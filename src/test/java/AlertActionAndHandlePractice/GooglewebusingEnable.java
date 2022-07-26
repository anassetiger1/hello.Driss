package AlertActionAndHandlePractice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Utils;

public class GooglewebusingEnable extends Utils {
	public static void main(String[] args) {
		
	

	Utils.getBrowser("chrome", "https://www.facebook.com/");
	
    //clear(); it will clear the input field/test field for us
	WebElement phoneEmail = driver.findElement(By.id("email"));
	phoneEmail.sendKeys("777-2345-8989");
	phoneEmail.clear();
	phoneEmail.sendKeys("rahafJudy@gmail.com");
	
	//getText();
	//getTagName(); will get the tag name for element
	WebElement creatNewAcct = driver.findElement(By.linkText("Create new account"));
	System.out.println("Tag name: " + creatNewAcct.getTagName());
	
	//get CcssValue 
	System.out.println("CssValue: " + creatNewAcct.getCssValue("background-color"));
	System.out.println("CssValue: " + creatNewAcct.getCssValue("front-size"));
	
	//get attribute();
	System.out.println("GetAttribute: " + creatNewAcct.getAttribute("data-testid"));
	
	//getSize
	//getLocation
	System.out.println("Size " +  creatNewAcct.getSize() );
	System.out.println("Location" + creatNewAcct.getLocation());
	
	
	
	
	Utils.hardWait(4000);
	Utils.tearDown();
		
			
	
	
	
		
	}	
		
		{
			
		}
	}



