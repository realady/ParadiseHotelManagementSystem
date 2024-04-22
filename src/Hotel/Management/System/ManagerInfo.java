package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ManagerInfo extends JFrame {
    ManagerInfo(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(new Color(26,76,140));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,34,980,450);
        table.setForeground(Color.white);
        table.setBackground(new Color(26,76,140));
        panel.add(table);

        try{
            con c = new con();
            String EmployeeSQL = "SELECT * FROM EMPLOYEE WHERE JOB = 'MANAGER'";
            ResultSet resultSet = c.statement.executeQuery(EmployeeSQL);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }


        JButton back = new JButton("BACK");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(350,500,120,30);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel name = new JLabel("NAME");
        name.setForeground(Color.white);
        name.setFont(new Font("Tahoma", Font.BOLD, 17));
        name.setBounds(41,11,70,19);
        panel.add(name);

        JLabel age = new JLabel("AGE");
        age.setForeground(Color.white);
        age.setFont(new Font("Tahoma", Font.BOLD, 17));
        age.setBounds(159,11,70,19);
        panel.add(age);

        JLabel gender = new JLabel("GENDER");
        gender.setForeground(Color.white);
        gender.setFont(new Font("Tahoma", Font.BOLD, 17));
        gender.setBounds(273,11,90,19);
        panel.add(gender);

        JLabel job = new JLabel("JOB");
        job.setForeground(Color.white);
        job.setFont(new Font("Tahoma", Font.BOLD, 17));
        job.setBounds(416,11,70,19);
        panel.add(job);

        JLabel salary = new JLabel("SALARY");
        salary.setForeground(Color.white);
        salary.setFont(new Font("Tahoma", Font.BOLD, 17));
        salary.setBounds(536,11,70,19);
        panel.add(salary);

        JLabel phone = new JLabel("PHONE");
        phone.setForeground(Color.white);
        phone.setFont(new Font("Tahoma", Font.BOLD, 17));
        phone.setBounds(656,11,70,19);
        panel.add(phone);

        JLabel email = new JLabel("EMAIL");
        email.setForeground(Color.white);
        email.setFont(new Font("Tahoma", Font.BOLD, 17));
        email.setBounds(786,11,70,19);
        panel.add(email);

        JLabel aadhar = new JLabel("AADHAR");
        aadhar.setForeground(Color.white);
        aadhar.setFont(new Font("Tahoma", Font.BOLD, 17));
        aadhar.setBounds(896,11,90,19);
        panel.add(aadhar);


        setUndecorated(true);
        setLocation(430,100);
        setLayout(null);
        setSize(1000,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ManagerInfo();
    }
}
