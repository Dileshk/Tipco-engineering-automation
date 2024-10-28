import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Create_Supervisor.Supervisor;
import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;

public class Test_Supervisor_from_supervisor extends Base_class{
	Supervisor sup;
	SoftAssert softAssert;
	@BeforeClass
	public void initializebrowser() throws IOException, InterruptedException
	{
		openbrowser();
		sup=new Supervisor(driver);
		Thread.sleep(8000);
		sup.entermail(UtilityClass.propertiesfile("supmail"));
		sup.entpass(UtilityClass.propertiesfile("passsup"));
		sup.clickbuttonsubmit();
	
	}
	@Test(priority = 50)
    public void Create_Supervisor_with_valid_email() throws IOException {
    	
         softAssert = new SoftAssert();
        try {
        	String randomEmail = generateRandomEmail();
            String randomPhoneNumber = generateRandomPhoneNumber();
        	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
        	wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
	        Thread.sleep(1000);
            sup.addbtnsupervisor();
            Thread.sleep(3000);
            sup.entersupermail(randomEmail);
            sup.entername(UtilityClass.propertiesfile("namesupervisor"));
            sup.enterphonenumber(randomPhoneNumber);
//            driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[2]")).click();
//            sup.sendkey();
//            Thread.sleep(2000);
//            sup.clickexternbtn();
            Thread.sleep(3000);
            sup.clickonsubmitbutton();
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Successfully Registered']")));
            System.out.println("Overlay Gone");
            
            String actual = driver.findElement(By.xpath("//div[text()='Successfully Registered']")).getText();
            String expected = "Successfully Registered";
            System.out.println("dhkjfh" + actual);
            
            softAssert.assertEquals(actual, expected);
        } catch (Exception e) {
            
            softAssert.fail("Exception  " + e.getMessage());
        } finally {
            softAssert.assertAll();  
        }
    }
	 private String generateRandomEmail() {
	        String emailDomain = "@example.com";
	        String emailPrefix = "user" + new Random().nextInt(10000);
	        return emailPrefix + emailDomain;
	    }

	    // Method to generate a random 10-digit phone number
	    private String generateRandomPhoneNumber() {
	        Random rand = new Random();
	        StringBuilder phoneNumber = new StringBuilder("9"); // Start with 9
	        for (int i = 0; i < 9; i++) {
	            phoneNumber.append(rand.nextInt(10));
	        }
	        return phoneNumber.toString();
	    }
    @Test(priority = 1)
    public void verify_that_createSupervisor_with_invalid_email() {
         softAssert = new SoftAssert();
        try {

        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
           
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	       Thread.sleep(2000);
	       sup.clicksbtn();
            Thread.sleep(2000);
            sup.clicksuper();
            WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
            wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
            Thread.sleep(3000);
            sup.addbtnsupervisor();
            Thread.sleep(4000);
            sup.entersupermail(UtilityClass.propertiesfile("invalidsuperviosrmail"));
            sup.entername(UtilityClass.propertiesfile("namesupervisor"));
            sup.enterphonenumber(UtilityClass.propertiesfile("numsuperviosr"));
//            driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[2]")).click();
//            sup.sendkey();
//            sup.clickexternbtn();
            sup.clickonsubmitbutton();
            Thread.sleep(2000);
            
            String expected = "Invalid Email. Ensure it follows the format: abc@abc.com";
            String actual = driver.findElement(By.xpath("//p[text()='Invalid Email. Ensure it follows the format: abc@abc.com']")).getText();
            
            softAssert.assertEquals(actual, expected);
            Thread.sleep(5000);
            driver.navigate().refresh();
        } catch (Exception e) {
            
            softAssert.fail("Exception  " + e.getMessage());
        } finally {
            softAssert.assertAll();  
        }
    }

