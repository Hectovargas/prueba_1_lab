package LAB_PRUEBA;

import LAB_PRUEBA.JuegoAhorcadoFijo;
import LAB_PRUEBA.JuegoAhorcadoAzar;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main_Ahorcado extends JFrame{
    public Main_Ahorcado(){
        setSize(600,600);
        setLocationRelativeTo(null);
        setBackground(Color.DARK_GRAY);
        menu();
    }
    private void menu(){
        JLabel label = new JLabel("Menu de juego");
        label.setBounds(200, 10, 200, 30);
        label.setFont(new Font("Arial", 0, 28));
        label.setForeground(Color.WHITE);
        JPanel menu = new JPanel();
        menu.setSize(600, 600);
        menu.setLayout(null);
        menu.setBackground(Color.darkGray);
        JButton boton = new JButton("Ahorcado Fijo");
        boton.setBounds(200, 100 ,200,50 );
        boton.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            JuegoAhorcadoFijo fijo = new JuegoAhorcadoFijo("palabra");
            fijo.jugar();
            }
        });
        menu.add(boton);
        
        JButton boton2 = new JButton("Ahorcado Azar");
        boton2.setBounds(200, 200 ,200,50 );
        boton2.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
        JuegoAhorcadoAzar azar = new JuegoAhorcadoAzar();
        azar.jugar();
            }
        });
        menu.add(boton2);
    
        JButton salir = new JButton("Ahorcado Azar");
        salir.setBounds(200, 200 ,200,50 );
        salir.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
        
            }
        });
        menu.add(salir);
        menu.add(label);
        add(menu);
    }
    
    
    public static void main(String[] args) {
        Main_Ahorcado m = new Main_Ahorcado();
        m.setVisible(true);
    }

    }

