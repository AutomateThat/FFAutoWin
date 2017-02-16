package tools;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ChooseMission {
	public static void ChooseChapter(Screen screen, int userChooseChapter) throws FindFailed, InterruptedException {

		
		//get user chapter selection from GUI 
		String chapterName = " "; 
		String imgString = " "; 

		switch(userChooseChapter){
		case 1: chapterName =  "The Missing Scientist"; 
				imgString = "img/chapters/chapter1.png";  
				break;
		case 2: chapterName = "An Ominous sign"; 
				imgString = "img/chapters/chapter2.png"; 
				break; 
		case 3: chapterName = "The Calm before the Storm"; 
				imgString = "img/chapters/chapter3.png"; 
				break; 
		case 4: chapterName = "Red Storm"; 
				imgString = "img/chapters/chapter4.png"; 
				break; 
		case 5: chapterName = "Rule the World!"; 
				imgString = "img/chapters/chapter5.png"; 
				break; 
		case 6: chapterName = "Cut off one head"; 
				imgString = "img/chapters/chapter6.png"; 
				break; 
		case 7: chapterName = "Overheaded and Retriggering"; 
				imgString = "img/chapters/chapter7.png"; 
				break; 
		case 8: chapterName = "The Apocalypse"; 
				imgString = "img/chapters/chapter8.png"; 
				break; 
		case 9: chapterName = "Iliad and Odyssey"; 
				imgString = "img/chapters/chapter9.png"; 
				break; 
		case 10: chapterName = "Frostbitten"; 
				imgString = "img/chapters/chapter10.png"; 
				break; 
		case 11: chapterName = "Danger Signal"; 
				imgString = "img/chapters/chapter11.png"; 
				break; 
		case 12: chapterName = "Asgardian War"; 
				imgString = "img/chapters/chapter12.png"; 
				break; 
		}
		
		System.out.println("Chapter Name: " + chapterName);
		System.out.println("Image String: " + imgString);
		
		Pattern userChoosePattern = new Pattern(imgString); 
		Pattern right_arrow = new Pattern("img/chapters/right_arrow.png"); 
		
		while(find(screen, userChoosePattern) == false){
			screen.click(right_arrow); 
		}
		
		
		if (find(screen, userChoosePattern)){
			System.out.println("Found the chapter.");

		}

}
	public static void ChooseStage(Screen screen,int userChooseStage) throws FindFailed{
		
		String stage = " "; 
		String imgString = " "; 
		
		switch(userChooseStage){
		case 1: stage =  "Stage 1";
				imgString = "img/chapters/stage/stage1.png";  
				break;
		case 2: stage = "Stage 2";
				imgString = "img/chapters/stage/stage2.png"; 
				break; 
		case 3: stage = "Stage 3"; 
				imgString = "img/chapters/stage/stage3.png";  
				break; 
		case 4: stage = "Stage 4"; 
				imgString = "img/chapters/stage/stage4.png";  
				break; 
		case 5: stage = "Stage 5";
				imgString = "img/chapters/stage/stage5.png"; 
				break; 
		case 6: stage = "Stage 6"; 
				imgString = "img/chapters/stage/stage6.png";  
				break; 
		case 7: stage = "Stage 7"; 
				imgString = "img/chapters/stage/stage7.png"; 
				break; 
		case 8: stage = "Stage 8";
				imgString = "img/chapters/stage/stage8.png"; 
				break; 
		case 9: stage = "Stage 9";
				imgString = "img/chapters/stage/stage9.png";  
				break; 
		case 10: stage = "Stage 10";
				imgString = "img/chapters/stage/stage10.png"; 
				break; 
		case 11: stage = "Stage 11"; 
				imgString = "img/chapters/stage/stage11.png";  
				break; 
		case 12: stage = "Stage 12";  
				imgString = "img/chapters/stage/stage12.png";  
				break; 
		}
		
		System.out.println("Stage: " + stage);
		System.out.println("Image String: " + imgString);
		
		Pattern userChoosePattern = new Pattern(imgString); 
		
		screen.click(userChoosePattern);
		
		
	}
	
	public static void chooseSpecialMissions(Screen screen, String whichMission, int whichLevel) throws FindFailed{
		String imgString = " "; 
		String missionName = " "; 
		if(whichMission == "paris"){
			imgString = "img/special/paris.png"; 
			missionName = "Paris"; 
		}else if(whichMission =="jungle_boogie"){
			imgString = "img/special/jungle_boogie.png"; 
			missionName = "Jungle Boogie"; 
		}else if(whichMission =="shanghai"){
			imgString = "img/special/shanghai.png"; 
			missionName = "Shanghai"; 
		}else if(whichMission =="alaska"){
			imgString = "img/special/alaska.png"; 
			missionName = "Alaska"; 
		}else if(whichMission =="new_york"){
			imgString = "img/special/new_york.png"; 
			missionName = "New York"; 
		} else {
			imgString=" "; 
			missionName = " No Mission Selected"; 
		}
		
		Pattern userChoosePattern = new Pattern(imgString); 
		screen.click(userChoosePattern); 
		
		System.out.println("Mission Name: " + missionName);
		
	}
	
	public static int dailyBiometricCount(Screen screen) throws FindFailed{
		int dailyBiometricCount = 0;
		Pattern daily_biometric_10 = new Pattern("img/chapters/daily_biometric/10.png"); 
		Pattern daily_biometric_9 = new Pattern("img/chapters/daily_biometric/9.png");
		Pattern daily_biometric_8 = new Pattern("img/chapters/daily_biometric/8.png");
		Pattern daily_biometric_7 = new Pattern("img/chapters/daily_biometric/7_end.png");

		
		


		if(find(screen, daily_biometric_10)){
			dailyBiometricCount = 10; 
		} else if(find(screen, daily_biometric_9)){
			dailyBiometricCount = 9; 
		} else if(find(screen, daily_biometric_8  )){
			dailyBiometricCount = 8; 
		} else if(find(screen, daily_biometric_7  )){
			dailyBiometricCount = 7; 
		} else {
			System.out.println("No match:");
		}

		
		System.out.println("Daily Biometric Count: " + dailyBiometricCount);
		return dailyBiometricCount; 
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
