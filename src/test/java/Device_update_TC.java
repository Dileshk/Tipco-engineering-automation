
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
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
//		Thread.sleep(2000);
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
//       wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
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
//       wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
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
//	  		
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
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
//		 device.maxtemp1(UtilityClass.propertiesfile("minvalueoftemp1"));
//	      
//	     device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	       
//	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//	        
//	        device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//	
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Product Temperature must be between 1 and 100']")).getText();
//		String expected="Product Temperature must be between 1 and 100";
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
//       wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
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
////	WebElement maxtemp1 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature One']"));
////	maxtemp1.sendKeys(Keys.CONTROL+"a");
////	maxtemp1.sendKeys(Keys.DELETE);
//		
//		 device.maxtemp1(UtilityClass.propertiesfile("maxvalueoftemp1"));
//	      
//	     device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	       
//	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//	        
//	        device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//	
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Product Temperature must be between 1 and 100']")).getText();
//		String expected="Product Temperature must be between 1 and 100";
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
//       wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
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
////	WebElement maxtemp1 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature One']"));
////	maxtemp1.sendKeys(Keys.CONTROL+"a");
////	maxtemp1.sendKeys(Keys.DELETE);
//		device.maxtemp1(UtilityClass.propertiesfile("alphabetintemp1"));
//		Thread.sleep(3000);
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	       
//        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//        
//        device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Product Temperature must be a whole number']")).getText();
//		String expected="Product Temperature must be a whole number";
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
//       wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
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
////	WebElement maxtemp1 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature One']"));
////	maxtemp1.sendKeys(Keys.CONTROL+"a");
////	maxtemp1.sendKeys(Keys.DELETE);
////		device.maxtemp1(UtilityClass.propertiesfile("alphabetintemp1"));
////	device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	       
//        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//        
//        device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Max Product Temperature is required']")).getText();
//		String expected="Max Product Temperature is required";
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
//       wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
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
////	WebElement maxtemp1 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature One']"));
////	maxtemp1.sendKeys(Keys.CONTROL+"a");
////	maxtemp1.sendKeys(Keys.DELETE);
//		device.maxtemp1(UtilityClass.propertiesfile("specialcharintemp1"));
//		Thread.sleep(3000);
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	       
//        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//        
//        device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Product Temperature must be a whole number']")).getText();
//		String expected="Product Temperature must be a whole number";
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
//       wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////	WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////	maxtemp2.sendKeys(Keys.CONTROL+"a");
////	maxtemp2.sendKeys(Keys.DELETE);
//		device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//		device.maxtemp2(UtilityClass.propertiesfile("minvalueoftemp2"));
//		Thread.sleep(3000);
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	       
//        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//        device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//        device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Coolant Temperature must be between 1 and 100']")).getText();
//		String expected="Coolant Temperature must be between 1 and 100";
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
//       wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//		device.maxtemp2(UtilityClass.propertiesfile("maxvalueoftemp2"));
//		Thread.sleep(3000);
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	       
//        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//        device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//        device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Coolant Temperature must be between 1 and 100']")).getText();
//		String expected="Coolant Temperature must be between 1 and 100";
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
//       wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				device.maxtemp2(UtilityClass.propertiesfile("alphaandspeintemp2"));
//		Thread.sleep(3000);
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	       
//     device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//     device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//     device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//     device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		
//		Thread.sleep(3000);
//		
//	
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Coolant Temperature must be a whole number']")).getText();
//		String expected="Coolant Temperature must be a whole number";
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
//       wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				
//		Thread.sleep(3000);
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	       
//  device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//  device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//  device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//  device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Max Coolant Temperature is required']")).getText();
//		String expected="Max Coolant Temperature is required";
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
//       wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				device.maxtemp2(UtilityClass.propertiesfile("alphaandspeintemp2"));
//		Thread.sleep(3000);
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	       
//device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		
//	   
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Coolant Temperature must be a whole number']")).getText();
//		String expected="Coolant Temperature must be a whole number";
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
//	@Test(priority = 14)
//	public void verify_that_to_update_device_with_maxtemp3_below_the_range() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    
//	    	
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//		Thread.sleep(3000);
//		device.maxtemp3(UtilityClass.propertiesfile("minvalueoftemp3"));
//	       
//device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		
//		
//		Thread.sleep(3000);
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Chill Water Temperature must be between 1 and 100']")).getText();
//		String expected="Chill Water Temperature must be between 1 and 100";
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
//	@Test(priority = 15)
//	public void verify_that_to_update_device_with_maxtemp3_above_the_range() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//		
//	    		
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//				driver.findElement(By.xpath("//input[@name='max_temp3_value']")).sendKeys("300");
//		Thread.sleep(3000);
//	
//	       
//device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//
////	WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Three']"));
////	maxtemp2.sendKeys(Keys.CONTROL+"a");
////	maxtemp2.sendKeys(Keys.DELETE);
//		
//		Thread.sleep(3000);
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String actual = driver.findElement(By.xpath("//p[text()='Chill Water Temperature must be between 1 and 100']")).getText();
//		String expected="Chill Water Temperature must be between 1 and 100";
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
//	@Test(priority = 16)
//	public void verify_that_to_update_device_with_enter_alphabet_in_maxtemp3_field() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//		
//	    	 
//		       
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//				device.maxtemp3(UtilityClass.propertiesfile("alphaandspeintemp3"));
//		Thread.sleep(3000);
//	
//	       
//device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		
//		Thread.sleep(3000);
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Chill Water Temperature must be a whole number']")).getText();
//		
//		String expected="Chill Water Temperature must be a whole number";
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
//	@Test(priority = 17)
//	public void verify_that_to_update_device_without_enter_maxtemp3() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
////		
////	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
////	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
////	      Thread.sleep(2000);
////	       device.clicksbtn();
////	       Thread.sleep(3000);
////	       
////	       device.clickondevicetab();
////		       
//		       
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//				
//		Thread.sleep(3000);
//	
//	       
//device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Max Chill Water Temperature is required']")).getText();
//		
//		String expected="Max Chill Water Temperature is required";
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
//	@Test(priority = 18)
//	public void verify_that_to_update_device_maxtemp3_with_special_char() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//		
//	    	 
//		       
//		       
//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//       wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//				device.maxtemp3(UtilityClass.propertiesfile("specialinmaxtemp3"));
//		Thread.sleep(3000);
//	
//	       
//device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		
//		Thread.sleep(3000);
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Chill Water Temperature must be a whole number']")).getText();
//		
//		String expected="Chill Water Temperature must be a whole number";
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
//	@Test(priority = 19)
//	public void verify_that_to_update_device_with_below_range_of_the_maxpresser1() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//				device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(3000);
//	
//	       
//		device.entermaxpresser(UtilityClass.propertiesfile("belowpresser"));
//device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		
//		Thread.sleep(3000);
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Product Pressure must be between 1 and 10']")).getText();
//		
//		String expected="Product Pressure must be between 1 and 10";
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
//	@Test(priority = 20)
//	public void verify_that_to_update_device_with_above_range_of_the_maxpresser1() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//				device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(3000);
//	
//	       
//		device.entermaxpresser(UtilityClass.propertiesfile("aboverangepresser"));
//device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		
//		Thread.sleep(3000);
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Product Pressure must be between 1 and 10']")).getText();
//		
//		String expected="Product Pressure must be between 1 and 10";
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
//	@Test(priority = 21)
//	public void verify_that_to_update_device_with_enter_alphabet_in_maxtpresser1_field() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//				device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(3000);
//	
//	       
//		device.entermaxpresser(UtilityClass.propertiesfile("maxpresseralpha"));
//device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		
//   
//
//Thread.sleep(3000);
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Product Pressure must be a whole number']")).getText();
//		
//		String expected="Product Pressure must be a whole number";
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
//	@Test(priority = 22)
//	public void verify_that_to_update_device_with0ut_enter_maxtpresser1_field() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//				device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(3000);
//	
//	       
//		
//device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Max Product Pressure is required']")).getText();
//		
//		String expected="Max Product Pressure is required";
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
//	      
//	}
//	@Test(priority = 23)
//	public void verify_that_to_update_device_with_enter_specialchar_in_maxtpresser1_field() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//				device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(3000);
//	
//	       
//		device.entermaxpresser(UtilityClass.propertiesfile("specialcharinpre"));
//device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		
//		Thread.sleep(3000);
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Product Pressure must be a whole number']")).getText();
//		
//		String expected="Product Pressure must be a whole number";
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
//	}}
//	@Test(priority = 24)
//	public void verify_that_to_update_device_with_below_range_of_the_maxpresser2() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//	          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
//	        Thread.sleep(2000);
//	         device.clicksbtn();
//	         Thread.sleep(3000);
//	         
//	         device.clickondevicetab();
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//				device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(3000);
//	
//	       
//		device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//device.maxpre2(UtilityClass.propertiesfile("belowmaxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		
//		Thread.sleep(3000);
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Coolant Pressure must be between 1 and 10']")).getText();
//		
//		String expected="Coolant Pressure must be between 1 and 10";
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
//	@Test(priority = 25)
//	public void verify_that_to_update_device_with_above_range_of_the_maxpresser2() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//				device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(3000);
//	
//	       
//		device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//device.maxpre2(UtilityClass.propertiesfile("abovemaxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		
//		Thread.sleep(3000);
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Coolant Pressure must be between 1 and 10']")).getText();
//		
//		String expected="Coolant Pressure must be between 1 and 10";
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
//	@Test(priority = 26)
//	public void verify_that_to_update_device_with_enter_alphabet_in_maxtpresser2_field() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//				device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(3000);
//	
//	       
//		device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//device.maxpre2(UtilityClass.propertiesfile("alphamaxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		
//   
//
//Thread.sleep(3000);
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Coolant Pressure must be a whole number']")).getText();
//		
//		String expected="Coolant Pressure must be a whole number";
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
//	@Test(priority = 27)
//	public void verify_that_to_update_device_with0ut_enter_maxtpresser2_field() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//				device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(3000);
//	
//		device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//		
//
//device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Max Coolant Pressure is required']")).getText();
//		
//		String expected="Max Coolant Pressure is required";
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
//	      
//	}
//	@Test(priority = 28)
//	public void verify_that_to_update_device_with_enter_specialchar_in_maxtpresser2_field() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//       wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
//       Thread.sleep(3000);
//		driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////			maxtemp2.sendKeys(Keys.CONTROL+"a");
////			maxtemp2.sendKeys(Keys.DELETE);
//				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//				device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//				device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//		Thread.sleep(3000);
//	
//	       
//		device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//device.maxpre2(UtilityClass.propertiesfile("specialcharinmaxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//		
//		Thread.sleep(3000);
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Coolant Pressure must be a whole number']")).getText();
//		
//		String expected="Coolant Pressure must be a whole number";
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
//@Test(priority = 29)
//public void verify_that_to_update_device_with_below_range_of_the_maxpresser3() throws InterruptedException, IOException
//{
//	 softAssert = new SoftAssert();
//      try {
//    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
//        Thread.sleep(2000);
//         device.clicksbtn();
//         Thread.sleep(3000);
//         
//         device.clickondevicetab();
//    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//   wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
//   Thread.sleep(3000);
//	driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
////	WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////	deviceID.sendKeys(Keys.CONTROL+"a");
////	deviceID.sendKeys(Keys.DELETE);
////	device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//	driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//	 Thread.sleep(3000);
//	 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////		WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////		maxtemp2.sendKeys(Keys.CONTROL+"a");
////		maxtemp2.sendKeys(Keys.DELETE);
//			device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//			device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//			device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	Thread.sleep(3000);
//
//       
//	device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("belowmaxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//	
//	Thread.sleep(3000);
//
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	Thread.sleep(3000);
//	String actual = driver.findElement(By.xpath("//p[text()='Chill Water Pressure must be between 1 and 10']")).getText();
//	
//	String expected="Chill Water Pressure must be between 1 and 10";
//	
//softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//      
//      Thread.sleep(4000);
//      driver.navigate().refresh();
//  } catch (Exception e) {
//      softAssert.fail("Exception: " + e.getMessage());
//  } finally {
//      softAssert.assertAll();          
//     
//  }
//}
//@Test(priority = 30)
//public void verify_that_to_update_device_with_above_range_of_the_maxpresser3() throws InterruptedException, IOException
//{
//	 softAssert = new SoftAssert();
//      try {
//    	
//    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//   wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
//   Thread.sleep(3000);
//	driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
////	WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////	deviceID.sendKeys(Keys.CONTROL+"a");
////	deviceID.sendKeys(Keys.DELETE);
////	device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//	driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//	 Thread.sleep(3000);
//	 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////		WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////		maxtemp2.sendKeys(Keys.CONTROL+"a");
////		maxtemp2.sendKeys(Keys.DELETE);
//			device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//			device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//			device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	Thread.sleep(3000);
//
//       
//	device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("abovemaxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//	
//	Thread.sleep(3000);
//
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	Thread.sleep(3000);
//	String actual = driver.findElement(By.xpath("//p[text()='Chill Water Pressure must be between 1 and 10']")).getText();
//	
//	String expected="Chill Water Pressure must be between 1 and 10";
//	
//softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//      
//      Thread.sleep(4000);
//      driver.navigate().refresh();
//  } catch (Exception e) {
//      softAssert.fail("Exception: " + e.getMessage());
//  } finally {
//      softAssert.assertAll();          
//     
//  }
//}
//@Test(priority = 31)
//public void verify_that_to_update_device_with_enter_alphabet_in_maxtpresser3_field() throws InterruptedException, IOException
//{
//	 softAssert = new SoftAssert();
//      try {
//    	
//    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//   wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
//   Thread.sleep(3000);
//	driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
//	driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//	 Thread.sleep(3000);
//	 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////		WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////		maxtemp2.sendKeys(Keys.CONTROL+"a");
////		maxtemp2.sendKeys(Keys.DELETE);
//			device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//			device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//			device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	Thread.sleep(3000);
//
//       
//	device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("alphamaxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//	
//
//
//Thread.sleep(3000);
//
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	Thread.sleep(3000);
//	String actual = driver.findElement(By.xpath("//p[text()='Chill Water Pressure must be a whole number']")).getText();
//	
//	String expected="Chill Water Pressure must be a whole number";
//	
//softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//      
//      Thread.sleep(4000);
//      driver.navigate().refresh();
//  } catch (Exception e) {
//      softAssert.fail("Exception: " + e.getMessage());
//  } finally {
//      softAssert.assertAll();          
//     
//  }
//}
//@Test(priority = 32)
//public void verify_that_to_update_device_with0ut_enter_maxtpresser3_field() throws InterruptedException, IOException
//{
//	 softAssert = new SoftAssert();
//      try {
//    	
//    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//   wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
//   Thread.sleep(3000);
//	driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
//	driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//	 Thread.sleep(3000);
//	 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////		WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////		maxtemp2.sendKeys(Keys.CONTROL+"a");
////		maxtemp2.sendKeys(Keys.DELETE);
//			device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//			device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//			device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	Thread.sleep(3000);
//
//	device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//	
//	device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	Thread.sleep(3000);
//	String actual = driver.findElement(By.xpath("//p[text()='Max Chill Water Pressure is required']")).getText();
//	
//	String expected="Max Chill Water Pressure is required";
//	
//softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//      
//      Thread.sleep(4000);
//      driver.navigate().refresh();
//  } catch (Exception e) {
//      softAssert.fail("Exception: " + e.getMessage());
//  } finally {
//      softAssert.assertAll();          
//     
//  }
//      
//}
//@Test(priority = 33)
//public void verify_that_to_update_device_with_enter_specialchar_in_maxtpresser3_field() throws InterruptedException, IOException
//{
//	 softAssert = new SoftAssert();
//      try {
//    	
//    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//   wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
//   Thread.sleep(3000);
//	driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
//	driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//	 Thread.sleep(3000);
//	 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
////		WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
////		maxtemp2.sendKeys(Keys.CONTROL+"a");
////		maxtemp2.sendKeys(Keys.DELETE);
//			device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//			device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//			device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	Thread.sleep(3000);
//
//       
//	device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
//device.maxpresser3(UtilityClass.propertiesfile("specialcharinmaxpre3"));
//device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//	
//	Thread.sleep(3000);
//
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	Thread.sleep(3000);
//	String actual = driver.findElement(By.xpath("//p[text()='Chill Water Pressure must be a whole number']")).getText();
//	
//	String expected="Chill Water Pressure must be a whole number";
//	
//softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//      
//      Thread.sleep(4000);
//      driver.navigate().refresh();
//  } catch (Exception e) {
//      softAssert.fail("Exception: " + e.getMessage());
//  } finally {
//      softAssert.assertAll();          
//     
//  }
//}
	@Test(priority = 34)
	public void verify_that_to_update_device_with_below_range_of_the_vibration() throws InterruptedException, IOException
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
	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	    	  wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
	        Thread.sleep(3000);
	 		driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
	 		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
	 		 Thread.sleep(3000);
	 		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
