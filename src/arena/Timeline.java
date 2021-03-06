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
		Pattern timeline_recommended_heroes = new Pattern("img/timeline_recommended_heroes.png");
		Pattern search_for_opponent = new Pattern("img/search_for_opponent.png"); 
		Pattern fight = new Pattern("img/fight.png"); 
		Pattern timeline_finish_bar = new Pattern("img/timeline_finish_bar.png"); 
		Pattern replay = new Pattern("img/replay.png"); 
		Pattern leave_button = new Pattern("img/leave_button.png"); 
		Pattern ok = new Pattern("img/ok.png"); 
		Pattern close = new Pattern("img/close.png"); 
		Pattern shield_safehouse = new Pattern("img/shield_safehouse.png"); 
		Pattern shield_ok = new Pattern("img/shield_ok.png");
		
		Thread.sleep(3000);
		screen.click(arena); 
		Thread.sleep(1500);
		screen.click(timeline_battle);
		Thread.sleep(1500);
		screen.click(get_ready); 
		Thread.sleep(1500);
		
		if(find(screen, timeline_recommended_heroes)){
			screen.click(close);
		}

		screen.click(search_for_opponent);
		Thread.sleep(1500);
		
		for(int i=1; i<11; i++){
			screen.click(fight); 
			System.out.println("The timeline fight has started.");
			Thread.sleep(3000);
			while (findTwo(screen, timeline_finish_bar, replay) == false) { 
				System.out.println("Still playing the mission...");
				
			}
			if (findTwo(screen, timeline_finish_bar,replay)){
				System.out.println("The mission has finished.");
				Thread.sleep(6000);
			}
			System.out.println("Count is: " + i );
			if(find(screen, shield_safehouse)){
				screen.click(ok); 
			}
			Thread.sleep(6000);
			screen.click(replay);
			Thread.sleep(5000);
			if(find(screen, shield_safehouse)){
				screen.click(shield_ok); 
				System.out.println("Clicked shield safehouse.");
			}
			Thread.sleep(6000);
		}
		
		screen.click(leave_button); 
		//This will take us back to the main menu 
		System.out.println("Daily Timeline battles of 10 have been finished.");
		
	}
	
	public static boolean find(Screen screen, Pattern pattern)
	{
		if ((screen.exists(pattern) != null)) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	public static boolean findTwo(Screen screen, Pattern pattern, Pattern pattern2)
	{
		if ((screen.exists(pattern) != null & screen.exists(pattern2) != (null))) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	
	
}
