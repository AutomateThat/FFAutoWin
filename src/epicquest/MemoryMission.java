package epicquest;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class MemoryMission {

	public void runMemoryMission(Screen screen, String whichMission) throws FindFailed, InterruptedException{
		//From main menu 
	Pattern epic_quest = new Pattern("img/epic_quest");   
	
	Thread.sleep(1000);
	screen.click(epic_quest); 
	


		
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
}
