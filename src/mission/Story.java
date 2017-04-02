package mission;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import tools.ChooseMission;

public class Story {

	public static  void runStoryMissions(int chapter, int stage, int runTimes) throws FindFailed, InterruptedException {
		Screen screen = new Screen(); 
		ChooseMission.ChooseChapter(screen,chapter);
		ChooseMission.ChooseStage(screen, stage);
		int dailyBiometricCount = ChooseMission.dailyBiometricCount(screen); 
		
		Pattern start = new Pattern("img/chapters/start.png"); 
		Pattern replay = new Pattern("img/chapters/replay.png"); 
		Pattern next = new Pattern("img/chapters/next.png"); 
		Pattern mission_finish_bar = new Pattern("img/chapters/mission_finish_bar.png");
		Pattern shield_safehouse = new Pattern("img/shield_safehouse.png"); 
		Pattern shield_ok = new Pattern("img/shield_ok.png");
		
		int storyRunCount = 0; 
		//For loop to run mission how many times 
		for(int i = 0; i<runTimes; i++){
			screen.click(start); 
			System.out.println("The mission has started.");
	
			
			Thread.sleep(2000);
			while (find(screen, mission_finish_bar) == false) {
	 
				System.out.println("Still playing the mission...");
				
			}
			if (screen.exists(mission_finish_bar) != null){
				System.out.println("The mission has finished.");
	
			}
			System.out.println("Wait for 5 Seconds");
			Thread.sleep(5000);
			System.out.println("Click repeat button");
			screen.click(replay); 
			if(find(screen, shield_safehouse)){
				screen.click(shield_ok); 
			}
			Thread.sleep(3000);
			storyRunCount++; 
			System.out.println("The count is now: " + storyRunCount);
		}
	}
	
	public static boolean find(Screen screen, Pattern pattern)
	{
		if (screen.exists(pattern) != null) {
			return true;
		} 
		else {
			return false;
		}
	}

}
