package fitpeoassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectcptcodes {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//max window Size
		driver.manage().window().maximize();
		//opends URl
		driver.navigate().to("https://fitpeo.com/revenue-calculator");
		//search for the Checkbox and selects the desired box
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']//div[1]//label[1]//span[1]//input[1]")).click();
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']//div[2]//label[1]//span[1]//input[1]")).click();
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']//div[3]//label[1]//span[1]//input[1]")).click();
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']//div[8]//label[1]//span[1]//input[1]")).click();
		//to confirm wheather the check box is selected or not can be used 
		boolean checkBox=driver.findElement(By.xpath("//div[1]//label[1]//span[1]//input[1]")).isSelected();
		boolean checkBox1=driver.findElement(By.xpath("//div[2]//label[1]//span[1]//input[1]")).isSelected();
		boolean checkBox2=driver.findElement(By.xpath("//div[3]//label[1]//span[1]//input[1]")).isSelected();
		boolean checkBox3=driver.findElement(By.xpath("//div[8]//label[1]//span[1]//input[1]")).isSelected();
		//resturns true if the Checkbox is selected ekse false
		System.out.println("CheckBox Selection Status:" + checkBox);


	}

}
