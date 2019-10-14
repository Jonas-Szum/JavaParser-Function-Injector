package edu.uic.cs474.hw1;

import com.github.javaparser.ast.AccessSpecifier;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.FieldAccessExpr;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.expr.ThisExpr;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.expr.BooleanLiteralExpr;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.lang.String;

public class ToStringGenerator {
    private List<StaticFieldInfo> fieldsToPrint;
    private String prependIfStatic;
    private List<ImportDeclaration> imports;
    ////////////////////////////////////////////////////////////////////////////////Use importedDeclaration to solve java.lang.String problem
    public ToStringGenerator(List<FieldDeclaration> fields, String testEightTribute, List<ImportDeclaration> imports) {
        this.fieldsToPrint = new LinkedList<>();
        this.prependIfStatic = testEightTribute;
        this.imports = imports;
        
        for (FieldDeclaration f : fields) {
            // This handles the cases where many fields are declared in the same line
            // E.g., int a, b, c; float f, g, h;
            // Each line is a FieldDeclaration, each individual variable is a VariableDeclarator
            for (VariableDeclarator v : f.getVariables()) {
                this.saveFieldInfo(f, v);
            }
        }
    }

    private void saveFieldInfo(FieldDeclaration fieldDecl, VariableDeclarator varDecl) {
        StaticFieldInfo info = new StaticFieldInfo();
        // Luís: here you should save the info about the field that you will need on FieldInfo
        fieldsToPrint.add(info);
        
            
        info.name = varDecl.getName().asString();

        info.isFinal = fieldDecl.isFinal();
        info.isStatic = fieldDecl.isStatic();
        String fieldType = fieldDecl.getElementType().asString();
       // System.out.println("fieldType: " + fieldType);
        info.fieldType = fieldType;
        if(fieldType.equals("int") || fieldType.equals("long") || fieldType.equals("short") || 
          fieldType.equals("float") || fieldType.equals("double") || fieldType.equals("char") || 
          fieldType.equals("byte"))
        {
            info.isPrim = true; //check to see if the type is primitive or not
            info.isString = false;
        }
        else if (fieldType.equals("String"))
        {
            info.isPrim = false; //check to see if the type is primitive or not
            info.isString = true;
        }
        else
        {
            info.isPrim = false;
            info.isString = false;
        }
        for(ImportDeclaration p : imports)
        {
            String tempName = p.getName().toString();
            int tempIndex = tempName.lastIndexOf(".");
            String checkToReplace = tempName.substring(tempIndex + 1);
            if(fieldType.equals(checkToReplace))
            {
                info.fieldType = tempName;
            }
        }
        //System.out.println("Is final: " + info.isFinal);
        //System.out.println("Name: " + info.name);
        //System.out.println("Access Specifier: " + fieldDecl.getAccessSpecifier());
        switch (fieldDecl.getAccessSpecifier()) {
            case PUBLIC:
                info.vis = StaticFieldInfo.Visibility.PUBLIC;
                break;
            case PRIVATE:
                info.vis = StaticFieldInfo.Visibility.PRIVATE;
                break;
            case PROTECTED:
                info.vis = StaticFieldInfo.Visibility.PROTECTED;
                break;
            default:
                info.vis = StaticFieldInfo.Visibility.DEFAULT;
                break;
        }
    }

    private void generateToString(TypeDeclaration t) {
        // Generate the toString method
        MethodDeclaration generatedToString = t.addMethod("toString", Modifier.Keyword.PUBLIC);
        generatedToString.setType(String.class);

        // Instead of generating the code to print each field here,
        // we will instead call our runtime support for each field and its value
        String registerFieldMethodName = "edu.uic.cs474.hw1.runtime.Runtime.registerField";
        for (StaticFieldInfo info : fieldsToPrint) {
            StringLiteralExpr access;
            // Luís: The access prefix may be different
            switch (info.vis) {
                case PUBLIC:
                    access = new StringLiteralExpr("+");
                    break;
                case PRIVATE:
                    access = new StringLiteralExpr("-");
                    break;
                case PROTECTED:
                    access = new StringLiteralExpr("#");
                    break;
                default:
                    access = new StringLiteralExpr(" ");
                    break;
            }
            StringLiteralExpr fieldName = new StringLiteralExpr(info.name);
            //System.out.println("Type: " + info.fieldType);
            StringLiteralExpr declaredType = new StringLiteralExpr(info.fieldType);
            if (info.isPrim) {
                registerFieldMethodName = "edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField";
            } else {
                registerFieldMethodName = "edu.uic.cs474.hw1.runtime.Runtime.registerField";
            }
            FieldAccessExpr value = new FieldAccessExpr(new ThisExpr(), info.name);
            // Luís:  The line above should have the name of the field instead of hashCode().
            //        This hack allows you to generate code that compiles to get you started.
            
            BooleanLiteralExpr newArgument = new BooleanLiteralExpr(info.isFinal);
            BooleanLiteralExpr newStaticArg = new BooleanLiteralExpr(info.isStatic);
            StringLiteralExpr prepend = new StringLiteralExpr(prependIfStatic);
            MethodCallExpr call = new MethodCallExpr(registerFieldMethodName, access, fieldName, declaredType, value, newArgument, newStaticArg, prepend);
            generatedToString.getBody().get().addStatement(call);
        }

        // Generate the string at runtime
        String toStringMethodName = "edu.uic.cs474.hw1.runtime.Runtime.getToString";
        generatedToString.getBody().get().addStatement(new ReturnStmt(new MethodCallExpr(toStringMethodName)));
    }

    public void addToStringMethod(TypeDeclaration t) {
        // Ensure the fields are sorted by the correct order
        sortFields();

        // Generate a toString method
        generateToString(t);
    }

    private void sortFields() {
        Collections.sort(fieldsToPrint, new Comparator<StaticFieldInfo>() {
            @Override
            public int compare(StaticFieldInfo o1, StaticFieldInfo o2) {
                // Luís: this needs to be more complicated
                //       Use what you saved in FieldInfo to see which o1 or o2 should come first
                return Integer.compare(o1.hashCode(), o2.hashCode());
            }
        });
    }
}
