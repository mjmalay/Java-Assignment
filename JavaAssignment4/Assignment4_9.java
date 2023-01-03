/*9. WAP to print your scroll and blink your name using Applet and multithreading */
import java.util.*;
import java.applet.*;
import java.awt.*;
/*<applet code =Assignment4_9.class width=500 heght=500/>*/

 class Assignment4_9 extends Applet implements Runnable
{
    String str="Shri Ram";
    int x=100;
    int y=100;
    public void init()
    {
        Thread t=new Thread();
        t.start();
    }   
    public void paint(Graphics g)
    {
        g.setColor(Color.GREEN);
        g.drawString(str,x+100,y+200);
    } 
    public void run()
    {
        boolean scroll =true;
        while(true)
        {
            repaint();
            try{
                if(scroll)
                {
                    if(x<500)
                    {
                        x=x+5;
                    }else{
                        scroll=false;
                    }
                }else{
                    if(x>0)
                    {
                        x=x-5;
                    }else{
                        scroll=true;
                    }
                }
                Thread.sleep(100);
            }catch(Exception e){}
        }
    }
}
