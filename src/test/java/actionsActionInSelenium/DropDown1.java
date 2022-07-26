package actionsActionInSelenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class DropDown1 extends Utils {
	
	public static void main(String [] args) {
		
		getBrowser ("chrome" ," https://jqueryui.com/selectable/");
		WebElement iFrame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iFrame);
	    hardWait(2000);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.COMMAND)
		.click(item1)
		.click(item2)
		.click(item3)
	    .click(item4)
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		hardWait(6000);
		tearDown();
		
		
	
		
	
		
		
		
	}

}
