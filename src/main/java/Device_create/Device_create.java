package Device_create;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Device_create {
	
	@FindBy(xpath = "//input[@name='email']")private WebElement mail;
	@FindBy(xpath = "//input[@name='password']")private WebElement pass;
	@FindBy(xpath = "//button[text()='Sign in']")private WebElement btn;
	@FindBy(xpath = "//div[@id='toggle-id']")private WebElement sbtn;
	@FindBy(xpath = "//span[text()='Device']")private WebElement devicetab;
	@FindBy(xpath = "//button[text()='Add Device']")private WebElement adddevice;
	@FindBy(xpath = "//input[@placeholder='Device Id ']")private WebElement Deviceid;
	@FindBy(xpath = "//span[@class='dropDownIcon']")private WebElement devicetype;
	@FindBy(xpath = "//input[@name='max_temp1_value']")private WebElement maxtemp1;
	@FindBy(xpath = "//input[@name='max_pressure1_value']")private WebElement maxpre;
	@FindBy(xpath = "//input[@name='max_pressure3_value']")private WebElement maxpre2;
	@FindBy(xpath = "//input[@name='max_pressure2_value']")private WebElement maxpre3;
	@FindBy(xpath = "//input[@name='max_vibration_value']")private WebElement maxvib;
	@FindBy(xpath = "//input[@name='max_temp2_value']")private WebElement maxtemp2;
	@FindBy(xpath = "//input[@name='max_temp3_value']") private WebElement maxtemp3;
	@FindBy(xpath = "//input[@placeholder='Please Select Time Zone']")private WebElement timezone;
	@FindBy(xpath = "//input[@placeholder='Please Select Organization']")private WebElement orgname;
	
	public Device_create(WebDriver driver)
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
	public void clickondevicetab()
	{
		devicetab.click();
	}
	public void clickonadddevice()
	{
		adddevice.click();
	}
	public void enterdeviceId(String id)
	{
		Deviceid.sendKeys(id);
	}
	public void clickondevicetypelistbox()
	{
		devicetype.click();
	}
	public void entermaxpresser(String maxp)
	{
		maxpre.sendKeys(maxp);
	}
	public void entermaxvibration(String vib)
	{
		maxvib.sendKeys(vib);
	}
	public void entertimezone(String time)
	{
		timezone.sendKeys(time);
	}
	public void maxtemp1(String temp1)
	{
		maxtemp1.sendKeys(temp1);
	}
	public void maxtemp2(String temp2)
	{
		maxtemp2.sendKeys(temp2);
	}
	public void maxtemp3(String temp3)
	{
		maxtemp3.sendKeys(temp3);
	}
	public void enterorgname(String entorg)
	{
		orgname.sendKeys(entorg);
	}
	public void maxpresser3(String pre2)
	{
		maxpre2.sendKeys(pre2);
	}
	public void maxpre2(String pre3)
	{
		maxpre3.sendKeys(pre3);
	}
	
	
}

