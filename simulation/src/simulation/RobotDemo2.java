package simulation;

import java.awt.AWTException;
import java.awt.Robot;  
import java.awt.event.KeyEvent;  
  
public class RobotDemo2  
{  
    private Robot robot = null;  
      
    public RobotDemo2()  
    {  
        try  
        {  
            robot = new Robot();  
        }  
        catch (AWTException e)  
        {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }  
      
    //模拟Ctrl+Alt+Z的按下和抬起  
    public void keyBoardDemo()  
    {  
        robot.keyPress(KeyEvent.VK_CONTROL);  
        robot.keyPress(KeyEvent.VK_ALT);  
        robot.keyPress(KeyEvent.VK_Z);  
        robot.keyRelease(KeyEvent.VK_CONTROL);  
        robot.keyRelease(KeyEvent.VK_ALT);  
        robot.keyRelease(KeyEvent.VK_Z);  
    }  
      
    public static void main(String[] args)  
    {  
        RobotDemo demo = new RobotDemo();  
        demo.keyBoardDemo();  
    }  
}