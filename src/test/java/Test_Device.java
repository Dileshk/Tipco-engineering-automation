import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Device_create.Device_create;
import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;
import action.Select;

public class Test_Device extends Base_class{
	
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
//	public void Verify_to_create_Horizontalbead_mill_machine() throws IOException, InterruptedException {
//	     softAssert = new SoftAssert();
//	    try {
//	        Thread.sleep(25000);
//	        device.clicksbtn();
//	        Thread.sleep(3000);
//	        device.clickondevicetab();
//	        Thread.sleep(3000);
//	        device.clickonadddevice();
//	        Thread.sleep(3000);
//	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//
//	        device.clickondevicetypelistbox();
//	        driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
//	        Thread.sleep(2000);
//
//	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//	        device.entertimezone(UtilityClass.propertiesfile("zone"));
//	        Thread.sleep(5000);
//	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();
//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        Thread.sleep(3000);
//	        driver.findElement(By.xpath("//button[text()='Submit']")).click();
//
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));//hamne is xpath ke liye wait kar rahe ye nahi mila toh sab fail hojayege
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Created Successfully']")));
//	        System.out.println("Overlay Gone");
//
//	        
//	        String actual = driver.findElement(By.xpath("//div[text()='Device Created Successfully']")).getText();
//	        String expected = "Device Created Successfully";
//	        System.out.println("dhkjfh" + actual);
//	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//
//	    } catch (Exception e) {
//	        softAssert.fail("Exception " + e.getMessage()); 
//	    } finally {
//	        softAssert.assertAll(); 
//	        driver.navigate().refresh(); 
//	    }
//	}
//
//	@Test(priority = 2)
//	public void verify_to_create_twinsaftdisperser() throws InterruptedException, IOException {
//	     softAssert = new SoftAssert();
//	    try {
//	        device.clickonadddevice();
//	        Thread.sleep(3000);
//	        device.enterdeviceId(UtilityClass.propertiesfile("TID"));
//	        device.clickondevicetypelistbox();
//	        driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
//	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//	        device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
//	        device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
//	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//	        device.entertimezone(UtilityClass.propertiesfile("zone"));
//	        Thread.sleep(5000);
//	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();
//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        Thread.sleep(3000);
//	        driver.findElement(By.xpath("//button[text()='Submit']")).click();
//
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Created Successfully']")));
//	        System.out.println("Overlay Gone");
//
//	        
//	        String actual = driver.findElement(By.xpath("//div[text()='Device Created Successfully']")).getText();
//	        String expected = "Device Created Successfully";
//	        System.out.println("dhkjfh" + actual);
//	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//
//	    } catch (Exception e) {
//	        softAssert.fail("Exception " + e.getMessage());
//	    } finally {
//	        softAssert.assertAll();
//	        driver.navigate().refresh();
//	    }
//	}
//
//	@Test(priority = 3)
//	public void Verify_to_create_highspeed_disperser_machine() throws InterruptedException, IOException {
//	     softAssert = new SoftAssert();
//	    try {
//	        Thread.sleep(5000);
//	        device.clickonadddevice();
//	        Thread.sleep(3000);
//	        device.enterdeviceId(UtilityClass.propertiesfile("HIID"));
//	        device.clickondevicetypelistbox();
//	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
//	        Thread.sleep(3000);
//
//	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//	        Thread.sleep(3000);
//	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//	        device.entertimezone(UtilityClass.propertiesfile("zone"));
//	        Thread.sleep(5000);
//	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();
//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        Thread.sleep(3000);
//	        driver.findElement(By.xpath("//button[text()='Submit']")).click();
//
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Created Successfully']")));
//	        System.out.println("Overlay Gone");
//
//	        
//	        String actual = driver.findElement(By.xpath("//div[text()='Device Created Successfully']")).getText();
//	        String expected = "Device Created Successfully";
//	        System.out.println("dhkjfh" + actual);
//	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//
//	    } catch (Exception e) {
//	        softAssert.fail("Exception  " + e.getMessage());
//	    } finally {
//	        softAssert.assertAll();
//	    }}
		
