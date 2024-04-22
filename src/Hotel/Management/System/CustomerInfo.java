package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame {
    CustomerInfo(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(25,76,140));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,40,900,450);
        table.setBackground(new Color(25,76,140));
        table.setForeground(Color.white);
        panel.add(table);

        try{
            con c = new con();
            String q = "SELECT * FROM CUSTOMER";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel id = new JLabel("ID");
        id.setBounds(31,11,46,14);
        id.setForeground(Color.white);
        id.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(id);

        JLabel number = new JLabel("ID NUMBER");
        number.setBounds(150,11,100,14);
        number.setForeground(Color.white);
        number.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(number);

        JLabel name = new JLabel("NAME");
        name.setBounds(270,11,100,14);
        name.setForeground(Color.white);
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(name);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(360,11,100,14);
        gender.setForeground(Color.white);
        gender.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(gender);

        JLabel country = new JLabel("COUNTRY");
        country.setBounds(480,11,100,14);
        country.setForeground(Color.white);
        country.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(country);

        JLabel room = new JLabel("ROOM");
        room.setBounds(600,11,100,14);
        room.setForeground(Color.white);
        room.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(room);

        JLabel cit = new JLabel("CHECK IN TIME");
        cit.setBounds(680,11,120,14);
        cit.setForeground(Color.white);
        cit.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(cit);

        JLabel depsoit = new JLabel("DEPOSIT");
        depsoit.setBounds(810,11,100,14);
        depsoit.setForeground(Color.white);
        depsoit.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(depsoit);

        JButton back = new JButton("BACK");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(450,510,120,30);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setLayout(null);
        setSize(900, 600);
        setLocation(500,100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new CustomerInfo();
    }
}
