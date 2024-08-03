package fitpeoassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class updatetext {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://fitpeo.com/revenue-calculator");
		//maximize the window
		driver.manage().window().maximize();
		//opens the path as selected and navigate to the id
		driver.findElement(By.xpath("//input[@id=':R57alklff9da:']")).sendKeys("820");
		//driver.close();

	}

}