//	@Test(priority = 4)
//	public void Verify_that_the_Device_ID_field_is_unique_and_does_not_allow_duplicates() throws InterruptedException, IOException {
//	     softAssert = new SoftAssert();
//	    try {
//	    	Thread.sleep(30000);
//	        device.clicksbtn();
//	        Thread.sleep(3000);
//	        device.clickondevicetab();
//	       
//	        waitForPageLoad();
////	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
////	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add Device']")));
////	        device.clickonadddevice();
////	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
////	     // Wait until the element is clickable
////	     WebElement addDeviceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
////	     // Now click on the element after it is clickable
////	     addDeviceButton.click();
//	        device.clickonadddevice();
//	        Thread.sleep(3000);
//	        device.enterdeviceId(UtilityClass.propertiesfile("alreadyexist"));
//	        Thread.sleep(3000);
//	        device.clickondevicetypelistbox();
//	        Thread.sleep(3000);
//	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
//	        Thread.sleep(3000);
//
//	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//	        Thread.sleep(3000);
//	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//	        device.entertimezone(UtilityClass.propertiesfile("zone"));
//	        Thread.sleep(5000);
//	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();
//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	       
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        Thread.sleep(3000);
//	        driver.findElement(By.xpath("//button[text()='Submit']")).click();
//
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Id already exists within the organization']")));
//	        System.out.println("Overlay Gone");
//
//	        
//	        String actual = driver.findElement(By.xpath("//div[text()='Device Id already exists within the organization']")).getText();
//	        String expected = "Device Id already exists within the organization";
//	        System.out.println("dhkjfh" + actual);
//	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
//                 Thread.sleep(5000);
//                
//	    } catch (Exception e) {
//	        softAssert.fail("Exception  " + e.getMessage());
//	    } finally {
//	        softAssert.assertAll();
//	        driver.navigate().refresh();
//	    }}
	@Test(priority = 5)
	public void Verify_to_check_the_Device_ID_with_special_characters() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='toggle-id']")));
	       Thread.sleep(2000);
	        device.clicksbtn();
	        Thread.sleep(3000);
	        
	        device.clickondevicetab();
	        Thread.sleep(3000); // Give some time for the page to load

	        // Re-locate the Add Device button after DOM updates
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(25));
	        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        // Now click on Add Device
	        device.clickonadddevice();
	        Thread.sleep(3000);

	        device.enterdeviceId(UtilityClass.propertiesfile("Idwithspecialchar"));
	        Thread.sleep(2000);

	        // Re-locate dropdown and click to avoid stale element issues
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	        Thread.sleep(2000);
	        
	        // Re-fetch the element in case of DOM change and click again
	        dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	        Thread.sleep(2000);

	        // Select device type
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	        Thread.sleep(2000);

	        // Continue filling out the form
	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        Thread.sleep(3000);
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(5000);

	        // Select timezone
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
           driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
	        // Re-locate and select organization name
	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        Thread.sleep(3000);

	        // Submit the form
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        // Re-locate and verify the error message
	        String actual = driver.findElement(By.xpath("//p[text()='Enter only letters and numbers without special characters']")).getText();
	        String expected = "Enter only letters and numbers without special characters";
	        
	        System.out.println("Message: " + actual);
	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
	        
	        Thread.sleep(5000);
	    } catch (Exception e) {
	        softAssert.fail("Exception: " + e.getMessage());
	    } finally {
	        softAssert.assertAll();
	        driver.navigate().refresh();
	    }
	}
}
//	public void waitForPageLoad() {
//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//	    for (int i = 0; i < 30; i++) { // Retry up to 30 times (adjust if needed)
//	        try {
//	            Thread.sleep(1000); // Wait 1 second between checks
//	            if (js.executeScript("return document.readyState").toString().equals("complete")) {
//	                break;
//	            }
//	        } catch (InterruptedException e) {
//	            e.printStackTrace();
//	        }
//	    }
//	}
//}
