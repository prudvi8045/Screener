package tests;

import org.testng.annotations.Test;

import Screener.Screener_Homepage;
import Screener.Screener_base;
import Screener.Stock;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class Screener_tests extends Screener_base{
	
	Screener_Homepage homepage = new Screener_Homepage();
	Stock stock = new Stock();
	private String EPS_10 = "//*[@id='profit-loss']//td[contains(text(),'EPS')]/following-sibling::td[2]";
	private String EPS_now ="//*[@id='profit-loss']//td[contains(text(),'EPS')]/following-sibling::td[12]";
	
	




  @Test(enabled = true)
  public void f() throws InterruptedException {
	  homepage.Login();
	  homepage.getStock("TCS");
	  String Sector = stock.getSector();
	  System.out.println("Sector: " + Sector);
	  System.out.println("EPS Growth rate 10 yrs: " + stock.getEPSgrowthrate_10yrs());
	  double invest = stock.getvalue(EPS_10);
	  double present = stock.getvalue(EPS_now);
	  double years = 10.0;
	  
	  System.out.println("EPS Growth rate 10 yrs: " + stock.getGrowthrate(invest, present, years));
  }
  


}
