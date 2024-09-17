import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Edit_profile.Edit_profile;
import Liberaryfiles.Base_class;
import Liberaryfiles.UtilityClass;

public class Test_editprofile extends Base_class {
	
	Edit_profile edit;
	@BeforeClass
	public void initializebrowser() throws IOException, InterruptedException
	{
		openbrowser();
		edit=new Edit_profile(driver);
		Thread.sleep(5000);
		edit.entermail(UtilityClass.propertiesfile("validmail"));
		edit.entpass(UtilityClass.propertiesfile("validpass"));
		Thread.sleep(3000);
		edit.clickbuttonsubmit();
	}
	@Test
	public void Verify_to_check_edit_full_namefield() throws InterruptedException
	{
		Thread.sleep(25000);
		edit.clicksbtn();
		edit.clickprofiletab();
		Thread.sleep(3000);
		edit.editname();
		Thread.sleep(5000);
		edit.editphone();
		Thread.sleep(3000);
		edit.submit();
		
	}
	

}
