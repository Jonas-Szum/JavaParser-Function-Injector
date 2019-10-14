package edu.uic.cs474.hw1;

public class StaticFieldInfo {
    enum Visibility {PUBLIC,PRIVATE,PROTECTED,DEFAULT}
    
    Visibility vis;
    public String name;
    public boolean isFinal;
    public String fieldType;
    public boolean isPrim;
    public boolean isString;
    public boolean isStatic;
}
