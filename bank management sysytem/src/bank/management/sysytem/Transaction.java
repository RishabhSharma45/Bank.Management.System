package bank.management.sysytem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ashish Katare
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Transaction extends JFrame implements ActionListener{
    
    JButton deposite,withdraw,checkbalance,state,exit;
    public static long n;
    
    Transaction(){
        
        getContentPane().setBackground(Color.WHITE);
      
        setLayout(null);
        setTitle("transactions");
        setSize(900,850);
        setLocation(250,10);
        setVisible(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 850,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,850);
        add(image);
        
        JLabel head = new JLabel("press to select services");
        head.setBounds(200,200,250,200);
        head.setFont(new Font("Osward",Font.BOLD,20));
        head.setForeground(Color.WHITE);
        image.add(head);
        
         deposite = new JButton("Deposite");
        deposite.setBackground(Color.WHITE);
        deposite.setForeground(Color.BLACK);
        deposite.setBounds(160,390,125,30);
        deposite.addActionListener(this);
        image.add(deposite);
        
         withdraw = new JButton("Withdraw");
        withdraw.setBackground(Color.WHITE);
        withdraw.setForeground(Color.BLACK);
        withdraw.setBounds(390,390,110,30);
        image.add(withdraw);
        withdraw.addActionListener(this);
        
         checkbalance = new JButton("CheckBalance");
        checkbalance.setBackground(Color.WHITE);
        checkbalance.setForeground(Color.BLACK);
        checkbalance.setBounds(160,430,125,30);
        image.add(checkbalance);
        checkbalance.addActionListener(this);
        
         state = new JButton("E-statement");
        state.setBackground(Color.WHITE);
        state.setForeground(Color.BLACK);
        state.setBounds(390,430,110,30);
        image.add(state);
        state.addActionListener(this);
        
         exit = new JButton("Exit");
        exit.setBackground(Color.WHITE);
        exit.setForeground(Color.BLACK);
        exit.setBounds(390,475,110,30);
        exit.addActionListener(this);
        image.add(exit);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        Random rando = new Random();
        n = Math.abs(rando.nextLong())%90000l + 10000l;
        
        
        if(ae.getSource()==exit){
            System.exit(0);
        }
        if(ae.getSource()==deposite){
            setVisible(false);
            new Deposite().setVisible(true);
        }
        if(ae.getSource()==checkbalance){
            if(Deposite.num2==0){
            n = n + Deposite.num2;
            JOptionPane.showMessageDialog(null, n);
        }
            else if(Deposite.num2!=0){
                JOptionPane.showMessageDialog(null,"₹" + Deposite.num2);
                
            }
                    
        }
    }
    
    
    public static void main(String args[]){
        new Transaction();
    }
    
}
