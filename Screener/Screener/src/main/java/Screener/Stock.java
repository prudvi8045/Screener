package Screener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Stock extends Screener_base{
	
	private By sector = By.xpath("//*[@id='peers']/div[1]/div[1]/p/a[1]");
	private By EPS_10 = By.xpath("//*[@id='profit-loss']//td[contains(text(),'EPS')]/following-sibling::td[2]");
	private By EPS_now = By.xpath("//*[@id='profit-loss']//td[contains(text(),'EPS')]/following-sibling::td[12]");
	
	public String getSector(){
		
		return getElement(sector,30).getText();
	
	}
	
	public String getEPS(){
		
		return getElement(EPS_10,30).getText();
	
	}
	
	public double getvalue(String element){
		
		return Double.parseDouble(getElement(By.xpath(element),30).getText());
	
	}
	
	public String getEPSgrowthrate_10yrs(){
		
		double eps_10yrs = Double.parseDouble(getElement(EPS_10,30).getText());
		double eps_now =  Double.parseDouble(getElement(EPS_now,30).getText());
		
		System.out.println("eps_now: " + eps_now);
		System.out.println("eps_10yrs: " + eps_10yrs);
		String growth_rate =Double.toString(((Math.pow((eps_now/eps_10yrs),(1.0/10.0)))-1)*100);
		return growth_rate; 
		
			
	}
	
	
	
	public String getGrowthrate(double invest, double present,double years){
		
		String growth_rate =Double.toString(((Math.pow((present/invest),(1.0/years)))-1)*100);
		return growth_rate; 
		
			
	}


}
