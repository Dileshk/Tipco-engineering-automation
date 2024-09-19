import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;
import Orgnization.Create_Orgnization;
import action.Select;


public class Test_Orgnization extends Base_class{
	
	Create_Orgnization org;
    SoftAssert softAssert;
	@BeforeClass
	public void initializebrowser() throws IOException, InterruptedException
	{
		openbrowser();
		org=new Create_Orgnization(driver);
		Thread.sleep(9000);
		org.entermail(UtilityClass.propertiesfile("validmail"));
		org.entpass(UtilityClass.propertiesfile("validpass"));
		org.clickbuttonsubmit();
		
	}
	@Test(priority = 1)
	public void Create_Orgnization_with_invalid_orgnization_name() throws IOException, InterruptedException {
	     softAssert = new SoftAssert();
	    
	    try {
	        Thread.sleep(25000);
	        org.clicksbtn();
	        Thread.sleep(3000);
	        org.clickonorgnizationtab();
	        Thread.sleep(3000);
	        org.addorgnization();
	        org.enterorgname(UtilityClass.propertiesfile("invalidorg"));
	        org.entergst(UtilityClass.propertiesfile("validgst"));
	        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
	        org.entercity(UtilityClass.propertiesfile("validcity"));
	        org.enterstate(UtilityClass.propertiesfile("validstate"));
	        org.enterpin(UtilityClass.propertiesfile("validpin"));

	        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
	        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
	        s.selectByValue("1");

	        org.entersupervisormail(UtilityClass.propertiesfile("validsupervisor"));
	        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
	        org.enterphone(UtilityClass.propertiesfile("numsuperviosr"));
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();

	        String expected = "Organization Name can only contain alphabets, numbers, single spaces, periods, commas, and ampersands (&)";
	        String actual = driver.findElement(By.xpath("//p[text()='Organization Name can only contain alphabets, numbers, single spaces, periods, commas, and ampersands (&)']")).getText();
	        softAssert.assertEquals(actual, expected, "Error message does not match for invalid organization name.");
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        Thread.sleep(5000);
	        driver.navigate().refresh();
	        softAssert.assertAll();  
	    }
	}

	@Test(priority = 2)
	public void verify_to_create_orgnization_with_all_valid_data_of_orgnization() throws InterruptedException, IOException {
	    softAssert = new SoftAssert();
	    
	    try {
	        Thread.sleep(5000);
	        org.addorgnization();
	        org.enterorgname(UtilityClass.propertiesfile("validorg"));
	        org.entergst(UtilityClass.propertiesfile("validgst"));
	        org.enteraddress(UtilityClass.propertiesfile("validaddress"));
	        org.entercity(UtilityClass.propertiesfile("validcity"));
	        org.enterstate(UtilityClass.propertiesfile("validstate"));
	        org.enterpin(UtilityClass.propertiesfile("validpin"));

	        WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
	        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(time);
	        s.selectByValue("1");

	        org.entersupervisormail(UtilityClass.propertiesfile("validsupervisor"));
	        org.enternameofsupername(UtilityClass.propertiesfile("namesupervisor"));
	        org.enterphone(UtilityClass.propertiesfile("numsuperviosr"));
	        
	        Thread.sleep(5000);
	        org.clickonsubmit();
	        
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
	        
	        String actual = driver.findElement(By.xpath("//div[text()='Organization Created Successfully']")).getText();
	        String expected = "Organization Created Successfully";
	        softAssert.assertEquals(actual, expected, "Organization creation success message does not match.");
	        
	    } catch (Exception e) {
	        softAssert.fail("An exception " + e.getMessage());
	    } finally {
	        softAssert.assertAll();  
	    }}

	
	

}
