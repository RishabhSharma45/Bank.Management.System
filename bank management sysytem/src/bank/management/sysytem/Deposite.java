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

public class Deposite extends JFrame implements ActionListener {
    
    JButton dep,exit;
    JTextField headTextField;
    public static long num,num1,num2;
    
    Deposite(){
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        
        setTitle("deposite");
        setSize(900,850);
        setLocation(250,10);
        setVisible(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,850);
        add(image);
        
        JLabel head = new JLabel("enter amount want to deposite");
         head.setBounds(200,200,250,200);
        head.setFont(new Font("Osward",Font.BOLD,16));
        head.setForeground(Color.WHITE);
        image.add(head);
        
        headTextField = new JTextField();
        headTextField.setBounds(200,330,250,25);
        headTextField.setFont(new Font("Osward",Font.BOLD,15));
        image.add(headTextField);
        
        dep = new JButton("Deposite");
        dep.setBackground(Color.WHITE);
        dep.setForeground(Color.BLACK);
        dep.setBounds(390,430,110,30);
        image.add(dep);
        dep.addActionListener(this);
        
         exit = new JButton("Back");
        exit.setBackground(Color.WHITE);
        exit.setForeground(Color.BLACK);
        exit.setBounds(390,475,110,30);
        image.add(exit);
        exit.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        Random rando = new Random();
        
        
        String dep1 = headTextField.getText();
        
        if(dep1.equals("")){
            JOptionPane.showMessageDialog(null, "enter amount");
        }if(dep1.matches("[a-zA-Z]")){
            JOptionPane.showMessageDialog(null, "enter correct amount");
        }
        
        if(ae.getSource()==exit){
            setVisible(false);
            new Transaction().setVisible(true);
        }else if(!dep1.equals("") && !dep1.matches("[a-zA-Z]") && ae.getSource()== dep){
            num = Transaction.n;
            num1 = Long.parseLong(dep1);
            num2 = num+num1;
            JOptionPane.showMessageDialog(null, "transaction successful " + "\n" + "total balance :- ₹" +num2);
            setVisible(false);
            new Transaction().setVisible(true);
        }
        
    }
        
    
    public static void main(String args[]){
        new Deposite();
    }
}
