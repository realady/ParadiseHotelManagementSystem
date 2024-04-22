package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDriver extends JFrame implements ActionListener {
    JTextField nameText, ageText, carCText, carNText, locText;
    JComboBox comboBox, comboBox2;
    JButton add, back;
    AddDriver(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(25, 76, 140));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("ADD DRIVERS");
        label.setBounds(194,10,200,22);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD, 22));
        panel.add(label);

        JLabel name = new JLabel("NAME");
        name.setBounds(64,70,102,22);
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        name.setForeground(Color.WHITE);
        panel.add(name);
        nameText = new JTextField();
        nameText.setBounds(174,70,156,20);
        nameText.setFont(new Font("Tahoma", Font.BOLD, 14));
        nameText.setForeground(Color.WHITE);
        nameText.setBackground(new Color(0, 140, 240));
        panel.add(nameText);

        JLabel age = new JLabel("AGE");
        age.setBounds(64,110,102,22);
        age.setFont(new Font("Tahoma", Font.BOLD, 14));
        age.setForeground(Color.WHITE);
        panel.add(age);
        ageText = new JTextField();
        ageText.setBounds(174,110,156,20);
        ageText.setFont(new Font("Tahoma", Font.BOLD, 14));
        ageText.setForeground(Color.WHITE);
        ageText.setBackground(new Color(0, 140, 240));
        panel.add(ageText);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(64,150,102,22);
        gender.setFont(new Font("Tahoma", Font.BOLD, 14));
        gender.setForeground(Color.WHITE);
        panel.add(gender);
        comboBox = new JComboBox(new String[]{"Male", "Female"});
        comboBox.setBounds(176,150,154,20);
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        comboBox.setForeground(Color.WHITE);
        comboBox.setBackground(new Color(0, 140, 240));
        panel.add(comboBox);

        JLabel carC = new JLabel("CAR COMPANY");
        carC.setBounds(64,190,110,22);
        carC.setFont(new Font("Tahoma", Font.BOLD, 14));
        carC.setForeground(Color.WHITE);
        panel.add(carC);
        carCText = new JTextField();
        carCText.setBounds(174,190,156,20);
        carCText.setFont(new Font("Tahoma", Font.BOLD, 14));
        carCText.setForeground(Color.WHITE);
        carCText.setBackground(new Color(0, 140, 240));
        panel.add(carCText);

        JLabel carN = new JLabel("CAR NAME");
        carN.setBounds(64,230,102,22);
        carN.setFont(new Font("Tahoma", Font.BOLD, 14));
        carN.setForeground(Color.WHITE);
        panel.add(carN);
        carNText = new JTextField();
        carNText.setBounds(174,230,156,20);
        carNText.setFont(new Font("Tahoma", Font.BOLD, 14));
        carNText.setForeground(Color.WHITE);
        carNText.setBackground(new Color(0, 140, 240));
        panel.add(carNText);

        JLabel available = new JLabel("AVAILABLE");
        available.setBounds(64,270,102,22);
        available.setFont(new Font("Tahoma", Font.BOLD, 14));
        available.setForeground(Color.WHITE);
        panel.add(available);
        comboBox2 = new JComboBox(new String[]{"Yes", "No"});
        comboBox2.setBounds(176,270,154,20);
        comboBox2.setFont(new Font("Tahoma", Font.BOLD, 14));
        comboBox2.setForeground(Color.WHITE);
        comboBox2.setBackground(new Color(0, 140, 240));
        panel.add(comboBox2);

        JLabel loc = new JLabel("LOCATION");
        loc.setBounds(64,310,102,22);
        loc.setFont(new Font("Tahoma", Font.BOLD, 14));
        loc.setForeground(Color.WHITE);
        panel.add(loc);
        locText = new JTextField();
        locText.setBounds(174,310,156,20);
        locText.setFont(new Font("Tahoma", Font.BOLD, 14));
        locText.setForeground(Color.WHITE);
        locText.setBackground(new Color(0, 140, 240));
        panel.add(locText);

        add = new JButton("ADD");
        add.setBounds(64,380,111,33);
        add.setBackground(Color.black);
        add.setForeground(Color.white);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(198,380,111,33);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/license.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(500,60,300,300);
        panel.add(label1);

        setUndecorated(true);
        setLocation(20,200);
        setLayout(null);
        setSize(900,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){
            String name = nameText.getText();
            String age = ageText.getText();
            String gender = (String) comboBox.getSelectedItem();
            String company = carCText.getText();
            String carname = carNText.getText();
            String available = (String) comboBox2.getSelectedItem();
            String location = locText.getText();
            try{
                con c = new con();
                String q = "INSERT INTO DRIVER VALUES('"+name+"', '"+age+"', '"+gender+"', '"+company+"', '"+carname+"', '"+available+"', '"+location+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Driver Added");
                setVisible(false);
            }catch (Exception err){
                err.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddDriver();
    }

}
