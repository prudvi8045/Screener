package Screener;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExcelFile extends Screener_base{
	
	 File file =    new File("src/main/results/TCS.xls");
	 /*
     //Create an object of FileInputStream class to read excel file
     FileInputStream inputStream = new FileInputStream(file);
     
     //creating workbook instance that refers to .xls file
    // HSSFWorkbook wb=new HSSFWorkbook(inputStream);
     
     //creating a Sheet object
    // HSSFSheet sheet=wb.getSheet("STUDENT_DATA");
     
     //get all rows in the sheet
     int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
     


     //Identify the WebElements for the student registration form
     WebElement firstName=driver.findElement(By.id("firstName"));
     WebElement lastName=driver.findElement(By.id("lastName"));
     WebElement email=driver.findElement(By.id("userEmail"));
     WebElement genderMale= driver.findElement(By.id("gender-radio-1"));
     WebElement mobile=driver.findElement(By.id("userNumber"));
     WebElement address=driver.findElement(By.id("currentAddress"));
     WebElement submitBtn=driver.findElement(By.id("submit"));
     
     */

}
