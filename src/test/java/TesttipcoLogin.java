

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;

import tipcologin.Loginpage;



public class TesttipcoLogin extends Base_class {
	
Loginpage log;
@BeforeClass

public void initialise() throws IOException
{
	openbrowser();
	log=new Loginpage(driver);
}
@Test(priority = 6)
public void Verify_to_login_with_invalidmail_and_password() throws IOException, InterruptedException
{
	Thread.sleep(3000);
	log.entermail(UtilityClass.propertiesfile("invalidmail"));
	log.entpass(UtilityClass.propertiesfile("invalidpass"));
	
	log.clickbutton();
	Thread.sleep(4000);
	
	
	String expected="Invalid email format";
	String actual=driver.findElement(By.xpath("//p[text()='Invalid email format']")).getText();
	org.testng.Assert.assertEquals(actual, expected);
//	log.clearmail();
//	log.clearpass();
	Thread.sleep(4000);
	driver.navigate().refresh();
	
}
@Test(priority = 7)
public void verify_to_login_with_valid_mail_and_Password() throws IOException, InterruptedException
{
	Thread.sleep(5000);
	log.entermail(UtilityClass.propertiesfile("validmail"));
	log.entpass(UtilityClass.propertiesfile("validpass"));
	Thread.sleep(3000);
	log.clickbutton();
	Thread.sleep(20000);
	WebElement logo = driver.findElement(By.xpath("//img[@alt='logo Image']"));
	org.testng.Assert.assertTrue(logo.isDisplayed(),"the logo is not displayed after login");
	
//	log.clicksbtn();
//	Thread.sleep(4000);
//	log.clicksuper();
}
@Test(priority = 1)
public void Verify_that_notable_to_Login_with_incorrect_password() throws InterruptedException, IOException
{
	Thread.sleep(9000);
	log.entermail(UtilityClass.propertiesfile("validmail"));
	log.entpass(UtilityClass.propertiesfile("invalidpass"));
	Thread.sleep(1000);
	log.clickbutton();
	
  
//	
////	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Incorrect Password']")));
	System.out.println("Overlay Gone");
//	
	String actual=driver.findElement(By.xpath("//div[text()='Incorrect Password']")).getText();
	String expected="Incorrect Password";
	System.out.println("dhkjfh" + actual);
	org.testng.Assert.assertEquals(actual, expected);
	
//	WebElement to = driver.findElement(By.xpath("//input[@name='email']"));
//	to.sendKeys(Keys.DELETE);
//	ele.clear();
//	Thread.sleep(6000);
//	driver.get(driver.getCurrentUrl());
//	Thread.sleep(9000);
//	log.clearmail();
//	log.clearpass();
//	log.clearmail();
//	log.clearpass();
	
	
}
@Test(priority = 2)
public void Verify_that_not_able_to_login_with_unregisterdmail() throws IOException, InterruptedException
{
    driver.navigate().refresh();
	Thread.sleep(3000);
	log.entermail(UtilityClass.propertiesfile("unregisterdmail"));
	log.entpass(UtilityClass.propertiesfile("validpass"));
	
	log.clickbutton();
	
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='Toastify']/div/div/div/div)[2]")));
	System.out.println("Overlay Gone");
////	
	String expected="We can't find an account with this email. Try another email address, or if you don't have an account, Kindly contact admin.";
	String actual = driver.findElement(By.xpath("(//div[@class='Toastify']/div/div/div/div)[2]")).getText();
	System.out.println(actual+"gfgh");
	org.testng.Assert.assertEquals(actual,expected );
	
}
@Test(priority = 3)
public void Verify_to_signin_with_blank_mail_and_passwordfield() throws InterruptedException, IOException
{
	driver.navigate().refresh();
	Thread.sleep(9000);
	log.clickbutton();
	Thread.sleep(3000);
	
	
}
@Test(priority = 4)
public void Verify_to_login_with_validmail_and_blankpass() throws IOException, InterruptedException

{
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	log.entermail(UtilityClass.propertiesfile("validmail"));
	log.clickbutton();
	Thread.sleep(3000);
	String expected="Password is required";
	String actual = driver.findElement(By.xpath("//p[text()='Password is required']")).getText();
	org.testng.Assert.assertEquals(actual, expected);
	Thread.sleep(5000);
	driver.navigate().refresh();
}
@Test(priority = 5)
public void verify_to_login_with_blankmail_and_valid_password() throws InterruptedException, IOException
{
	Thread.sleep(4000);
	log.entpass(UtilityClass.propertiesfile("validpass"));
	
	log.clickbutton();
	
	String expected="Email is required";
	String actual = driver.findElement(By.xpath("//p[text()='Email is required']")).getText();
	org.testng.Assert.assertEquals(actual, expected);
	Thread.sleep(5000);
	driver.navigate().refresh();
}
////@AfterTest
////public void clearall()
////{
////	driver.manage().deleteAllCookies();
////	driver.close();
////}



	
}
