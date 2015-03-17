package simulation;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.util.Random;
 
/**
*
* @author Xiaofeng Wang  随机移动鼠标并点击左键
* 
* 
* 
* 鼠标移动事件。
Robot中主要的鼠标和键盘控制方法有：
•    void keyPress(int keycode) 按下给定的键。
•    void keyRelease(int keycode) 释放给定的键。
•    void mouseMove(int x, int y) 将鼠标指针移动到给定屏幕坐标。
•    void mousePress(int buttons) 按下一个或多个鼠标按钮。
•    void mouseRelease(int buttons) 释放一个或多个鼠标按钮。
•    void mouseWheel(int wheelAmt) 在配有滚轮的鼠标上旋转滚轮。
*/
public class MouseController implements Runnable {
	private Dimension dim;
	private Random rand;
	private Robot robot;
	private volatile boolean stop = false;
	/** Creates a new instance of Main */
	public MouseController() {
	dim = Toolkit.getDefaultToolkit().getScreenSize();
	rand = new Random();
	try {
	robot = new Robot();
	} catch (AWTException ex) {
	ex.printStackTrace();
	}
}
 
	public void run() {
		while(!stop) {
			int x = rand.nextInt(dim.width);
			int y = rand.nextInt(dim.height);
			robot.mouseMove(x, y);
			robot.mousePress(InputEvent.BUTTON1_MASK);
			try {
				Thread.sleep(3000);
				} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
	public synchronized void stop() {
		stop = true;
	}
	/** * @param args the command line arguments */
	public static void main(String[] args) {
		MouseController mc = new MouseController();
		Thread mcThread = new Thread(mc);
		System.out.println("Mouse Controller start");
		mcThread.start();
		try {
			Thread.sleep(60000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		mc.stop();
		System.out.println("Mouse Controller stoped");
	}
}