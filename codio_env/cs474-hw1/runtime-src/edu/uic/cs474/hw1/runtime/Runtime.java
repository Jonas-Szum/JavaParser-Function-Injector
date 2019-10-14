package edu.uic.cs474.hw1.runtime;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringJoiner;
import java.util.ArrayList;
import java.lang.Object;
/**
 * This class will be copied to the processed folder.
 * You can place here any code that you want to have available at runtime.
 *
 * Code outside this class runs before compile-time
 * Code inside this class runs at runtime
 *
 * Be careful not to use the JavaParser API, it will not be available at runtime.
 */
public class Runtime {
    private static LinkedList<RuntimeFieldInfo> fields = new LinkedList<>();
    //int RPF below
    public static void registerPrimitiveField(String visibility, String name, String declaredType, int runtimeValue, boolean finalBool, boolean staticBool, String prependIfStatic) {
        // Luís:  You need to save some data here
        // Maybe you need to add more arguments to this method
        RuntimeFieldInfo info = new RuntimeFieldInfo();
        fields.add(info);
        info.visibility = visibility;
        //System.out.println("Vis: " + visibility);
        info.declaredType = declaredType;
        //System.out.println("declaredType: " + declaredType);
        info.name = name;
        //System.out.println("name: " + name);
        info.staticBool = staticBool;
        info.finalBool = finalBool;
        //System.out.println("final: " + finalBool);
        info.staticPrepend = "";
        info.stringToPrepend = "";
        if(staticBool == true)
        {
            info.staticPrepend = prependIfStatic;
        }
        info.stringToAppend = "";
        info.value = (Object)(Integer.valueOf(runtimeValue));
    }

    //long RPF below
    public static void registerPrimitiveField(String visibility, String name, String declaredType, long runtimeValue, boolean finalBool, boolean staticBool, String prependIfStatic) {
        // Luís:  You need to save some data here
        // Maybe you need to add more arguments to this method
        RuntimeFieldInfo info = new RuntimeFieldInfo();
        fields.add(info);
        info.visibility = visibility;
        //System.out.println("Vis: " + visibility);
        info.declaredType = declaredType;
        //System.out.println("declaredType: " + declaredType);
        info.name = name;
        //System.out.println("name: " + name);
        info.staticBool = staticBool;
        info.finalBool = finalBool;
        //System.out.println("final: " + finalBool);
        info.stringToPrepend = "";
        info.staticPrepend = "";

        if(staticBool == true)
        {
        info.staticPrepend = prependIfStatic;        
        }

        info.stringToAppend = "L"; //L for long
        info.value = (Object)(Long.valueOf(runtimeValue));
    }
    
    //short RPF below
    public static void registerPrimitiveField(String visibility, String name, String declaredType, short runtimeValue, boolean finalBool, boolean staticBool, String prependIfStatic) {
        // Luís:  You need to save some data here
        // Maybe you need to add more arguments to this method
        RuntimeFieldInfo info = new RuntimeFieldInfo();
        fields.add(info);
        info.visibility = visibility;
        //System.out.println("Vis: " + visibility);
        info.declaredType = declaredType;
        //System.out.println("declaredType: " + declaredType);
        info.name = name;
        //System.out.println("name: " + name);
        info.staticBool = staticBool;
        info.finalBool = finalBool;
        //System.out.println("final: " + finalBool);
        info.stringToPrepend = "";
        info.staticPrepend = "";

        if(staticBool == true)
        {
        info.staticPrepend = prependIfStatic;        
        }

        info.stringToAppend = "S"; //S for Short 
        info.value = (Object)(Short.valueOf(runtimeValue));
    }
    
