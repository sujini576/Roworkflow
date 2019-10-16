package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Basicinfo {
	WebDriver driver;
	public Basicinfo(WebDriver driver) {
		this.driver=driver;
	}
	
   By gender=By.cssSelector("div.choice-item:nth-child(2) > label:nth-child(2)");
   By dob=By.id("dateOfBirth");
   By zipcode=By.id("zipcode");
   By phone=By.id("phone");
   By next=By.cssSelector("button.button:nth-child(1)");
		   
   public WebElement gender()
   {
	   return driver.findElement(gender);
   }
   public WebElement dob()
   {
	   return driver.findElement(dob);
   }
   public WebElement zipcode()
   {
	   return driver.findElement(zipcode);
   }
   public WebElement phone()
   {
	   return driver.findElement(phone);
   }
   public WebElement next()
   {
	   return driver.findElement(next);
   }
}
