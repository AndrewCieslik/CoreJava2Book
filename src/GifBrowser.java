import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GifBrowser {
    private JLabel label;
    class FrameBrowser extends JFrame{
        public FrameBrowser(){
            JMenuBar menuBar = new JMenuBar();
            setJMenuBar(menuBar);

            JMenu menu = new JMenu();
            menuBar.add(menu);

            JMenuItem open = new JMenuItem("Open");
            menu.add(open);
            open.addActionListener(new ListenIfOpen());
            JMenuItem end = new JMenuItem("End");
            menu.add(end);
            end.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    System.exit(0);
                }
            });
            //to print gifs use label
            label = new JLabel();
            Container contents = getContentPane();
            contents.add(label);
        }
    }


    public static void main(String[] args){
        JFrame frame = new FrameBrowser();
    }
}