    //float RPF below
    public static void registerPrimitiveField(String visibility, String name, String declaredType, float runtimeValue, boolean finalBool, boolean staticBool, String prependIfStatic) {
        // Luís:  You need to save some data here
        // Maybe you need to add more arguments to this method
        RuntimeFieldInfo info = new RuntimeFieldInfo();
        fields.add(info);
        info.visibility = visibility;
        //System.out.println("Vis: " + visibility);
        info.declaredType = declaredType;
        //System.out.println("declaredType: " + declaredType);
        info.name = name;
        //System.out.println("name: " + name);
        info.staticBool = staticBool;
        info.finalBool = finalBool;
        //System.out.println("final: " + finalBool);
        info.stringToPrepend = ""; 
        info.staticPrepend = "";

        if(staticBool == true)
        {
        info.staticPrepend = prependIfStatic;        
        }

        info.stringToAppend = ""; //nothing for float
        info.value = (Object)(Float.valueOf(runtimeValue));
    }
    
    //double RPF below
    public static void registerPrimitiveField(String visibility, String name, String declaredType, double runtimeValue, boolean finalBool, boolean staticBool, String prependIfStatic) {
        // Luís:  You need to save some data here
        // Maybe you need to add more arguments to this method
        RuntimeFieldInfo info = new RuntimeFieldInfo();
        fields.add(info);
        info.visibility = visibility;
        //System.out.println("Vis: " + visibility);
        info.declaredType = declaredType;
        //System.out.println("declaredType: " + declaredType);
        info.name = name;
        //System.out.println("name: " + name);
        info.staticBool = staticBool;
        info.finalBool = finalBool;
        //System.out.println("final: " + finalBool);
        info.stringToPrepend = "";
        info.staticPrepend = "";

        if(staticBool == true)
        {
        info.staticPrepend = prependIfStatic;        
        }
        info.stringToAppend = "D"; //D for double
        info.value = (Object)(Double.valueOf(runtimeValue));
    }
    
    //char RPF below
    public static void registerPrimitiveField(String visibility, String name, String declaredType, char runtimeValue, boolean finalBool, boolean staticBool, String prependIfStatic) {
        // Luís:  You need to save some data here
        // Maybe you need to add more arguments to this method
        RuntimeFieldInfo info = new RuntimeFieldInfo();
        fields.add(info);
        info.visibility = visibility;
        //System.out.println("Vis: " + visibility);
        info.declaredType = declaredType;
        //System.out.println("declaredType: " + declaredType);
        info.name = name;
        //System.out.println("name: " + name);
        info.staticBool = staticBool;
        info.finalBool = finalBool;
        info.staticPrepend = "";
        //System.out.println("final: " + finalBool);
        if(staticBool == true)
        {
        info.staticPrepend = prependIfStatic;        
        }
        
        info.stringToPrepend = "'";
        info.stringToAppend = "'";
        info.value = (Object)(Character.valueOf(runtimeValue));
    }
    
    //byte RPF below
    public static void registerPrimitiveField(String visibility, String name, String declaredType, byte runtimeValue, boolean finalBool, boolean staticBool, String prependIfStatic) {
        // Luís:  You need to save some data here
        // Maybe you need to add more arguments to this method
        RuntimeFieldInfo info = new RuntimeFieldInfo();
        String newVal = "";
        newVal = Integer.toHexString(runtimeValue & 0xFF); // and it with 0xFF to keep it as 1 byte
        fields.add(info);
        info.visibility = visibility;
        //System.out.println("Vis: " + visibility);
        info.declaredType = declaredType;
        //System.out.println("declaredType: " + declaredType);
        info.name = name;
        //System.out.println("name: " + name);
        info.staticBool = staticBool;
        info.finalBool = finalBool;
       //System.out.println("final: " + finalBool);
        info.staticPrepend = "";

        if(staticBool == true)
        {
        info.staticPrepend = prependIfStatic;        
        }
        
        info.stringToPrepend = "0x"; //0x because it's a byte
        info.stringToAppend = "";
        //System.out.println("runtime val: " + newVal);
        info.value = (Object)(newVal);
    }
    
