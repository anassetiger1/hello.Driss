package AlertActionAndHandlePractice;

import org.openqa.selenium.By;

import utilities.Utils;

public class CcselectorPractice1 extends Utils {

	public static void main(String[] args) {
		
		
		Utils.getBrowser("chrome", "https://www.facebook.com/");
		driver.findElement(By.cssSelector("div[class=_6ltg]>a[role=button]")).click();
		driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys("John");
		driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys("David");
		driver.findElement(By.cssSelector("input[type=text][name=reg_email__]")).sendKeys("johndavid@gmail.com");
		driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("12345");
		driver.findElement(By.cssSelector("select#month")).click();
		driver.findElement(By.cssSelector("select#month>option:nth-of-type(2)")).click();
		driver.findElement(By.cssSelector("select#day")).click();
		driver.findElement(By.cssSelector("select#day>option:first-child")).click();
		driver.findElement(By.cssSelector("select#year")).click();
		driver.findElement(By.cssSelector("select#year>option:nth-of-type(6)")).click();
		driver.findElement(By.cssSelector("input[type=radio][value='2']")).click();
		driver.findElement(By.cssSelector("button[name=websubmit]")).click();
		Utils.hardWait(2000);
		Utils.hardWait(6000);
		Utils.tearDown();
	}

}

