package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Updates {
	WebDriver driver;
	public Updates(WebDriver driver) {
		this.driver=driver;
	}
	
   By update=By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div[2]/div/div/div[5]/button[2]");
   By question=By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div[2]/form/button");
   By mquestion1=By.cssSelector("div.flow-choice_list-item:nth-child(1) > button:nth-child(1)");
   By mquestion2=By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div[2]/form/div[2]/div[2]/button");
   By suggestion=By.cssSelector("button.button:nth-child(1)");
   By information=By.cssSelector("button.button--primary:nth-child(1)");
   
   public WebElement update()
   {
	   return driver.findElement(update);
   }
   public WebElement question()
   {
	   return driver.findElement(question);
   }
   public WebElement mquestion1()
   {
	   return driver.findElement(mquestion1);
   }
   public WebElement mquestion2()
   {
	   return driver.findElement(mquestion2);
   }
   public WebElement suggestion()
   {
	   return driver.findElement(suggestion);
   }
   public WebElement information()
   {
	   return driver.findElement(information);
   }
}
