

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;

import tipcologin.Loginpage;



public class TesttipcoLogin extends Base_class {
	  Loginpage log;
	    SoftAssert softAssert;
	   
	    @BeforeClass
	    public void initialise() throws IOException {
	    	  
	        openbrowser();
	        log = new Loginpage(driver);
	    
	    }
	    
	    @Test(priority = 20)
	    public void Verify_to_login_with_invalidmail_and_password() {
	        softAssert = new SoftAssert(); 
	        try {
	            Thread.sleep(3000);
	            log.entermail(UtilityClass.propertiesfile("invalidmail"));
	            log.entpass(UtilityClass.propertiesfile("invalidpass"));
	            log.clickbutton();
	            Thread.sleep(4000);
	            
	            String expected = "Invalid email format";
	            String actual = driver.findElement(By.xpath("//p[text()='Invalid email format']")).getText();
	            softAssert.assertEquals(actual, expected, "The error message for invalid email format is incorrect.");
	            
	            Thread.sleep(4000);
	            driver.navigate().refresh();
	        } catch (Exception e) {
	            softAssert.fail("Exception occurred: " + e.getMessage());
	        } finally {
	            softAssert.assertAll(); 
	        }
	    }
	    
	    @Test(priority = 21)
	    public void verify_to_login_with_valid_mail_and_Password() {
	        softAssert = new SoftAssert(); 
	        try {
	            Thread.sleep(5000);
	            log.entermail(UtilityClass.propertiesfile("validmail"));
	            log.entpass(UtilityClass.propertiesfile("validpass"));
	            Thread.sleep(3000);
	            log.clickbutton();
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	       
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mainLogo']")));
	            System.out.println("Overlay Gone");
	            
	            WebElement logo = driver.findElement(By.xpath("//span[@class='mainLogo']"));
	            softAssert.assertTrue(logo.isDisplayed(), "The logo is not displayed after login.");
	        } catch (Exception e) {
	            softAssert.fail("Exception occurred: " + e.getMessage());
	        } finally {
	            softAssert.assertAll(); 
	        }
	    }
	    
	    @Test(priority = 1)
	    public void Verify_that_not_able_to_Login_with_incorrect_password() {
	        softAssert = new SoftAssert(); 
	        try {
	            Thread.sleep(9000);
	            log.entermail(UtilityClass.propertiesfile("validmail"));
	            log.entpass(UtilityClass.propertiesfile("invalidpass"));
	            Thread.sleep(1000);
	            log.clickbutton();
	            
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	           
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Incorrect Password']")));
	            System.out.println("Overlay Gone");
	            
	            String actual = driver.findElement(By.xpath("//div[text()='Incorrect Password']")).getText();
	            String expected = "Incorrect Password";
	            softAssert.assertEquals(actual, expected, "The error message for incorrect password is incorrect.");
	            Thread.sleep(4000);
	            driver.navigate().refresh();
	        } catch (Exception e) {
	            softAssert.fail("Exception occurred: " + e.getMessage());
	        } finally {
	            softAssert.assertAll(); 
	        }
	    }
	    
	    @Test(priority = 2)
	    public void Verify_that_not_able_to_login_with_unregisterdmail() {
	        softAssert = new SoftAssert(); 
	        try {
	           
	            log.entermail(UtilityClass.propertiesfile("unregisterdmail"));
	            log.entpass(UtilityClass.propertiesfile("validpass"));
	            Thread.sleep(3000);
	            log.clickbutton();
	            
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	           
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='Toastify']/div/div/div/div)[2]")));
	            System.out.println("Overlay Gone");
	            
