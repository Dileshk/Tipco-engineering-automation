import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
	
		Thread.sleep(30000);
		driver.navigate().refresh();
		Thread.sleep(7000);
		dash.clickonorarrow();
		Thread.sleep(7000);
		
		
		dash.clickonorgname();
		Thread.sleep(7000);
		dash.clickondevice();
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//input[@type='date']"));
		Thread.sleep(2000);
	date.sendKeys("2024-09-09");
		Thread.sleep(1000);
		date.click();
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
