package scripts;

import org.testng.annotations.Test;

import Pom.Addtocart;
import Pom.Skillararydemologin;
import Pom.Skillararylogin;
import genaricLib.StepGroup;


public class TestCase1 extends StepGroup
{
	@Test
	public void tc1()
	{
		Skillararylogin login=new Skillararylogin(driver);
		login.gearsbutton();
		login.demoskillrarybutton();
		
		Skillararydemologin demologin=new Skillararydemologin(driver);
		driverutility.switchTabs(driver);
		driverutility.mouseHover(driver, demologin.getCoursetb());
		demologin.seleniumtesting();
		
		Addtocart ad=new Addtocart(driver);
		driverutility.doubleClick(driver, ad.getPlusbutton());
		ad.addcart();
		driverutility.alertPopup(driver);
						
	}
	
	

}
