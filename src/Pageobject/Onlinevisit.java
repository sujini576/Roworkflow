package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Onlinevisit {

	WebDriver driver;
	public Onlinevisit(WebDriver driver) {
		this.driver=driver;
	}
	
   By button=By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div[2]/div/button");
  
   
   public WebElement button()
   {
	   return driver.findElement(button);
   }
}
