/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author daniel
 */
public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        
        frame.add(new EventosControl2());
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
