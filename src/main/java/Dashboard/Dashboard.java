package Dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	@FindBy(xpath = "//input[@name='email']")private WebElement mail;
	@FindBy(xpath = "//input[@name='password']")private WebElement pass;
	@FindBy(xpath = "//button[text()='Sign in']")private WebElement btn;
	@FindBy(xpath = "//span[@class='dropDownIcon']")private WebElement clickarrow;
	@FindBy(xpath = "//div[text()='Tipco Engineering']")private WebElement clickorgname;
	@FindBy(xpath = "//div[text()='THM']")private WebElement selectdev;
	
	
	public Dashboard(WebDriver driver)
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
	public void clickonorarrow()
	{
		clickarrow.click();
	}
	public void clickondevice()
	{
		selectdev.click();
	}
	public void clickonorgname()
	{
		clickorgname.click();
	}
	
	
	

}
