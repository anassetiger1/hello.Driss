package actionsActionInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class MoveToElement extends Utils {
	public static void main (String[] args) {
		
		getBrowser ("chrome","http://tek-school.com/retail" );
		
		WebElement electronics = driver.findElement(By.xpath("//a[text()='Desktops']"));
		Actions act = new Actions(driver);
		act.moveToElement(electronics).perform();
		Utils.hardWait(6000);
		
	}

}
