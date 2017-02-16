package mission;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import tools.ChooseMission;

public class Special {

	public void runSpecials(Screen screen, String whichMission) throws FindFailed{
		//Which specials corresponds to which special chapter, New Avengers or Inhuamns 
		
		Pattern new_avengers = new Pattern("img/special/new_avenger.png"); 
		Pattern paris = new Pattern("img/special/paris.png"); 
		Pattern jungle_boogie = new Pattern("img/special/jungle_boogie.png"); 
		Pattern shanghai = new Pattern("img/special/shanghai.png"); 
		Pattern alaska = new Pattern("img/special/alaska.png"); 
		Pattern new_york = new Pattern("img/special/new_york.png"); 
		Pattern no_limit = new Pattern(""); 
		Pattern ok = new Pattern("img/special/ok.png"); 
		
		
		ChooseMission.chooseSpecialMissions(screen, whichMission, 1);
	}
	
	public void runSpecialsUnlimited(Screen screen, String whichQuestPack, String whichMission) throws FindFailed{
		//if no quest pack is selected then choose using variable which QuestPack
		Pattern unlimited = new Pattern("img/special/unlimited.png");
		Pattern ok = new Pattern("img/special/ok.png");
		Pattern repeat = new Pattern("img/special/repeat.png");
		screen.click(unlimited);
		screen.click(ok); 
		
		ChooseMission.chooseSpecialMissions(screen, whichMission, 1);
		while(find(screen, repeat) == false){
			System.out.println("Still playing the mission.");
		}
		
		if(find(screen, repeat)){
			System.out.println("Mission finished.");
			screen.click(repeat); 
		}
		
	}
	
	public static boolean find(Screen screen, Pattern pattern)
	{
		if (screen.exists(pattern) != null ) {
			return true;
		} 
		else {
			return false;
		}
	}

}
