package fitpeoassignment;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class navtohome {

	public static void main(String[] args) {
		
		// Case;
		// open the url 
		//url should open url (web page)
		//opens Chrome Depends on Driver 
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


	}

}
