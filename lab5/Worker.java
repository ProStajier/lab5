package BIL218.lab5;

public class Worker extends Thread {

    private MyPanel mp = null;
	
    public Worker(MyPanel mp){
        this.mp = mp;
    }

    public void run(){
        try{
            while(true){
                mp.update();
                mp.repaint();
                Thread.sleep(250);  
            }
        }
        catch(Exception ex){
            ex.printStackTrace(); 
        }
    }	
}
