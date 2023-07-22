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
 import java.util.*;
 import java.awt.event.*;

public class signup1 extends JFrame implements ActionListener {
    
    Long random;
    JTextField nameTextField,fnameTextField,emailTextField,pTextField,addressTextField,cityTextField ,stateTextField;
    JRadioButton male,female,married,unmarried;
    JButton next;
    
    signup1(){
        
        setLayout(null);
        
        Random ran = new Random();
       random = Math.abs((ran.nextLong()% 900L) + 1000L);
        
        JLabel formno = new JLabel("application form No. " + random );
        formno.setFont(new Font("raleway",Font.BOLD ,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personalDetails = new JLabel("page I : Personal Details");
        personalDetails.setFont(new Font("raleway",Font.BOLD ,22));
        personalDetails.setBounds(250,80,400,30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name :");
        name.setFont(new Font("raleway",Font.BOLD ,22));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("raleway",Font.BOLD,20));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        
        JLabel fname = new JLabel("Fathers Name :");
        fname.setFont(new Font("raleway",Font.BOLD ,22));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("raleway",Font.BOLD,20));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("raleway",Font.BOLD ,22));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("raleway",Font.BOLD ,22));
        gender.setBounds(100,290,100,30);
        add(gender);
        
        male = new JRadioButton("MALE");
        male.setBounds(300 , 295, 100 , 20);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("FEMALE");
        female.setBounds(450 , 295, 100 , 20);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        
        JLabel email = new JLabel("E-mail :");
        email.setFont(new Font("raleway",Font.BOLD ,22));
        email.setBounds(100,340,100,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("raleway",Font.BOLD,20));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel mers = new JLabel("Merital Status :");
        mers.setFont(new Font("raleway",Font.BOLD ,22));
        mers.setBounds(100,390,200,30);
        add(mers);
        
        married = new JRadioButton("MARRIED");
        married.setBounds(300,395,100,20);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("UNMARRIED");
        unmarried.setBounds(450,395,100,20);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        ButtonGroup mrsgroup = new ButtonGroup();
        mrsgroup.add(married);
        mrsgroup.add(unmarried);
        
        JLabel address = new JLabel("Address :");
        address.setFont(new Font("raleway",Font.BOLD ,22));
        address.setBounds(100,440,100,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("raleway",Font.BOLD,20));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City :");
        city.setFont(new Font("raleway",Font.BOLD ,22));
        city.setBounds(100,490,100,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("raleway",Font.BOLD,20));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel state = new JLabel("State :");
        state.setFont(new Font("raleway",Font.BOLD ,22));
        state.setBounds(100,540,100,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("raleway",Font.BOLD,20));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("PinCode :");
        pincode.setFont(new Font("raleway",Font.BOLD ,22));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pTextField = new JTextField();
        pTextField.setFont(new Font("raleway",Font.BOLD,20));
        pTextField.setBounds(300,590,400,30);
        add(pTextField);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway" , Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setTitle("signup");
        setSize(850,800);
        setLocation(350 ,10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String gender = null;
        if(male.isSelected()){
            gender = "male";
        }else if(female.isSelected()){
            gender = "female";
        }
        String email = emailTextField.getText();
        String mrs = null;
        if(married.isSelected()){
            mrs ="married";
        }else if(unmarried.isSelected()){
            mrs ="unmarried";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pTextField.getText();
        
        try{
    if(name.equals("")){
        JOptionPane.showMessageDialog(null, "name is required");
    }if(fname.equals("")){
        JOptionPane.showMessageDialog(null,"father's name is required");
    }if(gender==null){
        JOptionPane.showMessageDialog(null,"gender required");
    }if(email.equals("")){
        JOptionPane.showMessageDialog(null,"email is required");
    }if(mrs==null){
        JOptionPane.showMessageDialog(null,"please fill married status");
    }
    
    if( !name.equals("") && !fname.equals("") && gender!=null && !email.equals("") && mrs!=null && ae.getSource()== next){
        setVisible(false);
        new signup2().setVisible(true);
    }
    
    else{
        Conn c = new Conn();
        String query = "insert into signup values('"+formno+"' , '"+name+"' ,'"+fname+"' ,'"+gender+"' ,'"+email+"' ,'"+mrs+"' ,'"+address+"' ,'"+state+"' ,'"+city+"' , '"+pin+"' )" ;
        c.s.executeUpdate(query);
    }
}
    catch(Exception e){
    System.out.println(e);
} 
        
    }   
    
    public static void main(String agrs[]){
        new signup1();
    }
    
}
