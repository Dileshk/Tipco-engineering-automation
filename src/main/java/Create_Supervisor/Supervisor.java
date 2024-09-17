package Create_Supervisor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import action.Random;

public class Supervisor {
	@FindBy(xpath = "//input[@name='email']")private WebElement mail;
	@FindBy(xpath = "//input[@name='password']")private WebElement pass;
	@FindBy(xpath = "//button[text()='Sign in']")private WebElement btn;
	@FindBy(xpath = "//div[text()='S']")private WebElement sbtn;
	@FindBy(xpath = "//span[text()='Supervisor']")private WebElement superv;
	@FindBy(xpath = "//button[text()='Add Supervisor']")private WebElement addsupervisor;
	@FindBy(xpath = "//input[@placeholder='Email address']")private WebElement supemail;
	@FindBy(xpath = "//input[@placeholder='Full Name ']")private WebElement supname;
	@FindBy(xpath = "//input[@placeholder='Enter phone number']")private WebElement supnum;
	@FindBy(xpath = "//input[@placeholder='Please Select Organization']")private WebElement sende;
	@FindBy(xpath = "//div[text()='extern labs']")private WebElement clickextern;
	@FindBy(xpath = "//button[@type='submit']")private WebElement clicksubmitbtn;
	
	
	
	public Supervisor(WebDriver driver)
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
	public void clicksuper()
	{
		superv.click();
	}
	public void addbtnsupervisor()
	{
		addsupervisor.click();
	}
	public void entersupermail(String mail)
	{
	supemail.sendKeys(mail);
	
	}
	public void entername(String name)
	{
		supname.sendKeys(name);
	}
	public void enterphonenumber(String number)
	{
		supnum.sendKeys(number);
	}
	public void sendkey()
	{
		sende.sendKeys("e");
	}
	public void clickexternbtn()
	{
		clickextern.click();
	}
	public void clickonsubmitbutton()
	{
		clicksubmitbtn.click();
	}
	

}



