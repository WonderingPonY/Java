import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.event.*;

public class gallery extends JFrame
{
  //Constucor for the tabbed pane
  public gallery()
  {
    setTitle("Gracey");
    setSize(300,300);
    JTabbedPane jtp = new JTabbedPane();
    //Template
    getContentPane().add(jtp);
    //TABS
    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();
    //Non-Editable label
      //No.1
    JLabel label1 = new JLabel();
    label1.setText("Home");
    jp1.add(label1);
    //Adds tabs to tabbed pane object
    jtp.addTab("Tab1", jp1);
    jtp.addTab("Tab2", jp2);
    //Tab2 Button "press"
    JButton test = new JButton("Press");
    jp2.add(test);
  }
  //Example Usage
  public static void main (String []args)
  {
    gallery tab = new gallery();
  }
}
