package Screener;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Screener_Homepage extends Screener_base{
	
	private String Search_box = "//input" ;
	private String Title = "//div[2]/div/div/a[1]" ;
	private String Login = "//div[1]/div/div[1]/div/div[3]/div[2]/a[1]";
	private String username = "//div/div/div[2]/form/div[1]/input";
	private String password = "//*[@id='id_password']";
	private String Login2 = "//div/div/div[2]/form/button";
	private String Search_box2 = "//*[@id='desktop-search']/div/input";
	
	
	public void Login() throws InterruptedException{

		getElement(By.xpath(Login),30).click();
		getElement(By.xpath(username),30).sendKeys("prudhvi7077@gmail.com");
		getElement(By.xpath(password),30).sendKeys("Screener@1");
		getElement(By.xpath(Login2),30).click();
		System.out.println("Login Successful");

		//getElement(By.xpath(Search_box),30).sendKeys(stock_name);
		
	}
	
	public void getStock(String stock_name) throws InterruptedException{

		getElement(By.xpath(Search_box2),30).sendKeys(stock_name);
		getElement(By.xpath("//*[@id='desktop-search']/div/ul/li[1]"),30).click();
		Thread.sleep(10000);
		
	}

}
