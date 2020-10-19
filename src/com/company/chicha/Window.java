package com.company.chicha;

import com.company.biba.Chicha;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.lang.Thread;
public class Window {
    public static void main(String[] args) throws InterruptedException {
        JFrame w = new JFrame("Window");
        w.setSize(900, 700);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // w.add();
        MovingC movingC = new MovingC();
        w.add(movingC);
        w.setVisible(true);
    }
}