import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class WelcomeApplet extends JApplet {
    public void init(){
        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        JLabel label = new JLabel(getParameter("Welcome"),SwingConstants.CENTER);
        label.setFont(new Font("TimesRoman", Font.BOLD,18));
        container.add(label, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        JButton buttonCay = new JButton("Cay Horstmann");
        buttonCay.addActionListener(downloadURLActionListener("http://www.horstmann.com"));
        panel.add(buttonCay);

        JButton buttonGary = new JButton("Gary Cornell");
        buttonGary.addActionListener(downloadURLActionListener("mailto:gary@thecornells.com"));
        panel.add(buttonGary);

        container.add(panel, BorderLayout.SOUTH);
    }
    public ActionListener downloadURLActionListener(final String urlAdress){
        return new ActionListener() {
        public void actionPerformed(ActionEvent action){
            try{
                URL url = new URL(urlAdress);
                getAppletContext().showDocument(url);
            }
            catch(Exception e) {e.printStackTrace();}
        }
        };
    }
}
