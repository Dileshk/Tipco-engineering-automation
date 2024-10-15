import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
		
		edit.clickbuttonsubmit();
	}
	@Test
	public void Verify_to_check_edit_full_namefield() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='toggle-id']")));
	         
	        edit.clicksbtn();
	          
	        edit.clickprofiletab();
	         
	        edit.editname();
	        
	        
	        edit.editphone();
	         
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
	

}
