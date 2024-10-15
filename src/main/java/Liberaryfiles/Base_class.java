package Liberaryfiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.timeout.TimeoutException;

public class Base_class {
	
	public static WebDriver driver;
	public void openbrowser() throws IOException
	{
//		WebDriverManager.chromedriver().clearDriverCache().setup();
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver();
		//driver= new ChromeDriver();
		driver.get(UtilityClass.propertiesfile("URL"));
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    options();
	}

	void options() {
	    driver.manage().window().maximize();
	}
	
}
