import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private NumberButton[] numB;
    private FuncButton[] functionButtons;
    private FuncButton addButton, subButton, mulButton, divButton;
    private FuncButton decButton, equButton, delButton, clrButton;
    private JPanel panel;

    private double num1, num2, result;
    private char operator;

    public Calculator() {
        this.setTitle("Calculator");
        this.setSize(350, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);



        ImageIcon image = new ImageIcon("Calculator2.png");
        this.setIconImage(image.getImage());

        textField = new JTextField();
        textField.setBounds(30, 30, 280, 50);
        textField.setEditable(false);
        this.add(textField);

        numB = new NumberButton[10];
        for (int i = 0; i < 10; i++) {
            numB[i] = new NumberButton(String.valueOf(i));
            numB[i].addActionListener(this);
        }

        functionButtons = new FuncButton[4];
        addButton = new FuncButton("+");
        subButton = new FuncButton("-");
        mulButton = new FuncButton("*");
        divButton = new FuncButton("/");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;

        for (int i = 0; i < 4; i++) {
            functionButtons[i].addActionListener(this);

        }

        decButton = new FuncButton(".");
        equButton = new FuncButton("=");
        delButton = new FuncButton("Delete");
        clrButton = new FuncButton("Clear");

        decButton.addActionListener(this);
        equButton.addActionListener(this);
        delButton.addActionListener(this);
        clrButton.addActionListener(this);

        panel = new JPanel();
        panel.setBounds(30, 100, 280, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numB[1]);
        panel.add(numB[2]);
        panel.add(numB[3]);
        panel.add(addButton);
        panel.add(numB[4]);
        panel.add(numB[5]);
        panel.add(numB[6]);
        panel.add(subButton);
        panel.add(numB[7]);
        panel.add(numB[8]);
        panel.add(numB[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numB[0]);
        panel.add(equButton);
        panel.add(divButton);

        this.add(panel);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numB[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decButton) {
            textField.setText(textField.getText().concat("."));
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource() == clrButton) {
            textField.setText("");
        }
        if (e.getSource() == delButton) {
            String str = textField.getText();
            textField.setText("");
            for (int i = 0; i < str.length() - 1; i++) {
                textField.setText(textField.getText() + str.charAt(i));
            }
        }
    }
}