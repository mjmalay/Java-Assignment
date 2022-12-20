/*14. WAP to create one registration form for students to enter their name, roll no, regd no, stream, 
branch, semester, gender, hobbies, email id and phone number using JLabel, JTextField, JCheckBox, 
JRadioButton, JComboBox, JButton for submit and reset Button? 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.LabelView;

class RegistrationForm extends JFrame 
{

    JLabel l=new JLabel("Register Yourself");
    JLabel l1=new JLabel("Name :");
    JLabel l2=new JLabel("Regd. No :");
    JLabel l3=new JLabel("Stream :");
    JLabel l4=new JLabel("Semester :");
    JLabel l5=new JLabel("Gender :");
    JLabel l6=new JLabel("Hobbies :");
    JLabel l7=new JLabel("Email :");
    JLabel l8=new JLabel("Phone Number :");
    JTextField tf1=new JTextField("");
    JTextField tf2=new JTextField("");
    JComboBox cb=new JComboBox();
    JComboBox cb1=new JComboBox();
    ButtonGroup bg=new ButtonGroup();
    JRadioButton rb1=new JRadioButton("Male");
    JRadioButton rb2=new JRadioButton("Female");
    JTextField tf3=new JTextField("");
    JTextField tf4=new JTextField("");
    JTextField tf5=new JTextField("");
    JTextField tf6=new JTextField("");
    JCheckBox c1=new JCheckBox("Play");
    JCheckBox c2=new JCheckBox("Read");
    JCheckBox c3=new JCheckBox("Sing");

    JButton bt1=new JButton("Submit");
    JButton bt2=new JButton("Reset");
    Container cn;
    
    RegistrationForm()
    {
        cn=getContentPane();
        setTitle("WelCome");
        setLayout(null);
        cn.add(l);
        l.setBounds(100,40,300,30);
        l.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        
        cn.add(l1);cn.add(tf1);
        l1.setBounds(50, 100,100,30);
        tf1.setBounds(110, 100, 170, 30);
        cn.add(l2);cn.add(tf2);
        l2.setBounds(50, 150,100,30);
        tf2.setBounds(110, 150, 150, 30);
        cn.add(l3);cn.add(cb);
        l3.setBounds(50, 200,100,30);
        cb.setBounds(114, 200, 100, 30);
        cb.addItem("B.Tech");
        cb.addItem("MCA");
        cb.addItem("M.Tech");
        cb.addItem("BE");
        cb.addItem("ME");
        cn.add(cb1);cn.add(l4);
        l4.setBounds(50, 250,100,30);
        cb1.setBounds(121, 250, 100, 30);
        cb1.addItem("1st");
        cb1.addItem("2nd");
        cb1.addItem("3rd");
        cb1.addItem("4th");
        cb1.addItem("5th");
        cb1.addItem("6th");
        cb1.addItem("7th");
        cb1.addItem("8th");

        cn.add(l5);cn.add(rb1);cn.add(rb2);bg.add(rb1);bg.add(rb2);
        l5.setBounds(50, 300, 100, 30);
        rb1.setBounds(107, 300,100,30);
        rb1.setSelected(true);
        rb2.setBounds(230, 300,100,30);
        rb2.setSelected(false);
        bg.add(rb1);bg.add(rb2);

        cn.add(l6);cn.add(c1);cn.add(c2);cn.add(c3);
        l6.setBounds(50,350,100,30);
        c1.setBounds(128,350,100,30);
        c2.setBounds(235,350,100,30);
        c3.setBounds(342,350,100,30);

        cn.add(l7);cn.add(tf5);cn.add(tf6);cn.add(l8);
        l7.setBounds(50,400, 100, 30);
        tf5.setBounds(121, 400, 150, 30);
        l8.setBounds(50,450, 100, 30);
        tf6.setBounds(128, 450, 150, 30);

        cn.add(bt1);cn.add(bt2);
        bt1.setBounds(128,520,100,30);bt1.setBackground(Color.cyan);
        bt2.setBounds(260,520,100,30);bt2.setBackground(Color.cyan);

        setSize(500,800);
        cn.setBackground(Color.green);
        setVisible(true);
    }

    public static void main(String[] args)
     {
        RegistrationForm r=new RegistrationForm();
    }
}

// class Assignment4_14
// {
// }