//	 			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
//	 			maxtemp2.sendKeys(Keys.CONTROL+"a");
//	 			maxtemp2.sendKeys(Keys.DELETE);
	 				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	 				device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
	 				device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
	 		Thread.sleep(3000);
	 	
	 	       
	 		device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	 device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
	 device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
	 device.entermaxvibration(UtilityClass.propertiesfile("vibrationbelowrange"));
	 		
	 		Thread.sleep(3000);
	 	
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String actual = driver.findElement(By.xpath("//p[text()='Vibration must be between 1 and 10000']")).getText();
		
		String expected="Vibration must be between 1 and 10000";
		
  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
          
          Thread.sleep(4000);
          driver.navigate().refresh();
      } catch (Exception e) {
          softAssert.fail("Exception: " + e.getMessage());
      } finally {
          softAssert.assertAll();          
         
      }
	}
	@Test(priority = 35)
	public void verify_that_to_update_device_with_above_range_of_the_vibration() throws InterruptedException, IOException
	{
		 softAssert = new SoftAssert();
	      try {
	    	
	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	    	  wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='actionIcon'])[2]")));
		        Thread.sleep(3000);
		 		driver.findElement(By.xpath("(//td[@class='actionIcon'])[2]")).click();
		 		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
		 		 Thread.sleep(3000);
		 		 driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
