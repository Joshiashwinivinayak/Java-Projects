/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
/**
 *
 * @author hp
 */
public class Helpline extends JFrame  {
    Helpline(){
        setBounds(500, 200, 1100, 700);
        getContentPane().setBackground(Color.YELLOW);
        setLayout(null);
        
        JLabel l1 = new JLabel("Shree Ganesh Tours and Travels - at your service 24 hours care ");
        l1.setFont(new Font("Tahoma", Font.BOLD,25));
        l1.setForeground(Color.RED);
        l1.setBounds(170, 30, 1000, 30);
        add(l1);
        
        JLabel l2 = new JLabel("If you need help then do get in touch with us");
        l2.setFont(new Font("Tahoma", Font.BOLD,25));
        l2.setForeground(Color.RED);
        l2.setBounds(170, 60, 1000, 30);
        add(l2);
        
        JLabel l3 = new JLabel("CONTACT US...");
        l3.setFont(new Font("Tahoma", Font.BOLD,30));
        l3.setForeground(Color.BLUE);
        l3.setBounds(250, 130, 1000, 30);
        add(l3);
        
        JLabel l4 = new JLabel("Address:");
        l4.setFont(new Font("Tahoma", Font.BOLD,25));
        l4.setForeground(Color.BLACK);
        l4.setBounds(250, 190, 1000, 30);
        add(l4);
        
        JLabel l5 = new JLabel("Shree Ganesh Tours amd Travels,");
        l5.setFont(new Font("Tahoma", Font.BOLD,20));
        l5.setForeground(Color.BLUE);
        l5.setBounds(250, 230, 1000, 30);
        add(l5);
        
        JLabel l6 = new JLabel("Near Ganesh Temple, Shivaji Chauk,");
        l6.setFont(new Font("Tahoma", Font.BOLD,20));
        l6.setForeground(Color.BLUE);
        l6.setBounds(250, 260, 1000, 30);
        add(l6);
        
        JLabel l7 = new JLabel("Main Road, Latur.");
        l7.setFont(new Font("Tahoma", Font.BOLD,20));
        l7.setForeground(Color.BLUE);
        l7.setBounds(250, 290, 1000, 30);
        add(l7);
        
        JLabel l8 = new JLabel("Helpline Number:");
        l8.setFont(new Font("Tahoma", Font.BOLD,25));
        l8.setForeground(Color.BLACK);
        l8.setBounds(250, 340, 1000, 30);
        add(l8);
        
        JLabel l9 = new JLabel("9092647835");
        l9.setFont(new Font("Tahoma", Font.BOLD,20));
        l9.setForeground(Color.BLUE);
        l9.setBounds(250, 380, 1000, 30);
        add(l9);
        
        JLabel l10 = new JLabel("Email:");
        l10.setFont(new Font("Tahoma", Font.BOLD,25));
        l10.setForeground(Color.BLACK);
        l10.setBounds(250, 430, 1000, 30);
        add(l10);
        
        JLabel l11 = new JLabel("shreeganeshtoursandtravels123@gmail.com");
        l11.setFont(new Font("Tahoma", Font.BOLD,20));
        l11.setForeground(Color.BLUE);
        l11.setBounds(250, 470, 1000, 30);
        add(l11);
        
        JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		setVisible(false);
		}
		});
		btnNewButton.setBounds(470, 550, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		add(btnNewButton);
}
    
    
            
    public static void main(String[] args){
    new Helpline().setVisible(true);
    }
}