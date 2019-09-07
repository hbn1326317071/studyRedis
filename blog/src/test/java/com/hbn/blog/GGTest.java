package com.hbn.blog;

public class GGTest {
    private Object instance;

    public GGTest() {
        byte[] m = new byte[20 * 1024 * 1024];
    }

    public static void main(String[] args) {

        GGTest ggTest = new GGTest();
        GGTest ggTest1 = new GGTest();
        ggTest.instance=ggTest1;
        ggTest1.instance=ggTest;
        ggTest=null;
        ggTest1=null;
        System.gc();


    }
}
