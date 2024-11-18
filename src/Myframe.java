import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Myframe  extends JFrame {
    JButton button;
    JLabel label;
    Myframe() {
        ImageIcon icon = new ImageIcon("button.png");
        ImageIcon icon2 = new ImageIcon("image.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);


        button = new JButton();
        button.setBounds(100, 80, 360, 360); // x,y,width,height
        button.addActionListener(e -> System.out.println("Button clicked"));
        button.setText("Click me");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(true);

        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Button clicked");
            label.setVisible(true);
        }
    }
}

