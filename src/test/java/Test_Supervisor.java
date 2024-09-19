import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Create_Supervisor.Supervisor;
import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;

public class Test_Supervisor extends Base_class  {
	
	Supervisor sup;
	SoftAssert softAssert;
	@BeforeClass
	public void initializebrowser() throws IOException, InterruptedException
	{
		openbrowser();
		sup=new Supervisor(driver);
		Thread.sleep(8000);
		sup.entermail(UtilityClass.propertiesfile("validmail"));
		sup.entpass(UtilityClass.propertiesfile("validpass"));
		sup.clickbuttonsubmit();
	
	}
	@Test(priority = 50)
    public void Create_Supervisor_with_valid_email() throws IOException {
    	
         softAssert = new SoftAssert();
        try {
            
            sup.addbtnsupervisor();
            Thread.sleep(3000);
            sup.entersupermail(UtilityClass.propertiesfile("validsupervisor"));
            sup.entername(UtilityClass.propertiesfile("namesupervisor"));
            sup.enterphonenumber(UtilityClass.propertiesfile("numsuperviosr"));
            sup.sendkey();
            sup.clickexternbtn();
            Thread.sleep(3000);
            sup.clickonsubmitbutton();
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
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

    @Test(priority = 1)
    public void verify_that_createSupervisor_with_invalid_email() {
         softAssert = new SoftAssert();
        try {
            Thread.sleep(25000);
            sup.clicksbtn();
            Thread.sleep(2000);
            sup.clicksuper();
            Thread.sleep(3000);
            sup.addbtnsupervisor();
            Thread.sleep(4000);
            sup.entersupermail(UtilityClass.propertiesfile("invalidsuperviosrmail"));
            sup.entername(UtilityClass.propertiesfile("namesupervisor"));
            sup.enterphonenumber(UtilityClass.propertiesfile("numsuperviosr"));
            sup.sendkey();
            sup.clickexternbtn();
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
    public void Verify_that_the_full_name_field_does_not_accept_numeric_or_special_characters() {
        softAssert = new SoftAssert();
        try {
            Thread.sleep(3000);
            sup.addbtnsupervisor();
            Thread.sleep(3000);
            sup.entermail(UtilityClass.propertiesfile("validsupervisor"));
            sup.entername(UtilityClass.propertiesfile("supervisornamewithnumericandspecialchar"));
            sup.enterphonenumber(UtilityClass.propertiesfile("numsuperviosr"));
            sup.sendkey();
            sup.clickexternbtn();
            sup.clickonsubmitbutton();
            
            String expected = "Full Name must only contain letters and a single space between words";
            String actual = driver.findElement(By.xpath("//p[text()='Full Name must only contain letters and a single space between words']")).getText();
            
            softAssert.assertEquals(actual, expected);
            Thread.sleep(4000);
            driver.navigate().refresh();
        } catch (Exception e) {
           
            softAssert.fail("Exception " + e.getMessage());
        } finally {
            softAssert.assertAll();  
        }}
	
	
	
	
	

}
