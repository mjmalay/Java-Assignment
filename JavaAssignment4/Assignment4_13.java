/*13) WAP to create digital clock using swing and multithreading */

import java.awt.*;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
class DigitalClock extends JFrame implements Runnable
{
    Container cn;
    JFrame f=new JFrame();
     Thread t;
     JLabel l1=new JLabel("Digital Clock");
     JButton b1=new JButton();
     DigitalClock()
     {
         cn=getContentPane();
        setLayout(null);
        t=new Thread(this);
         t.start();
         cn.add(l1);
         l1.setBounds(100,80,100,30);
        f.add(b1);
        b1.setBounds(100,100,200,250);
        f.setSize(500,500);
        f.setVisible(true);   
    }
    public void run()
    {
        try {
            while(true)
            {
               DateTimeFormatter sdf=DateTimeFormatter.ofPattern("hh:mm:ss");
               b1.setText(LocalTime.now().format(sdf)); 
            }
         } catch (Exception e) {
            e.printStackTrace();
         }
     }
     public static void main(String[] args)
     {
           new DigitalClock();
     }
}
    
// public class Assignment4_13 
// {  
// }
