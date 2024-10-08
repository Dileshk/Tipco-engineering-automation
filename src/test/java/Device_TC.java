import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Device_create.Device_create;
import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;

public class Device_TC extends Base_class{
	Device_create device;
//    SoftAssert softAssert;
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
//	@Test(priority = 5)
//	public void Verify_and_check_to_type_on_timezone_field_but_the_country_are_not_present_in_dropbox()
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
//		Thread.sleep(3000);
//		WebElement timez = driver.findElement(By.xpath("//input[@placeholder='Please Select Time Zone']"));
//		timez.sendKeys(Keys.CONTROL+"a");
//		timez.sendKeys(Keys.DELETE);
//		Thread.sleep(3000);
//		timez.sendKeys("abudabi");
//		Thread.sleep(3000);
////		driver.findElement(By.xpath("//button[text()='Submit']")).click();
////		 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));
////	     wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Updated Successfully']")));
//		String actual = driver.findElement(By.xpath("//p[text()='No data found']")).getText();
//		
//		String expected="No data found";
//		
//softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//Thread.sleep(3000);
//        driver.findElement(By.xpath("//h5[text()=' X ']")).click();
//       
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }
//	}
//	//check orgnization filed disable in update
//	//verify to clear all fields and click on submit in update device
//	@Test(priority = 6)
//	public void Verify_and_check_orgnization_field_disable_in_update_form()
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	 
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//     Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		Thread.sleep(3000);
//      WebElement orgfield = driver.findElement(By.xpath("//input[@placeholder='Please Select Organization']"));
//		softAssert.assertFalse(orgfield.isEnabled());
//		
//	
//		Thread.sleep(5000);
//	
////		driver.findElement(By.xpath("//button[text()='Submit']")).click();
////		 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));
////	     wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Updated Successfully']")));
//driver.findElement(By.xpath("//h5[text()=' X ']")).click();
//       
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }
//	}
//	@Test(priority = 7)
//	public void Verify_to_check_clear_all_fields_and_click_on_submit_in_update_form()
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	 
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//     Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		Thread.sleep(3000);
//		WebElement id = driver.findElement(By.xpath("//input[@placeholder='Device Id ']"));
//		id.sendKeys(Keys.CONTROL+"a");
//		id.sendKeys(Keys.DELETE);
//		Thread.sleep(3000);
//		WebElement timez = driver.findElement(By.xpath("//input[@placeholder='Please Select Time Zone']"));
//		timez.sendKeys(Keys.CONTROL+"a");
//		timez.sendKeys(Keys.DELETE);
//	
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
//	String actual = driver.findElement(By.xpath("//p[text()='Device ID is required']")).getText();
//		
//		String expected="Device ID is required";
//		
//softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//Thread.sleep(3000);
//		
////		driver.findElement(By.xpath("//button[text()='Submit']")).click();
////		 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));
////	     wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Updated Successfully']")));
//driver.findElement(By.xpath("//h5[text()=' X ']")).click();
//       
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }
//	}
//	@Test(priority = 8)
//	public void Verify_to_check_tipco_logo_is_visible_or_not_in_device_create_page()
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	 
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//     Thread.sleep(3000);
//		WebElement logo = driver.findElement(By.xpath("//span[@class='mainLogo']"));
//		softAssert.assertTrue(logo.isDisplayed());
//
//
//       
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }
//	}
//	@Test(priority = 9)
//	public void Verify_to_check_and_click_next_page_of_the_device_page()
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	 
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Next']")));
//     Thread.sleep(3000);
//		WebElement logo = driver.findElement(By.xpath("//a[text()='Next']"));
//		logo.click();
//		String actual= driver.findElement(By.xpath("//a[text()='Next']")).getText();
//        String expected="Next";
//        softAssert.assertEquals(actual, expected);
//
//       
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }
//	}
//	@Test(priority = 11)
//	public void Verify_to_check_and_click_prvious_pagebutton_of_the_device_page()
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	 
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Previous']")));
//     Thread.sleep(3000);
//		 driver.findElement(By.xpath("//a[text()='Previous']")).click();
//		
//		String actual= driver.findElement(By.xpath("//a[text()='Previous']")).getText();
//        String expected="Previous";
//        softAssert.assertEquals(actual, expected);
//
//       
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }
//	}
//	@Test(priority = 10)
//	public void Verify_to_check_sr_number_column_of_the_device_in_device_page()
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	 
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//th[text()='S. No.']")));
//     Thread.sleep(3000);
////		WebElement logo = driver.findElement(By.xpath("//a[text()='Next']"));
////		logo.click();
//		String actual= driver.findElement(By.xpath("//th[text()='S. No.']")).getText();
//        String expected="S. No.";
//        softAssert.assertEquals(actual, expected);
//
//       
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }
//	}
//	@Test(priority = 12)
//	public void Verify_to_check_devicwID_column_of_the_device_in_device_page()
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	 
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//th[text()='Device Id']")));
//     Thread.sleep(3000);
////		WebElement logo = driver.findElement(By.xpath("//a[text()='Next']"));
////		logo.click();
//		String actual= driver.findElement(By.xpath("//th[text()='Device Id']")).getText();
//        String expected="Device Id";
//        softAssert.assertEquals(actual, expected);
//
//       
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }
//	}
//	@Test(priority = 13)
//	public void Verify_to_check_devicetype_column_of_the_device_in_device_page()
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	 
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//th[text()='Device Type']")));
//     Thread.sleep(3000);
////		WebElement logo = driver.findElement(By.xpath("//a[text()='Next']"));
////		logo.click();
//		String actual= driver.findElement(By.xpath("//th[text()='Device Type']")).getText();
//        String expected="Device Type";
//        softAssert.assertEquals(actual, expected);
//
//       
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }
//	}
//	@Test(priority = 14)
//	public void Verify_to_check_Organization_Namecolumn_of_the_device_in_device_page()
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	 
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//th[text()='Organization Name']")));
//     Thread.sleep(3000);
////		WebElement logo = driver.findElement(By.xpath("//a[text()='Next']"));
////		logo.click();
//		String actual= driver.findElement(By.xpath("//th[text()='Organization Name']")).getText();
//        String expected="Organization Name";
//        softAssert.assertEquals(actual, expected);
//
//       
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }
//	}
//	@Test(priority = 15)
//	public void Verify_to_check_Action_column_of_the_device_in_device_page()
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	 
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//th[text()='Action']")));
//     Thread.sleep(3000);
////		WebElement logo = driver.findElement(By.xpath("//a[text()='Next']"));
////		logo.click();
//		String actual= driver.findElement(By.xpath("//th[text()='Action']")).getText();
//        String expected="Action";
//        softAssert.assertEquals(actual, expected);
//
//       
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }
//	      
//	}
//	@Test(priority = 16)
//	public void Verify_to_check_selected_option_of_zone_in_update_form_is_visible()
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	 
//	    	
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//     Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		 Thread.sleep(3000);
////		driver.findElement(By.xpath("//button[text()='Submit']")).click();
////		 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));
////	     wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Updated Successfully']")));
//		WebElement actual = driver.findElement(By.xpath("//input[@placeholder='Please Select Time Zone']"));
//		
//		softAssert.assertTrue(actual.isDisplayed());
//		
//
//        
//        Thread.sleep(4000);
//        driver.navigate().refresh();
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }}
//	@Test(priority = 17)
//	public void Verify_to_check_selected_option_of_devicetype_in_update_form_is_visible()
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	 
//	    	  
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//     Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		 Thread.sleep(3000);
////		driver.findElement(By.xpath("//button[text()='Submit']")).click();
////		 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));
////	     wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Updated Successfully']")));
//		WebElement actual = driver.findElement(By.xpath("//div[@class='header-main']"));
//		
//		softAssert.assertTrue(actual.isDisplayed());
//		
//
//        
//        Thread.sleep(4000);
//        driver.navigate().refresh();
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }}
//	@Test(priority = 18)
//	public void Verify_to_check_selected_orgnization_should_not_change_in_update()
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	 
//	    	  
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//     Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		 Thread.sleep(3000);
////		driver.findElement(By.xpath("//button[text()='Submit']")).click();
////		 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));
////	     wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Updated Successfully']")));
//		WebElement actual = driver.findElement(By.xpath("//input[@placeholder='Please Select Organization']"));
//		
//		softAssert.assertFalse(actual.isEnabled());
//		
//
//        
//        Thread.sleep(4000);
//        driver.navigate().refresh();
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }}
//
//	@Test(priority = 19)
//	public void Verify_to_check_click_on_any_intermediate_page_of_device_page()
//	{
//		 softAssert = new SoftAssert();
//	      try {
//	    	 
//	    	  
//	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
//     wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']/span")));
//     Thread.sleep(3000);
////		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
////		 Thread.sleep(3000);
////		driver.findElement(By.xpath("//button[text()='Submit']")).click();
////		 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));
////	     wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Updated Successfully']")));
//		driver.findElement(By.xpath("//a[text()='2']")).click();
//		
//
//        
//        Thread.sleep(4000);
//        driver.navigate().refresh();
//    } catch (Exception e) {
//        softAssert.fail("Exception: " + e.getMessage());
//    } finally {
//        softAssert.assertAll();          
//       
//    }}
	@Test(priority = 20)
	public void Verify_that_the_total_number_of_pages_is_displayed_correctly()
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
//		driver.findElement(By.xpath("//td[@class='actionIcon']/span")).click();
//		 Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
//		 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));
//	     wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Updated Successfully']")));
		WebElement page = driver.findElement(By.xpath("//a[text()='1']"));
		softAssert.assertTrue(page.isDisplayed());
		

        
        Thread.sleep(4000);
        driver.navigate().refresh();
    } catch (Exception e) {
        softAssert.fail("Exception: " + e.getMessage());
    } finally {
        softAssert.assertAll();          
       
    }}
//	public void sample()
//	{
//		softAssert= new SoftAssert();
//		try
//		{
//			driver.findElement(By.xpath(""));
//		}catch(Exception e) {
//			softAssert.fail("Exception "+e.getMessage());
//		}finally {
//			softAssert.assertAll();
//		}
//	}
//	
	


	

}
