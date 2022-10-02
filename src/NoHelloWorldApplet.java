import java.applet.Applet;
import java.awt.Graphics;

public class NoHelloWorldApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("No Hello world!", 50, 25);
    }
}