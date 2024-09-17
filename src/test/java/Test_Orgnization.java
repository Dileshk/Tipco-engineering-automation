import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;
import Orgnization.Create_Orgnization;
import action.Select;


public class Test_Orgnization extends Base_class{
	
	Create_Orgnization org;
	
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
	public void Create_Orgnization_with_invalid_orgnization_name() throws IOException, InterruptedException
	{
		Thread.sleep(22000);
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
//		org.clickonrefreshtextbox();
//		Thread.sleep(4000);
//		org.select1();
		WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(time);
		s.selectByValue("1");
		Thread.sleep(5000);
		org.clickonsubmit();
		String expected="Organization Name can only contain alphabets, numbers, single spaces, periods, commas, and ampersands (&)";
		String actual = driver.findElement(By.xpath("//p[text()='Organization Name can only contain alphabets, numbers, single spaces, periods, commas, and ampersands (&)']")).getText();
		Assert.assertEquals(actual, expected);
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//h5[text()=' X ']")).click();
		driver.navigate().refresh();
	}
	@Test(priority = 2)
	public void verify_to_create_orgnization_with_all_valid_data_of_orgnization() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
//		org.clicksbtn();
//		Thread.sleep(3000);
//		org.clickonorgnizationtab();
//		Thread.sleep(3000);
		org.addorgnization();
		org.enterorgname(UtilityClass.propertiesfile("validorg"));
		org.entergst(UtilityClass.propertiesfile("validgst"));
		org.enteraddress(UtilityClass.propertiesfile("validaddress"));
		org.entercity(UtilityClass.propertiesfile("validcity"));
		org.enterstate(UtilityClass.propertiesfile("validstate"));
		org.enterpin(UtilityClass.propertiesfile("validpin"));
		//org.clickonrefreshtextbox();
		//org.select1();
		WebElement time = driver.findElement(By.xpath("//select[@name='refresh_time']"));
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(time);
		s.selectByValue("1");
		Thread.sleep(5000);
		org.clickonsubmit();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Organization Created Successfully']")));
		System.out.println("Overlay Gone");
	//	
		String actual=driver.findElement(By.xpath("//div[text()='Organization Created Successfully']")).getText();
		String expected="Organization Created Successfully";
		System.out.println("dhkjfh" + actual);
		Assert.assertEquals(actual, expected);
		
		
		
	}
	
	
	

}
