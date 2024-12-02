import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Objects;

public class MyFrame extends JFrame {
    
    MyFrame(){

        ImageIcon image = new ImageIcon(Objects.requireNonNull(getClass().getResource("raccoon.jpg")));
        Border border = BorderFactory.createLineBorder(new Color(173, 0, 32),5);

        JLabel label = new JLabel();
        label.setText("merry christmas, hoes");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(173, 0, 32));
        label.setFont(new Font("Dancing Script OT", Font.PLAIN,46));
        label.setIconTextGap(4);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(125,125,500,500);

        this.setTitle("Will's Christmas Card");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
//        this.setLayout(null);
        this.setVisible(true);
        this.add(label);
        this.pack();
        this.setResizable(false);


    }
}
