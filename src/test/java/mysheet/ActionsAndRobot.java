package mysheet;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsAndRobot {
	public static void main(String[] args) throws Throwable {
		//System.setProperty("webdriver.edge.driver", "D:\\New folder\\Maven\\target\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url = "https://www.facebook.com/";
		driver.get(url);

		driver.manage().window().maximize();
		WebElement em1 = driver.findElement(By.id("email"));
				
				 //WebElement em = driver.findElement(By.xpath("//span[text()'Account & Lists']"));
		Actions a = new Actions (driver);
		         //a.moveToElement(em).perform(); 
		a.sendKeys(em1,"poyyali").perform();
		a.doubleClick().perform();
		a.contextClick().perform();  //rightclick

		Robot r = new Robot();
		for (int i = 0; i<2 ; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
		
		
		
		
		
}
}