    // Luís:  There are more primitive types that you have to handle
    // below handles primitive field arrays??
    //int RPF below
    public static void registerPrimitiveField(String visibility, String name, String declaredType, int runtimeValue[], boolean finalBool, boolean staticBool, String prependIfStatic) {
        // Luís:  You need to save some data here
        // Maybe you need to add more arguments to this method
        RuntimeFieldInfo info = new RuntimeFieldInfo();
        info.visibility = visibility;
        //System.out.println("Vis: " + visibility);
        info.declaredType = declaredType;
        //System.out.println("declaredType: " + declaredType);
        info.name = name;
        //System.out.println("name: " + name);
        info.staticBool = staticBool;
        info.finalBool = finalBool;
        //System.out.println("final: " + finalBool);
        info.stringToPrepend = "";
        info.stringToAppend = "";
        ArrayList<Integer> newList = new ArrayList<Integer>();
        info.staticPrepend = "";
        info.stringToPrepend = "";
        info.stringToAppend = "";
        fields.add(info);
        if(runtimeValue != null)
        {
            for(int i : runtimeValue)
            {
                newList.add(Integer.valueOf(i));
            }
            Object[] newListAsArray = newList.toArray();
            //Object[] tempArray = (Object[])(Byte.valueOf(runtimeValue));
            info.value = (Object)arrayToString((Object[])newListAsArray, info.stringToPrepend, info.stringToAppend, info);
            if(staticBool == true)
            {
            info.staticPrepend = prependIfStatic;        
            }
        }
        else
        {
            info.value = "null int[]";
        }
        info.stringToPrepend = "";
        info.stringToAppend = "";
    }

    //long RPF below
    public static void registerPrimitiveField(String visibility, String name, String declaredType, long runtimeValue[], boolean finalBool, boolean staticBool, String prependIfStatic) {
        // Luís:  You need to save some data here
        // Maybe you need to add more arguments to this method
        RuntimeFieldInfo info = new RuntimeFieldInfo();
        info.visibility = visibility;
        //System.out.println("Vis: " + visibility);
        info.staticBool = staticBool;
        info.declaredType = declaredType;
        //System.out.println("declaredType: " + declaredType);
        info.name = name;
        //System.out.println("name: " + name);
        info.finalBool = finalBool;
        //System.out.println("final: " + finalBool);
        info.stringToPrepend = "";
        info.stringToAppend = "L"; //L for long
        ArrayList<Long> newList = new ArrayList<Long>();
        info.staticPrepend = "";
        fields.add(info);
        if(runtimeValue != null)
        {
            for(long i : runtimeValue)
            {
                newList.add(Long.valueOf(i));
            }
            Object[] newListAsArray = newList.toArray();
            //Object[] tempArray = (Object[])(Byte.valueOf(runtimeValue));
            info.value = (Object)arrayToString((Object[])newListAsArray, info.stringToPrepend, info.stringToAppend, info);
            if(staticBool == true)
            {
            info.staticPrepend = prependIfStatic;        
            }
        }
        else
        {
            info.value = "null long[]";
        }
        info.stringToPrepend = "";
        info.stringToAppend = "";
    }
    
    //short RPF below
    public static void registerPrimitiveField(String visibility, String name, String declaredType, short runtimeValue[], boolean finalBool, boolean staticBool, String prependIfStatic) {
        // Luís:  You need to save some data here
        // Maybe you need to add more arguments to this method
        RuntimeFieldInfo info = new RuntimeFieldInfo();
        info.visibility = visibility;
        //System.out.println("Vis: " + visibility);
        info.declaredType = declaredType;
        //System.out.println("declaredType: " + declaredType);
        info.name = name;
        //System.out.println("name: " + name);
        info.staticBool = staticBool;
        info.finalBool = finalBool;
        //System.out.println("final: " + finalBool);
        info.stringToPrepend = "";
        info.stringToAppend = "S"; //S for Short 
        ArrayList<Short> newList = new ArrayList<Short>();
         info.staticPrepend = "";
        fields.add(info);
        if(runtimeValue != null)
        {
            for(short i : runtimeValue)
            {
                newList.add(Short.valueOf(i));
            }
            Object[] newListAsArray = newList.toArray();
            //Object[] tempArray = (Object[])(Byte.valueOf(runtimeValue));
            info.value = (Object)arrayToString((Object[])newListAsArray, info.stringToPrepend, info.stringToAppend, info);
            if(staticBool == true)
            {
            info.staticPrepend = prependIfStatic;        
            }
        }
        else
        {
            info.value = "null short[]";
        }
        info.stringToPrepend = "";
        info.stringToAppend = "";
    }
    
