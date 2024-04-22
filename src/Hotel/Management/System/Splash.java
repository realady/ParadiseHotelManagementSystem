package Hotel.Management.System;
import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/cccc.gif"));
        getContentPane().setBackground(new Color(25,76,140));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,858,680);
        add(label);
        setUndecorated(true);
        setLayout(null);
        setLocation(300, 80);
        setSize(858, 680);
        setVisible(true);
        try{
            Thread.sleep(2000);
            new Login();
            setVisible(false);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}