	            String expected = "We can't find an account with this email. Try another email address, or if you don't have an account, Kindly contact admin.";
	            String actual = driver.findElement(By.xpath("(//div[@class='Toastify']/div/div/div/div)[2]")).getText();
	            softAssert.assertEquals(actual, expected, "The error message for unregistered email is incorrect.");
	            Thread.sleep(5000);
	            driver.navigate().refresh();
	        } catch (Exception e) {
	            softAssert.fail("Exception occurred: " + e.getMessage());
	        } finally {
	            softAssert.assertAll();
	        }
	    }
	    
	    @Test(priority = 3)
	    public void Verify_to_signin_with_blank_mail_and_passwordfield() {
	        softAssert = new SoftAssert();
	        try {
	           
	            Thread.sleep(9000);
	            log.clickbutton();
	            Thread.sleep(3000);
	            Thread.sleep(3000);
	            driver.navigate().refresh();
	            
	            
	        } catch (Exception e) {
	            softAssert.fail("Exception occurred: " + e.getMessage());
	        } finally {
	            softAssert.assertAll(); 
	        }
	    }
	    
	    @Test(priority = 4)
	    public void Verify_to_login_with_validmail_and_blankpass() throws IOException, InterruptedException {
	    	int TCID=4;
	        softAssert = new SoftAssert(); 
	        try {
	           
	            Thread.sleep(3000);
	            log.entermail(UtilityClass.propertiesfile("validmail"));
	            log.clickbutton();
	            Thread.sleep(3000);
	            
	            String expected = "Password is required";
	            String actual = driver.findElement(By.xpath("//p[text()='Password is required']")).getText();
	            softAssert.assertEquals(actual, expected, "The error message for blank password is incorrect.");
	            
	            Thread.sleep(5000);
	            driver.navigate().refresh();
	        } catch (Exception e) {
	            softAssert.fail("Exception occurred: " + e.getMessage());
	            Thread.sleep(3000);
	            UtilityClass.take(driver, TCID);
	        } finally {
	            softAssert.assertAll(); 
	        }
	    }
	    
	    @Test(priority = 5)
	    public void verify_to_login_with_blankmail_and_valid_password() {
	        softAssert = new SoftAssert(); 
	        try {
	            Thread.sleep(4000);
	            log.entpass(UtilityClass.propertiesfile("validpass"));
	           
	            log.clickbutton();
	            
	            String expected = "Email is required";
	            String actual = driver.findElement(By.xpath("//p[text()='Email is required']")).getText();
	            softAssert.assertEquals(actual, expected, "The error message for blank email is incorrect.");
	            
	            Thread.sleep(4000);
	            driver.navigate().refresh();
	        } catch (Exception e) {
	            softAssert.fail("Exception occurred: " + e.getMessage());
	        } finally {
	            softAssert.assertAll();
	        }
	    }

 
	  
	    
	   
	    
	   
	    
	    //verify to enter wrong mail
	    //verify to enter without domain
	//check to take blank mail field
	    //enter unregisterd mail in forgott password
	    @Test(priority = 6)
	    public void verify_to_validmail_and_space_in_password_field() {
	        softAssert = new SoftAssert(); 
	        try {
	            Thread.sleep(4000);
	            log.entermail(UtilityClass.propertiesfile("validmail"));
	            log.entpass(UtilityClass.propertiesfile("passwithspace"));
	           
	            log.clickbutton();
	            
	            String expected = "Password must not contain spaces";
	            String actual = driver.findElement(By.xpath("//p[text()='Password must not contain spaces']")).getText();
	            softAssert.assertEquals(actual, expected, "The error message for blank email is incorrect.");
	            
	            Thread.sleep(4000);
	            driver.navigate().refresh();
	        } catch (Exception e) {
	            softAssert.fail("Exception occurred: " + e.getMessage());
	        } finally {
	            softAssert.assertAll();
	        }
	    }
	    @Test(priority = 7)
	    public void verify_to_check_that_Sign_in_text_is_present_at_signin_page() {
	        softAssert = new SoftAssert(); 
	        try {
	        	  
		            String actual = driver.findElement(By.xpath("//h2[text()='Sign in']")).getText();
		            String expected = "Sign in";
		            softAssert.assertEquals(actual, expected);
	            Thread.sleep(4000);
	            driver.navigate().refresh();
	        } catch (Exception e) {
	            softAssert.fail("Exception occurred: " + e.getMessage());
	        } finally {
	            softAssert.assertAll();
	        }
	    }
	    @Test(priority = 8)
	    public void verify_to_check_that_the_tipcoengineeing_logo_is_present_at_signin_page() {
	        softAssert = new SoftAssert(); 
	        try {
	        	  
		            WebElement actual = driver.findElement(By.xpath("//img[@alt='logo img']"));
		           softAssert.assertTrue(actual.isDisplayed());
		            
	            Thread.sleep(4000);
	            driver.navigate().refresh();
	        } catch (Exception e) {
	            softAssert.fail("Exception occurred: " + e.getMessage());
	        } finally {
	            softAssert.assertAll();
	        }
	    }
	    @Test(priority = 9)
	    public void verify_to_check_click_on_password_visibility_button() {
	        softAssert = new SoftAssert(); 
	        try {
	        	  
		           log.entermail(UtilityClass.propertiesfile("validmail"));
		           log.entpass(UtilityClass.propertiesfile("validpass"));
		           Thread.sleep(3000);
		           driver.findElement(By.xpath("//span[@class='password_eye']")).click();
		            
	            Thread.sleep(4000);
	            driver.navigate().refresh();
	        } catch (Exception e) {
	            softAssert.fail("Exception occurred: " + e.getMessage());
	        } finally {
	            softAssert.assertAll();
	        }
	    }
	    @Test(priority = 10)
	    public void verify_to_check_click_on_forgott_password_button_and_redirect_on_foergott_password_page() {
	        softAssert = new SoftAssert(); 
	        try {
	        	  
		          driver.findElement(By.xpath("//span[text()='Forgot Password ?']")).click();
		          Thread.sleep(4000);
		        WebElement text = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
		        softAssert.assertTrue(text.isDisplayed());
	            Thread.sleep(4000);
	            driver.navigate().refresh();
	        } catch (Exception e) {
	            softAssert.fail("Exception occurred: " + e.getMessage());
	        } finally {
	            softAssert.assertAll();
	        }
	    }
	    @Test(priority = 11)
	    public void verify_to_check_the_forgot_password_text_is_present_on_forgot_password_page() {
	        softAssert = new SoftAssert(); 
	        try {
	        	 Thread.sleep(4000);
		          driver.findElement(By.xpath("//span[text()='Forgot Password ?']")).click();
		          Thread.sleep(4000);
		        String text = driver.findElement(By.xpath("//h2[text()='Forgot Password']")).getText();
		        String expected="Forgot Password";
		        softAssert.assertEquals(text, expected);
	            Thread.sleep(4000);
	            driver.navigate().refresh();
	        } catch (Exception e) {
	            softAssert.fail("Exception occurred: " + e.getMessage());
	        } finally {
	            softAssert.assertAll();
	        }
	    }
	    @Test(priority = 12)
	    public void verify_to_check_click_on_forgot_password_and_then_click_on_cancel() {
	        softAssert = new SoftAssert(); 
	        try {
	        	 Thread.sleep(4000);
		          driver.findElement(By.xpath("//span[text()='Forgot Password ?']")).click();
		          Thread.sleep(4000);
		          driver.findElement(By.xpath("//button[text()='Cancel']")).click();
//		        String text = driver.findElement(By.xpath("//h2[text()='Forgot Password']")).getText();
//		        String expected="Forgot Password";
//		        softAssert.assertEquals(text, expected);
	            Thread.sleep(4000);
	            driver.navigate().refresh();
	        } catch (Exception e) {
	            softAssert.fail("Exception occurred: " + e.getMessage());
	        } finally {
	            softAssert.assertAll();
	        }
	    }
	    
	    //verify to enter wrong mail
	    //verify to enter without domain
	//check to take blank mail field
	    //enter unregisterd mail in forgott password
	    @Test(priority = 13)
	    public void verify_to_check_and_invalid_mail_in_forgot_password_field() {
	        softAssert = new SoftAssert(); 
	        try {
	        	 Thread.sleep(4000);
		          driver.findElement(By.xpath("//span[text()='Forgot Password ?']")).click();
		          Thread.sleep(4000);
		         driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tipco@.com");
		        
		         Thread.sleep(3000);
		        driver.findElement(By.xpath("//button[text()='Submit']")).click();
		        Thread.sleep(3000);
		        String text = driver.findElement(By.xpath("//p[text()='Email is invalid']")).getText();
		        String expected="Email is invalid";
		        softAssert.assertEquals(text, expected);
	            Thread.sleep(4000);
	            driver.navigate().refresh();
	        } catch (Exception e) {
	            softAssert.fail("Exception occurred: " + e.getMessage());
	        } finally {
	            softAssert.assertAll();
	        }
	    }
	    @Test(priority = 14)
	    public void verify_to_check_mail_field_take_blank_and_see_valid_error_message() {
	        softAssert = new SoftAssert(); 
	        try {
	        	 Thread.sleep(4000);
		          driver.findElement(By.xpath("//span[text()='Forgot Password ?']")).click();
		          Thread.sleep(4000);
		        driver.findElement(By.xpath("//button[text()='Submit']")).click();
		        Thread.sleep(3000);
		        String text = driver.findElement(By.xpath("//p[text()='Email is required']")).getText();
		        String expected="Email is required";
		        softAssert.assertEquals(text, expected);
	            Thread.sleep(4000);
	            driver.navigate().refresh();
	        } catch (Exception e) {
	            softAssert.fail("Exception occurred: " + e.getMessage());
	        } finally {
	            softAssert.assertAll();
	        }
	    }
	    @Test(priority = 15)
	    public void verify_to_check_tipco_enginnering_logo_is_present_at_forgot_password_page() {
	        softAssert = new SoftAssert(); 
	        try {
	        	 Thread.sleep(4000);
		          driver.findElement(By.xpath("//span[text()='Forgot Password ?']")).click();
		          Thread.sleep(4000);
		      WebElement text = driver.findElement(By.xpath("//img[@alt='logo img']"));
		       softAssert.assertTrue(text.isDisplayed());
	            Thread.sleep(4000);
	            driver.navigate().refresh();
	        } catch (Exception e) {
	            softAssert.fail("Exception occurred: " + e.getMessage());
	        } finally {
	            softAssert.assertAll();
	        }
	    }
	    }