import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private static int rate=10;
	private static Point startLocation;

	public static void main(String[] args) {
//	      while (rate == 0) {
//	          try {
//	             System.out.println("Speed of the auto-clicker (in miliseconds):");
//	             BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//	             try {
//	                rate = Integer.parseInt(in.readLine());
//	                if (rate < 50) {
//	                   rate = 0;
//	                   System.out.println("Must be at least 50 miliseconds.");
//	                }
//	             } catch (NumberFormatException ex) {
//	                System.out.println("Error - please try again.");
//	             }
//	          } catch (IOException e) {}
//	       }
		   try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		   startLocation=MouseInfo.getPointerInfo().getLocation();
	       try {
	          Robot robot = new Robot();
	          while (true) {
	             try {
	                Thread.sleep(rate);
	                robot.mousePress(InputEvent.BUTTON1_MASK);
	                robot.mouseRelease(InputEvent.BUTTON1_MASK);
	             } catch (InterruptedException ex) {}
	             
	             if(MouseInfo.getPointerInfo().getLocation().x!=startLocation.x){break;};
	             
	          }
	       } catch (AWTException e) {}
	}
}
