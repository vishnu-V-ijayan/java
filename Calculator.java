import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener {
    TextField tInput;
    Panel panel;
    String btnString[] = {"7", "8", "9", "+",
                        "4", "5", "6", "-",
                        "1", "2", "3", "*",
                        "C", "0", "=", "/"};
    Button btn[] = new Button[16];
    int num1 = 0, num2 = 0, result = 0;
    char op;

    public Calculator() {
        Font f = new Font("Cambria", Font.BOLD, 18);
        tInput = new TextField(10);
        tInput.setFont(f);

        panel = new Panel();
        add(tInput, "North");
        add(panel, "Center");
        panel.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < 16; i++) {
            btn[i] = new Button(btnString[i]);
            btn[i].setFont(f);
            btn[i].addActionListener(this);
            panel.add(btn[i]);
        }
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("+")) {
            op = '+';
            if (!tInput.getText().isEmpty()) {
                num1 = Integer.parseInt(tInput.getText());
            }
            tInput.setText("");
        } else if (str.equals("-")) {
            op = '-';
            if (!tInput.getText().isEmpty()) {
                num1 = Integer.parseInt(tInput.getText());
            }
            tInput.setText("");
        } else if (str.equals("*")) {
            op = '*';
            if (!tInput.getText().isEmpty()) {
                num1 = Integer.parseInt(tInput.getText());
            }
            tInput.setText("");
        } else if (str.equals("/")) {
            op = '/';
            if (!tInput.getText().isEmpty()) {
                num1 = Integer.parseInt(tInput.getText());
            }
            tInput.setText("");
        } else if (str.equals("=")) {
            if (!tInput.getText().isEmpty()) {
                num2 = Integer.parseInt(tInput.getText());
            }
            switch (op) {
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
            tInput.setText(String.valueOf(result));
            num1 = result;
        } else if (str.equals("C")) {
            tInput.setText("");
            num1 = 0;
            num2 = 0;
            result = 0;
        } else {
            tInput.setText(tInput.getText() + str);
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setSize(1000, 1000);
        calc.setVisible(true);
    }
}