package AlertActionAndHandlePractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class AlertAcceptCancelPractice extends Utils {

	public static void main(String[] args) {
		getBrowser ("chrome", "https://demo.guru99.com/test/delete_customer.php");
		WebElement textField = driver.findElement(By.cssSelector("input[name=cusid]"));
		textField.sendKeys("7777");
		WebElement submitBttn = driver.findElement(By.cssSelector("input[name=submit]"));
		submitBttn.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.accept();
		
	//	WebElement iframe = driver.findElement(By.id("iframeResult"));
	//	driver.switchTo().frame(iframe);
		//WebElement tryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
	//	tryIt.click();
	//	Utils.hardWait(1000);
		//Alert alert = driver.switchTo().alert();
		//alert.sendKeys(" Ilham and Rahaf");
		//alert.accept();
		//
		
		
		Utils.hardWait(6000);
		Utils.tearDown();

	}
}


