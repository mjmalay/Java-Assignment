/*11. WAP to move a ball in a straight line left to right horizontally using Applet and multithreading? */

import java.applet.*;
import java.awt.*;
/*<applet code="Assignment4_11" width=500 height=500></applet> */

public class Assignment4_11 extends Applet implements Runnable
{
    Thread t;
    int x=0;
    int y=0;
    public void start()
    {
        t=new Thread(this);
        t.start();
    }    
    public void paint(Graphics g)
    {
        g.fillOval(x,y,80,80);
    }
    public void run()
    {
        try {
            while(true)
            {
              while(true)
                {
                    if(y==120)
                    {
                        break;
                    }else if(x==390){
                        x=0;
                        y=0;
                        repaint();
                    }else{
                        y=0;
                        x=x+3;
                        Thread.sleep(100);
                        repaint();
                    }
                }
               while(true)
                {
                    if(y==0)
                    {
                        break;
                    }else if(x==390)
                    {
                        x=0;
                        y=0;
                        repaint();
                    }
                    else{
                        y=y-3;
                        x=x+3;
                        Thread.sleep(100);
                        repaint();
                    }
                }
                run();
            }
        } catch (InterruptedException e) {
           
        }
    }
}
