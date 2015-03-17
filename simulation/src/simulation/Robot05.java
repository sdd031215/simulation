package simulation;


import javax.swing.*; 
import javax.swing.event.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.io.*; 

public class Robot05{ 
	//Create an array of keycode data 
	static int keyInput[] = { 
	KeyEvent.VK_H, 
	KeyEvent.VK_E, 
	KeyEvent.VK_L, 
	KeyEvent.VK_L, 
	KeyEvent.VK_O 
};//end keyInput array 

public static void main(String[] args) throws AWTException,IOException{ 

	Runtime.getRuntime().exec("notepad"); 
	Robot robot = new Robot(); 
	robot.keyPress(KeyEvent.VK_SHIFT); 
	
	for (int cnt2 = 0;cnt2 < keyInput.length; cnt2++){ 
	
	if(cnt2 > 0){ 
	robot.keyRelease(KeyEvent.VK_SHIFT); 
	}//end if 
	
	robot.keyPress(keyInput[cnt2]); 
	//Insert a one-half second delay between 
	// characters. 
	
	robot.delay(500); 
	}//end for loop 
	}//main 

}//end class Robot05 

