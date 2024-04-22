package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame {
    JTable table;
    JButton back;
    Room(){
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 890,590);
        panel.setBackground(new Color(25,76,140));
        panel.setLayout(null);
        add(panel);


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(600,200,200,200);
        panel.add(label);

        table = new JTable();
        table.setBounds(10,40,500,400);
        table.setBackground(new Color(25,76,140));
        table.setForeground(Color.white);
        panel.add(table);

        try{
            con c = new con();
            String RoomInfo = "SELECT * FROM ROOM";
            ResultSet resultSet = c.statement.executeQuery(RoomInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch(Exception e){
            e.printStackTrace();
        }

        back = new JButton("BACK");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(200,500,120,30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        panel.add(back);

        JLabel availability = new JLabel("AVAILABILITY");
        availability.setBounds(112,15,80,19);
        availability.setForeground(Color.white);
        availability.setFont(new Font("Tahoma", Font.BOLD,10));
        panel.add(availability);

        JLabel clean = new JLabel("CLEANING STATUS");
        clean.setBounds(210,15,150,19);
        clean.setForeground(Color.white);
        clean.setFont(new Font("Tahoma", Font.BOLD,10));
        panel.add(clean);

        JLabel price = new JLabel("PRICE");
        price.setBounds(330,15,150,19);
        price.setForeground(Color.white);
        price.setFont(new Font("Tahoma", Font.BOLD,10));
        panel.add(price);

        JLabel bed = new JLabel("BED TYPE");
        bed.setBounds(417,15,150,19);
        bed.setForeground(Color.white);
        bed.setFont(new Font("Tahoma", Font.BOLD,10));
        panel.add(bed);

        JLabel room = new JLabel("ROOM NO.");
        room.setBounds(12,15,150,19);
        room.setForeground(Color.white);
        room.setFont(new Font("Tahoma", Font.BOLD,10));
        panel.add(room);


        setUndecorated(true);
        setLayout(null);
        setLocation(500,100);
        setSize(900,600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Room();
    }

}
