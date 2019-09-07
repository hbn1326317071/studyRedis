package com.hbn.blog;

import org.junit.Test;

import java.util.Random;

public class Food {
    private static int  count=1;
    public static void main(String[] args) {
        Food food = new Food();
        System.out.println(food.getClass().getClassLoader());
        System.out.println(food.getClass().getClassLoader().getParent());
        System.out.println(food.getClass().getClassLoader().getParent().getParent());
        String a = "b";
        String b = new String("b");
        print();
//        sun.misc.Launcher$AppClassLoader@18b4aac2
//        sun.misc.Launcher$ExtClassLoader@3b07d329
//        null:BootStrapClassLoader---加载了系统里面的String  防止重复加载
        System.out.println(b.getClass().getClassLoader());
    }

    public  static  void print()  {
//        try {
            System.out.println(count++);
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        print();
    }


    /**
     * 测试oom异常
     */
    @Test
    public void test1() {
//
        String str = "hello";
        while (true) {
            str += str + new Random(100);
        }


    }
}
