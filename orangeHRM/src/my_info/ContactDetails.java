package my_info;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ContactDetails {

	public static void main(String[] args)  {
		FileInputStream f;
		try {
			f = new FileInputStream("C:\\Users\\hp\\Desktop\\OrangeHRM data.xls");
		
		
		Workbook wb= Workbook.getWorkbook(f);
		Sheet s=wb.getSheet("Sheet2");
        System.setProperty("webdriver.gecko.driver","E:\\\\shridevi\\\\jar files\\\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		// launching app
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get((s.getCell(1, 2).getContents()));
		driver.manage().window().maximize();
		//Entering User name
		driver.findElement(By.xpath(s.getCell(1, 3).getContents())).sendKeys(s.getCell(1, 4).getContents());
		//Entering Password
		driver.findElement(By.xpath(s.getCell(1, 5).getContents())).sendKeys(s.getCell(1, 6).getContents());
// clicking on login
		driver.findElement(By.xpath(s.getCell(1, 7).getContents())).click();
	//clicking on my info
		driver.findElement(By.xpath(s.getCell(1, 8).getContents())).click();
		//clicking on contact details
		driver.findElement(By.xpath(s.getCell(1, 9).getContents())).click();
		driver.findElement(By.xpath(s.getCell(1, 10).getContents())).sendKeys(s.getCell(1, 11).getContents());
		driver.findElement(By.xpath(s.getCell(1, 12).getContents())).sendKeys(s.getCell(1, 13).getContents());
		driver.findElement(By.xpath(s.getCell(1, 14).getContents())).sendKeys(s.getCell(1, 15).getContents());
		driver.findElement(By.xpath(s.getCell(1, 16).getContents())).sendKeys(s.getCell(1, 17).getContents());
		driver.findElement(By.xpath(s.getCell(1, 18).getContents())).sendKeys(s.getCell(1, 19).getContents());
		WebElement country= driver.findElement(By.xpath(s.getCell(1, 20).getContents()));
		Select obj= new Select(country);
		obj.selectByIndex(0);

		driver.findElement(By.xpath(s.getCell(1, 21).getContents())).sendKeys(s.getCell(1, 22).getContents());
		driver.findElement(By.xpath(s.getCell(1, 23).getContents())).sendKeys(s.getCell(1, 24).getContents());
		driver.findElement(By.xpath(s.getCell(1, 25).getContents())).sendKeys(s.getCell(1, 26).getContents());
		driver.findElement(By.xpath(s.getCell(1, 27).getContents())).clear();
		driver.findElement(By.xpath(s.getCell(1, 27).getContents())).sendKeys(s.getCell(1, 28).getContents());
		driver.findElement(By.xpath(s.getCell(1, 29).getContents())).sendKeys(s.getCell(1, 30).getContents());
		driver.findElement(By.xpath(s.getCell(1, 31).getContents())).click();
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
	
	
	
	
	
	}

}
