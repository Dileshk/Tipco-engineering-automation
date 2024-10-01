import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Device_create.Device_create;
import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;

public class Device_update_TC extends  Base_class{
	Device_create device;
    SoftAssert softAssert;
	@BeforeClass
	public void initializebrowser() throws IOException, InterruptedException
	{
		openbrowser();
		device=new Device_create(driver);
		Thread.sleep(5000);
		device.entermail(UtilityClass.propertiesfile("validmail"));
		device.entpass(UtilityClass.propertiesfile("validpass"));
		device.clickbuttonsubmit();
	}
//	@Test(priority = 1)
//	public void verify_that_to_update_device_and_enter_min_length_of_device_ID() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
//      Thread.sleep(2000);
//       device.clicksbtn();
//       Thread.sleep(3000);
//       
//       device.clickondevicetab();
//        
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
//		deviceID.sendKeys(Keys.CONTROL+"a");
//		deviceID.sendKeys(Keys.DELETE);
//		device.enterdeviceId(UtilityClass.propertiesfile("mindeviceid"));
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Device ID should be between 3 and 15 characters']")).getText();
//		String expected="Device ID should be between 3 and 15 characters";
//		
//  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//          
//          Thread.sleep(4000);
//          driver.navigate().refresh();
//      } catch (Exception e) {
//          softAssert.fail("Exception: " + e.getMessage());
//      } finally {
//          softAssert.assertAll();          
//         
//      }
//	}
//	@Test(priority = 2)
//	public void verify_that_to_update_device_and_enter_max_length_of_device_ID() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//		
//        
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
//		deviceID.sendKeys(Keys.CONTROL+"a");
//		deviceID.sendKeys(Keys.DELETE);
//		device.enterdeviceId(UtilityClass.propertiesfile("maxdeviceid"));
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Device ID should be between 3 and 15 characters']")).getText();
//		String expected="Device ID should be between 3 and 15 characters";
//		
//  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//          
//          Thread.sleep(4000);
//          driver.navigate().refresh();
//      } catch (Exception e) {
//          softAssert.fail("Exception: " + e.getMessage());
//      } finally {
//          softAssert.assertAll();          
//         
//      }
//	}
//	@Test(priority = 3)
//	public void verify_that_to_update_device_and_take_deviceId_field_blank() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//		
//        
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
//		deviceID.sendKeys(Keys.CONTROL+"a");
//		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("maxdeviceid"));
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Device ID is required']")).getText();
//		String expected="Device ID is required";
//		
//  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//          
//          Thread.sleep(4000);
//          driver.navigate().refresh();
//      } catch (Exception e) {
//          softAssert.fail("Exception: " + e.getMessage());
//      } finally {
//          softAssert.assertAll();          
//         
//      }
//	}
//	@Test(priority = 4)
//	public void verify_that_to_update_device_and_enter_temp1_below_the_range() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//		
//	  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
//	      Thread.sleep(2000);
//	       device.clicksbtn();
//	       Thread.sleep(3000);
//	       
//	       device.clickondevicetab();
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("maxdeviceid"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
//		WebElement maxtemp1 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature One']"));
//		maxtemp1.sendKeys(Keys.CONTROL+"a");
//		maxtemp1.sendKeys(Keys.DELETE);
//		Thread.sleep(2000);
//		device.maxtemp1(UtilityClass.propertiesfile("minvalueoftemp1"));
//		Thread.sleep(2000);
//		device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Temperature must be between 1 and 100']")).getText();
//		String expected="Temperature must be between 1 and 100";
//		
//  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//          
//          Thread.sleep(4000);
//          driver.navigate().refresh();
//      } catch (Exception e) {
//          softAssert.fail("Exception: " + e.getMessage());
//      } finally {
//          softAssert.assertAll();          
//         
//      }
//	}
//	@Test(priority = 5)
//	public void verify_that_to_update_device_and_enter_maxtemp1_above_the_range() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//		
//	        
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////	device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
//	WebElement maxtemp1 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature One']"));
//	maxtemp1.sendKeys(Keys.CONTROL+"a");
//	maxtemp1.sendKeys(Keys.DELETE);
//		device.maxtemp1(UtilityClass.propertiesfile("maxvalueoftemp1"));
//		Thread.sleep(3000);
//		device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Temperature must be between 1 and 100']")).getText();
//		String expected="Temperature must be between 1 and 100";
//		
//  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//          
//          Thread.sleep(4000);
//          driver.navigate().refresh();
//      } catch (Exception e) {
//          softAssert.fail("Exception: " + e.getMessage());
//      } finally {
//          softAssert.assertAll();          
//         
//      }
//	}
//	
//	@Test(priority = 6)
//	public void verify_that_to_update_device_and_enter_alphabet_in_maxtemp1_field() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//		
//	  	
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
//	WebElement maxtemp1 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature One']"));
//	maxtemp1.sendKeys(Keys.CONTROL+"a");
//	maxtemp1.sendKeys(Keys.DELETE);
//		device.maxtemp1(UtilityClass.propertiesfile("alphabetintemp1"));
//		Thread.sleep(3000);
//		device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("(//p[text()='Temperature must be a whole number'])")).getText();
//		String expected="Temperature must be a whole number";
//		
//  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//          
//          Thread.sleep(4000);
//          driver.navigate().refresh();
//      } catch (Exception e) {
//          softAssert.fail("Exception: " + e.getMessage());
//      } finally {
//          softAssert.assertAll();          
//         
//      }
//	}
//	@Test(priority = 7)
//	public void verify_that_to_update_device_without_enter_temp1() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//		
//	  	
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
//	WebElement maxtemp1 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature One']"));
//	maxtemp1.sendKeys(Keys.CONTROL+"a");
//	maxtemp1.sendKeys(Keys.DELETE);
////		device.maxtemp1(UtilityClass.propertiesfile("alphabetintemp1"));
//	device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//	device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("(//p[text()='Max temperature is required'])[1]")).getText();
//		String expected="Max temperature is required";
//		
//  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//          
//          Thread.sleep(4000);
//          driver.navigate().refresh();
//      } catch (Exception e) {
//          softAssert.fail("Exception: " + e.getMessage());
//      } finally {
//          softAssert.assertAll();          
//         
//      }
//	}
//	@Test(priority = 8)
//	public void verify_that_to_update_device_with_enter_special_char_in_temp1_field() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//		
//	  	
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
//	WebElement maxtemp1 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature One']"));
//	maxtemp1.sendKeys(Keys.CONTROL+"a");
//	maxtemp1.sendKeys(Keys.DELETE);
//		device.maxtemp1(UtilityClass.propertiesfile("specialcharintemp1"));
//		Thread.sleep(3000);
//		device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Temperature must be a whole number']")).getText();
//		String expected="Temperature must be a whole number";
//		
//  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//          
//          Thread.sleep(4000);
//          driver.navigate().refresh();
//      } catch (Exception e) {
//          softAssert.fail("Exception: " + e.getMessage());
//      } finally {
//          softAssert.assertAll();          
//         
//      }
//	}
//	@Test(priority = 9)
//	public void verify_that_to_update_device_with_enter_maxtemp2_below_the_range() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//		
//		  		
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
//	WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
//	maxtemp2.sendKeys(Keys.CONTROL+"a");
//	maxtemp2.sendKeys(Keys.DELETE);
//		device.maxtemp2(UtilityClass.propertiesfile("minvalueoftemp2"));
//		Thread.sleep(3000);
//		
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Temperature must be between 1 and 100']")).getText();
//		String expected="Temperature must be between 1 and 100";
//		
//  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//          
//          Thread.sleep(4000);
//          driver.navigate().refresh();
//      } catch (Exception e) {
//          softAssert.fail("Exception: " + e.getMessage());
//      } finally {
//          softAssert.assertAll();          
//         
//      }
//	}
//	@Test(priority = 10)
//	public void verify_that_to_update_device_with_enter_maxtemp2_above_the_range() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//		
//		  		
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
//	WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
//	maxtemp2.sendKeys(Keys.CONTROL+"a");
//	maxtemp2.sendKeys(Keys.DELETE);
//		device.maxtemp2(UtilityClass.propertiesfile("maxvalueoftemp2"));
//		Thread.sleep(3000);
//		
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Temperature must be between 1 and 100']")).getText();
//		String expected="Temperature must be between 1 and 100";
//		
//  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//          
//          Thread.sleep(4000);
//          driver.navigate().refresh();
//      } catch (Exception e) {
//          softAssert.fail("Exception: " + e.getMessage());
//      } finally {
//          softAssert.assertAll();          
//         
//      }
//	}
//	@Test(priority = 11)
//	public void verify_that_to_update_device_with_enter_alphabet_in_temp2_field() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//		
//		  		
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
//	WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
//	maxtemp2.sendKeys(Keys.CONTROL+"a");
//	maxtemp2.sendKeys(Keys.DELETE);
//		device.maxtemp2(UtilityClass.propertiesfile("alphaandspeintemp2"));
//		Thread.sleep(3000);
//		
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Temperature must be a whole number']")).getText();
//		String expected="Temperature must be a whole number";
//		
//  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//          
//          Thread.sleep(4000);
//          driver.navigate().refresh();
//      } catch (Exception e) {
//          softAssert.fail("Exception: " + e.getMessage());
//      } finally {
//          softAssert.assertAll();          
//         
//      }
//	}
//	@Test(priority = 12)
//	public void verify_that_to_update_device_without_enter_temp2_field() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//		
//		  		
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
//	WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
//	maxtemp2.sendKeys(Keys.CONTROL+"a");
//	maxtemp2.sendKeys(Keys.DELETE);
////		device.maxtemp2(UtilityClass.propertiesfile("alphaandspeintemp2"));
//		Thread.sleep(3000);
//		
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("(//p[text()='Max temperature is required'])[1]")).getText();
//		String expected="Max temperature is required";
//		
//  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//          
//          Thread.sleep(4000);
//          driver.navigate().refresh();
//      } catch (Exception e) {
//          softAssert.fail("Exception: " + e.getMessage());
//      } finally {
//          softAssert.assertAll();          
//         
//      }
//	}
//	@Test(priority = 13)
//	public void verify_that_to_update_device_with_enter_special_char_in_temp2_field() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	  	
//		  		
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
//	WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
//	maxtemp2.sendKeys(Keys.CONTROL+"a");
//	maxtemp2.sendKeys(Keys.DELETE);
//		device.maxtemp2(UtilityClass.propertiesfile("alphaandspeintemp2"));
//	    device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Temperature must be a whole number']")).getText();
//		String expected="Temperature must be a whole number";
//		
//  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//          
//          Thread.sleep(4000);
//          driver.navigate().refresh();
//      } catch (Exception e) {
//          softAssert.fail("Exception: " + e.getMessage());
//      } finally {
//          softAssert.assertAll();          
//         
//      }
//	}
	@Test(priority = 14)
	public void verify_that_to_update_device_with_maxtemp3_below_the_range() throws InterruptedException, IOException
	{
		 softAssert = new SoftAssert();
	      try {
	    
	    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	        Thread.sleep(2000);
	         device.clicksbtn();
	         Thread.sleep(3000);
	         
	         device.clickondevicetab();
       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
       Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
//		deviceID.sendKeys(Keys.CONTROL+"a");
//		deviceID.sendKeys(Keys.DELETE);
//		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
		device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
	WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Three']"));
	maxtemp2.sendKeys(Keys.CONTROL+"a");
	maxtemp2.sendKeys(Keys.DELETE);
		device.maxtemp3(UtilityClass.propertiesfile("minvalueoftemp3"));
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String actual = driver.findElement(By.xpath("//p[text()='Temperature must be between 1 and 100']")).getText();
		String expected="Temperature must be between 1 and 100";
		
  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
          
          Thread.sleep(4000);
          driver.navigate().refresh();
      } catch (Exception e) {
          softAssert.fail("Exception: " + e.getMessage());
      } finally {
          softAssert.assertAll();          
         
      }
	}
	@Test(priority = 15)
	public void verify_that_to_update_device_with_maxtemp3_above_the_range() throws InterruptedException, IOException
	{
		 softAssert = new SoftAssert();
	      try {
		
	    		
       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
       Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
//		deviceID.sendKeys(Keys.CONTROL+"a");
//		deviceID.sendKeys(Keys.DELETE);
//		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
		device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
	WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Three']"));
	maxtemp2.sendKeys(Keys.CONTROL+"a");
	maxtemp2.sendKeys(Keys.DELETE);
		driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Three']")).sendKeys("300");
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String actual = driver.findElement(By.xpath("//p[text()='Temperature must be between 1 and 100']")).getText();
		String expected="Temperature must be between 1 and 100";
		
  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
          
          Thread.sleep(4000);
          driver.navigate().refresh();
      } catch (Exception e) {
          softAssert.fail("Exception: " + e.getMessage());
      } finally {
          softAssert.assertAll();          
         
      }
	}
	@Test(priority = 15)
	public void verify_that_to_update_device_with_enter_alphabet_in_maxtemp3_field() throws InterruptedException, IOException
	{
		 softAssert = new SoftAssert();
	      try {
		
	    	 
		       
       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
       Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
//		deviceID.sendKeys(Keys.CONTROL+"a");
//		deviceID.sendKeys(Keys.DELETE);
//		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
		device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
	WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Three']"));
	maxtemp2.sendKeys(Keys.CONTROL+"a");
	maxtemp2.sendKeys(Keys.DELETE);
		device.maxtemp3(UtilityClass.propertiesfile("alphaandspeintemp3"));
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String actual = driver.findElement(By.xpath("//p[text()='Temperature must be a whole number']")).getText();
		
		String expected="Temperature must be a whole number";
		
  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
          
          Thread.sleep(4000);
          driver.navigate().refresh();
      } catch (Exception e) {
          softAssert.fail("Exception: " + e.getMessage());
      } finally {
          softAssert.assertAll();          
         
      }
	}
	@Test(priority = 16)
	public void verify_that_to_update_device_without_enter_maxtemp3() throws InterruptedException, IOException
	{
		 softAssert = new SoftAssert();
	      try {
		
	    	 
		       
		       
       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
       Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
//		deviceID.sendKeys(Keys.CONTROL+"a");
//		deviceID.sendKeys(Keys.DELETE);
//		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
		device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
	WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Three']"));
	maxtemp2.sendKeys(Keys.CONTROL+"a");
	maxtemp2.sendKeys(Keys.DELETE);
//		device.maxtemp3(UtilityClass.propertiesfile("alphaandspeintemp3"));
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String actual = driver.findElement(By.xpath("//p[text()='Max temperature is required']")).getText();
		
		String expected="Max temperature is required";
		
  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
          
          Thread.sleep(4000);
          driver.navigate().refresh();
      } catch (Exception e) {
          softAssert.fail("Exception: " + e.getMessage());
      } finally {
          softAssert.assertAll();          
         
      }
	}
	@Test(priority = 17)
	public void verify_that_to_update_device_with_special_char() throws InterruptedException, IOException
	{
		 softAssert = new SoftAssert();
	      try {
		
	    	 
		       
		       
       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
       Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
//		deviceID.sendKeys(Keys.CONTROL+"a");
//		deviceID.sendKeys(Keys.DELETE);
//		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
		device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
	WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Three']"));
	maxtemp2.sendKeys(Keys.CONTROL+"a");
	maxtemp2.sendKeys(Keys.DELETE);
		device.maxtemp3(UtilityClass.propertiesfile("specialinmaxtemp3"));
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String actual = driver.findElement(By.xpath("//p[text()='Temperature must be a whole number']")).getText();
		
		String expected="Temperature must be a whole number";
		
  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
          
          Thread.sleep(4000);
          driver.navigate().refresh();
      } catch (Exception e) {
          softAssert.fail("Exception: " + e.getMessage());
      } finally {
          softAssert.assertAll();          
         
      }
	}
}
