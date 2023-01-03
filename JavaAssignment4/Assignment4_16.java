/*16. WAP to find summation, subtraction, multiplication, division, modulus and power of 2 numbers 
using swing and event handling? */
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import javax.swing.*;

class Calculator extends JFrame implements ActionListener
{
    double res=0;


    JLabel l1=new JLabel("Enter 1st number :");
    JLabel l2=new JLabel("Enter 2nd number :");
    JLabel l3=new JLabel("Result: ");
    JLabel l4=new JLabel();

    JTextField tf1=new JTextField("");
    JTextField tf2=new JTextField("");
    JTextField tf3=new JTextField("");

    JButton bt1=new JButton("Summation");
    JButton bt2=new JButton("Subtraction");
    JButton bt3=new JButton("Multiplication");
    JButton bt4=new JButton("Divison");
    JButton bt5=new JButton("MOdulus");
    JButton bt6=new JButton("Power");

    JButton bt=new JButton("CLEAR");

    Container cn;
    Calculator()
    {
        cn=getContentPane();
        setLayout(null);
        setTitle("Calculator");
        l1.setBounds(100,100,150,30);
        tf1.setBounds(220,100,80,30);
        cn.add(l1);cn.add(tf1);
        l2.setBounds(100,140,150,30);
        tf2.setBounds(220,140,80,30);
        cn.add(l2);cn.add(tf2);
        l3.setBounds(100,220,80,30);
        tf3.setBounds(220,220,80,30);
        cn.add(l3);cn.add(tf3);

        l4.setBounds(100,240,180,30);
        cn.add(l4);
        
        bt1.setBounds(100,300,100,40);
        bt2.setBounds(100,350,100,40);
        bt3.setBounds(225,300,100,40);
        bt4.setBounds(225,350,100,40);
        bt5.setBounds(350,300,100,40);
        bt6.setBounds(350,350,100,40);
        cn.add(bt1);cn.add(bt2);cn.add(bt3);cn.add(bt4);cn.add(bt5);cn.add(bt6);
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);

        bt.setBounds(350,220,100,40);
        cn.add(bt);
        bt.addActionListener(this);

        cn.setBackground(Color.CYAN);
        setSize(600,500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
       try {
            
            double num1=Double.parseDouble(tf1.getText());
            double num2=Double.parseDouble(tf2.getText());
            
            if(e.getSource()==bt1)
            {
                res=num1+num2;
                tf3.setText(""+res);
            }else if(e.getSource()==bt2)
            {
                res=num1-num2;
                tf3.setText(""+res);
            }else if(e.getSource()==bt3)
            {
                res=num1*num2;
                tf3.setText(""+res);
            }else if(e.getSource()==bt4)
            {
                res=num1/num2;
                tf3.setText(""+res);
            }else if(e.getSource()==bt5)
            {
                res=num1%num2;
                tf3.setText(""+res);
            }
            else if(e.getSource()==bt6)
            {
                res=Math.pow(num1,num2);
                tf3.setText(""+res);
            }else if(e.getSource()==bt)
            {
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
            }
       } catch (Exception ae) {
           l4.setText("Enter only number.");
       }
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
    }
}

// public class Assignment4_16  
// {
// }
