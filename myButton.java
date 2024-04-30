import javax.swing.*;
import java.awt.*;

public class myButton extends JButton {
    private String Text;
    myButton(String Text){
        this.setText(Text);
        this.setForeground(new Color(49, 48, 77));
        this.setBackground(new Color(182, 187, 196));
        this.setFont(new Font("Arial-PLAIN-11", Font.BOLD, 14));
    }

}
