/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
        numeroAleatorio();
        botonColor();
        botonEtiqueta2();
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
    
    //método privado para que al pulsar el botón se ponga en la etiqueta
    //un número del 0 al 10 aleatorio
    private void numeroAleatorio() {
        Random r = new Random();
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numAleatorio = r.nextInt(11);
                etiqueta1.setText(Integer.toString(numAleatorio));
            }
            
        });
    }
    
    //método para cambiar el color del fondo de la etiqueta2 cuando se posicione
    //encima del botón
    private void botonColor() {
        Color colorOriginal = etiqueta2.getBackground();
        boton2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                etiqueta2.setBackground(Color.red);
                etiqueta2.repaint();
                etiqueta2.setOpaque(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                etiqueta2.setBackground(colorOriginal);
                etiqueta2.repaint();
                etiqueta2.setOpaque(true);
            }
            
        });
    }
    
    //método para modificar la etiqueda2 pidiendole al usuario que introduzca
    //el texto
    private void textoEtiqueta2() {
        String texto = JOptionPane.showInputDialog("Introduce texto");
        etiqueta2.setText(texto);
    }
    
    private void botonEtiqueta2() {
        boton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                textoEtiqueta2();
            }
            
        });
    }
}
