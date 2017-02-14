package main;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import arena.Timeline;
import mission.Special;
import mission.Story;

public class Main {

	public static void main(String[] args) throws FindFailed, InterruptedException {


		//Create new Screen Object 
		Screen screen = new Screen(); 
				
		Pattern logoIcon = new Pattern("img/logo.PNG");
		Pattern logoMarvel = new Pattern("img/marvellogo.PNG");
		
		Timeline timeline = new Timeline(); 
		Special special = new Special(); 
		Story story = new Story(); 
			
	
		
		//Startup Sequence
		//Thread.sleep(3000);
		App.focus("Nox App Player"); 

		//screen.click(logoIcon); 
		/*
		while (find(screen, logoMarvel) == false) { 
			System.out.println("Loading Game");
			
			if (screen.exists(logoMarvel) != null){
				screen.click(logoMarvel); 
				Thread.sleep(2000);
				screen.click(logoMarvel); 
				break; 
			} 
		}
		*/
		//timeline.runTimeline(screen);
		//special.runSpecials(screen);
		//story.runStoryMissions(screen, 2, 3);
		
			
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
