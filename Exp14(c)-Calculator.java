import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame {
    public Calculator() {
        setTitle("Calculator");
        setSize(300, 350);
        setLayout(new BorderLayout());

        TextField display = new TextField();
        add(display, BorderLayout.NORTH);

        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String buttons[] = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String b : buttons) {
            Button button = new Button(b);
            panel.add(button);

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String value = button.getLabel();

                    if (value.equals("C")) {
                        display.setText("");
                    } else if (value.equals("=")) {
                        try {
                            display.setText(
                                String.valueOf(
                                    new javax.script.ScriptEngineManager()
                                        .getEngineByName("JavaScript")
                                        .eval(display.getText())
                                )
                            );
                        } catch (Exception ex) {
                            display.setText("Error");
                        }
                    } else {
                        display.setText(display.getText() + value);
                    }
                }
            });
        }

        add(panel, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
