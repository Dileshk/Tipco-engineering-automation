package Orgnization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Orgnization {
	@FindBy(xpath = "//input[@name='email']")private WebElement mail;
	@FindBy(xpath = "//input[@name='password']")private WebElement pass;
	@FindBy(xpath = "//button[text()='Sign in']")private WebElement btn;
	@FindBy(xpath = "//div[@id='toggle-id']") private WebElement clicksbtn;
	@FindBy(xpath = "//span[text()='Organization']") private WebElement clickonorg;
	@FindBy(xpath = "//button[text()='Add Organization']") private WebElement addorgbtn;
	@FindBy(xpath = "//input[@placeholder='Organization Name']") private WebElement orgname;
	@FindBy(xpath = "//input[@placeholder='GST Number']") private WebElement addgst;
	@FindBy(xpath = "//input[@placeholder='Address ']") private WebElement addaddress;
	@FindBy(xpath = "//input[@placeholder='City']") private WebElement addcity;
	@FindBy(xpath = "//input[@placeholder='State']") private WebElement addstate;
	@FindBy(xpath = "//input[@placeholder='Pincode']") private WebElement addpin;
	@FindBy(xpath = "//select[@name='refresh_time']") private WebElement clickrefresht;
//	@FindBy(xpath = "//option[@value='1']") private WebElement first;
	@FindBy(xpath = "//input[@name='supervisor_email']")private WebElement supervisor;
	@FindBy(xpath = "//input[@name='supervisor_name']")private WebElement supervisorname;
	@FindBy(xpath = "//input[@placeholder='Enter phone number']")private WebElement phoneno;
	@FindBy(xpath = "//button[text()='Submit']")private WebElement clicksubmit;
	
	public Create_Orgnization(WebDriver driver)
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
		clicksbtn.click();
	}
	public void clickonorgnizationtab()
	{
		clickonorg.click();
	}
	public void addorgnization()
	{
		addorgbtn.click();
	}
	public void enterorgname(String name)
	{
		orgname.sendKeys(name);
	}
	public void entergst(String gst)
	{
		addgst.sendKeys(gst);
	}
	public void enteraddress(String add)
	{
		addaddress.sendKeys(add);
	}
	public void entercity(String city)
	{
		addcity.sendKeys(city);
	}
	public void enterstate(String state)
	{
		addstate.sendKeys(state);
	}
	public void enterpin(String pin)
	{
		addpin.sendKeys(pin);
	}
	public void clickonrefreshtextbox()
	{
		clickrefresht.click();
	}
//	public void select1()
//	{
//		first.click();
//	}
	public void clickonsubmit()
	{
		clicksubmit.click();
	}
	public void entersupervisormail(String email)
	{
		supervisor.sendKeys(email);
	}
	public void enternameofsupername(String name)
	{
		supervisorname.sendKeys(name);
	}
	public void enterphone(String phone)
	{
		phoneno.sendKeys(phone);
	}
}
