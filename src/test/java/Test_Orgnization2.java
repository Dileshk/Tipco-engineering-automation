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

import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;
import Orgnization.Create_Orgnization;

public class Test_Orgnization2 extends Base_class {
	Create_Orgnization org;
    SoftAssert softAssert;
	@BeforeClass
	public void initializebrowser() throws IOException, InterruptedException
	{
		openbrowser();
		org=new Create_Orgnization(driver);
		Thread.sleep(3000);
		org.entermail(UtilityClass.propertiesfile("validmail"));
		org.entpass(UtilityClass.propertiesfile("validpass"));
		org.clickbuttonsubmit();
		
	}
	@Test(priority = 1)
	public void Ensure_that_the_organization_update_fails_with_enter_max_length_of_GSTnumberfield () throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	      Thread.sleep(2000);
	      org.clicksbtn();
	      Thread.sleep(2000);
	      org.clickonorgnizationtab();
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
          WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='GST Number']"));
          orgname.sendKeys(Keys.CONTROL+"a");
          orgname.sendKeys(Keys.DELETE);
         org.entergst(UtilityClass.propertiesfile("maxlengthgst"));
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();
//	        
//	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
//	        
	        String actual = driver.findElement(By.xpath("//p[text()='GST must be exactly 15 characters.']")).getText();
	        String expected = "GST must be exactly 15 characters.";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 2)
	public void Ensure_that_the_organization_update_fails_with_max_length_of_address_fields () throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
          WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='Address ']"));
          orgname.sendKeys(Keys.CONTROL+"a");
          orgname.sendKeys(Keys.DELETE);
         org.enteraddress(UtilityClass.propertiesfile("maxlengthadd"));
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();
//	        
//	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
//	        
	        String actual = driver.findElement(By.xpath("//p[text()='Maximum allowed length should be of 100 characters.']")).getText();
	        String expected = "Maximum allowed length should be of 100 characters.";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 3)
	public void Ensure_that_the_organization_update_fails_without_address_fields () throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
          WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='Address ']"));
          orgname.sendKeys(Keys.CONTROL+"a");
          orgname.sendKeys(Keys.DELETE);
//         org.enteraddress(UtilityClass.propertiesfile("maxlengthadd"));
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();
//	        
//	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
//	        
	        String actual = driver.findElement(By.xpath("//p[text()='Address is required']")).getText();
	        String expected = "Address is required";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 4)
	public void Ensure_that_the_organization_update_fails_with_max_length_Of_city () throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
          WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='City']"));
          orgname.sendKeys(Keys.CONTROL+"a");
          orgname.sendKeys(Keys.DELETE);
            org.entercity(UtilityClass.propertiesfile("maxlengthcity"));
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();
//	        
//	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
//	        
	        String actual = driver.findElement(By.xpath("//p[text()='Maximum allowed length should be of 100 characters.']")).getText();
	        String expected = "Maximum allowed length should be of 100 characters.";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 5)
	public void Ensure_that_the_organization_update_fails_without_enter_city () throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
          WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='City']"));
          orgname.sendKeys(Keys.CONTROL+"a");
          orgname.sendKeys(Keys.DELETE);
//            org.entercity(UtilityClass.propertiesfile("maxlengthcity"));
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();
//	        
//	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
//	        
	        String actual = driver.findElement(By.xpath("//p[text()='City is required']")).getText();
	        String expected = "City is required";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 6)
	public void Ensure_that_the_organization_update_fails_with_minimum_length_of_pincode () throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
          WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
          orgname.sendKeys(Keys.CONTROL+"a");
          orgname.sendKeys(Keys.DELETE);
            org.enterpin(UtilityClass.propertiesfile("minlengthpin"));
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();
//	        
//	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
//	        
	        String actual = driver.findElement(By.xpath("//p[text()='Pincode must be exactly 6 digits.']")).getText();
	        String expected = "Pincode must be exactly 6 digits.";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 7)
	public void Ensure_that_the_organization_update_fails_with_maximum_length_of_pincode () throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
          WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
          orgname.sendKeys(Keys.CONTROL+"a");
          orgname.sendKeys(Keys.DELETE);
            org.enterpin(UtilityClass.propertiesfile("maxlengthofpin"));
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();
//	        
//	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
//	        
	        String actual = driver.findElement(By.xpath("//p[text()='Pincode must be exactly 6 digits.']")).getText();
	        String expected = "Pincode must be exactly 6 digits.";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 8)
	public void Ensure_that_the_organization_update_fails_without_enter_pincode () throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
          WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
          orgname.sendKeys(Keys.CONTROL+"a");
          orgname.sendKeys(Keys.DELETE);
