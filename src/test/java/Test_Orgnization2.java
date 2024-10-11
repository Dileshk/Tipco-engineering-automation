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
}
