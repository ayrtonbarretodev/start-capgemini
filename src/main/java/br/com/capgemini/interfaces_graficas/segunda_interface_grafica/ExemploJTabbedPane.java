package br.com.capgemini.interfaces_graficas.segunda_interface_grafica;

import javax.swing.*;
import java.awt.*;

public class ExemploJTabbedPane extends JFrame{
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTextField nomeTextField;
    private JTextField empresaTextField;
    private JLabel empresaJLabel;
    private JLabel nomeJLabel;
    private JButton concluirButton;
    private JButton voltarButton;
    private JButton próximoButton;

    public ExemploJTabbedPane(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
    }

    public static void main(String[] args) {
        JFrame frame = new ExemploJTabbedPane("JTabbedPane");
        frame.setVisible(true);
    }
}
