/**
 * Mediator pattern
 */
package Meditator;
import java.util.Timer;
import java.util.TimerTask;


class Helper extends TimerTask 
{ 
    WorldGenerator gen;
    private int count = 0;
    
    public Helper() {}
    public Helper(WorldGenerator gen2) {
        gen = gen2;
    }

    public void run() 
    { 
       gen.updateState();
       gen.printInitial();
       count++;
       System.out.println(count);
    }
   
} 
  
public class Tick 
{ 
    public static void tickRun()
    { 
        WorldGenerator gen = new WorldGenerator();  
        Timer timer = new Timer(); 
        TimerTask task = new Helper(gen); 
        gen.generateFarm();
        timer.schedule(task, 2000, 5000); 
          
    } 
} 