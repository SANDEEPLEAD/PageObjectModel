package com.Hrms.tests;

import org.testng.annotations.Test;

import com.Hrms.base.BasePage;
import com.Hrms.pages.LoginPage;
import com.Hrms.utils.CommonUtils;
import com.Hrms.utils.TestNgUtility;

public class TestLoginPage extends BasePage{
		
		//----------------Page class objects Implementations---------
			LoginPage loginPage = new LoginPage();
			
			
			@Test(description="verify LoginPage",priority=0)
			public void verifyLoginPage() throws Exception {
					
			loginPage.login();
			CommonUtils.hardWait(5);
			TestNgUtility.assertTrue(CommonUtils.getElementText(loginPage.getWelcomePage()),"Welcome, kosmik");
			System.out.println("verified");
			
			}
			
		}



