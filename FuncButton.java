import javax.swing.*;
import java.awt.*;

public class FuncButton extends JButton {

    private String Text;
    FuncButton(String Text){
        this.setBackground(new Color(82, 109, 130));
        this.setText(Text);
        this.setFont(new Font("Arial-PLAIN-11", Font.BOLD, 23));}
}
