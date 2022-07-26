package AlertActionAndHandlePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class WebElementsMethods extends Utils {

	public static <clickOnRadioButton> void main(String[] args) {
		Utils.getBrowser("chrome", "https://www.facebook.com/");
		WebElement creatNewAcct = driver.findElement(By.linkText("Create new account"));
		
		//isDisplayed
		boolean isdisplayed = creatNewAcct.isDisplayed();
		System.out.println("isDisplayed = " + isdisplayed);
		//isEnabled
		boolean isenabled = creatNewAcct.isEnabled();
		System.out.println("isEnabled = " + isenabled);
		
		//isSelected
		 creatNewAcct.click();
		WebElement gender = driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));
		boolean isselected1 = gender.isSelected();
		System.out.println("isSelected " + isselected1);
		boolean isdisplayed2 = creatNewAcct.isDisplayed();
		System.out.println("gender: isDisplayed = " + isdisplayed2);
		boolean isenabled2 = creatNewAcct.isEnabled();
		System.out.println("gender: isEnabled = " + isenabled2);
		gender.click();
		boolean isselected2 = gender.isSelected();
		System.out.println("gender: isSelected " + isselected2);
        //clickOnRadioButton(gender);
        
		Utils.hardWait(4000);
		Utils.tearDown();
      //we can create a method to check all three conditions so that avoid  and use the same method again and again
	}
	public static void clickOnRadioButton(WebElement element ) {
	try{
		if(element.isDisplayed()== true & element.isEnabled()==true & element.isSelected()==false ) {
			element.click();
		}else {
			System.out.println("one of the conditions did not return value");
		}
		
	}catch (Exception e) {
		e.fillInStackTrace();
		
	}
		
		
		
	}
}


