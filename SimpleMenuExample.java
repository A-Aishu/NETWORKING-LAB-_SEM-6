import java.awt.*;
import java.awt.event.*;
import java.applet.Applet.*;
public class SimpleMenuExample extends Frame implements ActionListener
{
 Menu file, edit;
 public SimpleMenuExample()
 {
 MenuBar mb = new MenuBar(); // begin with creating menu bar
 setMenuBar(mb); // add menu bar to frame
 file = new Menu("File"); // create menus
 edit = new Menu("Edit");
 mb.add(file); // add menus to menu bar
 mb.add(edit);
 file.addActionListener(this); // link with ActionListener for event handling
 edit.addActionListener(this);
 file.add(new MenuItem("New"));
 file.add(new MenuItem("Open"));
 file.add(new MenuItem("Save"));
 file.addSeparator(); // separator line
 file.add(new MenuItem("Saveas"));
 file.add(new MenuItem("Print"));
 file.add(new MenuItem("Exit"));
 edit.add(new MenuItem("Cut"));
 edit.add(new MenuItem("Copy"));
 edit.add(new MenuItem("Paste"));
 edit.addSeparator(); // separator
 edit.add(new MenuItem("Find"));
 edit.add(new MenuItem("Replace"));
 edit.add(new MenuItem("GoTo"));
 setTitle("Simple Menu Program"); // frame creation methods
 setSize(300, 300);
 setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
 String str = e.getActionCommand(); // know the menu item selected by the user
 System.out.println("You selected " + str);
 }
 public static void main(String args[])
 {
 new SimpleMenuExample();
 }
}