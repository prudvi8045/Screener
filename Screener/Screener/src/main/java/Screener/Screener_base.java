package Screener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Screener_base {
	private WebDriver driver;
	
  @BeforeTest
  public void beforeClass() {
	  //System.out.println("Enetered Before Test function");
	  
	  System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	  driver = new ChromeDriver();
	  DriverManager.setWebDriver(driver);
	  DriverManager.getDriver().manage().window().maximize();
  }
  
  @BeforeMethod
  public void loadthepage() {
	  
	  //System.out.println("Enetered Before Method Function");
	  
	  DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	  DriverManager.getDriver().get("https://www.screener.in/");

      //String Title = "Google Search";
      
      String displayed_title = driver.getTitle();
      
      System.out.println("Loaded the page : " + displayed_title);

      //Assert.assertEquals(text, search_text, "Text not found!");
	  
	  
  }
  
	public WebElement getElement(By element, int sec) {
		Wait<WebDriver> wait = new WebDriverWait(DriverManager.getDriver(), sec);
		try {
			WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(element));
			return we;
		} catch (WebDriverException e) {
			return null;
		}
	}
  


  @AfterTest
  public void afterClass() {
	  
	  //System.out.println("Enetered After Test Function");
	  
	  DriverManager.getDriver().quit();
	  
  }

}
