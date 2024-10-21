package Edit_profile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_profile {
	@FindBy(xpath = "//input[@name='email']")private WebElement mail;
	@FindBy(xpath = "//input[@name='password']")private WebElement pass;
	@FindBy(xpath = "//button[text()='Sign in']")private WebElement btn;
	@FindBy(xpath = "//div[@id='toggle-id']")private WebElement sbtn;
	@FindBy(xpath = "//span[text()='Profile']")private WebElement profiletab;
	@FindBy(xpath = "//input[@placeholder='Email address']")private WebElement email;
	@FindBy(xpath = "//input[@placeholder='Full Name ']")private WebElement name;
	@FindBy(xpath = "//input[@placeholder='Enter phone number']")private WebElement phnum;
	@FindBy(xpath = "//button[text()='Submit']")private WebElement submitbtn;
	
	
	
	
	
	public Edit_profile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void entermail(String ok)
	{
		mail.sendKeys(ok);
	}
	public void entpass(String so)
	{
		pass.sendKeys(so);
	}
	public void clickbuttonsubmit()
	{
		btn.click();
	}
	public void clicksbtn()
	{
		sbtn.click();
	}
	public void clickprofiletab()
	{
		profiletab.click();
	}
	public void clearmail()
	{
		email.clear();
	}
	public void editname(String names)
	{
		name.sendKeys(names);
		
	}
	public void editphone(String number)
	{
		phnum.sendKeys(number);
	}
	public void submit()
	{
		submitbtn.click();
	}
	

}
