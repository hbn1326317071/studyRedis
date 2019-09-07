package com.hbn.blog;

import org.junit.Test;

import java.util.Random;

public class HeapSizeTest {

    public static void main(String[] args) {
//    获取java虚拟机使用的最大值
        long maxMemeory=Runtime.getRuntime().maxMemory();
        long totalMemory=Runtime.getRuntime().totalMemory();
        add();
        System.out.println("maxMemeory"+maxMemeory/1024/1024+"MB");
        System.out.println("totalMemory"+totalMemory/1024/1024+"MB");
//    获取java虚拟机使用初始值


    }

    public static void add() {
        System.out.println("fsljfs f");
    }

}
