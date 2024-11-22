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

import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;
import Orgnization.Create_Orgnization;



public class Test_Orgnization extends Base_class{
	
	Create_Orgnization org;
    SoftAssert softAssert;
	@BeforeClass
	public void initializebrowser() throws IOException, InterruptedException
	{
		openbrowser();
		org=new Create_Orgnization(driver);
		
		org.entermail(UtilityClass.propertiesfile("validmail"));
		org.entpass(UtilityClass.propertiesfile("validpass"));
		org.clickbuttonsubmit();
//		
	}
@Test(priority = 1)
public void Create_Orgnization_with_invalid_orgnization_name() throws IOException, InterruptedException {
     softAssert = new SoftAssert();
    
    try {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
       Thread.sleep(2000);
       org.clicksbtn();
       Thread.sleep(2000);
       org.clickonorgnizationtab();
       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
       wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
      
        
        Thread.sleep(3000);
        
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("invalidorg"));
        org.entergst(UtilityClass.propertiesfile("validgst"));
        Thread.sleep(5000);
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();

        String expected = "Organization Name can only contain alphabets, numbers, single spaces, periods, commas, and ampersands (&)";
        String actual = driver.findElement(By.xpath("//p[text()='Organization Name can only contain alphabets, numbers, single spaces, periods, commas, and ampersands (&)']")).getText();
        softAssert.assertEquals(actual, expected, "Error message does not match for invalid organization name.");
        Thread.sleep(5000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
       
       
        softAssert.assertAll();  
        driver.navigate().refresh();
    }
}

@Test(priority = 31)
public void verify_to_create_orgnization_with_all_valid_data_of_orgnization() throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	 String randomOrgName = generateRandomOrganizationName();
         String randomGST = generateRandomGSTNumber();
         String randomEmail = generateRandomEmail();
         String randomPhoneNumber = generateRandomPhoneNumber();
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(randomOrgName);
        org.entergst(randomGST);
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(randomEmail);
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(randomPhoneNumber);
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
        
        String actual = driver.findElement(By.xpath("//div[text()='Organization Created Successfully']")).getText();
        String expected = "Organization Created Successfully";
        softAssert.assertEquals(actual, expected, "Organization creation success message does not match.");
        Thread.sleep(5000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
        softAssert.assertAll();  
        driver.navigate().refresh();
    }}
private String generateRandomOrganizationName() {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    StringBuilder orgName = new StringBuilder();
    Random random = new Random();

    
    int length = random.nextInt(15) + 5; 
    for (int i = 0; i < length; i++) {
        orgName.append(alphabet.charAt(random.nextInt(alphabet.length())));
    }
    return orgName.toString();
}


private String generateRandomGSTNumber() {
    String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    StringBuilder gstNumber = new StringBuilder();
    Random random = new Random();

    for (int i = 0; i < 15; i++) {
        gstNumber.append(alphanumeric.charAt(random.nextInt(alphanumeric.length())));
    }
    return gstNumber.toString();
}


private String generateRandomEmail() {
    String emailDomain = "@example.com";
    String emailPrefix = "user" + new Random().nextInt(10000); 
    return emailPrefix + emailDomain;
}


private String generateRandomPhoneNumber() {
    Random rand = new Random();
    StringBuilder phoneNumber = new StringBuilder("9"); 
    for (int i = 0; i < 9; i++) {
        phoneNumber.append(rand.nextInt(10)); 
    }
    return phoneNumber.toString();
}
@Test(priority = 3)
public void Verify_that_an_organization_cannot_be_created_without_an_organization_name() throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
	
 
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
      
        org.addorgnization();
