package arena;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class CoopPlay {

	//This method uses clear tickets to further automate the process with the games mechanics 
	public void runCoopTickets(Screen screen) throws FindFailed, InterruptedException{
		//ensure the repeat button is selected before proceeding 
		Pattern arena = new Pattern("img/arena.png"); 
		Pattern coop_play = new Pattern("img/coop_play");
		Pattern start = new Pattern("img/start"); 
		Pattern notice = new Pattern("img/notice"); 
		Pattern ok = new Pattern("img/ok"); 
		Pattern leave_button = new Pattern("img/leave_button");
		Pattern progress_100 = new Pattern("img/progress_100");
		Pattern completion_reward = new Pattern("img/completion_reward");
		Pattern claim = new Pattern("img/claim");
		Pattern progress_reward = new Pattern("img/progress_reward");
		Pattern reward_acquired = new Pattern("img/reward_acquired");
		Pattern coop_finish_notice = new Pattern("img/coop_finish_notice");
		
		
		Thread.sleep(3000);
		screen.click(arena);
		Thread.sleep(3000);
		screen.click(coop_play);
		Thread.sleep(3000);
		screen.click(start);
		
		if (find(screen,notice)){
			screen.click(ok);
		}
		
		while(find(screen,coop_finish_notice) == false){
			System.out.println("Coop Missions Still running...");
			
			if(find(screen,progress_100)){
				screen.click(ok); 
				Thread.sleep(5000); 
				screen.click(reward_acquired); 
				Thread.sleep(5000); 
				screen.click(claim); 
				Thread.sleep(7000); 
				screen.click(ok); 
				Thread.sleep(3000); 
				screen.click(start); 
				if (find(screen,notice)){
					screen.click(ok);
				}
			}

			
			if(find(screen,coop_finish_notice)){
				System.out.println("Co-Op Missions Finished");
				screen.click(ok); 
				break;
			}
		}
		
	}
	
	public static boolean find(Screen screen, Pattern pattern)
	{
		if ((screen.exists(pattern) != null )) {
			return true;
		} 
		else {
			return false;
		}
	}
}
