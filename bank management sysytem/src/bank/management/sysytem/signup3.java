/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.sysytem;

/**
 *
 * @author Ashish Katare
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class signup3 extends JFrame implements ActionListener{
    
    JButton submit;
    JLabel ac;
    JRadioButton type,type1;
    JCheckBox atm,cheq,statement,check,decl;
    public static long num,num1;
    
    signup3(){
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        setTitle("response page");
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JLabel title = new JLabel("Page 3 - Account Details");
        title.setBounds(250 ,20 ,500,100);
        title.setFont(new Font("Osward",Font.BOLD,30));
        add(title);
        
        ac = new JLabel("Account Type");
        ac.setBounds(100 ,120 ,200,100);
        ac.setFont(new Font("Osward",Font.BOLD,25));
        add(ac);
        
        type = new JRadioButton("Current");
        type.setBounds(150,210,100,20);
        type.setFont(new Font("Raleway",Font.BOLD,20));
        type.setBackground(Color.WHITE);
        add(type);
        
        type1 = new JRadioButton("Saving");
        type1.setBounds(300,210,200,20);
        type1.setFont(new Font("Raleway",Font.BOLD,20));
        type1.setBackground(Color.WHITE);
        add(type1);
        
        ButtonGroup rs = new ButtonGroup();
        rs.add(type);
        rs.add(type1);
        
        JLabel cardno = new JLabel("CARD NUMBER :");
        cardno.setBounds(100 ,270 ,200,100);
        cardno.setFont(new Font("Osward",Font.BOLD,23));
        add(cardno);
        
         JLabel acc = new JLabel("Your 16 digit card number");
        acc.setBounds(100 ,300 ,200,100);
        acc.setFont(new Font("Osward",Font.BOLD,15));
        add(acc);
        
         JLabel pin = new JLabel("PIN                      :");
        pin.setBounds(100 ,350 ,200,100);
        pin.setFont(new Font("Osward",Font.BOLD,23));
        add(pin);
        
        JLabel accc = new JLabel("Your 4 digit card number");
        accc.setBounds(100 ,370 ,200,100);
        accc.setFont(new Font("Osward",Font.BOLD,15));
        add(accc);
        
        JLabel card = new JLabel("XXXX-XXXX-XXXX-1456");
        card.setBounds(310 ,270 ,300,100);
        card.setFont(new Font("Osward",Font.BOLD,23));
        add(card);
        
        JLabel p = new JLabel("XXX1");
        p.setBounds(310 ,350 ,200,100);
        p.setFont(new Font("Osward",Font.BOLD,23));
        add(p);
        
        JLabel services = new JLabel("Services -");
        services.setBounds(100 ,450 ,200,100);
        services.setFont(new Font("Osward",Font.BOLD,25));
        add(services);
        
        
        atm = new JCheckBox("ATM");
        atm.setBounds(150,530,100,20);
        atm.setFont(new Font("Osward",Font.BOLD,20));
        atm.setBackground(Color.WHITE);
        add(atm);
        
        cheq = new JCheckBox("Cheqbook");
        cheq.setBounds(300,530,200,20);
        cheq.setFont(new Font("Osward",Font.BOLD,20));
        cheq.setBackground(Color.WHITE);
        add(cheq);
        
        statement = new JCheckBox("Statement");
        statement.setBounds(150,580,150,20);
        statement.setFont(new Font("Osward",Font.BOLD,20));
        statement.setBackground(Color.WHITE);
        add(statement);
        
        check = new JCheckBox("Check Balance");
        check.setBounds(300,580,200,20);
        check.setFont(new Font("Osward",Font.BOLD,20));
        check.setBackground(Color.WHITE);
        add(check);
        
        decl = new JCheckBox("I declared that all the details given by me are correct");
        decl.setBounds(100,650,700,20);
        decl.setFont(new Font("Osward",Font.BOLD,15));
        decl.setBackground(Color.WHITE);
        add(decl);
        
        submit = new JButton("SUBMIT");
        submit.setBounds(100,700,150,50);
        submit.setFont(new Font("Osward",Font.BOLD,20));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        add(submit);
        submit.addActionListener(this);
    }
        
        public void actionPerformed(ActionEvent ae){
            
            Random rando = new Random();
            num = Math.abs(rando.nextLong()) %9000000l + 5593120000000000l;
            num1 = Math.abs(rando.nextLong()) %9000l + 1000l;
            
            String ac1 = null;
            if(type.isSelected()){
                ac1 = "Current";
            }if(type1.isSelected()){
                ac1 = "Saving";  
            }
            String atm1 = null;
            if(atm.isSelected()){
                atm1 = "ATM";
            }else if(cheq.isSelected()){
                atm1 = "cheq";
            }else if(statement.isSelected()){
                atm1 = "statement";
            }else if(check.isSelected()){
                atm1 = "check";
            }
            
            String decl1 = null;
            if(decl.isSelected()){
                decl1 = "decl";
            }
            
            if(ac1==null){
                JOptionPane.showMessageDialog(null, "select account type");
            }if(atm1==null){
                JOptionPane.showMessageDialog(null, "service is not selected");
            }if(decl1==null){
                JOptionPane.showMessageDialog(null, "fill the declaration checkbox");
            }
            else if(ac1!=null && atm1!=null && decl1!=null && ae.getSource()==submit){
                JOptionPane.showMessageDialog(null, "Card Number :-" + num + "\n" + "Pin :-" +num1);
                setVisible(false);
                new Login().setVisible(true);
            }
            
        }
        
    
    public static void main(String args[]){
        new signup3();
    }
    
}
