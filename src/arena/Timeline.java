package arena;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Timeline {

	public void runTimeline(Screen screen) throws FindFailed, InterruptedException{
		//From main menu 
	  
		
		Pattern arena = new Pattern("img/arena.png"); 
		Pattern timeline_battle = new Pattern("img/timeline_battle.png"); 
		Pattern get_ready = new Pattern("img/get_ready.png"); 
		Pattern find_opponent = new Pattern("img/find_opponent.png"); 
		Pattern fight = new Pattern("img/fight.png"); 
		Pattern timeline_finish_bar = new Pattern("img/timeline_finish_bar.png"); 
		Pattern replay = new Pattern("img/replay.png"); 
		
		Thread.sleep(3000);
		screen.click(arena); 
		Thread.sleep(1000);
		screen.click(timeline_battle);
		Thread.sleep(1000);
		screen.click(get_ready); 
		Thread.sleep(1000);
		screen.click(find_opponent);
		Thread.sleep(1000);
		screen.click(fight); 
		System.out.println("The timeline fight has started.");
		Thread.sleep(3000);
		while (find(screen, timeline_finish_bar, replay) == false) { 
			System.out.println("Still playing the mission...");
			
		}
		if (find(screen, timeline_finish_bar,replay)){
			System.out.println("The mission has finished.");
		}
		
		
	}
	
	public static boolean find(Screen screen, Pattern pattern, Pattern pattern2)
	{
		if ((screen.exists(pattern) != null & screen.exists(pattern2) != (null))) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	
	
}
