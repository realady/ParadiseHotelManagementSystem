package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoom extends JFrame implements ActionListener {
    JTextField t2,t4;
    JComboBox t3,t5,t6;
    JButton b1,b2;
    AddRoom(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,875,490);
        panel.setBackground(new Color(25,76,140));
        panel.setLayout(null);
        add(panel);

        JLabel l1 = new JLabel("Add Room");
        l1.setBounds(194,10,160,22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 22));
        l1.setForeground(Color.white);
        panel.add(l1);

        JLabel l2 = new JLabel("Room Number");
        l2.setBounds(64,70,152,22);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        l2.setForeground(Color.white);
        panel.add(l2);

        t2=new JTextField();
        t2.setBounds(200,70,156,20);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t2.setForeground(Color.white);
        t2.setBackground(new Color(0,144,240));
        panel.add(t2);

        JLabel l3 = new JLabel("Availability");
        l3.setBounds(64,110,152,22);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setForeground(Color.white);
        panel.add(l3);

        t3=new JComboBox(new String[] {"Available", "Occupied"});
        t3.setBounds(200,110,156,20);
        t3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t3.setForeground(Color.white);
        t3.setBackground(new Color(0,144,240));
        panel.add(t3);

        JLabel l4 = new JLabel("Price");
        l4.setBounds(64,150,152,22);
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        l4.setForeground(Color.white);
        panel.add(l4);

        t4=new JTextField();
        t4.setBounds(200,150,156,20);
        t4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t4.setForeground(Color.white);
        t4.setBackground(new Color(0,144,240));
        panel.add(t4);

        JLabel l5 = new JLabel("Cleaning Status");
        l5.setBounds(64,190,152,22);
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        l5.setForeground(Color.white);
        panel.add(l5);

        t5=new JComboBox(new String[] {"Cleaned", "Dirty"});
        t5.setBounds(200,190,156,20);
        t5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t5.setForeground(Color.white);
        t5.setBackground(new Color(0,144,240));
        panel.add(t5);

        JLabel l6 = new JLabel("Bed Type");
        l6.setBounds(64,230,152,22);
        l6.setFont(new Font("Tahoma",Font.BOLD,14));
        l6.setForeground(Color.white);
        panel.add(l6);

        t6=new JComboBox(new String[] {"Single Bed", "Double Bed"});
        t6.setBounds(200,230,156,20);
        t6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t6.setForeground(Color.white);
        t6.setBackground(new Color(0,144,240));
        panel.add(t6);

        b1 = new JButton("Add");
        b1.setBounds(64,321,111,33);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(198,321,111,33);
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/roomser.png"));
        Image image = i1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(500,60,300,300);
        panel.add(label);




        setUndecorated(true);
        setLocation(20,200);
        setLayout(null);
        setSize(885,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource()==b1){
                try{
                    con c = new con();

                    String room = t2.getText();
                    String ava = (String) t3.getSelectedItem();
                    String status = (String) t5.getSelectedItem();
                    String price = t4.getText();
                    String type = (String) t6.getSelectedItem();

                    String q = "INSERT INTO ROOM VALUES('"+room+"', '"+ava+"', '"+status+"', '"+price+"', '"+type+"')";
                    c.statement.executeUpdate(q);

                    JOptionPane.showMessageDialog(null, "Room Added Successfully");
                    setVisible(false);


                }catch (Exception x){
                    x.printStackTrace();
                }
            }else{
                setVisible(false);

            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new AddRoom();
    }
}
