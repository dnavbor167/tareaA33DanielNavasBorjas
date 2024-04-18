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
        //Creamos el objeto JFrame y le ponemos de nombre lo que esta puesto
        JFrame frame = new JFrame("App Cetnro");

        //añadimos al frame el evetno
        frame.add(new EventosControl2(frame));
        //hacemos que no sea redimensionable
        frame.setResizable(false);
        //lo ajustamos al contenido
        frame.pack();
        //lo hacemos visible
        frame.setVisible(true);
        //Hacemos que pueda cerrarse
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
