/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author daniel
 */
public class EventosControl2 extends JPanel {

    private final int ANCHO = 400;
    private final int ALTO = 200;
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JButton boton1;
    private JButton boton2;

    public EventosControl2(JFrame jframe) {
        initComponents();
        modificarTamaño(jframe);
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        this.add(panel);
        etiqueta1 = new JLabel("etiqueta1");
        etiqueta2 = new JLabel("etiqueta2");
        boton1 = new JButton("Aleatorio");
        boton2 = new JButton("Ratón");
        this.add(boton1);
        this.add(etiqueta1);
        this.add(boton2);
        this.add(etiqueta2);
    }

    private void modificarTamaño(JFrame jframe) {
        this.setPreferredSize(new Dimension(ANCHO, ALTO));

        // Obtener la dimensión de la pantalla
        Dimension tamañoPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension tamañoFrame = jframe.getSize();

        // Obtener el ancho y alto de la pantalla
        int anchoPantalla = tamañoPantalla.width;
        int altoPantalla = tamañoPantalla.height;

        // Calcular las coordenadas para centrar el JFrame
        int xPos = anchoPantalla / 2 - (ANCHO / 2);
        int yPos = altoPantalla / 2 - (ALTO / 2);

        jframe.setLocation(xPos, yPos);

    }
}
