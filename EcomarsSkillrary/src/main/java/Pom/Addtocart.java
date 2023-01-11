package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	@FindBy(id="add")
	private WebElement plusbutton;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addbutton;
	
	
	public Addtocart(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}


	public WebElement getPlusbutton() {
		return plusbutton;
	}
	
	public void addcart()
	{
		addbutton.click();
	}
	
	

}
