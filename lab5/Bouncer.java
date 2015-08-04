package BIL218.lab5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bouncer extends JFrame{

	private MyPanel mp = null;
	
    public Bouncer(){

        super("Testing v0.1");
        JPanel root = new JPanel();
        setContentPane(root);
        
        mp = new MyPanel();
        root.setLayout(new BorderLayout());
        root.add(mp,BorderLayout.CENTER);
        
        JButton jb = new JButton("START");
        root.add(jb, BorderLayout.SOUTH);
        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Worker w = new Worker(mp);
                w.start();
            }
        });
        
        mp.setPreferredSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);	
    }

    public static void main(String[] args) {
        new Bouncer();
    }
	
}
