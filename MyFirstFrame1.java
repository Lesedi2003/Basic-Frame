/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


/**
 *
 * @author User
 */
public class MyFirstFrame1 extends JFrame{
    
     public MyFirstFrame1()
    {
        this.setTitle("My First GUI");
        this.setSize(300, 300);
        this.setDefaultLookAndFeelDecorated(true);
        this.setResizable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setForeground(Color.BLUE);
        this.setVisible(true);
    }
       
    
}
