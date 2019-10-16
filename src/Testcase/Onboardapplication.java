package Testcase;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pageobject.Basicinfo;
import Pageobject.Login;
import Pageobject.Onlinevisit;
import Pageobject.Updates;

public class Onboardapplication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","path of the .exe file");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://start.ro.co/rory/vaginal-dryness");
	    driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	    
	    Login ro =new Login(driver);
        ro.Email().sendKeys("test@gmail.com");
	    ro.firstname().sendKeys("hello");
	    ro.lastname().sendKeys("hi");
	    ro.password().sendKeys("Test@123");
	    ro.checkbox().click();
	    ro.submit().click();
	    
	    Onlinevisit ov= new Onlinevisit(driver);
	    Thread.sleep(1000);
	    ov.button().click();
		
        Basicinfo bi=new Basicinfo(driver);
	    Thread.sleep(1000);
        bi.gender().click();
        bi.dob().sendKeys("11/11/1911");
        bi.zipcode().sendKeys("08890");
        bi.phone().sendKeys("999-999-9999");
        bi.next().click();
        
        Updates up=new Updates(driver);
        up.update().click();
        up.question().click();
        up.mquestion1().click();
        up.mquestion2().click();
        up.suggestion().click();
        up.information().click();
        driver.quit();
	}

}
