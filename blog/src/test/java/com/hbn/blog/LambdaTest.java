package com.hbn.blog;

import javax.swing.*;
import java.awt.*;

public class LambdaTest extends JFrame {
    private  JButton jb;

    public LambdaTest() {
        this.setBounds(200, 200, 400, 200);
        this.setTitle("lamba测试");
        jb = new JButton("click");
        this.add(jb);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

    }

}
