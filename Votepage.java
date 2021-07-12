// This Project has been build in NetBeans 8.2

package e_voting_system;

import java.io.FileWriter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Votepage extends JFrame implements ActionListener
{
    JButton b1 , b2 , b3 ;
    int a , b ;
    
    Votepage()
    {
        
        JLabel l5=new JLabel("Vote For Your Desserving Party");
        l5.setFont(new Font("Tohama",Font.BOLD,50));
        l5.setBounds(200,000,1940,100);        
        add(l5);
        
        JLabel l4=new JLabel("Developed by BU Coders - Bennett University ");
        l4.setFont(new Font("Tohama",Font.BOLD,20));
        l4.setBounds(30,900,1500,150);
        add(l4);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("e_Voting_System/icons/BJPlogo.png"));
        JLabel l1=new JLabel(i1);
        l1.setBounds(10,0,700,600);
        add(l1);
        
        ImageIcon i2=new ImageIcon(ClassLoader.getSystemResource("e_Voting_System/icons/CONGRESSlogo.jpg"));
        JLabel l2=new JLabel(i2);
        l2.setBounds(10,400,700,600);
        add(l2);
        
        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("e_voting_system/icons/5128465.jpg"));
        JLabel l3=new JLabel(i3);
        l3.setBounds(000,000,1940,1000);
        add(l3);
        
        b1 = new JButton("VOTE");
        b1.setFont(new Font("Tohama",Font.BOLD,50));
        b1.addActionListener(this);
        b1.setBounds(650,250,300,100);
        add(b1);  
        
        b2 = new JButton("VOTE");
        b2.setFont(new Font("Tohama",Font.BOLD,50));
        b2.addActionListener(this);
        b2.setBounds(650,650,300,100);
        add(b2);  
        
        b3 = new JButton("Result");
        b3.setFont(new Font("Tohama",Font.BOLD,50));
        b3.addActionListener(this);
        b3.setBounds(1200,450,300,100);
        add(b3);  
             
        
        setBounds(0,0,1940,1000);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);        
        setVisible(true);
    }
    public static void main(String[] args) 
    {
        new Votepage();
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource()==b1) 
        {    
        a=a+1;        
        JOptionPane.showMessageDialog(null, "Your Vote has been added to bjp");    
        }
        if(ae.getSource()==b2)
        {
        b=b+1;
        JOptionPane.showMessageDialog(null, "Your Vote has been added to Congress");            
        }
        if(ae.getSource()==b3)
        {
        JOptionPane.showMessageDialog(null, "BJP : "+a+"    Congress : "+b );
        }
    }
}
