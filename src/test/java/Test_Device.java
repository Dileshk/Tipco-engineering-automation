import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Device_create.Device_create;
import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;
import action.Select;

public class Test_Device extends Base_class{
	
	Device_create device;
	@BeforeClass
	public void initializebrowser() throws IOException, InterruptedException
	{
		openbrowser();
		device=new Device_create(driver);
		Thread.sleep(5000);
		device.entermail(UtilityClass.propertiesfile("validmail"));
		device.entpass(UtilityClass.propertiesfile("validpass"));
		device.clickbuttonsubmit();
	}
	@Test(priority = 1)
	public void Verify_to_create_Horizontalbead_mill_machine() throws IOException, InterruptedException
	{
		Thread.sleep(25000);
		device.clicksbtn();
		Thread.sleep(3000);
		device.clickondevicetab();
		Thread.sleep(3000);
		device.clickonadddevice();
		Thread.sleep(3000);
		device.enterdeviceId(UtilityClass.propertiesfile("HID"));
		
	device.clickondevicetypelistbox();
//		WebElement list = driver.findElement(By.xpath("//input[@placeholder='Please Select Device Type']"));
//		org.openqa.selenium.support.ui.Select dev=new org.openqa.selenium.support.ui.Select(list);
//		dev.selectByVisibleText("Horizontal Bead Mill");
//		list.click();
	     driver.findElement(By.xpath("//div[text()='Horizontal Bead Mill']")).click();
		device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
		device.entermaxpresser(UtilityClass.propertiesfile("presser"));
		device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
		device.entertimezone(UtilityClass.propertiesfile("zone"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();
		device.enterorgname(UtilityClass.propertiesfile("orgname"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Created Successfully']")));
		System.out.println("Overlay Gone");
	//	
		String actual=driver.findElement(By.xpath("//div[text()='Device Created Successfully']")).getText();
		String expected="Device Created Successfully";
		System.out.println("dhkjfh" + actual);
		Assert.assertEquals(actual, expected);
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	@Test(priority = 2)
	public void verify_to_create_twinsaftdisperser() throws InterruptedException, IOException
	{
//		Thread.sleep(11000);
//		device.clicksbtn();
//		Thread.sleep(3000);
//		device.clickondevicetab();
//		Thread.sleep(3000);
		device.clickonadddevice();
		Thread.sleep(3000);
		device.enterdeviceId(UtilityClass.propertiesfile("TID"));
		device.clickondevicetypelistbox();
//		WebElement list = driver.findElement(By.xpath("//select[@name='device_type']"));
//		org.openqa.selenium.support.ui.Select dev=new org.openqa.selenium.support.ui.Select(list);
//		dev.selectByVisibleText("Twin Shaft Disperser");
//		list.click();
	    driver.findElement(By.xpath("//div[text()='Twin Shaft Disperser']")).click();
		device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
		device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
		device.entermaxpresser(UtilityClass.propertiesfile("presser"));
		device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
		device.entertimezone(UtilityClass.propertiesfile("zone"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();
		device.enterorgname(UtilityClass.propertiesfile("orgname"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Created Successfully']")));
		System.out.println("Overlay Gone");
	//	
		String actual=driver.findElement(By.xpath("//div[text()='Device Created Successfully']")).getText();
		String expected="Device Created Successfully";
		System.out.println("dhkjfh" + actual);
		Assert.assertEquals(actual, expected);
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	@Test(priority = 3)
	public void Verify_to_create_highspeed_disperser_machine() throws InterruptedException, IOException
	{
		Thread.sleep(10000);
		device.clickonadddevice();
		Thread.sleep(3000);
		device.enterdeviceId(UtilityClass.propertiesfile("HIID"));
	device.clickondevicetypelistbox();
//		WebElement list = driver.findElement(By.xpath("//select[@name='device_type']"));
//		org.openqa.selenium.support.ui.Select dev=new org.openqa.selenium.support.ui.Select(list);
//		dev.selectByVisibleText("High Speed Disperser");
//		list.click();
	 driver.findElement(By.xpath("//div[text()='High Speed Disperser']")).click();
		device.maxtemp1(UtilityClass.propertiesfile("maxtemp1"));
//		device.maxtemp2(UtilityClass.propertiesfile("maxtemp2"));
		Thread.sleep(3000);
//		device.maxtemp3(UtilityClass.propertiesfile("maxtemp3"));
		device.entermaxpresser(UtilityClass.propertiesfile("presser"));
		device.entermaxvibration(UtilityClass.propertiesfile("vibration"));
		device.entertimezone(UtilityClass.propertiesfile("zone"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Asia/Calcutta']")).click();
		device.enterorgname(UtilityClass.propertiesfile("orgname"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='TechNova Solutions']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Device Created Successfully']")));
		System.out.println("Overlay Gone");
	//	
		String actual=driver.findElement(By.xpath("//div[text()='Device Created Successfully']")).getText();
		String expected="Device Created Successfully";
		System.out.println("dhkjfh" + actual);
		Assert.assertEquals(actual, expected);
		
	}

}
