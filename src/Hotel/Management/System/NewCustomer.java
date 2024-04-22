package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class NewCustomer extends JFrame implements ActionListener {
    JComboBox comboBox;
    JTextField textFieldNumber , textFieldName, textFieldCountry, textFieldDeposit;
    JRadioButton r1, r2;
    Choice c1;
    JLabel date;
    JButton add, back;
    NewCustomer(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setLayout(null);
        panel.setBackground(new Color(25,76,140));
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel imgLabel = new JLabel(imageIcon1);
        imgLabel.setBounds(550,150,200,200);
        panel.add(imgLabel);

        JLabel labelName = new JLabel("NEW CUSTOMER FORM");
        labelName.setBounds(118,11,260,53);
        labelName.setFont(new Font("Tahoma", Font.BOLD, 20));
        labelName.setForeground(Color.white);
        panel.add(labelName);

        JLabel labelID = new JLabel("ID : ");
        labelID.setBounds(35,76,200,14);
        labelID.setForeground(Color.white);
        labelID.setFont(new Font("Tahoma",Font.PLAIN, 14));
        panel.add(labelID);

        comboBox = new JComboBox(new String[]{"Passport", "Aadhar", "Voter ID", "Driving License"});
        comboBox.setBounds(271,73,150,20);
        comboBox.setForeground(Color.white);
        comboBox.setBackground(new Color(0,144,240));
        comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(comboBox);

        JLabel number = new JLabel("NUMBER : ");
        number.setBounds(35,111,200,14);
        number.setForeground(Color.white);
        number.setFont(new Font("Tahoma",Font.PLAIN, 14));
        panel.add(number);
        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(271,111,150,20);
        textFieldNumber.setForeground(Color.white);
        textFieldNumber.setBackground(new Color(0,144,240));
        panel.add(textFieldNumber);

        JLabel name = new JLabel("NAME : ");
        name.setBounds(35,151,200,14);
        name.setForeground(Color.white);
        name.setFont(new Font("Tahoma",Font.PLAIN, 14));
        panel.add(name);
        textFieldName = new JTextField();
        textFieldName.setBounds(271,151,150,20);
        textFieldName.setForeground(Color.white);
        textFieldName.setBackground(new Color(0,144,240));
        panel.add(textFieldName);

        JLabel gender = new JLabel("GENDER : ");
        gender.setBounds(35,191,200,14);
        gender.setForeground(Color.white);
        gender.setFont(new Font("Tahoma",Font.PLAIN, 14));
        panel.add(gender);
        r1=new JRadioButton("Male");
        r1.setForeground(Color.white);
        r1.setFont(new Font("Tahoma", Font.BOLD,14));
        r1.setBounds(271,191,80,12);
        r1.setBackground(new Color(25,76,140));
        panel.add(r1);
        r2=new JRadioButton("Female");
        r2.setForeground(Color.white);
        r2.setFont(new Font("Tahoma25", Font.BOLD,14));
        r2.setBounds(350,191,80,12);
        r2.setBackground(new Color(25,76,140));
        panel.add(r2);

        JLabel country = new JLabel("COUNTRY : ");
        country.setBounds(35,231,200,14);
        country.setForeground(Color.white);
        country.setFont(new Font("Tahoma",Font.PLAIN, 14));
        panel.add(country);
        textFieldCountry = new JTextField();
        textFieldCountry.setBounds(271,231,150,20);
        textFieldCountry.setForeground(Color.white);
        textFieldCountry.setBackground(new Color(0,144,240));
        panel.add(textFieldCountry);

        JLabel room = new JLabel("ALLOCATED ROOM NUMBER : ");
        room.setBounds(35,274,200,14);
        room.setForeground(Color.white);
        room.setFont(new Font("Tahoma",Font.PLAIN, 14));
        panel.add(room);
        c1=new Choice();
        try{
            con c = new con();
            ResultSet resultSet = c.statement.executeQuery("SELECT * FROM ROOM WHERE AVAILABILITY = 'Available'");
            while(resultSet.next()){
               c1.add(resultSet.getString("roomnumber"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        c1.setBounds(271,274,150,20);
        c1.setFont(new Font("Tahoma", Font.BOLD,14));
        c1.setForeground(Color.white);
        c1.setBackground(new Color(25,76,140));
        panel.add(c1);

        JLabel cis = new JLabel("CHECKED-IN : ");
        cis.setBounds(35,316,200,14);
        cis.setForeground(Color.white);
        cis.setFont(new Font("Tahoma",Font.PLAIN, 14));
        panel.add(cis);

        Date date1 = new Date();

        date = new JLabel(""+date1);
        date.setBounds(271,316,200,14);
        date.setForeground(Color.white);
        date.setFont(new Font("Tahoma",Font.PLAIN, 14));
        panel.add(date);

        JLabel deposit = new JLabel("DEPOSIT : ");
        deposit.setBounds(35,359,200,14);
        deposit.setForeground(Color.white);
        deposit.setFont(new Font("Tahoma",Font.PLAIN, 14));
        panel.add(deposit);
        textFieldDeposit = new JTextField();
        textFieldDeposit.setBounds(271,359,150,20);
        textFieldDeposit.setForeground(Color.white);
        textFieldDeposit.setBackground(new Color(0,144,240));
        panel.add(textFieldDeposit);

        add = new JButton("ADD");
        add.setBounds(100,430,120,30);
        add.setBackground(Color.black);
        add.setForeground(Color.white);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(260,430,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        panel.add(back);

        setUndecorated(true);
        setLayout(null);
        setLocation(500,150);
        setSize(850,550);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){
            con c = new con();
            String radioBTn = null;
            if(r1.isSelected()){
                radioBTn="Male";
            }else if(r2.isSelected()){
                radioBTn="Female";
            }
            String s1 = (String) comboBox.getSelectedItem();
            String s2 = textFieldNumber.getText();
            String s3 = textFieldName.getText();
            String s4 = radioBTn;
            String s5 = textFieldCountry.getText();
            String s6 = c1.getSelectedItem();
            String s7 = date.getText();
            String s8 = textFieldDeposit.getText();

            try {
                String q = "INSERT INTO CUSTOMER VALUES('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
                String q1 = "UPDATE ROOM SET AVAILABILITY = 'Occupied' WHERE ROOMNUMBER = '"+s6+"'";
                c.statement.executeUpdate(q);
                c.statement.executeUpdate(q1);
                JOptionPane.showMessageDialog(null,"ADDED SUCCESSFULLY");
                setVisible(false);
            }catch (Exception err){
                err.printStackTrace();
            }

        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new NewCustomer();
    }
}
