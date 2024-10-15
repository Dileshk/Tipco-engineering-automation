import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Dashboard.Dashboard;
import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;

public class Test_dashboard extends Base_class {
	
	Dashboard dash;
	SoftAssert softAssert;
	@BeforeClass
	public void initialisebrowser() throws IOException, InterruptedException
	{
		openbrowser();
		dash=new Dashboard(driver);
		Thread.sleep(5000);
		dash.entermail(UtilityClass.propertiesfile("validmail"));
		dash.entpass(UtilityClass.propertiesfile("validpass"));
		dash.clickbuttonsubmit();
	}
	@Test
	public void Verify_that_select_orgnization_device_and_check_data_according_select_date() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
    
		dash.clickonorarrow();
		Thread.sleep(7000);
		
		
		dash.clickonorgname();
		Thread.sleep(7000);
		dash.clickondevice();
		 
		WebElement date = driver.findElement(By.xpath("//input[@type='date']"));
		 
	date.sendKeys("20-09-2024");
//		Thread.sleep(1000);
//		date.click();
		Thread.sleep(8000);
		WebElement nodata = driver.findElement(By.xpath("//ul[@class='graphtlist']/li"));
		softAssert.assertTrue(nodata.isDisplayed());
	}
	catch(Exception e)
	{
		softAssert.fail("Exceptio"+e.getMessage());
	}finally {
		softAssert.assertAll();
	}
		
	}

}
