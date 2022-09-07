package com.cloud.testcases;

import org.testng.annotations.Test;

import com.cloud.qa.base.TestBase;
import com.cloud.qa.pages.DashboardPage;

public class Empcloud_Onboard_Test extends TestBase {
	
	@Test
	public void EmpCloud_OnboardEmployees_page () throws InterruptedException {			
		DashboardPage dp = new DashboardPage(getDriver());		
		dp.EmpCloud_OnboardEmployees_page();
		
		
	}

}
