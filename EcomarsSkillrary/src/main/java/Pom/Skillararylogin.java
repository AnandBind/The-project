package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillararylogin {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearstab;
	
	@FindBy(xpath ="//a[text()=' SkillRary Demo APP']")
	private WebElement killarydemo;
	
	public Skillararylogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gearsbutton()
	{
		gearstab.click();
	}
	public void demoskillrarybutton()
	{
		killarydemo.click();
	}
	
}
