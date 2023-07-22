/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ashish Katare
 */

package bank.management.sysytem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login , clear , signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){
        
        setTitle("AUTOMATIC TELLER MACHINE");
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text = new JLabel("Welcome To ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
         JLabel cardno = new JLabel("CARD NO:");
        cardno.setFont(new Font("Railway",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
         JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Railway",Font.BOLD,28));
        pin.setBounds(120,220,400,30);
        add(pin);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("arial",Font.BOLD,14));
        add(cardTextField);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        add(pinTextField);
        
        login = new JButton("SIGN IN");
        login.setBounds(300 , 300 , 100 , 30);
        add(login);
        login.addActionListener(this);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430 , 300 , 100 , 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
         clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGNUP");
        signup.setBounds(300 , 350 , 230 , 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
         signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800 , 480);
        setVisible(true);
        setLocation(350,200);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String card1 = cardTextField.getText();
        String pin1 = pinTextField.getText();
        
        long num2 = signup3.num;
        long num3 = signup3.num1;
        
        String card2 = "" + num2;
        String pin2 = "" + num3;
        
        if(ae.getSource()== clear){
            cardTextField.setText("");
            pinTextField.setText("");
            
        }else if(ae.getSource()== login){
            if(card1.equals("")){
                JOptionPane.showMessageDialog(null, "please enter Card number , if you don't have click on signup" );
            }
            else if(card1.equals(card2) && pin1.equals(pin2)){
                setVisible(false);
                new Transaction().setVisible(true);
            }
            else if(!card1.equals(card2) || !pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null, "please enter valid card number and pin number" );
            }
        }
        else if(ae.getSource()== signup){
            setVisible(false);
            new signup1().setVisible(true);
            
        }
    }
    
    public static void main(String args[]){
        new Login();
    }
    
}
