package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillararydemologin {
	@FindBy(id="course")
	private WebElement coursetb;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtestin;
	
	public Skillararydemologin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCoursetb()
	{
		return coursetb;
	}
	public void seleniumtesting()
	{
		seleniumtestin.click();
	}
	
}