    //float RPF below
    public static void registerPrimitiveField(String visibility, String name, String declaredType, float runtimeValue[], boolean finalBool, boolean staticBool, String prependIfStatic) {
        // Luís:  You need to save some data here
        // Maybe you need to add more arguments to this method
        RuntimeFieldInfo info = new RuntimeFieldInfo();
        info.visibility = visibility;
        //System.out.println("Vis: " + visibility);
        info.declaredType = declaredType;
        //System.out.println("declaredType: " + declaredType);
        info.name = name;
        //System.out.println("name: " + name);
        info.staticBool = staticBool;
        info.finalBool = finalBool;
        //System.out.println("final: " + finalBool);
        info.stringToPrepend = ""; 
        info.stringToAppend = ""; //nothing for float
        ArrayList<Float> newList = new ArrayList<Float>();
        info.staticPrepend = "";
        fields.add(info);
        if(runtimeValue != null)
        {
            for(float i : runtimeValue)
            {
                newList.add(Float.valueOf(i));
            }
            Object[] newListAsArray = newList.toArray();
            //Object[] tempArray = (Object[])(Byte.valueOf(runtimeValue));
            info.value = (Object)arrayToString((Object[])newListAsArray, info.stringToPrepend, info.stringToAppend, info);
            if(staticBool == true)
            {
            info.staticPrepend = prependIfStatic;        
            }
        }
        else
        {
            info.value = "null float[]";
        }
        info.stringToPrepend = "";
        info.stringToAppend = "";
    }
    
    //double RPF below
    public static void registerPrimitiveField(String visibility, String name, String declaredType, double runtimeValue[], boolean finalBool, boolean staticBool, String prependIfStatic) {
        // Luís:  You need to save some data here
        // Maybe you need to add more arguments to this method
        RuntimeFieldInfo info = new RuntimeFieldInfo();
        info.visibility = visibility;
        //System.out.println("Vis: " + visibility);
        info.declaredType = declaredType;
        //System.out.println("declaredType: " + declaredType);
        info.name = name;
        //System.out.println("name: " + name);
        info.staticBool = staticBool;
        info.finalBool = finalBool;
        //System.out.println("final: " + finalBool);
        info.stringToPrepend = "";
        info.stringToAppend = "D"; //D for double
        ArrayList<Double> newList = new ArrayList<Double>();
        info.staticPrepend = "";
        fields.add(info);
        if(runtimeValue != null)
        {
            for(double i : runtimeValue)
            {
                newList.add(Double.valueOf(i));
            }
            Object[] newListAsArray = newList.toArray();
            //Object[] tempArray = (Object[])(Byte.valueOf(runtimeValue));
            info.value = (Object)arrayToString((Object[])newListAsArray, info.stringToPrepend, info.stringToAppend, info);
            if(staticBool == true)
            {
            info.staticPrepend = prependIfStatic;        
            }
        }
        else
        {
            info.value = "null double[]";
        }
        info.stringToPrepend = "";
        info.stringToAppend = "";
    }
    
