package mytests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;


public class NewToursRegistrationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\Dínamo-TI\\Downloads\\IEDriverServer_x64_3.6.0\\IEDriverServer.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dínamo-TI\\Downloads\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		
//		WebDriver driver = new InternetExplorerDriver();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement RegisterLink;
		
	
//		RegisterLink = driver.findElement(By.xpath("//a[@href='mercuryregister.php']"));
		RegisterLink = driver.findElement(By.linkText("REGISTER"));
		
		RegisterLink.click();
		
		driver.quit();
		
		

	}

}