    @Test(priority = 2)
    public void Verify_that_the_full_name_field_does_not_accept_numeric_or_special_characters_accept_only_character() {
        softAssert = new SoftAssert();
        try {
        	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
        	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
 	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
             Thread.sleep(1000);
            sup.addbtnsupervisor();
            Thread.sleep(3000);
            sup.entermail(UtilityClass.propertiesfile("validsupervisor"));
            sup.entername(UtilityClass.propertiesfile("supervisornamewithnumericandspecialchar"));
            sup.enterphonenumber(UtilityClass.propertiesfile("numsuperviosr"));
//            driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[2]")).click();
//            sup.sendkey();
//            Thread.sleep(2000);
//            sup.clickexternbtn();
            sup.clickonsubmitbutton();
            
            String expected = "Full Name must only contain letters and a single space between words";
            String actual = driver.findElement(By.xpath("//p[text()='Full Name must only contain letters and a single space between words']")).getText();
            
            softAssert.assertEquals(actual, expected);
            Thread.sleep(5000);
            driver.navigate().refresh();
        } catch (Exception e) {
           
            softAssert.fail("Exception " + e.getMessage());
        } finally {
            softAssert.assertAll();  
        }}
//    
    @Test(priority = 3)
    public void Verify_that_the_email_field_is_mandatory_and_displays_an_error_message_when_left_empty() {
        softAssert = new SoftAssert();
        try {
        	
        	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
        	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
 	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
             Thread.sleep(1000);
            
            sup.addbtnsupervisor();
            Thread.sleep(3000);
           
            sup.entername(UtilityClass.propertiesfile("namesupervisor"));
            sup.enterphonenumber(UtilityClass.propertiesfile("numsuperviosr"));
//            driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[2]")).click();
//            sup.sendkey();
//            Thread.sleep(2000);
//            sup.clickexternbtn();
            sup.clickonsubmitbutton();
            
            String expected = "Email is required";
            String actual = driver.findElement(By.xpath("//p[text()='Email is required']")).getText();
            
            softAssert.assertEquals(actual, expected);
            Thread.sleep(5000);
            driver.navigate().refresh();
        } catch (Exception e) {
           
            softAssert.fail("Exception " + e.getMessage());
        } finally {
            softAssert.assertAll();  
        }}
	
    @Test(priority = 4)
    public void Verify_that_the_full_name_field_is_mandatory_and_displays_an_error_message_when_left_empty() {
        softAssert = new SoftAssert();
        try {
        	
        	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
        	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
 	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
             Thread.sleep(1000);
            
            sup.addbtnsupervisor();
            Thread.sleep(3000);
           
            sup.entermail(UtilityClass.propertiesfile("validsupervisor"));
            sup.enterphonenumber(UtilityClass.propertiesfile("numsuperviosr"));
//            driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[2]")).click();
//            sup.sendkey();
//           
//            sup.clickexternbtn();
            sup.clickonsubmitbutton();
            
            String expected = "Full Name is required";
            String actual = driver.findElement(By.xpath("//p[text()='Full Name is required']")).getText();
            
            softAssert.assertEquals(actual, expected);
            Thread.sleep(5000);
            driver.navigate().refresh();
        } catch (Exception e) {
           
            softAssert.fail("Exception " + e.getMessage());
        } finally {
            softAssert.assertAll();  
        }}
//    @Test(priority = 5)
//    public void Verify_that_the_mobile_number_field_accepts_numeric() {
//        softAssert = new SoftAssert();
//        try {
//        	
//          Thread.sleep(3000);
//            
//            sup.addbtnsupervisor();
//            Thread.sleep(3000);
//           
//            sup.entermail(UtilityClass.propertiesfile("checkphonmail"));
//            sup.entername(UtilityClass.propertiesfile("namesupervisor"));
//            sup.enterphonenumber(UtilityClass.propertiesfile("checkvalidphone"));
//            sup.sendkey();
//            Thread.sleep(2000);
//            sup.clickexternbtn();
//            sup.clickonsubmitbutton();
//            
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Successfully Registered']")));
//         System.out.println("Overlay Gone");
//            
//            String expected = "Successfully Registered";
//            String actual = driver.findElement(By.xpath("//div[text()='Successfully Registered']")).getText();
//            
//            softAssert.assertEquals(actual, expected);
//            Thread.sleep(4000);
//            driver.navigate().refresh();
//        } catch (Exception e) {
//           
//            softAssert.fail("Exception " + e.getMessage());
//        } finally {
//            softAssert.assertAll();  
//        }}
    @Test(priority = 6)
    public void Verify_that_the_mobile_number_field_does_not_accept_alphabetic_or_special_characters() {
        softAssert = new SoftAssert();
        try {
        	
        	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
        	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
 	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
             Thread.sleep(1000);
            
            sup.addbtnsupervisor();
            Thread.sleep(3000);
           
            sup.entermail(UtilityClass.propertiesfile("validsupervisor"));
            sup.entername(UtilityClass.propertiesfile("namesupervisor"));
            sup.enterphonenumber(UtilityClass.propertiesfile("numfieldwithalphaspecial"));
//            driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[2]")).click();
//            sup.sendkey();
//            Thread.sleep(2000);
//            sup.clickexternbtn();
            sup.clickonsubmitbutton();
            
            String expected = "Field cannot be empty";
            String actual = driver.findElement(By.xpath("//span[text()='Field cannot be empty']")).getText();
            
            softAssert.assertEquals(actual, expected);
            Thread.sleep(5000);
            driver.navigate().refresh();
        } catch (Exception e) {
           
            softAssert.fail("Exception " + e.getMessage());
        } finally {
            softAssert.assertAll();  
        }}
    
//	badme karna hai aryan ko bta diya is error pe loader chal raha contineo
	
