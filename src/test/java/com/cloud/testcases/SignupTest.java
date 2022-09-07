package com.cloud.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.cloud.qa.base.TestBase;
import com.cloud.qa.pages.DashboardPage;

import lombok.experimental.Helper;




public class SignupTest {
	
	

	@Test
	public void EmpCloud_Signup_Test () throws InterruptedException {	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\git\\EmpCloud\\Drivers\\chromedriver1.exe");
		WebDriver driver =new ChromeDriver();
		String baseUrl = "https://d32h3vn85slvoi.cloudfront.net/";
		driver.get(baseUrl);
		Reporter.log("<B><font color = 'orange'> Step1 -</font>Launched Emp cloud Page");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".button-sm-simple")).click();
		Reporter.log("<B><font color = 'orange'> Step2 -</font>Clicked on Try For Free Button");
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/button[2]")).click();
		Reporter.log("<B><font color = 'orange'> Step3 -</font>Clicked on Active Monitoring Button");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".items-center [fill]")).click();
		Reporter.log("<B><font color = 'orange'> Step4 -</font>Clicked on Continue For Free Button");
		Thread.sleep(3000);
		
		
		WebElement email =driver.findElement(By.cssSelector("[type='email']"));
		email.clear();email.sendKeys("sitaramireddy@globussoft.in");
		Reporter.log("<B><font color = 'orange'> Step5 -</font>Entered Email address");
		Thread.sleep(3000);
		
		
		WebElement FirstName =driver.findElement(By.cssSelector("input[name='firstName']"));
		FirstName.clear();FirstName.sendKeys("sithu");
		Reporter.log("<B><font color = 'orange'> Step6 -</font>Entered First Name");
		Thread.sleep(3000);
		
		
		WebElement LastName =driver.findElement(By.cssSelector("input[name='lastName']"));
		LastName.clear();LastName.sendKeys("Kalluru");
		Reporter.log("<B><font color = 'orange'> Step7 -</font>Entered Last Name");
		Thread.sleep(3000);
		
		
		WebElement Password =driver.findElement(By.cssSelector("input[name='password']"));
		Password.clear();Password.sendKeys("Sithu99123@");
		Reporter.log("<B><font color = 'orange'> Step8 -</font>Entered Password");
		Thread.sleep(3000);
		
		
		WebElement ConfirmPassword =driver.findElement(By.cssSelector("input[name='confirmPassword']"));
		ConfirmPassword.clear();ConfirmPassword.sendKeys("Sithu99123@");
		Reporter.log("<B><font color = 'orange'> Step9 -</font>Entered Confirm password");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement CompanyName =driver.findElement(By.cssSelector("input[name='cname']"));
		CompanyName.clear();CompanyName.sendKeys("GlobusSoft");
		Reporter.log("<B><font color = 'orange'> Step10 -</font>Entered CompanyName");
		Thread.sleep(3000);
		
		
		WebElement TeamSize =driver.findElement(By.cssSelector("select[name='sizeOfWorkforce']"));
		TeamSize.click();
		  TeamSize =driver.findElement(By.cssSelector("[value='10']"));
		  TeamSize.click();
		Reporter.log("<B><font color = 'orange'> Step11 -</font>Selected Team Size 1-10");
		Thread.sleep(3000);
		
		
		WebElement PhoneNumber =driver.findElement(By.cssSelector("input[name='phoneNumber']"));
		PhoneNumber.clear();
		PhoneNumber.sendKeys("9912376843");
		Reporter.log("<B><font color = 'orange'> Step12 -</font>Entered Phone Number");
		Thread.sleep(3000);
		
		
		WebElement Country =driver.findElement(By.cssSelector("[name='country']"));
		Country.click();
		Country =driver.findElement(By.cssSelector("[value='IN']"));
		Country.click();
		Reporter.log("<B><font color = 'orange'> Step13 -</font>Selected Country india");
		Thread.sleep(3000);
		
		WebElement State =driver.findElement(By.cssSelector("input[name='state']"));
		State.clear();
		State.sendKeys("AndhraPradesh");
		Reporter.log("<B><font color = 'orange'> Step14 -</font>Entered State name AndhraPradesh");
		Thread.sleep(3000);
		
		WebElement City =driver.findElement(By.cssSelector("input[name='city']"));
		City.clear();
		City.sendKeys("Kurnool");
		Reporter.log("<B><font color = 'orange'> Step15 -</font>Entered City Name Kurool ");
		Thread.sleep(3000);
		
		WebElement Zipcode =driver.findElement(By.cssSelector("input[name='zip']"));
		Zipcode.clear();
		Zipcode.sendKeys("518100");
		Reporter.log("<B><font color = 'orange'> Step16 -</font>Entered Zipcode");
		Thread.sleep(3000);
		
//		WebElement Teco =driver.findElement(By.cssSelector("input[name='termsAndCondition']"));
//		Teco.click();
//		Reporter.log("<B><font color = 'orange'> Step17 -</font>Clicked on Terms and Condtion check Box");
//		Thread.sleep(3000);
//		
		WebElement Create =driver.findElement(By.cssSelector(".button.items-center.mt-5"));
		Create.click();
		Reporter.log("<B><font color = 'orange'> Step17 -</font>Clicked on Create Account Button");
		Thread.sleep(9000);
		
		
		driver.quit();
		

		
		
	}

	
	}
	
	

