package main;

import java.awt.List;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Testing {

	public static void main(String[] args) throws FindFailed {
	/************** Multiple Image Array Testing  ******************/	
		//Create new Screen Object 
		Screen screen = new Screen(); 
				
		App.focus("Nox App Player"); 
		
		Pattern enter = new Pattern("img/enter.png"); 
		
		
	    //ImagePath.setBundlePath("C:\\patterns\\");

	    Iterator<Match> it = screen.findAll(enter);
	    //ArrayList<Point> points = new ArrayList(); 
	    
	    ArrayList<Point> points = new ArrayList();  
	    
	    int i = 0; 
	    while(it.hasNext()){
	        //it.next().highlight(1);
	    	
	    	
	        Location enter_pattern = it.next().getCenter(); 
	        int xx; 
	        int y;
	        
	        xx = enter_pattern.getX(); 
	        System.out.println("X: " + xx);
	        
	        y = enter_pattern.getY(); 
	        System.out.println("Y: " + y);	  
	        points.add(new Point(xx, y)); 
	        
	       //These below are different ways to print the array.  
	       /* for(Point e : points){
	        	System.out.println(e + "PointX: " + xx);
	        	System.out.println(e + "PointY: " + y);
	        }
	        */ 
	        
	        //System.out.println(Arrays.toString(points.toArray()));
	        
	}
	    //This is to check that the the points have been stored into the array at correct index 
	    System.out.println(points.get(3)); 
}
	

}
