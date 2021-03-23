package sk.stuba.fei.uim.oop;
import sk.stuba.fei.uim.oop.utility.MyCanvas;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        var okno = new JFrame();
        okno.setVisible(true);
        okno.setSize(300,300);
        okno.add(new MyCanvas());


    }
}
