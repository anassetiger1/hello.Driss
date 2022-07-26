package AlertActionAndHandlePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class LocatorPractice extends Utils{

	public static void main(String[] args) {
		Utils.getBrowser("chrome", "https://www.facebook.com/");
		WebElement createNewAcc = driver.findElement(By.linkText("Create new account"));
		createNewAcc.click();
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Rahaf");
		Utils.hardWait(2000);
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Elhazime");
		Utils.hardWait(2000);
		WebElement enterEmail = driver.findElement(By.xpath("//input[@name=\'reg_email__\']"));enterEmail.click();
		Utils.hardWait(2000);
		enterEmail.sendKeys("rahafjudy@gmail.com");
		Utils.hardWait(2000);
		WebElement emailConfirmation = driver.findElement(By.name("reg_email_confirmation__"));
		emailConfirmation.sendKeys("rahafjudy@gmail.com");
		WebElement newPassword = driver.findElement(By.id("password_step_input"));
		newPassword.sendKeys("12345678");
		
		Utils.hardWait(2000);
		Utils.tearDown();
	}
}
	