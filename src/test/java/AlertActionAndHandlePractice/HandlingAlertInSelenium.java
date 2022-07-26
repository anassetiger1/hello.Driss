package AlertActionAndHandlePractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class HandlingAlertInSelenium extends Utils {

	public static void main(String[] args) {
		getBrowser ("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		WebElement iframe = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(iframe);
		WebElement tryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryIt.click();
		Utils.hardWait(1000);
		Alert alert =driver.switchTo().alert();
		alert.accept();
		//alert.dismiss();
		
		 
		
		
		
		
		
		
	
		
		Utils.hardWait(6000);
		Utils.tearDown();
		}
	

	}


