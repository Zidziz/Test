import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Main extends JFrame {
    private static final long serialVersionUID = 1L;

    private static final String BUTTON_NAME = "button1";

    public Main() {
        super("Тестовое задание");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        Action action1 = new SimpleAction1();
        JButton button1 = new JButton(action1);
        button1.setName(BUTTON_NAME);
        button1.setText("Тест 1");
        Action action2 = new SimpleAction2();
        JButton button2 = new JButton(action2);
        button2.setName(BUTTON_NAME);
        button2.setText("Тест 2");
        Action action3 = new SimpleAction3();
        JButton button3 = new JButton(action3);
        button3.setName(BUTTON_NAME);
        button3.setText("Тест 3");

        container.add(button1);
        container.add(button2);
        container.add(button3);
        setSize(320, 200);
        setVisible(true);
    }
    class SimpleAction1 extends AbstractAction {
        private static final long serialVersionUID = 1L;

        double i;


        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();

            if (btn.getName().equalsIgnoreCase(BUTTON_NAME)) {
                String showInputDialog1 = JOptionPane.showInputDialog(null,
                        "Введите целое число", "Тест 1", JOptionPane.INFORMATION_MESSAGE);
                Double i = Double.parseDouble(showInputDialog1);

                if (i > 7) {
                    JOptionPane.showConfirmDialog(null, "Привет!", "Тест 1", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showConfirmDialog(null, "Увы, ваше число меньше или равно 7", "Тест 1", JOptionPane.WARNING_MESSAGE);
                }

            }
        }

    }
    class SimpleAction2 extends AbstractAction {
        private static final long serialVersionUID = 1L;

        String s = "Вячеслав";

        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();

            if (btn.getName().equalsIgnoreCase(BUTTON_NAME)) {
                String showInputDialog2 = JOptionPane.showInputDialog(null,
                        "Введиде ваше имя", "Тест 2", JOptionPane.INFORMATION_MESSAGE);

                if (showInputDialog2.equals(s)) {
                    JOptionPane.showConfirmDialog(null, "Привет, Вячеслав!", "Тест 2", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showConfirmDialog(null, "Нет такого имени", "Тест 2", JOptionPane.WARNING_MESSAGE);
                }
            }
        }

    }
    static class SimpleAction3 extends AbstractAction {
        private static final long serialVersionUID = 1L;

        int a;

        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();

            if (btn.getName().equalsIgnoreCase(BUTTON_NAME)) {
                String showInputDialog3 = JOptionPane.showInputDialog(null,
                        "Введите элементы массива через пробел", "Тест 3", JOptionPane.INFORMATION_MESSAGE);
                int[] arr = Arrays.stream(showInputDialog3.split(" "))
                        .mapToInt(Integer::parseInt).toArray();

                int[] b = new int[arr.length];

                    for (int k = 0; k <= arr.length; k++) {
                        if (arr[k] % 3 == 0){
                            JOptionPane.showMessageDialog(null, arr[k],"Тест 3", JOptionPane.WARNING_MESSAGE);

                            }
                        }

                    }




                {

                }

                }

            }
    public static void main(String[] args) {
        new Main();
    }
}

