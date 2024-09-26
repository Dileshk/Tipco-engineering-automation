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
	@Test(priority = 1)
	public void Verify_to_create_Horizontalbead_mill_machine() throws IOException, InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	       Thread.sleep(2000);
	        device.clicksbtn();
	        Thread.sleep(2000);
	        device.clickondevicetab();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");
	        Thread.sleep(3000);
	       
	        device.clickonadddevice();
	        Thread.sleep(3000);
	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));

	        device.clickondevicetypelistbox();
	        driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
	        Thread.sleep(2000);

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();
	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));//hamne is xpath ke liye wait kar rahe ye nahi mila toh sab fail hojayege
	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Created Successfully']")));
	        System.out.println("Overlay Gone");

	        
	        String actual = driver.findElement(By.xpath("//div[text()='Device Created Successfully']")).getText();
	        String expected = "Device Created Successfully";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
	  Thread.sleep(5000);
 driver.navigate().refresh(); 
	    } catch (Exception e) {
	        softAssert.fail("Exception " + e.getMessage()); 
	    } finally {
	        softAssert.assertAll(); 
	       
	    }
	}

	@Test(priority = 2)
	public void verify_to_create_twinsaftdisperser() throws InterruptedException, IOException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");
	        Thread.sleep(3000);
	        device.clickonadddevice();
	        Thread.sleep(3000);
	        device.enterdeviceId(UtilityClass.propertiesfile("TID"));
	        device.clickondevicetypelistbox();
	        driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
	        device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();
	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Created Successfully']")));
	        System.out.println("Overlay Gone");

	        
	        String actual = driver.findElement(By.xpath("//div[text()='Device Created Successfully']")).getText();
	        String expected = "Device Created Successfully";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
    Thread.sleep(5000);
	        driver.navigate().refresh();
	    } catch (Exception e) {
	        softAssert.fail("Exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll();
	        
	    }
	}

	@Test(priority = 3)
	public void Verify_to_create_highspeed_disperser_machine() throws InterruptedException, IOException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");
	        Thread.sleep(3000);
	      
	        device.clickonadddevice();
	        Thread.sleep(3000);
	        device.enterdeviceId(UtilityClass.propertiesfile("HIID"));
	        device.clickondevicetypelistbox();
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	        Thread.sleep(3000);

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        Thread.sleep(3000);
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();
	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Created Successfully']")));
	        System.out.println("Overlay Gone");

	        
	        String actual = driver.findElement(By.xpath("//div[text()='Device Created Successfully']")).getText();
	        String expected = "Device Created Successfully";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
	  Thread.sleep(5000);
  driver.navigate().refresh();
	    } catch (Exception e) {
	        softAssert.fail("Exception  " + e.getMessage());
	    } finally {
	        softAssert.assertAll();
	    }}}
		
