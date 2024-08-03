package fitpeoassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class validaterembvalue {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//navugate to the URl
		driver.navigate().to("https://fitpeo.com/revenue-calculator");
		//selectes the Checkboxes and value
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']//div[1]//label[1]//span[1]//input[1]")).click();
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']//div[2]//label[1]//span[1]//input[1]")).click();
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']//div[3]//label[1]//span[1]//input[1]")).click();
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']//div[8]//label[1]//span[1]//input[1]")).click();
		//comapres the given value is amtched or not and retuens true else false (boolean value)
		boolean TotalRecurringReimbursement = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 inter css-hocx5c'][normalize-space()='$27000']")).isDisplayed();
		System.out.println("Total Reimbursement Value : " + TotalRecurringReimbursement );
		//returns true or fakse boolean value
		

	}

}
