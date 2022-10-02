import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.CENTER;

public class NoHelloWorldApplet extends JApplet {
    public void init(){
        Container field = getContentPane();
        JLabel label = new JLabel("This is not applet 'Hello World'", CENTER);
        field.add(label);
    }
}
