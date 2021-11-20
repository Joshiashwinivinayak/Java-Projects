package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class SelectDestination extends JFrame implements ActionListener {
    Choice c1;
    JLabel l21, l22, l23, l24, l25, l26;
    JButton b1, b2;
    SelectDestination(String username, String dname){
        setBounds(550, 240, 1100, 550);
        getContentPane().setBackground(Color.YELLOW);
        setLayout(null);
        
        JLabel l1 = new JLabel("SELECT DESTINATION");
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        l1.setForeground(Color.RED);
        l1.setBounds(100, 0, 400, 30);
        add(l1);
        
        JLabel l2 = new JLabel("Username: ");
        l2.setBounds(20, 70, 100, 30);
        add(l2);
        
        l21 = new JLabel();
        l21.setBounds(250, 70, 170, 30);
        add(l21);
        
        
        
        l26 = new JLabel();
        l26.setBounds(250, 70, 170, 30);
        add(l26);
        
        JLabel l3 = new JLabel("Select Destination: ");
        l3.setBounds(20, 110, 150, 30);
        add(l3);
        
        c1 = new Choice();
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from destination");
            while(rs.next()){
                c1.add(rs.getString("dname"));
                
            }
        }catch(Exception e){}
        c1.setBounds(250, 110, 170, 30);
        add(c1);
        
        JLabel l8 = new JLabel("ID: ");
        l8.setBounds(20, 150, 100, 30);
        add(l8);
        
        l22 = new JLabel();
        l22.setBounds(250, 150, 170, 30);
        add(l22);
        
        JLabel l9 = new JLabel("Number: ");
        l9.setBounds(20, 190, 100, 30);
        add(l9);
        
        l23 = new JLabel();
        l23.setBounds(250, 190, 170, 30);
        add(l23);
        
        JLabel l10 = new JLabel("Phone: ");
        l10.setBounds(20, 230, 100, 30);
        add(l10);
        
        l24 = new JLabel();
        l24.setBounds(250, 230, 170, 30);
        add(l24);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
            while(rs.next()){
               l21.setText(rs.getString("username"));
               l22.setText(rs.getString("id"));
               l23.setText(rs.getString("number"));
               l24.setText(rs.getString("phone"));
            
            }
        }catch(SQLException e){}
         
        
        
        b1 = new JButton("Book");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100, 400, 120, 30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(250, 400, 120, 30);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/manali1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 =new JLabel(i3);
        l12.setBounds(470, 50, 600, 400);
        add(l12);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try{
              Conn c = new Conn();
              c.s.executeUpdate("insert into selectdestination values('"+l21.getText()+"', '"+c1.getSelectedItem()+"', '"+l22.getText()+"', '"+l23.getText()+"', '"+l24.getText()+"')");
              
              JOptionPane.showMessageDialog(null, "Destination Selected Successfully");
              
              this.setVisible(false);
            }catch(Exception e){}
        }else if(ae.getSource() == b2){
          this.setVisible(false);
        }
    }
    
    public static void main(String[] args){
    new SelectDestination("","").setVisible(true);
    }
}

        
    
    

    
    
    
   