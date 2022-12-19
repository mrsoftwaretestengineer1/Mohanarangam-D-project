package Hyundaiprojectsai1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class apiautomation {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		//Launch the browser
		 driver.get("https://reqres.in/");
		 
		// Step 4: Maximise the window
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//li[@data-http='get']")).click();
			
						
			driver.findElement(By.className("response-title")).getText();
			
			driver.findElement(By.xpath("(//li[@data-id='login-successful']")).click();
			
			driver.findElement(By.xpath("//span[@data-key='response-code']")).getText();
			
			driver.findElement(By.xpath("//li[@data-id='login-unsuccessful']")).click();
			
			driver.findElement(By.xpath("//span[@class='response-code bad']")).getText();
			
			driver.findElement(By.xpath("(//li[@data-id='users-single-not-found']")).click();
			
			driver.findElement(By.xpath("//span[@class='response-code bad']")).getText();
					
			driver.findElement(By.xpath("(//li[@data-id='unknown']/following-sibling::li[1]]")).click();
			
			driver.findElement(By.xpath("//p[@class='response-title']//span[1]")).getText();
			
			driver.findElement(By.xpath("//li[@data-http='put']")).click();
			
			driver.findElement(By.xpath("//span[@data-key='response-code']")).getText();
			
			
			driver.findElement(By.xpath("//li[@data-id='delete']")).click();
			
			driver.findElement(By.xpath("//span[@data-key='response-code']")).getText();
			
			

	}

}
