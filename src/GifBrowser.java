import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Locale;

public class GifBrowser {
    public static void main(String[] args) {
        JFrame frame = new FrameBrowser();
        frame.setTitle("GIF Browser");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.show();
    }
}
class FrameBrowser extends JFrame {
    public FrameBrowser() {
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

        private class ListenIfOpen implements ActionListener {
            public void actionPerformed(ActionEvent zda) {
                //choosing file solution
                JFileChooser choice = new JFileChooser();
                choice.setCurrentDirectory(new File("."));

                //accept only GIF files
                choice.setFileFilter(new javax.swing.filechooser.FileFilter() {
                    public boolean accept(File p) {
                        return p.getName().toLowerCase(Locale.ROOT).endsWith(".gif") || p.isDirectory();
                    }

                    public String getDescription() {
                        return "Obraz GIF";
                    }
                });
                //window choosing file
                int r = choice.showOpenDialog(FrameBrowser.this);

                //if file was accepted, use file icon as label
                if (r == JFileChooser.APPROVE_OPTION) {
                    String name = choice.getSelectedFile().getPath();
                    label.setIcon(new ImageIcon(name));
                }
            }
        }
        private JLabel label;
}