//        org.enterorgname(UtilityClass.propertiesfile("validorg"));
        org.entergst(UtilityClass.propertiesfile("validgst"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
//        
        String actual = driver.findElement(By.xpath("//p[text()='Organization Name is required']")).getText();
        String expected = "Organization Name is required";
        softAssert.assertEquals(actual, expected, "Organization creation success message does not match.");
        Thread.sleep(4000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
        softAssert.assertAll();  
        driver.navigate().refresh();
    }}
@Test(priority = 4)
public void Verify_to_add_orgnization_with_special_charcter_in_org_name_field  () throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("orgnamespechar"));
        org.entergst(UtilityClass.propertiesfile("validgst"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
//        
        String actual = driver.findElement(By.xpath("//p[text()='Organization Name can only contain alphabets, numbers, single spaces, periods, commas, and ampersands (&)']")).getText();
        String expected = "Organization Name can only contain alphabets, numbers, single spaces, periods, commas, and ampersands (&)";
        softAssert.assertEquals(actual, expected, "Organization creation success message does not match.");
        Thread.sleep(5000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
        softAssert.assertAll();  
        driver.navigate().refresh();
    }}
@Test(priority = 5)
public void Verify_to_add_orgnization_with_minimum_length_of_orgname () throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("minorg"));
        org.entergst(UtilityClass.propertiesfile("validgst"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
//        
        String actual = driver.findElement(By.xpath("//p[text()='Organization name should be between 3 and 50 characters']")).getText();
        String expected = "Organization name should be between 3 and 50 characters";
        softAssert.assertEquals(actual, expected, "Organization creation success message does not match.");
        Thread.sleep(4000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
        softAssert.assertAll();
        driver.navigate().refresh();
    }}
@Test(priority = 6)
public void Verify_to_add_orgnization_with_max_length_of_orgname () throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("maxorg"));
        org.entergst(UtilityClass.propertiesfile("validgst"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
//        
        String actual = driver.findElement(By.xpath("//p[text()='Organization name should be between 3 and 50 characters']")).getText();
        String expected = "Organization name should be between 3 and 50 characters";
        softAssert.assertEquals(actual, expected, "Organization creation success message does not match.");
        Thread.sleep(4000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
        softAssert.assertAll(); 
        driver.navigate().refresh();
    }}
//@Test(priority = 6)
//public void Verify_to_add_orgnization_with_special_charcter_in_GST_No_field   () throws InterruptedException, IOException {
//    softAssert = new SoftAssert();
//    
//    try {
//    	
//    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
//         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
//       Thread.sleep(2000);
//        org.addorgnization();
//        org.enterorgname(UtilityClass.propertiesfile("validorg"));
//        org.entergst(UtilityClass.propertiesfile("specialcharingst"));
//        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
//        org.entercity(UtilityClass.propertiesfile("validcity"));
//        org.enterstate(UtilityClass.propertiesfile("validstate"));
//        org.enterpin(UtilityClass.propertiesfile("validpin"));
//
//        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
//        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
//        s.selectByValue("1");
//
//        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
//        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
//        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
//        
//        Thread.sleep(5000);
//        org.clickonsubmit();
//        
////        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
////        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
////        
//        String actual = driver.findElement(By.xpath("//p[text()='Organization name should be between 3 and 50 characters']")).getText();
//        String expected = "Organization name should be between 3 and 50 characters";
//        softAssert.assertEquals(actual, expected, "Organization creation success message does not match.");
//        Thread.sleep(4000);
//    } catch (Exception e) {
//        softAssert.fail("An exception " + e.getMessage());
//    } finally {
//        softAssert.assertAll(); 
//        driver.navigate().refresh();
//    }}

@Test(priority = 7)
public void Verify_that_an_organization_cannot_be_created_with_an_invalid_GST_number_format () throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("validorg"));
        org.entergst(UtilityClass.propertiesfile("minlengthofgst"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
//        
        String actual = driver.findElement(By.xpath("//p[text()='GST must be exactly 15 characters.']")).getText();
        String expected = "GST must be exactly 15 characters.";
        softAssert.assertEquals(actual, expected, "Organization creation success message does not match.");
        Thread.sleep(4000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
        softAssert.assertAll(); 
        driver.navigate().refresh();
    }}
@Test(priority = 8)
public void Verify_that_an_organization_cannot_be_created_without_GST_number() throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("validorg"));
//        org.entergst(UtilityClass.propertiesfile("minlengthofgst"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
//        
        String actual = driver.findElement(By.xpath("//p[text()='GST is required']")).getText();
        String expected = "GST is required";
        softAssert.assertEquals(actual, expected, "Organization creation success message does not match.");
        Thread.sleep(4000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
        softAssert.assertAll(); 
        driver.navigate().refresh();
    }}
@Test(priority = 9)
public void Verify_that_an_organization_cannot_be_created_with_max_length_of_GST_number() throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	;
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("validorg"));
        org.entergst(UtilityClass.propertiesfile("maxlengthgst"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
//        
        String actual = driver.findElement(By.xpath("//p[text()='GST must be exactly 15 characters.']")).getText();
        String expected = "GST must be exactly 15 characters.";
        softAssert.assertEquals(actual, expected, "Organization creation success message does not match.");
        Thread.sleep(4000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
        softAssert.assertAll(); 
        driver.navigate().refresh();
    }}
@Test(priority = 10)
public void Verify_that_an_organization_cannot_be_created_with_max_length_of_Address_field() throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	;
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("validorg"));
        org.entergst(UtilityClass.propertiesfile("validgst"));
        org.enteraddress(UtilityClass.propertiesfile("maxlengthadd"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
//        
        String actual = driver.findElement(By.xpath("//p[text()='Maximum allowed length should be of 100 characters.']")).getText();
        String expected = "Maximum allowed length should be of 100 characters.";
        softAssert.assertEquals(actual, expected, "Organization creation success message does not match.");
        Thread.sleep(4000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
        softAssert.assertAll(); 
        driver.navigate().refresh();
    }}
@Test(priority = 11)
public void Verify_that_an_organization_cannot_be_created_without_Address_field() throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("validorg"));
        org.entergst(UtilityClass.propertiesfile("validgst"));
