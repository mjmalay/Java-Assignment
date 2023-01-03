/*10) WAP to create smiley face and Start using Applet and multithreading */

import java.applet.*;
import java.awt.*;
/*<applet code=SmileyFace.class width=500 height=500></applet> */

public class SmileyFace extends Applet implements Runnable 
{
    Thread t;
    
    public void start()
    {
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        try{
                repaint();
        }catch(Exception e){}
    }
    public void paint(Graphics g)
    {
        g.drawString("Keep Smile",130,300);
    
        
        g.setColor(Color.YELLOW);
        g.fillOval(80, 70,150, 150);

        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);

        g.drawArc(130, 170, 50, 20, 180, 180);
        g.drawArc(140,150,30,20,180,180);
    }
}
