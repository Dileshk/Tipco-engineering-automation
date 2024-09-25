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
		
	@Test(priority = 4)
	public void Verify_that_the_Device_ID_field_is_unique_and_does_not_allow_duplicates() throws InterruptedException, IOException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	       Thread.sleep(2000);
	        device.clicksbtn();
	        Thread.sleep(3000);
	        
	        device.clickondevicetab();
	         
	        Thread.sleep(2000);
	       
	        
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add Device']")));
//	        device.clickonadddevice();
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
//	     // Wait until the element is clickable
//	     WebElement addDeviceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
//	     // Now click on the element after it is clickable
//	     addDeviceButton.click();
	        device.clickonadddevice();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");
	        
	        Thread.sleep(3000);
	        device.enterdeviceId(UtilityClass.propertiesfile("alreadyexist"));
	        Thread.sleep(3000);
	        device.clickondevicetypelistbox();
	        Thread.sleep(3000);
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
	       
	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Id already exists within the organization']")));
	        System.out.println("Overlay Gone");

	        
	        String actual = driver.findElement(By.xpath("//div[text()='Device Id already exists within the organization']")).getText();
	        String expected = "Device Id already exists within the organization";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
                 Thread.sleep(5000);
                
	    } catch (Exception e) {
	        softAssert.fail("Exception  " + e.getMessage());
	    } finally {
	        softAssert.assertAll();
	        driver.navigate().refresh();
	    }}
	@Test(priority = 5)
	public void Verify_to_check_the_Device_ID_with_special_characters() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	       

	       
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	       
	        device.clickonadddevice();
	        Thread.sleep(3000);

	        device.enterdeviceId(UtilityClass.propertiesfile("Idwithspecialchar"));
	        Thread.sleep(2000);

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	        Thread.sleep(2000);
	        
	        dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	        Thread.sleep(2000);

	       
	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        Thread.sleep(3000);
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(5000);

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
           driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
	        
	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        Thread.sleep(3000);

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
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
	@Test(priority = 6)
	public void Verify_to_check_the_Device_ID_with_spaces() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	       

	       
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	       
	        device.clickonadddevice();
	        Thread.sleep(3000);

	        device.enterdeviceId(UtilityClass.propertiesfile("Idwithspace"));
	        Thread.sleep(2000);

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	        Thread.sleep(2000);
	        
	        dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	        Thread.sleep(2000);

	       
	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        Thread.sleep(3000);
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(5000);

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
           driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
	        
	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        Thread.sleep(3000);

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Spaces are not allowed']")).getText();
	        String expected = "Spaces are not allowed";
	        
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
	@Test(priority = 7)
	public void  Verify_that_the_Device_ID_field_does_not_accept_with_minimum_length_of_2_characters() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	       
	       
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	       
	        device.clickonadddevice();
	        Thread.sleep(3000);

	        device.enterdeviceId(UtilityClass.propertiesfile("mindeviceid"));
	        Thread.sleep(2000);

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	        Thread.sleep(2000);
	        
	        dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	        Thread.sleep(2000);

	       
	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        Thread.sleep(3000);
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(5000);

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
           driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
	        
	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        Thread.sleep(3000);

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Device ID should be between 3 and 15 characters']")).getText();
	        String expected = "Device ID should be between 3 and 15 characters";
	        
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
	@Test(priority = 8)
	public void  Verify_that_the_Device_ID_field_does_not_accept_with_max_length() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	       
	       
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	       
	        device.clickonadddevice();
	        Thread.sleep(3000);

	        device.enterdeviceId(UtilityClass.propertiesfile("maxdeviceid"));
	        Thread.sleep(2000);

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	        Thread.sleep(2000);
	        
	        dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	        Thread.sleep(2000);

	       
	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        Thread.sleep(3000);
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(5000);

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
           driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
	        
	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        Thread.sleep(3000);

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Device ID should be between 3 and 15 characters']")).getText();
	        String expected = "Device ID should be between 3 and 15 characters";
	        
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
	@Test(priority = 9)
	public void  Verify_that_the_Max_Temperature_1_field_accepts_numeric_values_between_1_to_100 () throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        Thread.sleep(3000);
	        device.clickonadddevice();
	        Thread.sleep(3000);

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	        Thread.sleep(2000);

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	        Thread.sleep(2000);
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	        Thread.sleep(2000);

	       
	        device.maxtemp1(UtilityClass.propertiesfile("maxvalueoftemp1"));
	        Thread.sleep(3000);
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(3000);

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
           driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
	        
	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        Thread.sleep(3000);

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Temperature must be between 1 and 100']")).getText();
	        String expected = "Temperature must be between 1 and 100";
	        
	        System.out.println("Message: " + actual);
	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
	        
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("Exception: " + e.getMessage());
	    } finally {
	        softAssert.assertAll();
	        driver.navigate().refresh();
	    }
	}
	@Test(priority = 10)
	public void  Verify_that_temp1_field_should_not_accept_alphabet() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	         
	       Thread.sleep(2000);
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        Thread.sleep(3000);
	        device.clickonadddevice();
	        Thread.sleep(3000);

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	        Thread.sleep(2000);

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	        Thread.sleep(2000);
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	        Thread.sleep(2000);

	       
	        device.maxtemp1(UtilityClass.propertiesfile("alphabetintemp1"));
	        Thread.sleep(3000);
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(3000);

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
           driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
	        
	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        Thread.sleep(3000);

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Temperature must be a whole number']")).getText();
	        String expected = "Temperature must be a whole number";
	        
	        System.out.println("Message: " + actual);
	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
	        
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("Exception: " + e.getMessage());
	    } finally {
	        softAssert.assertAll();
	        driver.navigate().refresh();
	    }
	}
	
	@Test(priority = 11)
	public void  Verify_that_temp1_field_take_blank() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	         
	       
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        Thread.sleep(3000);
	        device.clickonadddevice();
	        Thread.sleep(3000);

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	        Thread.sleep(2000);

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	        Thread.sleep(2000);
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	        Thread.sleep(2000);

	       
	       
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(3000);

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
           driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
	        
	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        Thread.sleep(3000);

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Max temperature is required']")).getText();
	        String expected = "Max temperature is required";
	        
	        System.out.println("Message: " + actual);
	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
	        
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("Exception: " + e.getMessage());
	    } finally {
	        softAssert.assertAll();
	        driver.navigate().refresh();
	    }
	}
	@Test(priority = 12)
	public void  Verify_that_the_Max_Temperature_2_field_does_not_accept_alphabetic_or_any_special_characters
() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	         
	       
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        Thread.sleep(3000);
	        device.clickonadddevice();
	        Thread.sleep(3000);

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	        Thread.sleep(2000);

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	        Thread.sleep(2000);
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
	        Thread.sleep(2000);

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        device.maxtemp2(UtilityClass.propertiesfile("alphaandspeintemp2"));
	       device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(3000);

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
           driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
	        
	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        Thread.sleep(3000);

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Temperature must be a whole number']")).getText();
	        String expected = "Temperature must be a whole number";
	        
	        System.out.println("Message: " + actual);
	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
	        
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("Exception: " + e.getMessage());
	    } finally {
	        softAssert.assertAll();          //Verify that the Max Temperature 2 field accepts numeric values between 1 to 100
	        driver.navigate().refresh();
	    }
	}
	@Test(priority = 13)
	public void   Verify_that_the_Max_Temperature_2_field_does_not_greater_than_100 
() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	         
	       
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        Thread.sleep(3000);
	        device.clickonadddevice();
	        Thread.sleep(3000);

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	        Thread.sleep(2000);

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	        Thread.sleep(2000);
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
	        Thread.sleep(2000);

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        device.maxtemp2(UtilityClass.propertiesfile("maxvalueoftemp2"));
	       device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(3000);

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
           driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
	        
	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        Thread.sleep(3000);

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Temperature must be between 1 and 100']")).getText();
	        String expected = "Temperature must be between 1 and 100";
	        
	        System.out.println("Message: " + actual);
	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
	        
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("Exception: " + e.getMessage());
	    } finally {
	        softAssert.assertAll();          //Verify that the Max Temperature 2 field accepts numeric values between 1 to 100
	        driver.navigate().refresh();
	    }
	}
	@Test(priority = 14)
	public void  check_maxtemp3_field_does_not_accept_special_and_char
() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	         
	       
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        Thread.sleep(3000);
	        device.clickonadddevice();
	        Thread.sleep(3000);

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	        Thread.sleep(2000);

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	        Thread.sleep(2000);
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
	        Thread.sleep(2000);

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
	       device.maxtemp3(UtilityClass.propertiesfile("alphaandspeintemp3"));
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(3000);

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
           driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
	        
	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        Thread.sleep(3000);

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Temperature must be a whole number']")).getText();
	        String expected = "Temperature must be a whole number";
	        
	        System.out.println("Message: " + actual);
	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
	        
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("Exception: " + e.getMessage());
	    } finally {
	        softAssert.assertAll();          //Verify that the Max Temperature 2 field accepts numeric values between 1 to 100
	        driver.navigate().refresh();
	    }
	}
	@Test(priority = 15)
	public void  check_maxtepm3_does_not_accept_greater_than_100
() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	         
	       
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        Thread.sleep(3000);
	        device.clickonadddevice();
	        Thread.sleep(3000);

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	        Thread.sleep(2000);

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	        Thread.sleep(2000);
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
	        Thread.sleep(2000);

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
	       device.maxtemp3(UtilityClass.propertiesfile("maxvalueoftemp3"));
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(3000);

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
           driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
	        
	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        Thread.sleep(3000);

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Temperature must be between 1 and 100']")).getText();
	        String expected = "Temperature must be between 1 and 100";
	        
	        System.out.println("Message: " + actual);
	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
	        
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("Exception: " + e.getMessage());
	    } finally {
	        softAssert.assertAll();          //Verify that the Max Temperature 2 field accepts numeric values between 1 to 100
	        driver.navigate().refresh();
	    }
	}
	@Test(priority = 16)
	public void  check_maxtepm3_field_blank
() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	         
	       
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        Thread.sleep(3000);
	        device.clickonadddevice();
	        Thread.sleep(3000);

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	        Thread.sleep(2000);

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	        Thread.sleep(2000);
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
	        Thread.sleep(2000);

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
	       
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(3000);

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
           driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
	        
	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        Thread.sleep(3000);

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Max temperature is required']")).getText();
	        String expected = "Max temperature is required";
	        
	        System.out.println("Message: " + actual);
	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
	        
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("Exception: " + e.getMessage());
	    } finally {
	        softAssert.assertAll();          //Verify that the Max Temperature 2 field accepts numeric values between 1 to 100
	        driver.navigate().refresh();
	    }
	}
}