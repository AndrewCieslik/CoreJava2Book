import java.applet.Applet;
import java.awt.Graphics;

public class NoHelloWorldApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("No Hello world!", 50, 25);
    }
}
/*
Here are browsers that do not support Java Applet any more:

Google Chrome
Firefox
Safari
Microsoft Edge
Opera
So, as you can see that all these browsers not longer support Applet. Even the newer versions of Oracle’s JDK does not come with the support of the Java browser plugin.

The reason for dropping the support was because of security issues and risks that were found.
 */