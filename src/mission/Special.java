package mission;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Special {

	public void runSpecials(Screen screen) throws FindFailed{
		Pattern no_limit = new Pattern("img/special/no_limit.png"); 
		Pattern ok = new Pattern("img/special/ok.png"); 
		
		boolean progress_100 = false; 
		
		if (find(screen, no_limit)){
			progress_100 = true; 
			screen.click(no_limit);
			screen.click(ok);
		}
	}
	
	public void runSpecialsNoLimit(){
		
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
