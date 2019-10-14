package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test34_ManyFieldsOfVisibilityFinalStaticNames {
    private int field404 = 1489;
    static protected int field224 = 1118;
    static public int field943 = 1872;
    int field473 = 1880;
    public int field710 = 359;
    final public int field868 = -1961;
    final protected int field987 = 303;
    static private int field96 = -724;
    final private int field68 = -1223;
    static  int field762 = 467;
    final public int field231 = 866;
    static  int field990 = -1209;
    final protected int field695 = -1347;
    static private int field907 = -879;
    static public int field227 = 1497;
    static protected int field735 = 1356;
    static protected int field119 = -286;
    protected int field773 = 1691;
    final private int field691 = -170;
    public int field711 = 1275;
    int field869 = 505;
    static  int field482 = 1361;
    protected int field689 = 266;
    static  int field512 = 1073;
    static public int field480 = -562;
    final  int field77 = -1076;
    static private int field374 = -1055;
    static protected int field634 = 197;
    static public int field591 = -1151;
    static private int field852 = 1085;
    final  int field344 = -40;
    private int field303 = 1818;
    int field33 = 10;

    @Test
    public void test() {
        String expected = "{+edu.uic.cs474.hw1.Test34_ManyFieldsOfVisibilityFinalStaticNames.field227:1497;+edu.uic.cs474.hw1.Test34_ManyFieldsOfVisibilityFinalStaticNames.field480:-562;+edu.uic.cs474.hw1.Test34_ManyFieldsOfVisibilityFinalStaticNames.field591:-1151;+edu.uic.cs474.hw1.Test34_ManyFieldsOfVisibilityFinalStaticNames.field943:1872;#edu.uic.cs474.hw1.Test34_ManyFieldsOfVisibilityFinalStaticNames.field119:-286;#edu.uic.cs474.hw1.Test34_ManyFieldsOfVisibilityFinalStaticNames.field224:1118;#edu.uic.cs474.hw1.Test34_ManyFieldsOfVisibilityFinalStaticNames.field634:197;#edu.uic.cs474.hw1.Test34_ManyFieldsOfVisibilityFinalStaticNames.field735:1356; edu.uic.cs474.hw1.Test34_ManyFieldsOfVisibilityFinalStaticNames.field482:1361; edu.uic.cs474.hw1.Test34_ManyFieldsOfVisibilityFinalStaticNames.field512:1073; edu.uic.cs474.hw1.Test34_ManyFieldsOfVisibilityFinalStaticNames.field762:467; edu.uic.cs474.hw1.Test34_ManyFieldsOfVisibilityFinalStaticNames.field990:-1209;-edu.uic.cs474.hw1.Test34_ManyFieldsOfVisibilityFinalStaticNames.field374:-1055;-edu.uic.cs474.hw1.Test34_ManyFieldsOfVisibilityFinalStaticNames.field852:1085;-edu.uic.cs474.hw1.Test34_ManyFieldsOfVisibilityFinalStaticNames.field907:-879;-edu.uic.cs474.hw1.Test34_ManyFieldsOfVisibilityFinalStaticNames.field96:-724;+field231=866;+field868=-1961;#field695=-1347;#field987=303; field344=-40; field77=-1076;-field68=-1223;-field691=-170;+field710:359;+field711:1275;#field689:266;#field773:1691; field33:10; field473:1880; field869:505;-field303:1818;-field404:1489}";
        Assert.assertEquals(expected, new Test34_ManyFieldsOfVisibilityFinalStaticNames().toString());
    }
}
