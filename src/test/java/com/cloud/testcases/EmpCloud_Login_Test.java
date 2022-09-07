package com.cloud.testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.cloud.qa.base.TestBase;
import com.cloud.qa.pages.DashboardPage;




public class EmpCloud_Login_Test extends TestBase{
	
	

	@Test
	public void EmpCloud_Login_Test () throws InterruptedException {			
		DashboardPage dp = new DashboardPage(getDriver());		
		dp.EmpCloud_Dashbaord_page();
		
		
	}
	
	
}
