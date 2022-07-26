package AlertActionAndHandlePractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class AmazonPractice extends Utils{

	public static void main(String[] args) {
		Utils.getBrowser("chrome", "https://www.facebook.com/");
		WebElement text = driver.findElement(By.linkText("TEST ENVIRONMENT"));
		String strText = text.getText();
		Utils.hardWait(2000);
		driver.navigate().to("https://www.amazon.com/");
		Utils.hardWait(2000);
		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		searchField.sendKeys(strText);
		Utils.hardWait(2000);
		WebElement searchBttn = driver.findElement(By.id("nav-search-submit-button"));
		searchBttn.click();
		
		
		
		
		
		Utils.hardWait(2000);
		Utils.tearDown();

		 

		 
		

	}


		
	}


