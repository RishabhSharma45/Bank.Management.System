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
 import java.util.*;
 import java.awt.event.*;

public class signup2 extends JFrame implements ActionListener {
    
    Long random;
    JTextField nameTextField,fnameTextField,emailTextField,pTextField,adharTextField,panTextField ,stateTextField;
    JRadioButton male,female,married,unmarried,ex,ex1;
    JButton next;
    JComboBox rel,cat,inc,eq,occ;
    
    signup2(){
        
        setLayout(null);
        
        JLabel additionalDetails = new JLabel("Page II : ADDITIONAL Details");
        additionalDetails.setFont(new Font("raleway",Font.BOLD ,22));
        additionalDetails.setBounds(250,70,400,30);
        add(additionalDetails);
        
        JLabel religion = new JLabel("Religion :");
        religion.setFont(new Font("raleway",Font.BOLD ,22));
        religion.setBounds(100,140,150,30);
        add(religion);
        
        String[] val = {"HINDU" , "Muslim" , "Christian" , "sikh" , "other"};
        rel = new JComboBox(val);
        rel.setBounds(300,140,400,30);
        rel.setBackground(Color.WHITE);
        add(rel);    
        
        JLabel caste = new JLabel("Category :");
        caste.setFont(new Font("raleway",Font.BOLD ,22));
        caste.setBounds(100,190,200,30);
        add(caste);
        
        String val2[] = {"GENERAL" , "OBc" , "SC","ST"};
        cat = new JComboBox(val2);
        cat.setBounds(300,190,400,30);
        cat.setBackground(Color.WHITE);
        add(cat);
        
        
        JLabel income = new JLabel("Income :");
        income.setFont(new Font("raleway",Font.BOLD ,22));
        income.setBounds(100,240,200,30);
        add(income);
        
        String val3[] = {"NULL" , "<1.5 lakh" , "<2.5 lakh","<5 lakh","upto 10 lakh"};
        inc = new JComboBox(val3);
        inc.setBounds(300,240,400,30);
        inc.setBackground(Color.WHITE);
        add(inc);
        
        JLabel educational = new JLabel("Educational");
       educational.setFont(new Font("raleway",Font.BOLD ,22));
        educational.setBounds(100,290,200,30);
        add(educational);
        
        JLabel qualification = new JLabel("Qualification :");
        qualification.setFont(new Font("raleway",Font.BOLD ,22));
        qualification.setBounds(100,315,200,30);
        add(qualification);
        
        String val4[] = {"10th" , "<12th" , "<diploma","graduate","other"};
        eq = new JComboBox(val4);
        eq.setBounds(300,315,400,30);
        eq.setBackground(Color.WHITE);
        add(eq);
        
         JLabel occupation = new JLabel("Occupation :");
        occupation.setFont(new Font("raleway",Font.BOLD ,22));
        occupation.setBounds(100,375,200,30);
        add(occupation);
        
        String val5[] = {"STUDENT" , "EMPLOYEE" , "FARMER","BUSSINESS","other"};
        occ = new JComboBox(val5);
        occ.setBounds(300,375,400,30);
        occ.setBackground(Color.WHITE);
        add(occ);
        
         JLabel sr = new JLabel("Senior citizen :");
        sr.setFont(new Font("raleway",Font.BOLD ,22));
        sr.setBounds(100,425,200,30);
        add(sr);
        
        married = new JRadioButton("YES");
        married.setBounds(300,430,100,20);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("NO");
        unmarried.setBounds(450,430,100,20);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        ButtonGroup group = new ButtonGroup();
        group.add(married);
        group.add(unmarried);
        
        
        
        JLabel adhar = new JLabel("Adhar number :");
        adhar.setFont(new Font("raleway",Font.BOLD ,22));
        adhar.setBounds(100,475,200,30);
        add(adhar);
        
        adharTextField = new JTextField();
        adharTextField.setFont(new Font("raleway",Font.BOLD,20));
        adharTextField.setBounds(300,475,400,30);
        add(adharTextField);
        
        JLabel pan = new JLabel("Pan Number :");
        pan.setFont(new Font("raleway",Font.BOLD ,22));
        pan.setBounds(100,525,200,30);
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("raleway",Font.BOLD,20));
        panTextField.setBounds(300,525,400,30);
        add(panTextField);
        
        JLabel existing = new JLabel("Existing account :");
        existing.setFont(new Font("raleway",Font.BOLD ,22));
        existing.setBounds(100,575,200,30);
        add(existing);
        
        ex = new JRadioButton("Yes");
        ex.setBounds(300,580,100,20);
        ex.setBackground(Color.WHITE);
        add(ex);
        
        ex1 = new JRadioButton("NO");
        ex1.setBounds(450,580,100,20);
        ex1.setBackground(Color.WHITE);
        add(ex1);
        
        ButtonGroup gr = new ButtonGroup();
        gr.add(ex);
        gr.add(ex1);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway" , Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setTitle("signup page - 2");
        setSize(850,800);
        setLocation(350 ,10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        String formno = "" + random;
        
        
        String adhar = adharTextField.getText();
        String pan = panTextField.getText();
        
        
        
        try{     
    if(adhar.equals("") || adhar.length()!=12 ){
        JOptionPane.showMessageDialog(null, "enter 12 digit valid adhar number");
    }if(pan.equals("")){
        JOptionPane.showMessageDialog(null,"enter pan number");
    }else if(!adhar.equals("") && adhar.length()==12 && !pan.equals("") && ae.getSource()==next){
        setVisible(false);
        new signup3().setVisible(true);
    }
    
    /*else{
        Conn c = new Conn();
        String query = "insert into signup values('"+formno+"' , '"+name+"' ,'"+fname+"' ,'"+gender+"' ,'"+email+"' ,'"+mrs+"' ,'"+address+"' ,'"+state+"' ,'"+city+"' , '"+pin+"' )" ;
        c.s.executeUpdate(query);
    }*/
}
    catch(Exception e){
    System.out.println(e);
} 
        
    }   
    
    public static void main(String agrs[]){
        new signup2();
    }
    
}