//        org.enteraddress(UtilityClass.propertiesfile("maxlengthadd"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
//        
        String actual = driver.findElement(By.xpath("//p[text()='Address is required']")).getText();
        String expected = "Address is required";
        softAssert.assertEquals(actual, expected, "Organization creation success message does not match.");
        Thread.sleep(4000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
        softAssert.assertAll(); 
        driver.navigate().refresh();
    }}
@Test(priority = 12)
public void Verify_that_an_organization_cannot_be_created_withmax_length_of_city_field() throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("validorg"));
        org.entergst(UtilityClass.propertiesfile("validgst"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("maxlengthcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
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
@Test(priority = 13)
public void Verify_that_an_organization_cannot_be_created_without_enter_city_field() throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("validorg"));
        org.entergst(UtilityClass.propertiesfile("validgst"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
//        org.entercity(UtilityClass.propertiesfile("maxlengthcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
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
@Test(priority = 14)
public void Verify_that_an_organization_cannot_be_created_with_an_minimum_length_of_pincode() throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("validorg"));
        org.entergst(UtilityClass.propertiesfile("validgst"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("minlengthpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
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
@Test(priority = 15)
public void Verify_that_an_organization_cannot_be_created_with_an_max_length_of_pincode() throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("validorg"));
        org.entergst(UtilityClass.propertiesfile("validgst"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("maxlengthofpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
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
@Test(priority = 16)
public void Verify_that_an_organization_cannot_be_created_without__pincode() throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("validorg"));
        org.entergst(UtilityClass.propertiesfile("validgst"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
//        org.enterpin(UtilityClass.propertiesfile("maxlengthofpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
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
@Test(priority = 17)
public void Verify_that_an_organization_cannot_be_created_with_max_length_of_state() throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("validorg"));
        org.entergst(UtilityClass.propertiesfile("validgst"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("maxlengthstate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
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
@Test(priority = 18)
public void Verify_that_an_organization_cannot_be_created_with_using_undercurse_and_attherate_in_state() throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("validorg"));
        org.entergst(UtilityClass.propertiesfile("validgst"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("attheratestate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
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
@Test(priority = 19)
public void Verify_that_an_organization_cannot_be_created_without_enter_state() throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("validorg"));
        org.entergst(UtilityClass.propertiesfile("validgst"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
//        org.enterstate(UtilityClass.propertiesfile("attheratestate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
//        
        String actual = driver.findElement(By.xpath("//p[text()='State is required']")).getText();
        String expected = "State is required";
        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
        Thread.sleep(4000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
        softAssert.assertAll(); 
        driver.navigate().refresh();
    }}
@Test(priority = 20)
public void Verify_that_an_organization_cannot_be_created_without_selecting_refresh_time() throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("validorg"));
        org.entergst(UtilityClass.propertiesfile("validgst"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

//        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
//        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
//        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
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
@Test(priority = 21)
public void Verify_that_an_organization_cannot_be_created_with_a_name_that_already_exists() throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("validorg"));
        org.entergst(UtilityClass.propertiesfile("validgst"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("validcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

//        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
//        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
//        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
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
@Test(priority = 22)
public void Verify_that_an_organization_cannot_be_created_with_a_numeric_city_name() throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add Organization']")));
       Thread.sleep(2000);
        org.addorgnization();
        org.enterorgname(UtilityClass.propertiesfile("orgnameforncity"));
        org.entergst(UtilityClass.propertiesfile("GSTforncity"));
        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
        org.entercity(UtilityClass.propertiesfile("numericcity"));
        org.enterstate(UtilityClass.propertiesfile("validstate"));
        org.enterpin(UtilityClass.propertiesfile("validpin"));

        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
        s.selectByValue("1");

        org.entersupervisormail(UtilityClass.propertiesfile("validsup"));
        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
        org.enterphone(UtilityClass.propertiesfile("validnumofsuper"));
        
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
@Test(priority = 23)
public void Ensure_that_the_organization_is_successfully_updated_with_valid_inputs_for_organization_name_GST_number_address () throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
       Thread.sleep(2000);
       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();

        
        Thread.sleep(5000);
        org.clickonsubmit();
        
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
        
        String actual = driver.findElement(By.xpath("//div[text()='Organization Updated Successfully']")).getText();
        String expected = "Organization Updated Successfully";
        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
        Thread.sleep(4000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
        softAssert.assertAll(); 
        driver.navigate().refresh();
    }}
@Test(priority = 24)
public void Ensure_that_the_organization_update_fails_when_the_organization_name_is_missing () throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
       Thread.sleep(2000);
       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
      WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='Organization Name']"));
      orgname.sendKeys(Keys.CONTROL+"a");
      orgname.sendKeys(Keys.DELETE);
        
        Thread.sleep(5000);
        org.clickonsubmit();
//        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
//        
        String actual = driver.findElement(By.xpath("//p[text()='Organization Name is required']")).getText();
        String expected = "Organization Name is required";
        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
        Thread.sleep(4000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
        softAssert.assertAll(); 
        driver.navigate().refresh();
    }}
@Test(priority = 25)
public void Ensure_that_the_organization_update_fails_when_enter_special_char_in_orgname_field () throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
       Thread.sleep(2000);
       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
      WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='Organization Name']"));
      orgname.sendKeys(Keys.CONTROL+"a");
      orgname.sendKeys(Keys.DELETE);
      org.enterorgname(UtilityClass.propertiesfile("orgnamespechar"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
//        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
//        
        String actual = driver.findElement(By.xpath("//p[text()='Organization Name can only contain alphabets, numbers, single spaces, periods, commas, and ampersands (&)']")).getText();
        String expected = "Organization Name can only contain alphabets, numbers, single spaces, periods, commas, and ampersands (&)";
        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
        Thread.sleep(4000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
        softAssert.assertAll(); 
        driver.navigate().refresh();
    }}
@Test(priority = 26)
public void Ensure_that_the_organization_update_fails_when_enter_min_length_of_orgname_field () throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
       Thread.sleep(2000);
       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
      WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='Organization Name']"));
      orgname.sendKeys(Keys.CONTROL+"a");
      orgname.sendKeys(Keys.DELETE);
      org.enterorgname(UtilityClass.propertiesfile("minorg"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
//        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
//        
        String actual = driver.findElement(By.xpath("//p[text()='Organization name should be between 3 and 50 characters']")).getText();
        String expected = "Organization name should be between 3 and 50 characters";
        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
        Thread.sleep(4000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
        softAssert.assertAll(); 
        driver.navigate().refresh();
    }}
@Test(priority = 27)
public void Ensure_that_the_organization_update_fails_when_enter_max_length_of_orgname_field () throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
       Thread.sleep(2000);
       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
      WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='Organization Name']"));
      orgname.sendKeys(Keys.CONTROL+"a");
      orgname.sendKeys(Keys.DELETE);
      org.enterorgname(UtilityClass.propertiesfile("maxorg"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
//        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
//        
        String actual = driver.findElement(By.xpath("//p[text()='Organization name should be between 3 and 50 characters']")).getText();
        String expected = "Organization name should be between 3 and 50 characters";
        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
        Thread.sleep(4000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
        softAssert.assertAll(); 
        driver.navigate().refresh();
    }}
@Test(priority = 28)
public void Ensure_that_the_organization_update_fails_when_enter_special_char_in_GSTnumberfield () throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
       Thread.sleep(2000);
       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
      WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='GST Number']"));
      orgname.sendKeys(Keys.CONTROL+"a");
      orgname.sendKeys(Keys.DELETE);
     org.entergst(UtilityClass.propertiesfile("specialcharingst"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
//        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
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
@Test(priority = 29)
public void Ensure_that_the_organization_update_fails_when_enter_invalidGSTnumberfield () throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
       Thread.sleep(2000);
       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
      WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='GST Number']"));
      orgname.sendKeys(Keys.CONTROL+"a");
      orgname.sendKeys(Keys.DELETE);
     org.entergst(UtilityClass.propertiesfile("invalidgst"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
//        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
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
@Test(priority = 30)
public void Ensure_that_the_organization_update_fails_without_enter_GSTnumberfield () throws InterruptedException, IOException {
    softAssert = new SoftAssert();
    
    try {
    	
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
    	 wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));
         wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='actionIcon']")));
       Thread.sleep(2000);
       driver.findElement(By.xpath("//td[@class='actionIcon']")).click();
      WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='GST Number']"));
      orgname.sendKeys(Keys.CONTROL+"a");
      orgname.sendKeys(Keys.DELETE);
//     org.entergst(UtilityClass.propertiesfile("invalidgst"));
        
        Thread.sleep(5000);
        org.clickonsubmit();
//        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));
//        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Updated Successfully']")));
//        
        String actual = driver.findElement(By.xpath("//p[text()='GST is required']")).getText();
        String expected = "GST is required";
        softAssert.assertEquals(actual, expected, "Maximum allowed length should be of 100 characters.");
        Thread.sleep(4000);
    } catch (Exception e) {
        softAssert.fail("An exception " + e.getMessage());
    } finally {
        softAssert.assertAll(); 
        driver.navigate().refresh();
    }}
}