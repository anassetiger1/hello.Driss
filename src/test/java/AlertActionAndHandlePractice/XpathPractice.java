package AlertActionAndHandlePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class XpathPractice extends Utils {

	public static void main(String[] args) {

		Utils.getBrowser("chrome", "https://www.facebook.com/");
		WebElement createAccount = driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
		createAccount.click();
		WebElement firstName = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		firstName.sendKeys("Rahaf");
		

		WebElement lastName = driver.findElement(By.xpath("//input[@name= lastname\"]"));
		

		lastName.sendKeys("Judy");
		createAccount.click();

		WebElement emailPhone = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		emailPhone.sendKeys("Rahafjudy@gmail.com");

		WebElement newPassword = driver.findElement(By.xpath("//input[@id=\"password_step_input\"]"));
		newPassword.sendKeys("123456");

		WebElement birthDay = driver.findElement(By.xpath("//select[@name= 'birthday_month']"));
		birthDay.sendKeys("november");

		Utils.hardWait(4000);
		Utils.tearDown();
	}

}
