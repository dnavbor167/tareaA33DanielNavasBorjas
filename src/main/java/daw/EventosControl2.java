/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author daniel
 */
public class EventosControl2 extends JPanel {

    private final int ANCHO = 400;
    private final int ALTO = 200;
    private JButton botonSaludar;
    private JTextArea texto;

    public EventosControl2() {
        initComponents();
        modificarTamaño();
    }

    private void initComponents() {
        botonSaludar = new JButton("Daniel");
        texto = new JTextArea(1, 25);
        texto.setBackground(Color.ORANGE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(botonSaludar);
        panel.add(texto);

        this.add(panel);
    }

    private void modificarTamaño() {
        this.setPreferredSize(new Dimension(ANCHO, ALTO));

        // Obtener la dimensión de la pantalla
        Dimension tamañoPantalla = Toolkit.getDefaultToolkit().getScreenSize();

        // Obtener el ancho y alto de la pantalla
        int anchoPantalla = tamañoPantalla.width;
        int altoPantalla = tamañoPantalla.height;

        // Calcular las coordenadas para centrar el JFrame
        int xPos = (anchoPantalla - this.getWidth()) / 2;
        int yPos = (altoPantalla - this.getHeight()) / 2;

        this.setLocation(xPos, yPos);

    }
}
