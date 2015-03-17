package simulation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


//ctrl+shift+tab键打开任务管理器
public class TestRobot {
public static void main(String[] args) throws AWTException {

TestRobot t=new TestRobot();
//t.test();
t.test1();
}
public void test()throws AWTException
{
   Robot robot=new Robot();
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_ALT);
 
    robot.keyPress(KeyEvent.VK_DELETE);
    robot.keyRelease(KeyEvent.VK_DELETE);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyRelease(KeyEvent.VK_ALT);
}
public void test1()throws AWTException{
		Robot robot=new Robot();
   		robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_SHIFT);
	     robot.keyPress(KeyEvent.VK_ESCAPE);
	     robot.keyRelease(KeyEvent.VK_ESCAPE);
	     robot.keyRelease(KeyEvent.VK_SHIFT);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
}
}