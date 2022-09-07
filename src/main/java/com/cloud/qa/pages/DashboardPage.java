package com.cloud.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.cloud.qa.base.TestBase;
import com.cloud.qa.util.Helpers;

public class DashboardPage extends BasePage {

	Helpers helper = new Helpers();

	public DashboardPage(WebDriver driver) throws InterruptedException {
		super(TestBase.getDriver());
	}

	

	@FindBy(css = "[class='button w-auto px-10']")
	WebElement PopUpButton;
	
	@FindBy(css = "[class] span [alt='EmpCloud']")
	WebElement EmpClouDashBoard;
	
	@FindBy(css = "[class] .dropdownp-item:nth-of-type(1) [data-mdb-ripple]")
	WebElement Workobservability;
	
	@FindBy(xpath = "//span[contains(text(),'Onboard employees')]")
	WebElement OnboardEmployees;
	
	@FindBy(xpath = "//div[@id='__next']/div[@class='font-mulish']/div[@class='main-wrapper']/div[@class='card']/div/div[1]/div[2]/div[1]/input")
	WebElement Employee_one_empid;
	
	@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/input[1]")
	WebElement Employee_one_WorkEmail;
	
	@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/input[1]")
	WebElement Employee_one_FirstName;
	
	@FindBy(xpath = "//body/div[@id='__next']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[4]/input[1]")
	WebElement Employee_one_LastName;
	
	@FindBy(css = "[class='small-button items-center xs\\:w-full py-2 flex h-9 mb-2']")
	WebElement Next_Button;
	
	
	

	

	public void EmpCloud_Dashbaord_page() throws InterruptedException {

		
		
		
		Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into EmpCloud Web Application");
		
//		helper.waitForPageToLoad();
//		helper.waitFor(PopUpButton);
//		helper.highLightElement(driver, PopUpButton);
//		PopUpButton.click();
//		Reporter.log("<B><font color = 'orange'> Step2 -</font> Popup Button is Dislayed and Clicked on Continue");
//		
		
		
		helper.waitFor(EmpClouDashBoard);
		helper.highLightElement(driver, EmpClouDashBoard);
		String Page_titel = driver.getTitle();
		System.out.println(Page_titel);
		Reporter.log("<B><font color = 'orange'> Step2 -</font> I am on the page :" + Page_titel);
		
	}
		
	
	
	
	
	
	///////////////////////////////// OnboardEmployees///////////////////////////////////
	
		public void EmpCloud_OnboardEmployees_page() throws InterruptedException {

			
			
			
			Reporter.log("<B><font color = 'orange'> Step1 -</font> Logged into EmpCloud Web Application");
						

			
			helper.waitFor(Workobservability);
			helper.highLightElement(driver, Workobservability);
			helper.jsCLick(Workobservability);
			Thread.sleep(4000);
			Reporter.log("<B><font color = 'orange'> Step2 -</font> clicked on Workobservability Page");
			
			helper.waitFor(OnboardEmployees);
			helper.highLightElement(driver, OnboardEmployees);
			helper.jsCLick(OnboardEmployees);
			Thread.sleep(4000);
			Reporter.log("<B><font color = 'orange'> Step3 -</font> clicked on OnboardEmployees Page");
			
			helper.waitFor(Employee_one_empid);
			helper.highLightElement(driver, Employee_one_empid);
			Employee_one_empid.sendKeys("1");
			Thread.sleep(4000);
			Reporter.log("<B><font color = 'orange'> Step4 -</font> sent data into Empid one ");
			
			helper.waitFor(Employee_one_WorkEmail);
			helper.highLightElement(driver, Employee_one_WorkEmail);
			Employee_one_WorkEmail.sendKeys("bc@gmail.com");
			Thread.sleep(4000);
			Reporter.log("<B><font color = 'orange'> Step5 -</font> sent data into Employee_one_WorkEmail ");
			
			helper.waitFor(Employee_one_FirstName);
			helper.highLightElement(driver, Employee_one_FirstName);
			Employee_one_FirstName.sendKeys("Test");
			Thread.sleep(4000);
			Reporter.log("<B><font color = 'orange'> Step6 -</font> sent data into Employee_one_FirstName ");
		
			
			helper.waitFor(Employee_one_LastName);
			helper.highLightElement(driver, Employee_one_LastName);
			Employee_one_LastName.sendKeys("one");
			Thread.sleep(4000);
			Reporter.log("<B><font color = 'orange'> Step7 -</font> sent data into Employee_one_LastName ");
			
			helper.waitFor(Next_Button);
			helper.highLightElement(driver, Next_Button);
			helper.jsCLick(Next_Button);
			Thread.sleep(20000);
			Reporter.log("<B><font color = 'orange'> Step8 -</font> Clicked on NextButton ");
		
		
		
		
		
		
		


		

		

	}

}