//		 			WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Temperature Two']"));
//		 			maxtemp2.sendKeys(Keys.CONTROL+"a");
//		 			maxtemp2.sendKeys(Keys.DELETE);
		 				device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
		 				device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
		 				device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
		 		Thread.sleep(3000);
		 	
		 	       
		 		device.entermaxpresser(UtilityClass.propertiesfile("presser"));
		 device.maxpre2(UtilityClass.propertiesfile("maxpre2"));
		 device.maxpresser3(UtilityClass.propertiesfile("maxpre3"));
		 device.entermaxvibration(UtilityClass.propertiesfile("vibrationaboverange"));
		 		
		 		Thread.sleep(3000);
		 	
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String actual = driver.findElement(By.xpath("//p[text()='Vibration must be between 1 and 10000']")).getText();
		
		String expected="Vibration must be between 1 and 10000";
		
  softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
          
          Thread.sleep(4000);
          driver.navigate().refresh();
      } catch (Exception e) {
          softAssert.fail("Exception: " + e.getMessage());
      } finally {
          softAssert.assertAll();          
         
      }
	}}
//	@Test(priority = 26)
//	public void verify_that_to_update_device_with_enter_alphabet_in_maxvibration_field() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    		
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//      wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//      Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
//		device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Vibration']"));
//	maxtemp2.sendKeys(Keys.CONTROL+"a");
//	maxtemp2.sendKeys(Keys.DELETE);
//		device.entermaxvibration(UtilityClass.propertiesfile("alphainmaxvibration"));
//		Thread.sleep(3000);
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Vibration must be a whole number']")).getText();
//		
//		String expected="Vibration must be a whole number";
//		
// softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//         
//         Thread.sleep(4000);
//         driver.navigate().refresh();
//     } catch (Exception e) {
//         softAssert.fail("Exception: " + e.getMessage());
//     } finally {
//         softAssert.assertAll();          
//        
//     }
//	}
//	@Test(priority = 27)
//	public void verify_that_to_update_device_without_enter_maxvibration_field() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    		
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//      wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//      Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
//		device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Vibration']"));
//	maxtemp2.sendKeys(Keys.CONTROL+"a");
//	maxtemp2.sendKeys(Keys.DELETE);
////		device.entermaxvibration(UtilityClass.propertiesfile("alphainmaxvibration"));
//		Thread.sleep(3000);
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Max Vibration is required']")).getText();
//		
//		String expected="Max Vibration is required";
//		
// softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//         
//         Thread.sleep(4000);
//         driver.navigate().refresh();
//     } catch (Exception e) {
//         softAssert.fail("Exception: " + e.getMessage());
//     } finally {
//         softAssert.assertAll();          
//        
//     }
//	}
//	@Test(priority = 28)
//	public void verify_that_to_update_device_with_enter_specialchar_in_maxvibration_field() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    		
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//      wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//      Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		WebElement deviceID = driver.findElement(By.xpath("//input[@placeholder=\"Device Id \"]"));
////		deviceID.sendKeys(Keys.CONTROL+"a");
////		deviceID.sendKeys(Keys.DELETE);
////		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[1]")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
//		device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	WebElement maxtemp2 = driver.findElement(By.xpath("//input[@placeholder='Enter value for Max Vibration']"));
//	maxtemp2.sendKeys(Keys.CONTROL+"a");
//	maxtemp2.sendKeys(Keys.DELETE);
//		device.entermaxvibration(UtilityClass.propertiesfile("specialcharinvib"));
//		Thread.sleep(3000);
//	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//p[text()='Vibration must be a whole number']")).getText();
//		
//		String expected="Vibration must be a whole number";
//		
// softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//         
//         Thread.sleep(4000);
//         driver.navigate().refresh();
//     } catch (Exception e) {
//         softAssert.fail("Exception: " + e.getMessage());
//     } finally {
//         softAssert.assertAll();          
//        
//     }
//	}
//	@Test(priority = 29)
//	public void verify_that_to_clickon_update_device_and_click_on_cross_button_of_the_popup() throws InterruptedException, IOException
//	{
//		 
//	    		
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//      wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//      Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//h5[text()=' X ']")).click();
//
//	}
//	@Test(priority = 30)
//	public void verify_to_check_clickon_update_device_and_check_the_text_ofthe_page() throws InterruptedException, IOException
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    		
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
//      wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//      Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		 Thread.sleep(3000);
//		String actual = driver.findElement(By.xpath("//h3[text()='Edit Device']")).getText();
//		
//		String expected="Edit Device";
//		
// softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//         
//         Thread.sleep(4000);
//         driver.navigate().refresh();
//     } catch (Exception e) {
//         softAssert.fail("Exception: " + e.getMessage());
//     } finally {
//         softAssert.assertAll();          
//        
//     }
//	}}

//@AfterClass
//public void closethebrowser()
//{
//	driver.close();
//}
//}
		