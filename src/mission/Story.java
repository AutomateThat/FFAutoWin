package mission;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import tools.ChooseMission;

public class Story {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		Screen screen = new Screen(); 	
		ChooseMission.ChooseChapter(screen,5);
		ChooseMission.ChooseStage(screen, 9);
		int dailyBiometricCount = ChooseMission.dailyBiometricCount(screen); 
		
		Pattern start = new Pattern("img/chapters/start.png"); 
		Pattern replay = new Pattern("img/chapters/replay.png"); 
		Pattern next = new Pattern("img/chapters/next.png"); 
		Pattern mission_finish_bar = new Pattern("img/chapters/mission_finish_bar.png");

		
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