    @Test(priority = 7)
    public void Verify_that_the_mobile_number_field_accepts_different_formats_based_on_the_selected_country_code() throws InterruptedException, IOException {
        
    	
        	
    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
         Thread.sleep(1000);
            
            sup.addbtnsupervisor();
            Thread.sleep(3000);
           
            sup.entermail(UtilityClass.propertiesfile("validsupervisor"));
            sup.entername(UtilityClass.propertiesfile("namesupervisor"));
           
           
            driver.findElement(By.xpath("//div[@class='selected-flag']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[text()='Iceland']")).click();
//            driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[2]")).click();
//            sup.sendkey();
//            Thread.sleep(2000);
//            sup.clickexternbtn();
            Thread.sleep(5000);
            driver.navigate().refresh();
            
           
         }
    @Test(priority = 8)
    public void Verify_that_the_user_can_type_in_the_mobile_number_after_selecting_the_country_code() throws InterruptedException, IOException {
        
    	
        	
    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
         Thread.sleep(1000);
            
            sup.addbtnsupervisor();
            Thread.sleep(3000);
           
            sup.entermail(UtilityClass.propertiesfile("validsupervisor"));
            sup.entername(UtilityClass.propertiesfile("namesupervisor"));
           
           
            driver.findElement(By.xpath("//div[@class='selected-flag']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[text()='Iceland']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Enter phone number']")).sendKeys("9673568610");
//            driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[2]")).click();
//            sup.sendkey();
//            
//            sup.clickexternbtn();
            Thread.sleep(5000);
            driver.navigate().refresh();
            
           
         }
    @Test(priority = 9)
    public void Verify_that_the_organization_name_field_is_disabled_from_supervisorside() throws InterruptedException, IOException {
        
    	
        	
    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
         Thread.sleep(1000);
            
            sup.addbtnsupervisor();
            Thread.sleep(3000);
           
            sup.entermail(UtilityClass.propertiesfile("validsupervisor"));
            sup.entername(UtilityClass.propertiesfile("namesupervisor"));
           
           
            sup.enterphonenumber(UtilityClass.propertiesfile("numsuperviosr"));
          WebElement orglist = driver.findElement(By.xpath("//input[@placeholder='Please Select Organization']"));
          softAssert.assertFalse(orglist.isEnabled());
            Thread.sleep(5000);
            driver.navigate().refresh();
            
           
         }
//    @Test(priority = 10)
//    public void Verify_that_the_user_can_type_and_select_an_organization_name_if_it_is_not_listed_in_the_dropdown() {
//        softAssert = new SoftAssert();
//        try {
//        	
//        	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
//        	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
// 	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
//             Thread.sleep(1000);
//            
//            sup.addbtnsupervisor();
//            Thread.sleep(3000);
//           
//            sup.entermail(UtilityClass.propertiesfile("validsupervisor"));
//            sup.entername(UtilityClass.propertiesfile("namesupervisor"));
//            sup.enterphonenumber(UtilityClass.propertiesfile("numsuperviosr"));
//            driver.findElement(By.xpath("//input[@placeholder='Please Select Organization']")).sendKeys("xxxx");
//           
//            String expected = "No data found";
//            String actual = driver.findElement(By.xpath("//p[text()='No data found']")).getText();
//            
//            softAssert.assertEquals(actual, expected);
//            Thread.sleep(5000);
//            driver.navigate().refresh();
//        } catch (Exception e) {
//           
//            softAssert.fail("Exception " + e.getMessage());
//        } finally {
//            softAssert.assertAll();  
//        }}
//    
    @Test(priority = 11)
    public void Verify_that_an_error_message_is_displayed_if_the_save_button_is_clicked_when_mandatory_fields_are_not_filled() {
        softAssert = new SoftAssert();
        try {
        	
        	Thread.sleep(3000);
        
        	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
        	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
 	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
             Thread.sleep(1000);
            sup.addbtnsupervisor();
//            Thread.sleep(3000);
//           
//            sup.entermail(UtilityClass.propertiesfile("validsupervisor"));
//            sup.enterphonenumber(UtilityClass.propertiesfile("numsuperviosr"));
//            driver.findElement(By.xpath("//input[@placeholder='Please Select Organization']")).sendKeys("xxxx");
            sup.clickonsubmitbutton();
            String expected = "Email is required";
            String actual = driver.findElement(By.xpath("//p[text()='Email is required']")).getText();
            
            softAssert.assertEquals(actual, expected);
            Thread.sleep(5000);
            driver.navigate().refresh();
        } catch (Exception e) {
           
            softAssert.fail("Exception " + e.getMessage());
        } finally {
            softAssert.assertAll();  
        }}
    @Test(priority = 12)
  public void Verify_the_maximum_and_minimum_length_of_the_full_name() {
       softAssert = new SoftAssert();
      try {

    	  WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
    	  wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
          Thread.sleep(1000);
         sup.addbtnsupervisor();
         Thread.sleep(1000);
          sup.entersupermail(UtilityClass.propertiesfile("validsupervisor"));
          sup.entername(UtilityClass.propertiesfile("maxlengthofsup"));
          sup.enterphonenumber(UtilityClass.propertiesfile("numsuperviosr"));
//          driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[2]")).click();
//          sup.sendkey();
//          sup.clickexternbtn();
          sup.clickonsubmitbutton();
          Thread.sleep(2000);
          
         
          String actual = driver.findElement(By.xpath("//p[text()='Full Name should be between 2 to 30 characters']")).getText();
          String expected = "Full Name should be between 2 to 30 characters"; 
          softAssert.assertEquals(actual, expected);
          Thread.sleep(5000);
          driver.navigate().refresh();
      } catch (Exception e) {
          
          softAssert.fail("Exception  " + e.getMessage());
      } finally {
          softAssert.assertAll();  
          }
      }
      @Test(priority = 13)
      public void Verify_the_maximum_and_minimum_length_of_the_mobile_number_for_each_country_code() {
           softAssert = new SoftAssert();
          try {
        	  WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
        	  wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
  	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
              Thread.sleep(1000);
              sup.addbtnsupervisor();
              Thread.sleep(4000);
              sup.entersupermail(UtilityClass.propertiesfile("validsupervisor"));
              sup.entername(UtilityClass.propertiesfile("namesupervisor"));
              sup.enterphonenumber(UtilityClass.propertiesfile("minlengthofphon"));
//              driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[2]")).click();
//              sup.sendkey();
//              sup.clickexternbtn();
              sup.clickonsubmitbutton();
              Thread.sleep(2000);
              
              String expected = "Invalid Mobile No.";
              String actual = driver.findElement(By.xpath("//span[text()='Invalid Mobile No.']")).getText();
              
              softAssert.assertEquals(actual, expected);
              Thread.sleep(5000);
              driver.navigate().refresh();
          } catch (Exception e) {
              
              softAssert.fail("Exception  " + e.getMessage());
          } finally {
              softAssert.assertAll();  
          }
          }
          @Test(priority = 14)
        public void Enter_an_email_without_a_domain_and_verify_that_an_error_message_is_displayed() {
             softAssert = new SoftAssert();
            try {
              
            	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
            	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
     	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
                 Thread.sleep(1000);
                sup.addbtnsupervisor();
                Thread.sleep(4000);
                sup.entersupermail(UtilityClass.propertiesfile("supmailwithoutdomain"));
                sup.entername(UtilityClass.propertiesfile("namesupervisor"));
                sup.enterphonenumber(UtilityClass.propertiesfile("numsuperviosr"));
//                driver.findElement(By.xpath("(//span[@class='dropDownIcon'])[2]")).click();
//                sup.sendkey();
//                Thread.sleep(7000);
               
//              WebElement text = driver.findElement(By.xpath("//input[@placeholder='Please Select Organization']"));
//              text.sendKeys(Keys.DELETE);
//              Thread.sleep(3000);
//              driver.findElement(By.xpath("//input[@placeholder='Please Select Organization']")).sendKeys("ex");
//              Thread.sleep(3000);
//              sup.clickexternbtn();
//              Thread.sleep(2000);
                sup.clickonsubmitbutton();
                Thread.sleep(2000);
                
                String expected = "Invalid Email. Ensure it follows the format: abc@abc.com";
                String actual = driver.findElement(By.xpath("//p[text()='Invalid Email. Ensure it follows the format: abc@abc.com']")).getText();
                
                softAssert.assertEquals(actual, expected);
                Thread.sleep(7000);
                driver.navigate().refresh();
            } catch (Exception e) {
                
                softAssert.fail("Exception  " + e.getMessage());
            } finally {
                softAssert.assertAll();  
            }
  }
	@Test(priority = 15)
	public void Verify_to_check_and_click_on_next_page_button_of_supervisor() throws InterruptedException
	{
//		Thread.sleep(30000);
//      sup.clicksbtn();
//      Thread.sleep(4000);
//      sup.clicksuper();
		 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
		 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
   Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Next']")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
  @Test(priority = 16)
  public void check_to_update_supervisor_without_select_orgnization_name ()
  {
	  softAssert = new SoftAssert();
    try {
    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
      Thread.sleep(3000);
       sup.clickonupdate();
//     WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='Please Select Organization']"));
//     Thread.sleep(2000);
//     orgname.sendKeys(Keys.CONTROL+"a");
//     orgname.sendKeys(Keys.DELETE);
       WebElement orglist = driver.findElement(By.xpath("//input[@placeholder='Please Select Organization']"));
       softAssert.assertFalse(orglist.isEnabled());
     Thread.sleep(3000);
        sup.clickonsubmitbutton();
      
        Thread.sleep(5000);
        driver.navigate().refresh();
    } catch (Exception e) {
        
        softAssert.fail("Exception  " + e.getMessage());
    } finally {
        softAssert.assertAll();  
    }
  }
	 @Test(priority = 17)
	  public void check_and_update_superviaor_without_using_attherate ()
	  {
		  softAssert = new SoftAssert();
	    try {
	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
  	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
		
		  Thread.sleep(3000);
	       sup.clickonupdate();
	     WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='Email address']"));
	     Thread.sleep(2000);
	     orgname.sendKeys(Keys.CONTROL+"a");
	     orgname.sendKeys(Keys.DELETE);
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("name.com");
	       
	     Thread.sleep(3000);
	        sup.clickonsubmitbutton();
	       
	        String expected = "Invalid Email. Ensure it follows the format: abc@abc.com";
	        String actual = driver.findElement(By.xpath("//p[text()='Invalid Email. Ensure it follows the format: abc@abc.com']")).getText();
	        
	        softAssert.assertEquals(actual, expected);
	        Thread.sleep(5000);
	        driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("Exception  " + e.getMessage());
	    } finally {
	        softAssert.assertAll();  
	    }
	  }
	 @Test(priority = 18)
	  public void check_to_update_supervisor_without_enter_mandatory_field ()
	  {
		  softAssert = new SoftAssert();
	    try {
	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
  	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
		  Thread.sleep(2000);
	       sup.clickonupdate();
	     WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='Full Name ']"));
	     Thread.sleep(2000);
	     orgname.sendKeys(Keys.CONTROL+"a");
	     orgname.sendKeys(Keys.DELETE);
	     Thread.sleep(2000);
	     sup.clickonsubmitbutton();
	       
	        String expected = "Full Name is required";
	        String actual = driver.findElement(By.xpath("//p[text()='Full Name is required']")).getText();
	        
	        softAssert.assertEquals(actual, expected);
	        Thread.sleep(5000);
	        driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("Exception  " + e.getMessage());
	    } finally {
	        softAssert.assertAll();  
	    }
	  }
	 @Test(priority = 19)
	  public void Verify_to_update_supervisor_with_max_char_in_full_name_field   ()
	  {
		  softAssert = new SoftAssert();
	    try {
	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
  	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
		  Thread.sleep(2000);
	       sup.clickonupdate();
	     WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='Full Name ']"));
	     Thread.sleep(2000);
	     orgname.sendKeys(Keys.CONTROL+"a");
	     orgname.sendKeys(Keys.DELETE);
	     Thread.sleep(2000);
	     sup.entername(UtilityClass.propertiesfile("maxlengthofsup"));
	     sup.clickonsubmitbutton();
	       
	        String expected = "Full Name should be between 2 to 30 characters";
	        String actual = driver.findElement(By.xpath("//p[text()='Full Name should be between 2 to 30 characters']")).getText();
	        
	        softAssert.assertEquals(actual, expected);
	        Thread.sleep(5000);
	        driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("Exception  " + e.getMessage());
	    } finally {
	        softAssert.assertAll();  
	    }
	  }
	 @Test(priority = 20)
	  public void Verify_to_update_superviosr_with_invalid_number()
	  {
		  softAssert = new SoftAssert();
	    try {
	    	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
	    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
  	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
		  Thread.sleep(2000);
	       sup.clickonupdate();
	     WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='Enter phone number']"));
	     Thread.sleep(2000);
	     orgname.sendKeys(Keys.CONTROL+"a");
	     orgname.sendKeys(Keys.DELETE);
	     Thread.sleep(2000);
	    sup.enterphonenumber(UtilityClass.propertiesfile("minlengthofphon"));
	     sup.clickonsubmitbutton();
	       
	        String expected = "Invalid Mobile No.";
	        String actual = driver.findElement(By.xpath("//span[text()='Invalid Mobile No.']")).getText();
	        
	        softAssert.assertEquals(actual, expected);
	        Thread.sleep(5000);
	        driver.navigate().refresh();
	    } catch (Exception e) {
	        
	        softAssert.fail("Exception  " + e.getMessage());
	    } finally {
	        softAssert.assertAll();  
	    }
	  }
	 @Test(priority = 21)
	    public void Verify_to_check_createsupervisor_that_are_already_exist() throws IOException {
	    	
	         softAssert = new SoftAssert();
	        try {
//	        	Thread.sleep(25000);
//	            sup.clicksbtn();
//	            Thread.sleep(2000);
//	            sup.clicksuper();
	        	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
	        	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
	     	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
	            Thread.sleep(3000);
	            sup.addbtnsupervisor();
	            Thread.sleep(3000);
	            sup.entersupermail(UtilityClass.propertiesfile("alreadyexistsup"));
	            sup.entername(UtilityClass.propertiesfile("namesupervisor"));
	            sup.enterphonenumber(UtilityClass.propertiesfile("numsuperviosr"));
//	            sup.sendkey();
//	            Thread.sleep(2000);
//	            sup.clickexternbtn();
	            Thread.sleep(3000);
	            sup.clickonsubmitbutton();
	            
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Email already exists']")));
	            System.out.println("Overlay Gone");
	            
	            String actual = driver.findElement(By.xpath("//div[text()='Email already exists']")).getText();
	            String expected = "Email already exists";
	            System.out.println("dhkjfh" + actual);
	            
	            softAssert.assertEquals(actual, expected);
	            Thread.sleep(5000);
		        driver.navigate().refresh();
	        } catch (Exception e) {
	            
	            softAssert.fail("Exception  " + e.getMessage());
	        } finally {
	            softAssert.assertAll();  
	        }
	    }
}
//	 @Test(priority = 22)
//	    public void Verify_to_check_sr_no_column_is_present_in_supervisor_page() throws IOException {
//	    	
//	         softAssert = new SoftAssert();
//	        try {
//	        	
//	        	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
//	     	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
//	            Thread.sleep(3000);
//	           
//	            
//	            String actual = driver.findElement(By.xpath("//th[text()='S. No.']")).getText();
//	            String expected = "S. No.";
//	            System.out.println("dhkjfh" + actual);
//	            
//	            softAssert.assertEquals(actual, expected);
//	            Thread.sleep(3000);
//		        driver.navigate().refresh();
//	        } catch (Exception e) {
//	            
//	            softAssert.fail("Exception  " + e.getMessage());
//	        } finally {
//	            softAssert.assertAll();  
//	        }
//	    }
//	 @Test(priority = 23)
//	    public void Verify_to_check_supervisor_name_column_is_present_in_supervisor_page() throws IOException {
//	    	
//	         softAssert = new SoftAssert();
//	        try {
//	        	
//	        	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
//	     	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
//	            Thread.sleep(3000);
//	           
//	            
//	            String actual = driver.findElement(By.xpath("//th[text()='Supervisor Name']")).getText();
//	            String expected = "Supervisor Name";
//	            System.out.println("dhkjfh" + actual);
//	            
//	            softAssert.assertEquals(actual, expected);
//	            Thread.sleep(3000);
//		        driver.navigate().refresh();
//	        } catch (Exception e) {
//	            
//	            softAssert.fail("Exception  " + e.getMessage());
//	        } finally {
//	            softAssert.assertAll();  
//	        }
//	    }
//	 @Test(priority = 24)
//	    public void Verify_to_check_Email_column_is_present_in_supervisor_page() throws IOException {
//	    	
//	         softAssert = new SoftAssert();
//	        try {
//	        	
//	        	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
//	     	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
//	            Thread.sleep(3000);
//	           
//	            
//	            String actual = driver.findElement(By.xpath("//th[text()='Email']")).getText();
//	            String expected = "Email";
//	            System.out.println("dhkjfh" + actual);
//	            
//	            softAssert.assertEquals(actual, expected);
//	            Thread.sleep(3000);
//		        driver.navigate().refresh();
//	        } catch (Exception e) {
//	            
//	            softAssert.fail("Exception  " + e.getMessage());
//	        } finally {
//	            softAssert.assertAll();  
//	        }
//	 }
//	        @Test(priority = 25)
//		    public void Verify_to_check_mobile_number_column_is_present_in_supervisor_page() throws IOException {
//		    	
//		         softAssert = new SoftAssert();
//		        try {
//		        	
//		        	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
//		     	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
//		            Thread.sleep(3000);
//		           
//		            
//		            String actual = driver.findElement(By.xpath("//th[text()='Number']")).getText();
//		            String expected = "Number";
//		            System.out.println("dhkjfh" + actual);
//		            
//		            softAssert.assertEquals(actual, expected);
//		            Thread.sleep(3000);
//			        driver.navigate().refresh();
//		        } catch (Exception e) {
//		            
//		            softAssert.fail("Exception  " + e.getMessage());
//		        } finally {
//		            softAssert.assertAll();  
//		        }
//	    }
//	        @Test(priority = 26)
//		    public void Verify_to_check_orgnizationname_column_is_present_in_supervisor_page() throws IOException {
//		    	
//		         softAssert = new SoftAssert();
//		        try {
//		        	
//		        	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
//		     	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
//		            Thread.sleep(3000);
//		           
//		            
//		            String actual = driver.findElement(By.xpath("//th[text()='Organization Name']")).getText();
//		            String expected = "Organization Name";
//		            System.out.println("dhkjfh" + actual);
//		            
//		            softAssert.assertEquals(actual, expected);
//		            Thread.sleep(3000);
//			        driver.navigate().refresh();
//		        } catch (Exception e) {
//		            
//		            softAssert.fail("Exception  " + e.getMessage());
//		        } finally {
//		            softAssert.assertAll();  
//		        }
//	    }
//	        @Test(priority = 27)
//		    public void Verify_to_check_action_column_is_present_in_supervisor_page() throws IOException {
//		    	
//		         softAssert = new SoftAssert();
//		        try {
//		        	
//		        	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
//		     	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
//		            Thread.sleep(3000);
//		           
//		            
//		            String actual = driver.findElement(By.xpath("//th[text()='Action']")).getText();
//		            String expected = "Action";
//		            System.out.println("dhkjfh" + actual);
//		            
//		            softAssert.assertEquals(actual, expected);
//		            Thread.sleep(3000);
//			        driver.navigate().refresh();
//		        } catch (Exception e) {
//		            
//		            softAssert.fail("Exception  " + e.getMessage());
//		        } finally {
//		            softAssert.assertAll();  
//		        }
//	    }
//	        @Test(priority = 28)
//		    public void Verify_to_check_click_on_previous_page_button_of_supervisor_page() throws IOException {
//		    	
//		         softAssert = new SoftAssert();
//		        try {
//		        	
//		        	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
//		     	        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Supervisor']")));
//		            Thread.sleep(3000);
//		           driver.findElement(By.xpath("//a[text()='Previous']")).click();
////		            
////		            String actual = driver.findElement(By.xpath("//a[text()='Previous']")).getText();
////		            String expected = "Previous";
////		            System.out.println("dhkjfh" + actual);
////		            
////		            softAssert.assertEquals(actual, expected);
//		            Thread.sleep(3000);
//			        driver.navigate().refresh();
//		        } catch (Exception e) {
//		            
//		            softAssert.fail("Exception  " + e.getMessage());
//		        } finally {
//		            softAssert.assertAll();  
//		        }
//	    }
//	        }

