
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
	public void Verify_that_select_Horizontal_bead_mill_machine_and_check_product_pump_motor_Last_on_off_date_isDisplayed() throws InterruptedException
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
	@Test(priority = 5)
	public void Verify_that_select_Horizontal_bead_mill_machine_and_check_milli_motor_on_off() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
    
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='statuscheck uppercase-text'])[2]")));
     System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//div[@class='statuscheck uppercase-text'])[2]"));
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
	@Test(priority = 6)
	public void Verify_that_select_Horizontal_bead_mill_machine_and_check_milli_motor_RPM_is_displayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));

	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[4]")));
     System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[4]"));
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
	@Test(priority = 7)
	public void Verify_that_select_Horizontal_bead_mill_machine_and_check_Milli_motor_Last_on_off_time_isDisplayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
    
		
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[5]")));
     System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[5]"));
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
	@Test(priority = 8)
	public void Verify_that_select_Horizontal_bead_mill_machine_and_check_milli_motor_Last_on_off_date_isDisplayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
    
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[6]")));
     System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[6]"));
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
	@Test(priority = 9)
	public void Verify_that_select_Horizontal_bead_mill_machine_and_check_coolant_motor_on_off() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
    
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='statuscheck uppercase-text'])[3]")));
     System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//div[@class='statuscheck uppercase-text'])[3]"));
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
	
	@Test(priority = 10)
	public void Verify_that_select_Horizontal_bead_mill_machine_and_check_coolant_motor_Last_on_off_time_isDisplayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
    
		
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[7]")));
     System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[7]"));
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
	@Test(priority = 11)
	public void Verify_that_select_Horizontal_bead_mill_machine_and_check_coolant_motor_Last_on_off_date_isDisplayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
    
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[8]")));
     System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[8]"));
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
	@Test(priority = 12)
	public void Verify_that_select_Horizontal_bead_mill_machine_and_check_horizontal_bead_mill_machine_isDisplayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
    
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Horizontal Bead Mill']")));
     System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("//h2[text()='Horizontal Bead Mill']"));
		softAssert.assertTrue(nodata.isDisplayed());
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		softAssert.fail("Exceptio"+e.getMessage());
	}finally {
		softAssert.assertAll();
		driver.navigate().refresh();
	}}
	@Test(priority = 13)
	public void Verify_that_select_Horizontal_bead_mill_machine_and_check_temperature_isDisplayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
    
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[9]")));
     System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[9]"));
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
	@Test(priority = 14)
	public void Verify_that_select_Horizontal_bead_mill_machine_and_check_pressure_isDisplayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
    
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[10]")));
     System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[10]"));
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
	@Test(priority = 15)
	public void Verify_that_select_Horizontal_bead_mill_machine_and_check_vibration_isDisplayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
    
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[11]")));
     System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[11]"));
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
	@Test(priority = 16)
	public void Verify_that_select_Horizontal_bead_mill_machine_and_check_weight_isDisplayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
    
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
     
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[12]")));
     System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[12]"));
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
	@Test(priority = 17)
	public void Verify_that_select_twin_saft_disperser_machine_and_check_main_motor_on_off() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
    driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[text()='TSD']")).click();
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
	@Test(priority = 18)
	public void Verify_that_select_twin_shaftdisperser_machine_and_check_main_motor_motor_RPM_is_displayed() throws InterruptedException
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
	@Test(priority = 19)
	public void Verify_that_select_twin_shaftdisperser_machine_and_check_main_motor_motor_Last_on_off_time_is_displayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
 
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[2]")));
    System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[2]"));
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
	@Test(priority = 20)
	public void Verify_that_select_twin_shaftdisperser_machine_and_check_main_motor_motor_Last_on_off_date_is_displayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[3]")));
    System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[3]"));
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
	@Test(priority = 21)
	public void Verify_that_select_twin_shaftdisperser_machine_and_check_scrapper_motor_on_off_is_displayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='statuscheck uppercase-text'])[2]")));
    System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//div[@class='statuscheck uppercase-text'])[2]"));
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
	@Test(priority = 22)
	public void Verify_that_select_twin_shaftdisperser_machine_and_check_scrapper_motor_RPM_is_displayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[4]")));
    System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[4]"));
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
	@Test(priority = 23)
	public void Verify_that_select_twin_shaftdisperser_machine_and_check_scrapper_motor_last_on_off_time_is_displayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[5]")));
    System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[5]"));
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
	@Test(priority = 24)
	public void Verify_that_select_twin_shaftdisperser_machine_and_check_scrapper_motor_last_on_off_date_is_displayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[6]")));
    System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[6]"));
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
	@Test(priority = 25)
	public void Verify_that_select_twin_shaftdisperser_machine_and_check_hydraulic_motor__on_off_is_displayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='statuscheck uppercase-text'])[3]")));
    System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//div[@class='statuscheck uppercase-text'])[3]"));
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
	@Test(priority = 26)
	public void Verify_that_select_twin_shaftdisperser_machine_and_check_hydraulic_motor_Last_on_off__time_is_displayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[7]")));
    System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[7]"));
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
	@Test(priority = 27)
	public void Verify_that_select_twin_shaftdisperser_machine_and_check_hydraulic_motor_Last_on_off_date_is_displayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[8]")));
    System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[8]"));
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
	@Test(priority = 28)
	public void Verify_that_select_twin_shaftdisperser_machine_and_check_twin_shaft_disperser_machine_text_is_displayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Twin Shaft Disperser']")));
    System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("//h2[text()='Twin Shaft Disperser']"));
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
	@Test(priority = 29)
	public void Verify_that_select_twin_shaftdisperser_machine_and_check_temperature1_is_displayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[9]")));
    System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[9]"));
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
	@Test(priority = 30)
	public void Verify_that_select_twin_shaftdisperser_machine_and_check_temperature2_is_displayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[10]")));
    System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[10]"));
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
	@Test(priority = 31)
	public void Verify_that_select_twin_shaftdisperser_machine_and_check_temperature3_is_displayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[11]")));
    System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[11]"));
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
	@Test(priority = 32)
	public void Verify_that_select_twin_shaftdisperser_machine_and_check_vibration_is_displayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[12]")));
    System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[12]"));
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
	@Test(priority = 33)
	public void Verify_that_select_twin_shaftdisperser_machine_and_check_weight_is_displayed() throws InterruptedException
	{ softAssert= new SoftAssert();
	try
	{
	
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
  
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='pump-box-sub-titles'])[13]")));
    System.out.println("Overlay Gone");
		WebElement nodata = driver.findElement(By.xpath("(//p[@class='pump-box-sub-titles'])[13]"));
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

////div[text()='HSD']

