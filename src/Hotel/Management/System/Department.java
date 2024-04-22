package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame {
    Department(){

        JPanel panel = new JPanel();
        panel.setBackground(new Color(25,76,140));
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(0,40,700,350);
        table.setBackground(new Color(25,76,140));
        table.setForeground(Color.white);
        panel.add(table);


        try{
            con c = new con();
            String departmentInfo = "SELECT * FROM DEPARTMENT";
            ResultSet resultSet = c.statement.executeQuery(departmentInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBounds(400,410,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel department = new JLabel("DEPARTMENT");
        department.setBounds(145,11,105,14);
        department.setForeground(Color.white);
        department.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(department);

        JLabel budget = new JLabel("BUDGET");
        budget.setBounds(445,11,105,14);
        budget.setForeground(Color.white);
        budget.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(budget);







        setUndecorated(true);
        setLayout(null);
        setLocation(550,150);
        setSize(700,500);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Department();
    }
}
