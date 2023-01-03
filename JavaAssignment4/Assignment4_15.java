/*15. WAP to create one application for colour recognition for kids in which kids will chose button that 
shows colour name like RED,BLUE, etc. and after clicking on button background colour of window 
will change as per colour name?  */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Window extends JFrame implements ActionListener
{
    JLabel l1=new JLabel("Click the Button To Change the Color");

    Font f=new Font("Time New Roman",Font.BOLD,25);

    JButton bt1=new JButton("RED");
    JButton bt2=new JButton("BLUE");
    JButton bt3=new JButton("GREEN");
    JButton bt4=new JButton("CYAN");

    Color cr=new Color(255,255,255);

    Container cn;

    public Window()
    {
        cn= getContentPane();
        setLayout(null);
        l1.setBounds(40,70,490,30);
        cn.add(l1);
        l1.setFont(f);

        bt1.addActionListener(this);
        cn.add(bt1);
        bt1.setBounds(100,150,100,50);
        bt1.setBackground(cr);

        bt2.addActionListener(this);
        cn.add(bt2);
        bt2.setBounds(280,150,100,50);
        bt2.setBackground(cr);


        bt3.addActionListener(this);
        cn.add(bt3);
        bt3.setBounds(100,250,100,50);
        bt3.setBackground(cr);


        bt4.addActionListener(this);
        cn.add(bt4);
        bt4.setBounds(280,250,100,50);
        bt4.setBackground(cr);



        setSize(550,500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        try {
            if(ae.getSource()==bt1)
            {
                cn.setBackground(Color.RED);
            }
            if(ae.getSource()==bt2)
            {
                cn.setBackground(Color.BLUE);
            }
            if(ae.getSource()==bt3)
            {
                cn.setBackground(Color.GREEN);
            }
            if(ae.getSource()==bt4)
            {
                cn.setBackground(Color.CYAN);
            }
            
        } catch (Exception e) {
           
        }
    }
    public static void main(String[] args) {
       Window w=new Window(); 
    }
}

// public class Assignment4_15 {
    
// }