    //char RPF below
    public static void registerPrimitiveField(String visibility, String name, String declaredType, char runtimeValue[], boolean finalBool, boolean staticBool, String prependIfStatic) {
        // Luís:  You need to save some data here
        // Maybe you need to add more arguments to this method
        RuntimeFieldInfo info = new RuntimeFieldInfo();
        info.visibility = visibility;
        //System.out.println("Vis: " + visibility);
        info.declaredType = declaredType;
        //System.out.println("declaredType: " + declaredType);
        info.name = name;
        //System.out.println("name: " + name);
        info.staticBool = staticBool;
        info.finalBool = finalBool;
        //System.out.println("final: " + finalBool);
        info.stringToPrepend = "'"; // ' for char
        info.stringToAppend = "'"; // ' for end char
        ArrayList<Character> newList = new ArrayList<Character>();
        info.staticPrepend = "";
        fields.add(info);
        if(runtimeValue != null)
        {
            for(char i : runtimeValue)
            {
                newList.add(Character.valueOf(i));
            }
            Object[] newListAsArray = newList.toArray();
            //Object[] tempArray = (Object[])(Byte.valueOf(runtimeValue));
            info.value = (Object)arrayToString((Object[])newListAsArray, info.stringToPrepend, info.stringToAppend, info);
            if(staticBool == true)
            {
            info.staticPrepend = prependIfStatic;        
            }
        }
        else
        {
            info.value = "null char[]";
        }
        info.stringToPrepend = "";
        info.stringToAppend = "";
    }
    
    //byte RPF below
    public static void registerPrimitiveField(String visibility, String name, String declaredType, byte runtimeValue[], boolean finalBool, boolean staticBool, String prependIfStatic) {
        // Luís:  You need to save some data here
        // Maybe you need to add more arguments to this method
        RuntimeFieldInfo info = new RuntimeFieldInfo();
        info.visibility = visibility;
        //System.out.println("Vis: " + visibility);
        info.declaredType = declaredType;
        //System.out.println("declaredType: " + declaredType);
        info.name = name;
        //System.out.println("name: " + name);
        info.staticBool = staticBool;
        info.finalBool = finalBool;
       //System.out.println("final: " + finalBool);
        info.stringToPrepend = "0x"; //0x because it's a byte
        info.stringToAppend = "";
        ArrayList<Byte> newList = new ArrayList<Byte>();
        info.staticPrepend = "";
        fields.add(info);
        if(runtimeValue != null)
        {
            for(byte i : runtimeValue)
            {
                newList.add(Byte.valueOf(i));
            }
            Object[] newListAsArray = newList.toArray();
            //Object[] tempArray = (Object[])(Byte.valueOf(runtimeValue));
            info.value = (Object)arrayToString((Object[])newListAsArray, info.stringToPrepend, info.stringToAppend, info);
            if(staticBool == true)
            {
            info.staticPrepend = prependIfStatic;        
            }
        }
        else
        {
            info.value = "null byte[]";
        }
        info.stringToPrepend = "";
        info.stringToAppend = "";
    }
    //above handles primitive
 
    public static void registerField(String visibility, String name, String declaredType, Object value, boolean finalBool, boolean staticBool, String prependIfStatic) {
        // Luís:  You need to save some data here
        // Maybe you need to add more arguments to this method
        if(value != null && value.getClass().isArray())
        {
            if (value instanceof int[])
                registerPrimitiveField(visibility, name, declaredType, (int[])value, finalBool, staticBool, prependIfStatic);
            else if (value instanceof long[])
                registerPrimitiveField(visibility, name, declaredType, (long[])value, finalBool, staticBool, prependIfStatic);
            else if (value instanceof float[])
                registerPrimitiveField(visibility, name, declaredType, (float[])value, finalBool, staticBool, prependIfStatic);
            else if (value instanceof short[])
                registerPrimitiveField(visibility, name, declaredType, (short[])value, finalBool, staticBool, prependIfStatic);
            else if (value instanceof double[])
                registerPrimitiveField(visibility, name, declaredType, (double[])value, finalBool, staticBool, prependIfStatic);
            else if (value instanceof char[])
                registerPrimitiveField(visibility, name, declaredType, (char[])value, finalBool, staticBool, prependIfStatic);
            else if (value instanceof byte[])
                registerPrimitiveField(visibility, name, declaredType, (byte[])value, finalBool, staticBool, prependIfStatic);
            return;
        }
        RuntimeFieldInfo info = new RuntimeFieldInfo();
        fields.addLast(info);
        info.visibility = visibility;
        //System.out.println("Vis: " + visibility);
        info.declaredType = declaredType;
        //System.out.println("declaredType: " + declaredType);
        info.name = name;
        //System.out.println("name: " + name);
        info.staticBool = staticBool;
        info.finalBool = finalBool;
        //System.out.println("final: " + finalBool);
        boolean peen = value instanceof String;
        //System.out.println("peen: " + peen);

        if (peen)
        {
            info.stringToPrepend = "\""; 
            info.stringToAppend = "\"";
        }
        else
        {
            info.stringToPrepend = "";
            info.stringToAppend = "";
        }
        info.staticPrepend = "";
        if(staticBool == true)
        {
        info.staticPrepend = prependIfStatic;        
        }
        info.value = value;
    }

