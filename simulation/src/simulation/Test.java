package simulation;

import java.awt.Desktop;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		try {
			//1. Runtime.getRuntime().exec("cmd /c \"C:\\Program Files\\Thunder\\Program\\Thunder.exe\"");
			//2.
//			Desktop d=Desktop.getDesktop();
//			d.open(new File("C:\\Program Files\\Thunder\\Program\\Thunder.exe" ));
			
			Robot robot = new Robot(); //创建一个robot对象
            Runtime.getRuntime().exec("notepad");        //打开一个记事本程序
            robot.delay(2000);        //等待 2秒
            keyPressWithAlt(robot, KeyEvent.VK_SPACE); //按下 alt+ 空格
            keyPress(robot, KeyEvent.VK_X);  //按下x键
            
            
            
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// shift+ 按键
    public static void keyPressWithShift(Robot r, int key) {
            r.keyPress(KeyEvent.VK_SHIFT);
            r.keyPress(key);
            r.keyRelease(key);
            r.keyRelease(KeyEvent.VK_SHIFT);
            r.delay(100);
    }

    // ctrl+ 按键
    public static void keyPressWithCtrl(Robot r, int key) {
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(key);
            r.keyRelease(key);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.delay(100);
    }

    // alt+ 按键
    public static void keyPressWithAlt(Robot r, int key) {
            r.keyPress(KeyEvent.VK_ALT);
            r.keyPress(key);
            r.keyRelease(key);
            r.keyRelease(KeyEvent.VK_ALT);
            r.delay(100);
    }
    //打印出字符串
    public static void keyPressString(Robot r, String str){
            Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();//获取剪切板
            Transferable tText = new StringSelection(str);
            clip.setContents(tText, null); //设置剪切板内容
            keyPressWithCtrl(r, KeyEvent.VK_V);//粘贴
            r.delay(100);
    }
    
    //单个 按键
    public static void keyPress(Robot r,int key){
            r.keyPress(key);
            r.keyRelease(key);
            r.delay(100);
    }
}
