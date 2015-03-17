package simulation;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class EmulationKey {
 public static void pressKey(Robot robot, int keyvalue) {
  robot.keyPress(keyvalue); // 按下按键
  robot.keyRelease(keyvalue); // 释放按键
 }

 // 转换大小写,默认小写,经此方法变为大些
 public static void pressKeyWithShift(Robot robot, int keyvalue) {
  // 按下按键
  robot.keyPress(KeyEvent.VK_SHIFT);
  robot.keyPress(keyvalue);
  
  // 释放按键
  robot.keyRelease(keyvalue);
  robot.keyRelease(KeyEvent.VK_SHIFT);
 }

 // 关闭应用程序
 public static void closeApplication(Robot robot) {
  // 按下按键关闭应用程序(shift+f4)
  robot.keyPress(KeyEvent.VK_ALT);
  robot.keyPress(KeyEvent.VK_F4);
  // 释放按键关闭应用程序(shift+f4)
  robot.keyRelease(KeyEvent.VK_ALT);
  robot.keyRelease(KeyEvent.VK_F4);
  
  // 保存一个路径
  robot.keyPress(KeyEvent.VK_Y);
  robot.keyRelease(KeyEvent.VK_Y);
 }

 public static void main(String[] args) throws IOException {
  try {
   Robot robot = new Robot();
   
   //BufferedImage image  = robot.createScreenCapture(new Rectangle(0,0,500,500));
            Runtime.getRuntime().exec("notepad");
   // 定义1秒的延迟,机器人开始写字
   robot.delay(1000);
   for (int i = 0; i < 5; i++) {
    pressKeyWithShift(robot, KeyEvent.VK_H);
    pressKey(robot, KeyEvent.VK_I);
    pressKey(robot, KeyEvent.VK_SPACE);
    
    pressKeyWithShift(robot, KeyEvent.VK_B);
    pressKey(robot, KeyEvent.VK_E);
    pressKey(robot, KeyEvent.VK_A);
    pressKey(robot, KeyEvent.VK_U);
    pressKey(robot, KeyEvent.VK_T);
    pressKey(robot, KeyEvent.VK_Y);
    // 换行
    pressKey(robot, KeyEvent.VK_ENTER);
   }
   closeApplication(robot);
  } catch (AWTException e) {
   e.printStackTrace();
  }
 }
}