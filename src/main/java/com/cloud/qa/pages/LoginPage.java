package com.cloud.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.cloud.qa.base.TestBase;
import com.cloud.qa.util.Helpers;
@Listeners(ITestNGListener.class)

public class LoginPage  extends BasePage{
	
	Helpers helper=new Helpers();
	
	public LoginPage(WebDriver driver) throws InterruptedException {
		super(TestBase.getDriver());
	}
	
	
	//ELEMENTS ON LOGIN PAGE:
	@FindBy(css = "input[name='email']")
	WebElement input_username;

	@FindBy(css = "input[name='password']")
	WebElement input_password;
	
	@FindBy(css = "[fill]")
	WebElement Showpassword;
	
	@FindBy(css = "[type='checkbox']")
	WebElement Rememberme;

	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	WebElement Button_login;
	

	
	public void login(String un, String pwd) throws InterruptedException{
		
		
		helper.highLightElement(driver, input_username);
		input_username.sendKeys(un);
		Reporter.log("<B><font color = 'orange'>Username .</font></B> Entered User ID");		
		
		helper.highLightElement(driver, input_password);
		input_password.sendKeys(pwd);
		Reporter.log("<B><font color = 'orange'>Password .</font></B> Entered Password");
		
	
		helper.waitFor(Showpassword);
		helper.highLightElement(driver, Showpassword);
		Showpassword.click();
		Assert.assertTrue(Showpassword.isDisplayed(), "Show Password is Dispalyed and Clicked On show Password Button");
		Reporter.log("<B><font color = 'orange'> ShowPassword -</font> Show Password is Dispalyed and Clicked On show Password Button");
		
		helper.highLightElement(driver, Rememberme);
		Rememberme.click();
		Reporter.log("<B><font color = 'orange'>Rememberme .</font></B> Clicked On  Rememberme CheckBox");
		
		helper.highLightElement(driver, Button_login);
		Button_login.click();		
		Reporter.log("<B><font color = 'orange'>Sign In Button .</font></B> Clicked on Submit Button");
		
		Thread.sleep(7000);
	
		}
	}	