    //array of objects
    public static void registerField(String visibility, String name, String declaredType, Object value[], boolean finalBool, boolean staticBool, String prependIfStatic) {
        // Luís:  You need to save some data here
        // Maybe you need to add more arguments to this method
        RuntimeFieldInfo info = new RuntimeFieldInfo();
        info.visibility = visibility;
        //System.out.println("Vis: " + visibility);
        info.declaredType = declaredType;
        //System.out.println("declaredType: " + declaredType);
        info.name = name;
        //System.out.println("name: " + name);
        info.staticBool = staticBool;
        info.finalBool = finalBool;
        //System.out.println("final: " + finalBool);
        boolean peen = value instanceof String[];
        if (peen)
        {
            info.stringToPrepend = "\""; 
            info.stringToAppend = "\"";
            info.value = (Object)arrayToString(value, info.stringToPrepend, info.stringToAppend, info);
        }
        else
        {
            info.stringToPrepend = "";
            info.stringToAppend = "";
            info.value = (Object)arrayToString(value, info.stringToPrepend, info.stringToAppend, info);
        }
        fields.add(info);
        info.stringToPrepend = "";
        info.staticPrepend = "";
        if(staticBool == true)
        {
        info.staticPrepend = prependIfStatic;        
        }
        info.stringToAppend = "";
        //info.value = value;
    }
    private static boolean isArrayWrapper(Object[] o)
    {
        if(o instanceof Integer[] || o instanceof Long[] 
        || o instanceof Short[] || o instanceof Float[] 
        || o instanceof Double[] || o instanceof Character[]
        || o instanceof Byte[])
            return true;
        else
            return false;
    }
    private static String arrayToString(Object[] array, String prependMe, String appendMe, RuntimeFieldInfo info) {
        if(array != null)
        {
            if (array.length == 0)
                return "[] " + info.declaredType;
            String returnMe = "[";
            int arrayIndex = 0;
            boolean isWrapperArray = isArrayWrapper(array);
            for(Object o : array)
            {
                if(arrayIndex != 0)
                        returnMe += ","; //wont append a comma to the end of the list
                if(o != null)
                {
                    //below is going to check for self referencing objects
                    //System.out.println("declaredType: " + info.declaredType);
                    String selfCheck = o.getClass().getName().substring(o.getClass().getName().lastIndexOf(".") + 1);
                    //System.out.println("selfCheck: " + selfCheck);
                   if(selfCheck.equals(info.declaredType) && !(o instanceof String) && !isWrapperArray) //checks for self-reference, but exludes strings and wrappers
                    {
                        o = (Object)"...";
                    }
                    
                    if(o instanceof Byte)
                       { 
                           String temp;
                           temp = ((Integer.toHexString((byte)o & 0xFF)).toUpperCase());// and it with 0xFF to keep it as 1 byte
                           if(temp.equals("0"))
                           {
                               o = (Object)("00"); //check to see if we need 2 sig figs
                           }
                           else
                           {
                               o = (Object)(temp);
                           }
                       } 
                    else if(o instanceof String)
                    {
                        o = (Object)(((String)o).replace("\n", "\\n"));
                    }
                    returnMe += (Integer.valueOf(arrayIndex)).toString() + ":" + info.stringToPrepend + o.toString() + info.stringToAppend;
                }
                else
                {
                    returnMe += (Integer.valueOf(arrayIndex)).toString() + ":" + "null " + info.declaredType;
                }
                arrayIndex++;
            }
            returnMe += "]";
            return returnMe;
        }
        else
        {
            System.out.println("returning bepis");
            return "bepis";
        }
        // Luís:  What about non-empty arrays?

    }
    
