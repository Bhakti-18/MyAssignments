package week2.day2S;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();   //setup browser
		
		ChromeDriver driver = new ChromeDriver();   //Launch browser		
		
		driver.get("http://leaftaps.com/opentaps/control/main");   //Load the URL
		
		
		
		
		//Xpath xml path 
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("iGTB");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Bhakti");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Paturkar");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
	}

}
