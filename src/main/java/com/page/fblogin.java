/**
 * 
 */
package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Yogiiii
 *
 */
public class fblogin
{
	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="pass")
	private WebElement passwd;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement login_btn;
	
	@FindBy(xpath="//i[@class='fb_logo img sp_TqdTTRwIEat sx_59d053']")
	private WebElement fblogo;
	
	
	public fblogin(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void log()
	{
		uname.sendKeys("ABC");
		passwd.sendKeys("ABC");
		login_btn.click();
	}
	
	public boolean logo()
	{
		return fblogo.isDisplayed();
	}
	
}
