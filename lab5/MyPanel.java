package BIL218.lab5;

import java.awt.Graphics;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
    
    private int x = 20;
    private int y = 250;
    
    private double dir = Math.PI/4;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawOval(x, y, 15, 15);  
    }

    public void update(){
        if (y < 15){
            dir = 7*Math.PI/4;
            x = x+10+(int)Math.cos(dir);
            y = y+10+(int)Math.sin(dir);

        } else if (x > 470){
            dir = 5*Math.PI/4;
            x = x-10+(int)Math.cos(dir);
            y = y+10+(int)Math.sin(dir);

        } else if (y > 470){
            dir = 3*Math.PI/4;
            x = x-10+(int)Math.cos(dir);
            y = y-10+(int)Math.sin(dir);

        } else if (x < 15){
            dir = Math.PI/4;
            x = x+10+(int)Math.cos(dir);
            y = y-10+(int)Math.sin(dir);
            
        } else if (dir == Math.PI/4){
                x = x+10+(int)Math.cos(dir);
                y = y-10+(int)Math.sin(dir);
                
        } else if (dir == 7*Math.PI/4){
                x = x+10+(int)Math.cos(dir);
                y = y+10+(int)Math.sin(dir);
                
        } else if (dir == 5*Math.PI/4){
                x = x-10+(int)Math.cos(dir);
                y = y+10+(int)Math.sin(dir);
                
        } else if (dir == 3*Math.PI/4){
                x = x-10+(int)Math.cos(dir);
                y = y-10+(int)Math.sin(dir);			
        }
    }
}
