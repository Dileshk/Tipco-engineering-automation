package tipcologin;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(xpath = "//input[@name='email']")private WebElement mail;
	@FindBy(xpath = "//input[@name='password']")private WebElement pass;
	@FindBy(xpath = "//button[text()='Sign in']")private WebElement btn;
	@FindBy(xpath = "//div[text()='S']")private WebElement sbtn;
	@FindBy(xpath = "//span[text()='Supervisor']") WebElement superv;
	
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void entermail(String ok)
	{
		mail.sendKeys(ok);
	}
	public void clearmail()
	{
		mail.sendKeys(Keys.CONTROL+"a");
		mail.sendKeys(Keys.DELETE);
	}
	public void entpass(String so)
	{
		pass.sendKeys(so);
	}
	public void clearpass()
	{
		pass.sendKeys(Keys.CONTROL+"a");
		pass.sendKeys(Keys.DELETE);
	}
	public void clickbutton()
	{
		btn.click();
	}
	public void clicksbtn()
	{
		sbtn.click();
	}
	public void clicksuper()
	{
		superv.click();
	}
	

}
