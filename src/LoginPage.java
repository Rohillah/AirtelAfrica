import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage{

	public static void main(String[] args) {
		//hello
		
		  
		  System.setProperty("webdriver.chrome.driver","D:\\java workspace\\browser driver\\chromedriver.exe");
		    
		 WebDriver driver=new ChromeDriver();
		// ChromeDriver driver=new ChromeDriver();
		  
	//	 System.setProperty("webdriver.gecko.driver","D:\\java workspace\\browser driver\\geckodriver.exe");
	//	  WebDriver driver=new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    driver.get("https://kyctest.airtel.africa/kyc-ne/#!/login");
		//	driver.navigate().to("https://kyctest.airtel.africa/kyc-ne/#!/login"); stores history
		     driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("99887762");
		   driver.findElement(By.name("password")).sendKeys("Airtel1234");
		    driver.findElement(By.className("btn")).click();
		   // System.out.println(driver.getTitle());
		   //  driver.close();
		 //  driver.quit();  (to close all tabs)
				   
		//   Thread.sleep(5000);
		
		   
			}

	
}