//            org.enterpin(UtilityClass.propertiesfile("maxlengthofpin"));
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();
//	        
//	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
//	        
	        String actual = driver.findElement(By.xpath("//p[text()='Pincode is required']")).getText();
	        String expected = "Pincode is required";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 9)
	public void Ensure_that_the_organization_update_fails_with_max_length_of_state () throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {

	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
          WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='State']"));
          orgname.sendKeys(Keys.CONTROL+"a");
          orgname.sendKeys(Keys.DELETE);
          org.enterstate(UtilityClass.propertiesfile("maxlengthstate"));
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();
//	        
//	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
//	        
	        String actual = driver.findElement(By.xpath("//p[text()='Maximum allowed length should be of 50 characters.']")).getText();
	        String expected = "Maximum allowed length should be of 50 characters.";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 10)
	public void Ensure_that_the_organization_update_fails_with_using_undercurse_and_at_the_rate_in_state () throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
          WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='State']"));
          orgname.sendKeys(Keys.CONTROL+"a");
          orgname.sendKeys(Keys.DELETE);
          org.enterstate(UtilityClass.propertiesfile("attheratestate"));
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();
//	        
//	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
//	        
	        String actual = driver.findElement(By.xpath("//p[text()='State can only contain alphabets, numbers, single spaces, dashes (-), ampersands (&), and commas (,).']")).getText();
	        String expected = "State can only contain alphabets, numbers, single spaces, dashes (-), ampersands (&), and commas (,).";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 11)
	public void Ensure_that_the_organization_update_fails_withOut_enter_state () throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
          WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='State']"));
          orgname.sendKeys(Keys.CONTROL+"a");
          orgname.sendKeys(Keys.DELETE);
          org.enterstate(UtilityClass.propertiesfile("attheratestate"));
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();
//	        
//	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
//	        
	        String actual = driver.findElement(By.xpath("//p[text()='State can only contain alphabets, numbers, single spaces, dashes (-), ampersands (&), and commas (,).']")).getText();
	        String expected = "State can only contain alphabets, numbers, single spaces, dashes (-), ampersands (&), and commas (,).";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 12)
	public void Ensure_that_the_organization_update_fails_withOut_selecting_refresh_rate () throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
//          WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='State']"));
//          orgname.sendKeys(Keys.CONTROL+"a");
//          orgname.sendKeys(Keys.DELETE);
	       WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
	       org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
	        s.selectByIndex(0);
         
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();
//	        
//	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
//	        
	        String actual = driver.findElement(By.xpath("//p[text()='Refresh Time is required']")).getText();
	        String expected = "Refresh Time is required";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 13)
	public void Verify_that_an_updateorganization_with_a_name_that_already_exists() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {

	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
         WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='Organization Name']"));
         orgname.sendKeys(Keys.CONTROL+"a");
         orgname.sendKeys(Keys.DELETE);
        org.enterorgname(UtilityClass.propertiesfile("existorg"));
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();
	        
	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='organization with this name already exists.']")));
	        
	        String actual = driver.findElement(By.xpath("//div[text()='organization with this name already exists.']")).getText();
	        String expected = "organization with this name already exists.";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 14)
	public void Verify_that_an_updateorganization_with_a_numeric_city() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
         WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='City']"));
         orgname.sendKeys(Keys.CONTROL+"a");
         orgname.sendKeys(Keys.DELETE);
        org.entercity(UtilityClass.propertiesfile("numericcity"));
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();
	        
	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='City can only contain alphabetic characters, single spaces, ampersand(&), hyphen(-), and period.']")));
	        
	        String actual = driver.findElement(By.xpath("//div[text()='City can only contain alphabetic characters, single spaces, ampersand(&), hyphen(-), and period.']")).getText();
	        String expected = "City can only contain alphabetic characters, single spaces, ampersand(&), hyphen(-), and period.";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 15)
	public void Verify_that_an_updateorganization_without__city() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
         WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='City']"));
         orgname.sendKeys(Keys.CONTROL+"a");
         orgname.sendKeys(Keys.DELETE);
