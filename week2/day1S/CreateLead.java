package week2.day1S;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();   //setup browser
		
		ChromeDriver driver = new ChromeDriver();   //Launch browser		
		
		driver.get("http://leaftaps.com/opentaps/control/main");   //Load the URL
		
		//maximize browser window
		driver.manage().window().maximize();
		
		//Enter the Username  -- to get return type -- //cntrl+2+l
		WebElement elusername = driver.findElement(By.id("username")) ;
		elusername.sendKeys("DemoSalesManager");
		
	    driver.findElement(By.id("password")).sendKeys("crmsfa");;
	    
	    driver.findElement(By.className("decorativeSubmit")).click();  //Click on login button
	   // driver.findElement(By.className("decorativeSubmit")).sendKeys(Keys.ENTER);
	    driver.findElement(By.linkText("CRM/SFA")).click();  //click on CRM/SFA
	    
	    driver.findElement(By.linkText("Leads")).click();    // click on leads
        
	    driver.findElement(By.linkText("Create Lead")).click();  //click on create lead
	    
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Intellect deisgn arena");  //enter company name 
	    
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhakti");   //first name
	    
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Paturkar");  //Last Name
	    
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("BhaktiPatrukar");   //First name Local
	    
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");   //Department
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Hello Bhakti here & I am From IT Department.");   //Description
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Paturkar.bhakti@gmail.com");  //EmailID
	    
	    Select Dropdown = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
	    Dropdown.selectByVisibleText("New York");
	    
	    driver.findElement(By.className("smallSubmit")).click();    //Submit button
	    
	    System.out.println("tis is the title of the url"  +driver.getTitle());   //get title of the URL
	    
	    //Select dd=new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));   // Dropdown click
	   // dd.selectByValue("LEAD_CONERENCE");  
	    //dd.selectByIndex(1);
	    //dd.selectByVisibleText("Playwright");
	    //WebElement ele = dd.getFirstSelectedOption();  //to get value selected in dropdown.
	    //ele.getText();
	    
	    Thread.sleep(2000);
	    driver.close();
	}

}
