import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Input extends JFrame implements ActionListener {
    static JTextField textField;
    Input(){
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
