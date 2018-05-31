import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window extends JFrame implements MouseListener {

    private JLabel tableText;
    private JLabel text;

    private JTextField textField;
    private int width = 550;
    private int height = 170;

    private int fieldW = 200;
    private int fieldH = 30;

    public static void main(String[] args) {
        new Window();
    }

    Window() {
        this.setTitle("Tablica umnozheniya");
        this.setSize(800, 800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        this.addMouseListener(this);

        tableText = createTable();
        tableText.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        tableText.setBounds(999,999, width, height);
        this.add(tableText);

        textField = new JTextField();
        textField.setBounds(999, 999, fieldW, fieldH);
        this.add(textField);

        text = new JLabel("Some crazy text");
        text.setBounds(999, 999, fieldW, fieldH);
        this.add(text);

        createTable();
    }

    JLabel createTable() {
        String s = "";

        s = s.concat("<html><body><pre>");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) s = s.concat(String.valueOf((i * j) + "\t"));

            s = s.concat("<br>");
        }
        s = s.concat("</pre></body></html>");
        return new JLabel(s);
    }

    public void mouseClicked(MouseEvent event) {
    }

    public void mousePressed(MouseEvent event) {
        int x = event.getX() - 8;
        int y = event.getY() - 38;

        if (event.getButton() == 1) {
            tableText.setBounds(x, y, width, height);
        }
        else if (event.getButton() == 3) {
            textField.setBounds(x, y, fieldW, fieldH);
            textField.requestFocus();
        }

        else if (event.getButton() == 2) {
            text.setBounds(x, y, fieldW, fieldH);
        }

    }
    public void mouseReleased(MouseEvent e) {

    }
    public void mouseEntered(MouseEvent e) {

    }
    public void mouseExited(MouseEvent e) {

    }
}
