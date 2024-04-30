import javax.swing.*;
import java.awt.*;

public class NumberButton extends JButton {

    private String Text;
    NumberButton(String Text){
        this.setBackground(new Color(221, 230, 237));
        this.setText(Text);
        this.setFont(new Font("Arial-PLAIN-11", Font.BOLD, 23));}
}
