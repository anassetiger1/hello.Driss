package AlertActionAndHandlePractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import utilities.Utils;

public class InfluentWaitPractice extends Utils {

	public static void main(String[] args) {
		Utils.getBrowser("chrome", "https://shop.demoqa.com/");

		WebElement text1 = driver.findElement(By.cssSelector("div#slide-6-layer-444"));

		//@SuppressWarnings("deprecation")
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)

				.withTimeout(20, TimeUnit.SECONDS)

				.pollingEvery(1, TimeUnit.SECONDS)

				.withMessage("This test step is on line 23, class FluentWaitInSelenium1");

		wait.until(ExpectedConditions.visibilityOf(text1));
		

		System.out.println(text1.getText());
		Utils.hardWait(6000);

		Utils.tearDown();
		 

	}

}
