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

import Edit_profile.Edit_profile;
import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;

public class Test_editprofile extends Base_class {
	
	Edit_profile edit;
    SoftAssert softAssert;
	@BeforeClass
	public void initializebrowser() throws IOException, InterruptedException
	{
		openbrowser();
		edit=new Edit_profile(driver);
		Thread.sleep(5000);
		edit.entermail(UtilityClass.propertiesfile("validmail"));
		edit.entpass(UtilityClass.propertiesfile("validpass"));
		Thread.sleep(3000);
		edit.clickbuttonsubmit();
	}
	@Test(priority = 20)
	public void Verify_to_check_edit_full_namefield_and_enter_valid_NAME() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         Thread.sleep(3000);
	        edit.clicksbtn();
	        Thread.sleep(3000);
	        edit.clickprofiletab();
	        Thread.sleep(3000);
//	        edit.editname(UtilityClass.propertiesfile("validfullname")) ;
	        WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Full Name ']"));
		     fullname.sendKeys(Keys.CONTROL+"a");
		     fullname.sendKeys(Keys.DELETE);
		     edit.editname(UtilityClass.propertiesfile("validfullname"));
	        Thread.sleep(3000);
//	        edit.editphone(UtilityClass.propertiesfile("validphonenum"));
	         
	        edit.submit();

	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(15));
	        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Profile Updated Successfully']")));
	        System.out.println("Overlay Gone");

	       
	        String actual = driver.findElement(By.xpath("//div[text()='Profile Updated Successfully']")).getText();
	        String expected = "Profile Updated Successfully";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Profile update message mismatch");

	    } catch (Exception e) {
	        
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        
	        softAssert.assertAll();
	    }}
	@Test(priority = 1)
	public void Verify_to_check_edit_full_namefield_and_enter_max_length_of_fullname() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         Thread.sleep(3000);
	        edit.clicksbtn();
	        Thread.sleep(3000);
	        edit.clickprofiletab();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	       
	     WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Full Name ']"));
	     fullname.sendKeys(Keys.CONTROL+"a");
	     fullname.sendKeys(Keys.DELETE);
	        edit.editname(UtilityClass.propertiesfile("maxlengthfullname")) ;
	        Thread.sleep(3000);
	       edit.editphone(UtilityClass.propertiesfile("validphonenum"));
	       Thread.sleep(2000);
	        edit.submit();
	        String actual = driver.findElement(By.xpath("//p[text()='Full Name should be between 2 to 30 characters']")).getText();
	        String expected = "Full Name should be between 2 to 30 characters";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Profile update message mismatch");
	        Thread.sleep(3000);
           driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        
	        softAssert.assertAll();
	    }}
	@Test(priority = 2)
	public void Verify_to_check_edit_full_namefield_and_enterMinimum_length_of_fullname() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    	 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         Thread.sleep(3000);
	        edit.clicksbtn();
	        Thread.sleep(3000);
	        edit.clickprofiletab();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	        Thread.sleep(3000);
	     WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Full Name ']"));
	     fullname.sendKeys(Keys.CONTROL+"a");
	     fullname.sendKeys(Keys.DELETE);
	        edit.editname(UtilityClass.propertiesfile("minlengthoffullname")) ;
	        Thread.sleep(3000);
	       edit.editphone(UtilityClass.propertiesfile("validphonenum"));
	       Thread.sleep(2000);
	        edit.submit();
	        String actual = driver.findElement(By.xpath("//p[text()='Full Name should be between 2 to 30 characters']")).getText();
	        String expected = "Full Name should be between 2 to 30 characters";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Profile update message mismatch");
	        Thread.sleep(3000);
           driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        
	        softAssert.assertAll();
	    }}
	@Test(priority = 3)
	public void Verify_to_check_edit_full_namefield_and_enter_special_charIn_fullname() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    	 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         Thread.sleep(3000);
	        edit.clicksbtn();
	        Thread.sleep(3000);
	        edit.clickprofiletab();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	        Thread.sleep(3000);
	     WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Full Name ']"));
	     fullname.sendKeys(Keys.CONTROL+"a");
	     fullname.sendKeys(Keys.DELETE);
	        edit.editname(UtilityClass.propertiesfile("specialcharinfullname")) ;
	        Thread.sleep(3000);
	       edit.editphone(UtilityClass.propertiesfile("validphonenum"));
	       Thread.sleep(2000);
	        edit.submit();
	        String actual = driver.findElement(By.xpath("//p[text()='Full Name must only contain letters and a single space between words']")).getText();
	        String expected = "Full Name must only contain letters and a single space between words";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Profile update message mismatch");
	        Thread.sleep(3000);
           driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        
	        softAssert.assertAll();
	    }}
	@Test(priority = 4)
	public void Verify_to_check_edit_full_namefield_and_enter_numericvalue_fullname() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    	 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         Thread.sleep(3000);
	        edit.clicksbtn();
	        Thread.sleep(3000);
	        edit.clickprofiletab();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	        Thread.sleep(3000);
	     WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Full Name ']"));
	     fullname.sendKeys(Keys.CONTROL+"a");
	     fullname.sendKeys(Keys.DELETE);
	        edit.editname(UtilityClass.propertiesfile("numericvalueinname")) ;
	        Thread.sleep(3000);
	       edit.editphone(UtilityClass.propertiesfile("validphonenum"));
	       Thread.sleep(2000);
	        edit.submit();
	        String actual = driver.findElement(By.xpath("//p[text()='Full Name must only contain letters and a single space between words']")).getText();
	        String expected = "Full Name must only contain letters and a single space between words";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Profile update message mismatch");
	        Thread.sleep(3000);
           driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        
	        softAssert.assertAll();
	    }}
	@Test(priority = 5)
	public void Verify_to_check_edit_profile_without_fullname_field() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    	 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         Thread.sleep(3000);
	        edit.clicksbtn();
	        Thread.sleep(3000);
	        edit.clickprofiletab();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	        Thread.sleep(3000);
	     WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Full Name ']"));
	     fullname.sendKeys(Keys.CONTROL+"a");
	     fullname.sendKeys(Keys.DELETE);
	       
	        Thread.sleep(3000);
	       edit.editphone(UtilityClass.propertiesfile("validphonenum"));
	       Thread.sleep(2000);
	        edit.submit();
	        String actual = driver.findElement(By.xpath("//p[text()='Full Name is required']")).getText();
	        String expected = "Full Name is required";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Profile update message mismatch");
	        Thread.sleep(3000);
           driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        
	        softAssert.assertAll();
	    }}
	@Test(priority = 6)
	public void Verify_to_check_edit_profile_with_invalid_email_formate() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    	 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         Thread.sleep(3000);
	        edit.clicksbtn();
	        Thread.sleep(3000);
	        edit.clickprofiletab();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	        Thread.sleep(3000);
	     WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Email address']"));
	     fullname.sendKeys(Keys.CONTROL+"a");
	     fullname.sendKeys(Keys.DELETE);
	     edit.entermail(UtilityClass.propertiesfile("invalidmailformate"));
	       Thread.sleep(3000);
	        edit.submit();
	        String actual = driver.findElement(By.xpath("//p[text()='Invalid Email. Ensure it follows the format: abc@abc.com']")).getText();
	        String expected = "Invalid Email. Ensure it follows the format: abc@abc.com";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Profile update message mismatch");
	        Thread.sleep(3000);
           driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        
	        softAssert.assertAll();
	    }}
	@Test(priority = 7)
	public void Verify_to_check_edit_profile_without_using_at_the_ratein_name_field() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    	 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         Thread.sleep(3000);
	        edit.clicksbtn();
	        Thread.sleep(3000);
	        edit.clickprofiletab();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	        Thread.sleep(3000);
	     WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Email address']"));
	     fullname.sendKeys(Keys.CONTROL+"a");
	     fullname.sendKeys(Keys.DELETE);
	     edit.entermail(UtilityClass.propertiesfile("invalidmailformate"));
	       Thread.sleep(3000);
	        edit.submit();
	        String actual = driver.findElement(By.xpath("//p[text()='Invalid Email. Ensure it follows the format: abc@abc.com']")).getText();
	        String expected = "Invalid Email. Ensure it follows the format: abc@abc.com";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Profile update message mismatch");
	        Thread.sleep(3000);
           driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        
	        softAssert.assertAll();
	    }}
	@Test(priority = 8)
	public void Verify_to_check_edit_profile_without_enter_email_field() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    	 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         Thread.sleep(3000);
	        edit.clicksbtn();
	        Thread.sleep(3000);
	        edit.clickprofiletab();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	        Thread.sleep(3000);
	     WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Email address']"));
	     fullname.sendKeys(Keys.CONTROL+"a");
	     fullname.sendKeys(Keys.DELETE);
	     
	       Thread.sleep(3000);
	        edit.submit();
	        String actual = driver.findElement(By.xpath("//p[text()='Email is required']")).getText();
	        String expected = "Email is required";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Profile update message mismatch");
	        Thread.sleep(3000);
           driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        
	        softAssert.assertAll();
	    }}
	@Test(priority = 9)
	public void Verify_to_check_edit_profile_to_entermax_length_ofemail_field_more_than_50char() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    	 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         Thread.sleep(3000);
	        edit.clicksbtn();
	        Thread.sleep(3000);
	        edit.clickprofiletab();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	        Thread.sleep(3000);
	     WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Email address']"));
	     fullname.sendKeys(Keys.CONTROL+"a");
	     fullname.sendKeys(Keys.DELETE);
	     edit.entermail(UtilityClass.propertiesfile("maxlentghofemail"));
	       Thread.sleep(3000);
	        edit.submit();
	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(40));
	
	         wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Ensure this field has no more than 50 characters.']")));
	        String actual = driver.findElement(By.xpath("//div[text()='Ensure this field has no more than 50 characters.']")).getText();
	        String expected = "Ensure this field has no more than 50 characters.";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Profile update message mismatch");
	        Thread.sleep(3000);
           driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        
	        softAssert.assertAll();
	    }}
	
	
	
	
	
	@Test(priority = 10)
	public void Verify_to_check_edit_profile_to_enter_invalid_phoneNumber() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    	 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         Thread.sleep(3000);
	        edit.clicksbtn();
	        Thread.sleep(3000);
	        edit.clickprofiletab();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	        Thread.sleep(3000);
	     WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Enter phone number']"));
	     fullname.sendKeys(Keys.CONTROL+"a");
	     fullname.sendKeys(Keys.DELETE);
	     edit.editphone(UtilityClass.propertiesfile("minlengthofph"));
	       Thread.sleep(3000);
	        edit.submit();
	       
	        String actual = driver.findElement(By.xpath("//span[text()='Invalid Mobile No.']")).getText();
	        String expected = "Invalid Mobile No.";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Profile update message mismatch");
	        Thread.sleep(3000);
           driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        
	        softAssert.assertAll();
	    }}
	@Test(priority = 11)
	public void Verify_to_check_edit_profile_without_enter_phone_number() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    	 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         Thread.sleep(3000);
	        edit.clicksbtn();
	        Thread.sleep(3000);
	        edit.clickprofiletab();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	        Thread.sleep(3000);
	     WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Enter phone number']"));
	     fullname.sendKeys(Keys.CONTROL+"a");
	     fullname.sendKeys(Keys.DELETE);
	    
	       Thread.sleep(3000);
	        edit.submit();
	       
	        String actual = driver.findElement(By.xpath("//span[text()='Field cannot be empty']")).getText();
	        String expected = "Field cannot be empty";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Profile update message mismatch");
	        Thread.sleep(3000);
           driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        
	        softAssert.assertAll();
	    }}
	@Test(priority = 12)
	public void Verify_to_get_text_of_edit_profile_page() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    	 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         Thread.sleep(3000);
	        edit.clicksbtn();
	        Thread.sleep(3000);
	        edit.clickprofiletab();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	        Thread.sleep(3000);
	        edit.submit();
	       
	        String actual = driver.findElement(By.xpath("//h3[text()='Profile']")).getText();
	        String expected = "Profile";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Profile update message mismatch");
	        Thread.sleep(3000);
           driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        
	        softAssert.assertAll();
	    }}
	@Test(priority = 13)
	public void Verify_to_close_popup_to_click_on_cross_button_of_the_popup() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    	 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         Thread.sleep(3000);
	        edit.clicksbtn();
	        Thread.sleep(3000);
	        edit.clickprofiletab();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	        Thread.sleep(3000);
	       
	       
	        
	        		driver.findElement(By.xpath("//h5[text()=' X ']")).click();
	        Thread.sleep(3000);
           driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        
	        softAssert.assertAll();
	    }}
	@Test(priority = 14)
	public void Verify_to_check_select_other_country_code_and_enter_invalid_phone() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    	 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         Thread.sleep(3000);
	        edit.clicksbtn();
	        Thread.sleep(3000);
	        edit.clickprofiletab();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//div[@class='flag-dropdown ']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[text()='Honduras']")).click();
	     WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Enter phone number']"));
	     fullname.sendKeys(Keys.CONTROL+"a");
	     fullname.sendKeys(Keys.DELETE);
	     edit.editphone(UtilityClass.propertiesfile("minlengthofph"));
	       Thread.sleep(3000);
	        edit.submit();
	       
	        String actual = driver.findElement(By.xpath("//span[text()='Field cannot be empty']")).getText();
	        String expected = "Field cannot be empty";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Profile update message mismatch");
	        Thread.sleep(3000);
           driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        
	        softAssert.assertAll();
	    }}//changes hone wale hai iske uper
	@Test(priority = 15)
	public void Verify_toupdate_profile_with_all_valid_data() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    	 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         Thread.sleep(3000);
	        edit.clicksbtn();
	        Thread.sleep(3000);
	        edit.clickprofiletab();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
	        Thread.sleep(3000);
	        edit.submit();
	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
	        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Profile Updated Successfully']")));
	        System.out.println("Overlay Gone");

	       
	        String actual = driver.findElement(By.xpath("//div[text()='Profile Updated Successfully']")).getText();
	        String expected = "Profile Updated Successfully";
	        System.out.println("dhkjfh" + actual);
	        softAssert.assertEquals(actual, expected, "Profile update message mismatch");
	        
	        		
	        Thread.sleep(3000);
           driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        
	        softAssert.assertAll();
	    }}

}
