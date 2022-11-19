package week2.day2S;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();   //setup browser
		
		ChromeDriver driver = new ChromeDriver();   //Launch browser		
		
		driver.get("https://en-gb.facebook.com/");   //Load the URL
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	    //driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Steve");
	    
	    //1.basic xpath
	    //div[@class='mbm _1iy_ _a4y _3-90 lfloat _ohe']//input[@name='firstname']   -- grandparent and grandchild
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("steve");
	    
	    //2.//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//input[@name='lastname']  grandparent and grandchild
	    //"//input[@name='lastname']"
	    driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']//input[@name='lastname']")).sendKeys("thomas");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Stevethomas@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Steave@123");
		
		//GreatGrandparent to greatgrandchil
		WebElement day = driver.findElement(By.xpath("//div[@class='_5k_5']//select[@id='day']"));
		Select dday= new Select(day);
		dday.selectByValue("18");
		
		WebElement Month = driver.findElement(By.xpath("//div[@class='_5k_5']//select[@id='month']"));
		Select dMonth = new Select (Month);
		dMonth.selectByValue("8");
				
	
		WebElement Year = driver.findElement(By.xpath("//div[@class='_5k_5']//select[@id='year']"));
		Select dYear = new Select (Year);
		dYear.selectByValue("1998");
		
		//span[@class='_5k_3']//label[@class='_58mt']  - Female 
		driver.findElement(By.xpath("//label[contains(text(),'Fem')]")).click();
		
		System.out.println("All fields are entered successfully");
	    
	}

}
