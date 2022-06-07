package br.com.capgemini.interfaces_graficas.celsius_para_fahrenheit;

import javax.swing.*;

public class CelsiusConverterGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField celsiusTextField;
    private JLabel celsiusLabel;
    private JButton convertButton;
    private JLabel farhenheitLabel;

    public CelsiusConverterGUI(String title)  {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        convertButton.addActionListener(e -> {
            int tempFahr = (int) ((Double.parseDouble(celsiusTextField.getText())) * 1.8 + 32);
            farhenheitLabel.setText(tempFahr + " Fahrenheit");
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CelsiusConverterGUI("My Celsius Converter");
        frame.setVisible(true);
    }
}
