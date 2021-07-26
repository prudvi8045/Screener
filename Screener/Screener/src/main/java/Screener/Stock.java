package Screener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Stock extends Screener_base{
	
	private By sector = By.xpath("//*[@id='peers']/div[1]/div[1]/p/a[1]");
	private By EPS_10 = By.xpath("//*[@id='profit-loss']//td[contains(text(),'EPS')]/following-sibling::td[2]");
	private By EPS_now = By.xpath("//*[@id='profit-loss']//td[contains(text(),'EPS')]/following-sibling::td[12]");
	private By PE_Chart = By.xpath("//*[@id='chart-menu']/div[2]/button[2]");
	private By PE_Chart_time = By.xpath("//*[@id='chart-menu']/div[2]/button[2]");
	private By Median_PE = By.xpath("//*[@id='chart-legend']/label[2]/span");
	
	public String getSector(){
		
		return getElement(sector,30).getText();
	
	}
	
	public String getEPS(){
		
		return getElement(EPS_10,30).getText();
	
	}
	
	public double getvalue(String element){
		//System.out.println(getElement(By.xpath(element),30).getText());
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
	
	public String getHistoricalPE(double years){
		
		getElement(PE_Chart,30).click();
		getElement(PE_Chart_time,30).click();
		String medianPE_com = getElement(Median_PE,30).getText();
		System.out.println(getElement(Median_PE,30).getText());
		//String medianPE =Double.toString(medianPE_com.substring(13));
		return medianPE_com.substring(13); 
		
			
	}



}
