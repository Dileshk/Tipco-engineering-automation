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
//	@Test
//	public void Verify_that_select_orgnization_device_and_check_data_according_select_date() throws InterruptedException
//	{ softAssert= new SoftAssert();
//	try
//	{
//	
//		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
//		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
//    
//		dash.clickonorarrow();
//		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//		
//		
//		dash.clickonorgname();
//		
//		dash.clickondevice();
//		 
//		WebElement date = driver.findElement(By.xpath("//input[@type='date']"));
//		 
//	date.sendKeys("20-09-2024");
////		Thread.sleep(1000);
////		date.click();
//	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//     
//     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='graphtlist']/li")));
//     System.out.println("Overlay Gone");
//		WebElement nodata = driver.findElement(By.xpath("//ul[@class='graphtlist']/li"));
//		softAssert.assertTrue(nodata.isDisplayed());
//	}
//	catch(Exception e)
//	{
//		softAssert.fail("Exceptio"+e.getMessage());
//	}finally {
//		softAssert.assertAll();
//	}
//		
//	}
	@Test(priority = 1)
	public void Verify_that_select_Horizontal_bead_mill_machine_and_check_product_pump_motor_on_off() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
    
		dash.clickonorarrow();
		
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait3.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	     dash.clickonorgname();
		driver.findElement(By.xpath("//div[text()='THM']")).click();
	     
		 
		WebElement date = driver.findElement(By.xpath("//input[@type='date']"));
		 
	date.sendKeys("20-09-2024");
//		Thread.sleep(1000);
//		date.click();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='statuscheck uppercase-text']")));
     System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("//div[@class='statuscheck uppercase-text']"));
		softAssert.assertTrue(nodata.isDisplayed());
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		softAssert.fail("Exceptio"+e.getMessage());
	}finally {
		softAssert.assertAll();
		driver.navigate().refresh();
	}
		
	}
	@Test(priority = 2)
	public void Verify_that_select_Horizontal_bead_mill_machine_and_check_product_pump_motor_RPM_is_displayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));

	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='pump-box-sub-titles']")));
     System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("//p[@class='pump-box-sub-titles']"));
		softAssert.assertTrue(nodata.isDisplayed());
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		softAssert.fail("Exceptio"+e.getMessage());
	}finally {
		softAssert.assertAll();
		driver.navigate().refresh();
	}
		
	}
	@Test(priority = 3)
	public void Verify_that_select_Horizontal_bead_mill_machine_and_check_product_pump_motor_Last_of_off_time_isDisplayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
    
		
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='pump-box-sub-titles']")));
     System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("//p[@class='pump-box-sub-titles']"));
		softAssert.assertTrue(nodata.isDisplayed());
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		softAssert.fail("Exceptio"+e.getMessage());
	}finally {
		softAssert.assertAll();
		driver.navigate().refresh();
	}
		
	}
	@Test(priority = 4)
	public void Verify_that_select_Horizontal_bead_mill_machine_and_check_product_pump_motor_Last_of_off_date_isDisplayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
    
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='pump-box-sub-titles']")));
     System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("//p[@class='pump-box-sub-titles']"));
		softAssert.assertTrue(nodata.isDisplayed());
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		softAssert.fail("Exceptio"+e.getMessage());
	}finally {
		softAssert.assertAll();
		driver.navigate().refresh();
	}
		
	}

}
