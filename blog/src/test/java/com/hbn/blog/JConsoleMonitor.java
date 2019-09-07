package com.hbn.blog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JConsoleMonitor {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {

                }
            }
        },"while true").start();

        scanner.next();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"while true").start();
    }

}
