package AlertActionAndHandlePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class SelectDropDownPractice extends Utils {

	public static void main(String[] args) {
		Utils.getBrowser("chrome", "https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		List<WebElement> month = driver.findElements(By.cssSelector("select[id=month]>option"));
		List<WebElement> day = driver.findElements(By.cssSelector("select[id=day]>option"));
		List<WebElement> year = driver.findElements(By.cssSelector("select[id=year]>option"));
		selectValueFromDropdownUsingVisibleText(month, "Aug");
		selectValueFromDropdownUsingVisibleText(day, "15");
		selectValueFromDropdownUsingVisibleText(year, "2010");

		Utils.hardWait(5000);
		Utils.tearDown();

	}

	private static void selectValueFromDropdownUsingVisibleText(List<WebElement> element, String visibleText) {
		
	
		
		for (WebElement list : element) {
			String strValue = list.getText();
			if (strValue.equalsIgnoreCase(visibleText)) {
				list.click();
				
			 
			}
		}
	}
}

	
	


