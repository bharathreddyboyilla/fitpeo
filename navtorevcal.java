package fitpeoassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class navtorevcal {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//time for loading window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Open the web browser and navigate to FitPeo Homepage
		//can use get.() accept url in String format
		//driver.get("https://www.fitpeo.com/");
		// accept url in string and also object format
		driver.navigate().to("https://www.fitpeo.com/");
		
		//maximize the Window
		driver.manage().window().maximize();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//clicks on Revenue Calculator
		driver.findElement(By.xpath("//div[contains(text(),'Revenue Calculator')]")).click();
		driver.findElement(By.cssSelector("input[id=':r0:']")).sendKeys("300");
	

	}

}
