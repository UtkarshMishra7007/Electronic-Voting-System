// This Project has been built in NetBeans 8.2

package e_voting_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class E_Voting_System extends JFrame implements ActionListener

{
    E_Voting_System()
    {
        setBounds(0,0,1940,1000);
        getContentPane().setBackground(Color.WHITE);
        
        
        JLabel l1=new JLabel("Welcome to");
        l1.setFont(new Font("Tohama",Font.BOLD,100));
        l1.setBounds(660,50,600,100);        
        add(l1);
        
        JLabel l2=new JLabel("Electronic Voting System");
        l2.setFont(new Font("Tohama",Font.BOLD,100));
        l2.setBounds(380,150,1500,150);        
        add(l2);
        
        JLabel l4=new JLabel("Developed by BU Coders - Bennett University ");
        l4.setFont(new Font("Tohama",Font.BOLD,20));
        l4.setBounds(30,900,1500,150);        
        add(l4);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("e_voting_system/icons/5128465.jpg"));
        JLabel l3=new JLabel(i1);
        l3.setBounds(000,000,1940,1000);
        add(l3);
        

        JButton b1 = new JButton("Next");
        b1.setFont(new Font("Tohama",Font.BOLD,50));
        b1.addActionListener(this); 
        b1.setBounds(805,690,300,100);
        add(b1);     
        
        setLayout(null);        
        setVisible(true);
        
             
    }
    public static void main(String[] args)
    {
        new E_Voting_System();
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        new Votepage().setVisible(true); 
    }
}
