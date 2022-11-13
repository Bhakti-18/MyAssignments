package week2.day1S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();   //setup browser
		
		ChromeDriver driver = new ChromeDriver();   //Launch browser		
		
		driver.get("http://leaftaps.com/opentaps/control/main");   //Load the URL
		
		Select Dropdown = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
	    Dropdown.selectByVisibleText("New York");
	    
	    Select dd=new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));   // Dropdown click
		    dd.selectByValue("LEAD_CONERENCE");  
		    dd.selectByIndex(1);
		    dd.selectByVisibleText("Playwright");
		    WebElement ele = dd.getFirstSelectedOption();  //to get value selected in dropdown.
		    ele.getText();
	    
	}

}
