package br.com.capgemini.interfaces_graficas.primeira_interface_grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeiraTela extends JFrame {


    private JTextField textFieldNome;
    private JLabel nomeJLabel;
    private JButton mostrarNomeButton;
    private JPanel mainPanel;
    private JLabel mostraNomeLabel;

    public PrimeiraTela(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        mostrarNomeButton.addActionListener(e -> {
            String nome = textFieldNome.getText();
            mostraNomeLabel.setText(nome);
        });
    }

    public static void main(String[] args) {
        JFrame frame = new PrimeiraTela("Visualizador de Nome");
        frame.setVisible(true);
    }
}
