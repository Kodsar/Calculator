import javax.swing.*;
import java.awt.*;

public class myLabel extends JLabel {
    private String Text;
    myLabel(String Text){
        this.setText(Text);

        this.setForeground(new Color(240, 236, 229));
        this.setFont(new Font("Arial-PLAIN-11", Font.BOLD, 14));
    }
}
