package actionsActionInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class DragAndDown extends Utils {

	public static void main(String[] args) {
		getBrowser("chrome", "https://jqueryui.com/droppable/");
		WebElement iFrame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iFrame);
		WebElement elementA = driver.findElement(By.id("draggable"));
		WebElement elementB = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(elementA, elementB).build().perform();

		hardWait(6000);
		tearDown();

	}

}
