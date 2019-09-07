package com.hbn.blog;

import java.util.ArrayList;
import java.util.List;

public class JConsoleTest {

  public   byte[] b1 = new byte[128 * 1024];
    public JConsoleTest() {

    }
    public static void main(String[] args) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("start");
        fill(1000);

    }


    public static void fill(int n) {
        List<JConsoleTest> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new JConsoleTest());
        }

    }

}