//        org.entercity(UtilityClass.propertiesfile("numericcity"));
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();
	        
//	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='City can only contain alphabetic characters, single spaces, ampersand(&), hyphen(-), and period.']")));
//	        
	        String actual = driver.findElement(By.xpath("//p[text()='City is required']")).getText();
	        String expected = "City is required";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 16)
	public void Verify_that_an_editorgnizationtext_in_update_orgnization_page() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
//         WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='City']"));
//         orgname.sendKeys(Keys.CONTROL+"a");
//         orgname.sendKeys(Keys.DELETE);
//        org.entercity(UtilityClass.propertiesfile("numericcity"));
	      
	        
//	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='City can only contain alphabetic characters, single spaces, ampersand(&), hyphen(-), and period.']")));
//	        
	        String actual = driver.findElement(By.xpath("//h3[text()='Edit Organization']")).getText();
	        String expected = "Edit Organization";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 17)
	public void Verify_that_an_editorgnization_page_and_click_on_cross_button() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
//         WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='City']"));
//         orgname.sendKeys(Keys.CONTROL+"a");
//         orgname.sendKeys(Keys.DELETE);
//        org.entercity(UtilityClass.propertiesfile("numericcity"));
	      
	        
//	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='City can only contain alphabetic characters, single spaces, ampersand(&), hyphen(-), and period.']")));
////	        
//	        String actual = driver.findElement(By.xpath("//h3[text()='Edit Organization']")).getText();
//	        String expected = "Edit Organization";
//	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//h5[text()=' X ']")).click();
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 18)
	public void Verify_that_orgnization_text_present_in_orgnizationpage() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
           
        String actual = driver.findElement(By.xpath("//h2[text()='Organization']")).getText();
	        String expected = "Organization";
        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	       
	        
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 19)
	public void Verify_that_update_orgnization_with_duplicate_GST_number() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
         WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='GST Number']"));
         orgname.sendKeys(Keys.CONTROL+"a");
         orgname.sendKeys(Keys.DELETE);
       org.entergst(UtilityClass.propertiesfile("alreadyexistgst"));
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();
	        
	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='organization with this gst already exists.']")));
	        
	        String actual = driver.findElement(By.xpath("//div[text()='organization with this gst already exists.']")).getText();
	        String expected = "organization with this gst already exists.";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 20)
	public void Verify_that_to_check_sr_no_column_is_present_in_orgniozation_create_page() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       String actual = driver.findElement(By.xpath("//th[text()='S. No.']")).getText();
	        String expected = "S. No.";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 21)
	public void Verify_that_to_check_orgnization_name_column_is_present_in_orgniozation_create_page() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       String actual = driver.findElement(By.xpath("//th[text()='Organization Name']")).getText();
	        String expected = "Organization Name";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 22)
	public void Verify_that_to_check_city_columnname_is_present_in_orgniozation_create_page() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       String actual = driver.findElement(By.xpath("//th[text()='City']")).getText();
	        String expected = "City";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 23)
	public void Verify_that_to_check_state_columnname_is_present_in_orgniozation_create_page() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       String actual = driver.findElement(By.xpath("//th[text()='State']")).getText();
	        String expected = "State";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 24)
	public void Verify_that_to_check_action_columnname_is_present_in_orgniozation_create_page() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	       String actual = driver.findElement(By.xpath("//th[text()='Action']")).getText();
	        String expected = "Action";
	        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 25)
	public void Verify_that_to_check_to_click_next_page_of_orgnization_page() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
	       Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[text()='Next']")).click();
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
	@Test(priority = 26)
	public void Verify_that_to_check_to_click_previous_page_of_orgnization_page() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	    	
	    	
	    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Previous']")));
	       Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[text()='Previous']")).click();
	        Thread.sleep(4000);
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll(); 
	        driver.navigate().refresh();
	    }}
}
