package tools;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ChooseChapter {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		// TODO Auto-generated method stub

		Screen screen = new Screen(); 
		
		//get user chapter selection from GUI 
		int userChooseChapter = 12; 
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
			Thread.sleep(500); 
			screen.click(right_arrow); 
			Thread.sleep(500);
			
			if (find(screen, userChoosePattern)){
				System.out.println("Found the chapter.");
				break; 
			}
			
			
		
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
