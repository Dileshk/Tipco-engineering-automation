import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Device_create.Device_create;
import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;

public class Create_device_from_supervisor extends Base_class {
	Device_create device;
    SoftAssert softAssert;
	@BeforeClass
	public void initializebrowser() throws IOException, InterruptedException
	{
		openbrowser();
		device=new Device_create(driver);
		Thread.sleep(5000);
		device.entermail(UtilityClass.propertiesfile("supmail"));
		device.entpass(UtilityClass.propertiesfile("passsup"));
		device.clickbuttonsubmit();
	}
	@Test(priority = 31)
	public void Verify_to_create_Horizontalbead_mill_machine() throws IOException, InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	  
	    	String deviceId = generateDeviceId();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");
	        
	       
	        device.clickonadddevice();
	        
	        device.enterdeviceId(deviceId);

	        device.clickondevicetypelistbox();
	        driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
	         

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();
//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));//hamne is xpath ke liye wait kar rahe ye nahi mila toh sab fail hojayege
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

	@Test(priority = 32)
	public void verify_to_create_twinsaftdisperser() throws InterruptedException, IOException {
	     softAssert = new SoftAssert();
	    try {String deviceId = generateDeviceId();
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");
	        
	        device.clickonadddevice();
	        
	        device.enterdeviceId(deviceId);
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
//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        
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

	@Test(priority = 33)
	public void Verify_to_create_highspeed_disperser_machine() throws InterruptedException, IOException {
	     softAssert = new SoftAssert();
	    try {String deviceId = generateDeviceId();
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");
	        
	      
	        device.clickonadddevice();
	        
	        device.enterdeviceId(deviceId);
	        device.clickondevicetypelistbox();
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	        

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();
//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        
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
	    }}
	 public String generateDeviceId() {
	        int length = 14;
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder deviceId = new StringBuilder();
	        Random random = new Random();

	        for (int i = 0; i < length; i++) {
	            deviceId.append(characters.charAt(random.nextInt(characters.length())));
	        }

	        return deviceId.toString();
	    }
	@Test(priority = 4)
	public void Verify_that_the_Device_ID_field_is_unique_and_does_not_allow_duplicates() throws InterruptedException, IOException {
	     softAssert = new SoftAssert();
	    try {
	    	Thread.sleep(3000);
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         Thread.sleep(3000);
	        device.clicksbtn();
	        
	        
	        device.clickondevicetab();
	         
	         
	       
	        
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        device.clickonadddevice();
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
//	     // Wait until the element is clickable
//	     WebElement addDeviceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
//	     // Now click on the element after it is clickable
//	     addDeviceButton.click();
//	        device.clickonadddevice();
//	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(60));
//	        wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
//	        System.out.println("Overlay Gone");
	        
	        
	        device.enterdeviceId(UtilityClass.propertiesfile("alreadyexist"));
	        
	        device.clickondevicetypelistbox();
	        
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	        

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();
//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	       
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
	        
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
	public void Verify_to_check__Device_ID_Field_with_special_characters() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	       

	       
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	       
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("Idwithspecialchar"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	        dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	         

	       
	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(5000);

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Enter only letters and numbers without special characters']")).getText();
	        String expected = "Enter only letters and numbers without special characters";
	        
	        System.out.println("Message: " + actual);
	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
	        
	        Thread.sleep(5000);
	        driver.navigate().refresh();
	    } catch (Exception e) {
	        softAssert.fail("Exception: " + e.getMessage());
	    } finally {
	        softAssert.assertAll();
	        
	    }
	}

	//public void waitForPageLoad() {
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
	//}
	//}
	@Test(priority = 6)
	public void Verify_to_check__Device_IDfield_with_spaces() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	       

	       
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	       
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("Idwithspace"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	        dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	         

	       
	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(5000);

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        

	      
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
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	       
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("mindeviceid"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	        dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	         

	       
	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(5000);

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        

	      
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
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	       
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("maxdeviceid"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	        dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	         

	       
	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        Thread.sleep(5000);

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        

	      
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
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	         

	       
	        device.maxtemp1(UtilityClass.propertiesfile("maxvalueoftemp1"));
	        
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        
	//
//	      
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
	    	
	         
	        
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	         

	       
	        device.maxtemp1(UtilityClass.propertiesfile("alphabetintemp1"));
	        
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        
	//
//	      
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
	public void  Verify_that_temp1_field_take_blank_and_see_the_error_message() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	         
	       
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
	         

	       
	       
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        
	//
//	      
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
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
	         

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        device.maxtemp2(UtilityClass.propertiesfile("alphaandspeintemp2"));
	       device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        
	//
//	      
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
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
	         

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        device.maxtemp2(UtilityClass.propertiesfile("maxvalueoftemp2"));
	       device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        

	      
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
	public void  check_maxtemp3_field_does_not_accept_special_char
	() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	         
	       
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
	         

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
	       device.maxtemp3(UtilityClass.propertiesfile("alphaandspeintemp3"));
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        

	      
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
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
	         

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
	       device.maxtemp3(UtilityClass.propertiesfile("maxvalueoftemp3"));
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        

	      
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
	public void  check_to_create_device_with_maxtepm3_field_is_blank
	() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	         
	       
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
	         

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
	       
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        

	      
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
	@Test(priority = 17)
	public void  Verify_that_the_Max_Pressure_1_field_does_not_accept_alphabetic_or_any_speecial_characters

	() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
	         

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        
	       
	        device.entermaxpresser(UtilityClass.propertiesfile("maxpressoralphaspechar"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Pressure must be a whole number']")).getText();
	        String expected = "Pressure must be a whole number";
	        
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
	@Test(priority = 18)
	public void  Verify_that_the_Max_pressure_field_does_not_accept_values__greater_than_10

	() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
	         

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        
	       
	        device.entermaxpresser(UtilityClass.propertiesfile("maxpresservalue"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        
	//
//	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Pressure must be between 1 and 10']")).getText();
	        String expected = "Pressure must be between 1 and 10";
	        
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
	@Test(priority = 19)
	public void  Verify_that_the_Max_pressure_field_does_not_accept_values_less_than_1

	() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
	         

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        
	       
	        device.entermaxpresser(UtilityClass.propertiesfile("lesspressvalue"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Pressure must be between 1 and 10']")).getText();
	        String expected = "Pressure must be between 1 and 10";
	        
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
	@Test(priority = 20)
	public void  Verify_that_the_Max_pressure__field_take_blnak_and_see_error

	() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
	         

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        
	       
	       
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Max Pressure is required']")).getText();
	        String expected = "Max Pressure is required";
	        
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
	@Test(priority = 21)
	public void  Verify_that_the_Max_vibration_field_does_not_accept_alphabetic_or_any_special_characters


	() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
	         

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        
	       
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("maxvibrationwithalphaandspechar"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Vibration must be a whole number']")).getText();
	        String expected = "Vibration must be a whole number";
	        
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
	@Test(priority = 22)
	public void  Verify_that_the_Max_vibration_field_does_not_accept_value_greater_than_10000


	() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	 
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
	         

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        
	       
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibrationaboverange"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Vibration must be between 1 and 10000']")).getText();
	        String expected = "Vibration must be between 1 and 10000";
	        
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
	@Test(priority = 23)
	public void  Verify_that_the_Max_vibration_field_does_not_accept_value_less_than_1


	() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	    	
	      
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
	         

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        
	       
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibrationbelowrange"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Vibration must be between 1 and 10000']")).getText();
	        String expected = "Vibration must be between 1 and 10000";
	        
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
	@Test(priority = 24)
	public void  Verify_that_the_Max_vibration_field_take_blank_and_see_error_message


	() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	         
	         
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	         
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
	         

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        
	       
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
//	        device.entermaxvibration(UtilityClass.propertiesfile("vibrationbelowrange"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Max Vibration is required']")).getText();
	        String expected = "Max Vibration is required";
	        
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
	@Test(priority = 25)
	public void  Verify_that_the_Time_Zone_field_displays_a_dropdown_menu


	() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
//	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
//	        
//	        device.clicksbtn();
//	        
//	        
//	        device.clickondevicetab();
//	         
	      
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        
	        device.clickonadddevice();
	        

	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
	         

	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        
	       
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
//	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        
	//
//	       
//	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();
	        driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[2]")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
//	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        
	//
//	      
//	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	      WebElement countrylist = driver.findElement(By.xpath("//div[@class='dropdown companyDropDown dropdownhistory create-organization-main']"));
//	        String actual = driver.findElement(By.xpath("//p[text()='Max Vibration is required']")).getText();
//	        String expected = "Max Vibration is required";
//	        
//	        System.out.println("Message: " + actual);
//	        softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
	        softAssert.assertTrue(countrylist.isDisplayed());
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("Exception: " + e.getMessage());
	    } finally {
	        softAssert.assertAll();          
	        driver.navigate().refresh();
	    }
	}
	@Test(priority = 26)
	public void Verify_the_empty_field_of_Device_ID_is_not_saved_and_gets_valid_errormessage


	() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    try {
	    	
	         
	         
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");

	        
	        device.clickonadddevice();
	        
	//
//	        device.enterdeviceId(UtilityClass.propertiesfile("HID"));
//	         

	      
	        WebElement dropDownIcon = driver.findElement(By.xpath("//span[@class='dropDownIcon']"));
	        dropDownIcon.click();
	         
	        dropDownIcon.click();
	     //   dropDownIcon.click();
	      

	      
	        driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
	         
	       
	        device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
	        
	       
	        device.entermaxpresser(UtilityClass.propertiesfile("presser"));
	        device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
	        device.entertimezone(UtilityClass.propertiesfile("zone"));
	        

	       
	        driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();

//	        device.enterorgname(UtilityClass.propertiesfile("orgname"));
////	        Thread.sleep(5000);
//	       driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[3]")).click();
//	        
//	        driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
//	        

	      
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();

	        
	        String actual = driver.findElement(By.xpath("//p[text()='Device ID is required']")).getText();
	        String expected = "Device ID is required";
	        
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
	    @Test(priority = 27)
	public void Verify_that_click_on_cross_button_and_close_the_popup() throws InterruptedException
	{
	     
	  
	    	  
	         WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	         wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	         System.out.println("Overlay Gone");

	         
	         device.clickonadddevice();
	         
	         driver.findElement(By.xpath("//h5[text()=' X ']")).click();
	       
	        
	}

	  @Test(priority = 28)
	  public void Verify_that_the_text_of_Device_page
	  
	  
	  () throws InterruptedException, IOException {
	      softAssert = new SoftAssert();
	      try {
	      	
	           
	    	   
		        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
		        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
		        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
		        System.out.println("Overlay Gone");
	       
	        String expected="Device";
	        String actual=driver.findElement(By.xpath("//h2[text()='Device']")).getText();
	        
	          
	          System.out.println("Message: " + actual);
	          softAssert.assertEquals(actual, expected, "Device creation message mismatch!");
	          
	          Thread.sleep(4000);
	          driver.navigate().refresh();
	      } catch (Exception e) {
	          softAssert.fail("Exception: " + e.getMessage());
	      } finally {
	          softAssert.assertAll();          
	         
	      }
	  } 
	  @Test(priority = 29)
	  public void Verify_that_clickon_submit_button_when_all_the_fields_are_blank
	  
	  
	  () throws InterruptedException, IOException {
	      softAssert = new SoftAssert();
	      try {
	      	
	           
	    	   
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	        System.out.println("Overlay Gone");
	         
	        device.clickonadddevice();
	         
	        
	        driver.findElement(By.xpath("//button[text()='Submit']")).click();
	        String expected="Device ID is required";
	        String actual=driver.findElement(By.xpath("//p[text()='Device ID is required']")).getText();
	        
	          
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
	  @Test(priority = 30)
	  public void Verify_the_deice_text_on_add_device_page
	  
	  
	  () throws InterruptedException, IOException {
	      softAssert = new SoftAssert();
	      try {
	      	
	    	 
	          WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	          wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	          wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Device']")));
	          System.out.println("Overlay Gone");
	           
	          device.clickonadddevice();
	           
	       
	        String expected="Add Device";
	        String actual=driver.findElement(By.xpath("//h3[text()='Add Device']")).getText();
	        
	          
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
	}
