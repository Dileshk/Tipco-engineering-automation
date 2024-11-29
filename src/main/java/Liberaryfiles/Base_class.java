package Liberaryfiles;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class Base_class {
	
	public static WebDriver driver;
	public void openbrowser() throws IOException
	{
//		WebDriverManager.chromedriver().clearDriverCache().setup();
		ChromeOptions options = new ChromeOptions();
options.addArguments("--start-maximized", "--disable-gpu");
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