    private static boolean isWrapper(Object o)
    {
        if(o instanceof Integer || o instanceof Long 
        || o instanceof Short || o instanceof Float 
        || o instanceof Double || o instanceof Character
        || o instanceof Byte)
            return true;
        else
            return false;
    }    
    private static String valueToString(RuntimeFieldInfo field) {
        // Luís:  How do we print the different types of values?
        // Hint:  You need to use instanceof here
        // Hint: no the fuck i dont
        if(field.value != null)
        {      
         boolean wrapper = isWrapper(field.value);
         String selfCheck = field.value.getClass().getName().substring(field.value.getClass().getName().lastIndexOf(".") + 1);
        //below is going to check for self referencing objects
            if(selfCheck.equals(field.declaredType) && !(field.value instanceof String) && !wrapper) //checks for self-reference
            {
                return "...";
            }
            //System.out.println("selfCheck: " + selfCheck);
            //System.out.println("declaredType: " + field.declaredType);
            return field.value.toString();  
        }
        else
        {
            //System.out.println("null " + field.declaredType);
            return "null " + field.declaredType;
        }
        
    }

    public static String getToString() {
        if (fields.isEmpty())
            // Luís: How do classes with no fields look like?
            return "{}";
        
        Collections.sort(fields, new Comparator<RuntimeFieldInfo>() {
        public int compare(RuntimeFieldInfo s1, RuntimeFieldInfo s2) {
        if(s1.staticBool == true && s2.staticBool == false)
            return -1;
        else if(s1.staticBool == false && s2.staticBool == true)
            return 1;
        if(s1.finalBool == true && s2.finalBool == false)
            return -1;
        else if (s1.finalBool == false && s2.finalBool == true)
            return 1;
        else if(!(s1.visibility.equals(s2.visibility)))
        {
            if(s1.visibility.equals("+"))
                if(s2.visibility.equals("#") || s2.visibility.equals(" ") || s2.visibility.equals("-"))
                {
                return -1;   
                }
            if(s1.visibility.equals("#"))
                if(s2.visibility.equals(" ") || s2.visibility.equals("-"))
                {
                return -1;   
                }
            if(s1.visibility.equals(" "))
                if(s2.visibility.equals("-"))
                {
                return -1;   
                }
            
            if(s2.visibility.equals("+"))
                if(s1.visibility.equals("#") || s1.visibility.equals(" ") || s1.visibility.equals("-"))
                {
                return 1;   
                }
            if(s2.visibility.equals("#"))
                if(s1.visibility.equals(" ") || s1.visibility.equals("-"))
                {
                return 1;   
                }
            if(s2.visibility.equals(" "))
                if(s1.visibility.equals("-"))
                {
                return 1;   
                }
        }
        else //alphanumeric order
        {
            return s1.name.compareTo(s2.name);
        }
        return 0;
        }});
        // Luís:  This joiner thing is pretty neat, check out the API to learn how to use it
        StringJoiner joiner = new StringJoiner(";","{","}");
        for (RuntimeFieldInfo field : fields) {
            // Luís:  You should turn each field into a string here
            String f;
            if(field.finalBool == false)
                f = field.visibility + field.staticPrepend + field.name + ":" + field.stringToPrepend + valueToString(field) + field.stringToAppend;
            else
                f = field.visibility + field.staticPrepend + field.name + "=" + field.stringToPrepend + valueToString(field) + field.stringToAppend;
            int lastScan = 0;
            if(f.contains("\n"))
            {
            f = f.replace("\n", "\\n");
            }
            joiner.add(f);
        }
        return joiner.toString();
    }
}
