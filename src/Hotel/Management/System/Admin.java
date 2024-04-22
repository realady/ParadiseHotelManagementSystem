package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {
    JButton add_employee, add_room, add_driver, logout, back;
    Admin(){

        add_employee = new JButton("ADD EMPLOYEE");
        add_employee.setBounds(250,230,200,30);
        add_employee.setBackground(Color.white);
        add_employee.setForeground(Color.black);
        add_employee.setFont(new Font("Tahoma",Font.BOLD,15));
        add_employee.addActionListener(this);
        add(add_employee);

        add_room = new JButton("ADD ROOM");
        add_room.setBounds(250,380,200,30);
        add_room.setBackground(Color.white);
        add_room.setForeground(Color.black);
        add_room.setFont(new Font("Tahoma",Font.BOLD,15));
        add_room.addActionListener(this);
        add(add_room);

        add_driver = new JButton("ADD DRIVER");
        add_driver.setBounds(250,530,200,30);
        add_driver.setBackground(Color.white);
        add_driver.setForeground(Color.black);
        add_driver.setFont(new Font("Tahoma",Font.BOLD,15));
        add_driver.addActionListener(this);
        add(add_driver);

        logout = new JButton("LOGOUT");
        logout.setBounds(10,800,150,30);
        logout.setBackground(Color.black);
        logout.setForeground(Color.white);
        logout.setFont(new Font("Tahoma",Font.BOLD,15));
        logout.addActionListener(this);
        add(logout);

        back = new JButton("BACK");
        back.setBounds(210,800,150,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.addActionListener(this);
        add(back);

        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image l11 = l1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(l11);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(70,180,120,120);
        add(label);

        ImageIcon l111 = new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image l1111 = l111.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(l1111);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(70,340,120,120);
        add(label1);

        ImageIcon l2 = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image l12 = l2.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(l12);
        JLabel label2 = new JLabel(imageIcon2);
        label2.setBounds(70,500,120,120);
        add(label2);

        ImageIcon l3 = new ImageIcon(ClassLoader.getSystemResource("icon/cccc.gif"));
        Image l13 = l3.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        ImageIcon imageIcon3 = new ImageIcon(l13);
        JLabel label3 = new JLabel(imageIcon3);
        label3.setBounds(1000,250,500,500);
        add(label3);

        getContentPane().setBackground(new Color(25,76,140));
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource()==add_employee){
                new AddEmployee();
            }else if(e.getSource()==add_room){
                new AddRoom();
            }else if(e.getSource()==add_driver){
                new AddDriver();
            } else if (e.getSource()==logout) {
                System.exit(102);
            }else if(e.getSource()==back){
                new Dashboard();
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Admin();
    }
}
