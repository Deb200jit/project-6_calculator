import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
 
public class SetBackgroundColor extends Applet{
 
    public void paint(Graphics g) {
    
    Thread t1 = new Thread(new Runnable() {
            public void run() {
                for(int i = 1; i <= 5; i++) {
                    try {
                        int R = (int)(Math.random()*100) % 255;
                	    int G = (int)(Math.random()*100) % 255;
                	    int B = (int)(Math.random()*100) % 255;
                        Thread.sleep(250);
                        setBackground(new Color(R, G, B)); 
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        });
        
        t1.start();
        
        try {
            t1.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}