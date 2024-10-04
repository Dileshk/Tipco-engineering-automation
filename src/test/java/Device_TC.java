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

public class Device_TC extends Base_class{
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
//	public void Verify_to_check_click_on_update_and_click_on_submit_button()
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
//     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//     Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
//		 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	     wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Updated Successfully']")));
//		String actual = driver.findElement(By.xpath("//div[text()='Device Updated Successfully']")).getText();
//		
//		String expected="Device Updated Successfully";
//		
//softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//        
//        Thread.sleep(4000);
//        driver.navigate().refresh();
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }
//	}
////	@Test(priority = 2)
////	public void Verify_to_update_device_and_enter_deviceID_only_alphabetic()
////	{
////		 softAssert = new SoftAssert();
////	      try {
////	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
////	          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
////	        Thread.sleep(2000);
////	         device.clicksbtn();
////	         Thread.sleep(3000);
////	         
////	         device.clickondevicetab();
////	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
////     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
////     Thread.sleep(3000);
////		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		 Thread.sleep(3000);
////		WebElement deviceid = driver.findElement(By.xpath("//input[@placeholder='Device Id ']"));
////		deviceid.sendKeys(Keys.CONTROL+"a");
////		deviceid.sendKeys(Keys.DELETE);
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("//input[@placeholder='Device Id ']")).sendKeys("GONER");
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("//button[text()='Submit']")).click();
////		 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));
////	     wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Updated Successfully']")));
////		String actual = driver.findElement(By.xpath("//div[text()='Device Updated Successfully']")).getText();
////		
////		String expected="Device Updated Successfully";
////		
////softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
////        
////        Thread.sleep(4000);
////        driver.navigate().refresh();
////    } catch (Exception e) {
////        softAssert.fail("Exception: " + e.getMessage());
////    } finally {
////        softAssert.assertAll();          
////       
////    }
////	}
//	@Test(priority = 3)
//	public void Verify_and_check_to_update_devicezone_by_selecting_other_country_from_dropdown()
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	 
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//     Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[2]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Africa/Abidjan']")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
//		 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	     wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Updated Successfully']")));
//		String actual = driver.findElement(By.xpath("//div[text()='Device Updated Successfully']")).getText();
//		
//		String expected="Device Updated Successfully";
//		
//softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//        
//        Thread.sleep(4000);
//        driver.navigate().refresh();
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }
//	}
//	@Test(priority = 4)
//	public void Verify_and_check_to_type_on_timezone_field_and_select_from_list_box()
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	 
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//     Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		Thread.sleep(3000);
//		WebElement timez = driver.findElement(By.xpath("//input[@placeholder='Please Select Time Zone']"));
//		timez.sendKeys(Keys.CONTROL+"a");
//		timez.sendKeys(Keys.DELETE);
//		Thread.sleep(3000);
//		timez.sendKeys("Africa/Abi");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Africa/Abidjan']")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
//		 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	     wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Updated Successfully']")));
//		String actual = driver.findElement(By.xpath("//div[text()='Device Updated Successfully']")).getText();
//		
//		String expected="Device Updated Successfully";
//		
//softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//        
//        Thread.sleep(4000);
//        driver.navigate().refresh();
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }
//	}
	@Test(priority = 5)
	public void Verify_and_check_to_type_on_timezone_field_but_the_country_are_not_present_in_dropbox()
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
		Thread.sleep(3000);
		WebElement timez = driver.findElement(By.xpath("//input[@placeholder='Please Select Time Zone']"));
		timez.sendKeys(Keys.CONTROL+"a");
		timez.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		timez.sendKeys("abudabi");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
//		 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	     wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Updated Successfully']")));
		String actual = driver.findElement(By.xpath("//p[text()='No data found']")).getText();
		
		String expected="No data found";
		
softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
Thread.sleep(3000);
        driver.findElement(By.xpath("//h5[text()=' X ']")).click();
       
    } catch (Exception e) {
        softAssert.fail("Exception: " + e.getMessage());
    } finally {
        softAssert.assertAll();          
       
    }
	}

}
