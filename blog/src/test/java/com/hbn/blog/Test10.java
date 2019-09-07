package com.hbn.blog;


import java.util.Map;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Map<Thread, StackTraceElement[]>  map=Thread.getAllStackTraces();
        Scanner scanner = new Scanner(System.in);
        scanner.next();
    }

    public Test10() {

    }
}
