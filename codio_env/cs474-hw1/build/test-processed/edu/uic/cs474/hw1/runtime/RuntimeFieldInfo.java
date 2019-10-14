package edu.uic.cs474.hw1.runtime;

public class RuntimeFieldInfo {
	String name;
    String visibility;
    String declaredType;
    boolean finalBool;
    boolean staticBool;
    Object value;
    String stringToPrepend; //check this if preSuffOrBoth == P or B
    String stringToAppend;  //check this if preSuffOrBoth == S or B
    String staticPrepend;
}
