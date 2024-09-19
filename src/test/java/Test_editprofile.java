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
		Thread.sleep(3000);
		edit.clickbuttonsubmit();
	}
	@Test
	public void Verify_to_check_edit_full_namefield() throws InterruptedException {
	     softAssert = new SoftAssert();
	    try {
	        Thread.sleep(25000); 
	        edit.clicksbtn();
	        edit.clickprofiletab();
	        Thread.sleep(3000); 
	        edit.editname();
	        
	        Thread.sleep(5000); 
	        edit.editphone();
	        Thread.sleep(3000); 
	        edit.submit();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Profile Updated Successfully']")));
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
