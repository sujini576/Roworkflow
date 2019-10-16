package Pageobject;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class Login {

		WebDriver driver;
		public Login(WebDriver driver) {
			this.driver=driver;
		}
		
	   By email=By.xpath("//form/div/div/input[@id='temporaryEmail']");
	   By firstname=By.id("firstName");
	   By lastname=By.id("lastName");
	   By password=By.id("password");
	   By checkbox=By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div/form/div[5]/div/div/label/div");
	   By go=By.cssSelector(".sc-bxivhb");
	   
	   
	   
	   public WebElement Email()
	   {
		   return driver.findElement(email);
	   }
	   public WebElement firstname()
	   {
		   return driver.findElement(firstname);
	   }     
	   public WebElement lastname()
	   {
		   return driver.findElement(lastname);
	   }  
	   public WebElement password()
	   {
		   return driver.findElement(password);
	   }
	   public WebElement checkbox()
	   {
		   return driver.findElement(checkbox);
	   }
	   public WebElement submit()
	   {
		   return driver.findElement(go);
	   }
	   
	   }



