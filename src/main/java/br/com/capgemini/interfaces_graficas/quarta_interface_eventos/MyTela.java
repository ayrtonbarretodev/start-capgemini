package br.com.capgemini.interfaces_graficas.quarta_interface_eventos;

import br.com.capgemini.interfaces_graficas.terceira_interface_grafica.CadastroGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyTela extends JFrame {
    private JTextField textField1;
    private JButton button1;
    private JPanel mainPanel;
    private JButton button2;
    private JButton button3;

    public MyTela(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) { // funciona quando pressiona e solta o botão
                JOptionPane.showMessageDialog(mainPanel, "Seja bem vindo");
            }
        });

        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) { //funciona quando clica no botão
                JOptionPane.showMessageDialog(mainPanel, "Mouse Pressionado");
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                JOptionPane.showMessageDialog(mainPanel, "Mouse Liberado");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new MyTela("Cadastro de Usuário");
        frame.setVisible(true);
    }
}
