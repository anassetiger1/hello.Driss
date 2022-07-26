package AlertActionAndHandlePractice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class MoveToElementPractice1 extends Utils{

	public static void main(String[] args) {
		getBrowser("chrome","https://www.ebay.com/" );
		WebElement electronics = driver.findElement(By.cssSelector("li[data-hover-track='p2481888.m1380.l6435']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(electronics).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		hardWait(6000);
		tearDown();
		
		

	}

}
