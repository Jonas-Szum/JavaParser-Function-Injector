package edu.uic.cs474.hw1;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;

import java.util.LinkedList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    
    private static void printUsage() {
        System.err.println("Usage: Main [file or folder to process] [file or folder to write the results] [file or folder with runtime to inject into the results]");
    }

    private static void processSingleFile(File from, File to) throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(from);
        LinkedList<ImportDeclaration> packageNames = new LinkedList<ImportDeclaration>();
        LinkedList<TypeDeclaration> typeNames = new LinkedList<TypeDeclaration>();
        String packName = "";
        if (cu.getPackageDeclaration().isPresent()) {
            // Luís:  Do something with the package name
            packName = cu.getPackageDeclaration().get().getName().asString();
            //System.out.println("Package name: " + packName);
        }

        // For all imports in this file
        for (ImportDeclaration importDecl : cu.getImports()) {
            packageNames.add(importDecl);
            // Luís: Save imported names somewhere, we may need them later
        }

        // For all the classes (types) in this file
        for (TypeDeclaration<?> t : cu.getTypes()) {
            // Luís:  This method may be useful
            //System.out.println("TypeDeclaration t: " + t.getName());
           
            String testEightTribute = packName + "." + t.getName().asString() + ".";
            
            //t.setName(testEightTribute);
            typeNames.add(t);
            if(t.getMethodsByName("toString").size() != 0) {
                // Luís:  Do something here
            }
            else{
            // Generate a toString method
            ToStringGenerator generator = new ToStringGenerator(t.getFields(), testEightTribute, packageNames);
            generator.addToStringMethod(t);
            }
            
        }

        writeResult(to, cu);
    }

    private static void writeResult(File to, CompilationUnit cu) throws IOException {
        // Ensure the results directory structure exists
        to.getParentFile().mkdirs();

        // Write all classes back to the file we just processed
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(to)))) {
            // Write back the same package declaration
            if (cu.getPackageDeclaration().isPresent())
                bw.write(cu.getPackageDeclaration().get().toString());

            // Write back the same imports
            for (ImportDeclaration i : cu.getImports())
                bw.write(i.toString());

            for (TypeDeclaration<?> t : cu.getTypes()) {
                bw.write(t.toString());
            }
        }
    }

    private static void processFolder(File from, File to) throws IOException {
        for (File f : from.listFiles()) {
            File newTo = Paths.get(to.getAbsolutePath(), f.getName()).toFile();
            if (f.isFile()) {
                if (f.getName().endsWith(".java")) {
                    processSingleFile(f, newTo);
                } else {
                    Files.copy(f.toPath(), newTo.toPath(), StandardCopyOption.REPLACE_EXISTING);
                }
            } else if (f.isDirectory()) {
                processFolder(f, newTo);
            } else {
                // Skip
            }
        }
    }

    private static void injectRuntime(File runtime, File to) throws IOException {

        for (File f : runtime.listFiles()) {
            File t = Paths.get(to.getAbsolutePath(), f.getName()).toFile();
            if (t.exists() && t.isDirectory() && f.isDirectory()) {
                injectRuntime(f, t);
            } else if (!t.exists() && f.isDirectory()) {
                t.mkdir();
                injectRuntime(f, t);
            } else if (f.isFile()) {
                Files.copy(f.toPath(), t.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
        }
    }

    public static void main(String[] args) {
        if (args.length < 2 || args.length > 3) {
            printUsage();
            return;
        }

        File from = new File(args[0]);
        File to = new File(args[1]);

        File runtime = null;
        if (args.length == 3)
            runtime = new File(args[2]);

        try {
            if (from.isFile()) {
                processSingleFile(from, to);
            } else if (from.isDirectory()) {
                processFolder(from, to);
                if (runtime != null)
                    injectRuntime(runtime, to);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }

}