package com.Hrms.pages;


import java.util.Properties;

import org.openqa.selenium.By;

import com.Hrms.utils.CommonUtils;
import com.Hrms.utils.TestNgUtility;

public class LoginPage {
	
//private static final String TestNgUtility = null;

//private static final By by_getLater = null;

public static Properties properties;
	
	// Web locators
	//private final By by_username = By.xpath("//input[@name='txtUserName']");
	//private final By by_password = By.xpath("//input[@name='txtPassword']");
	//private final By by_signInn = By.xpath("//button[@class='signinButton gfg_loginModalBtn login-modal-btn']");
    private final By by_username = By.xpath("//input[@name='username']");
    private final By by_password = By.xpath("//input[@name='password']");
    private final By by_signIn = By.xpath("//input[@name='submit']");
	
	private final By by_welcomepage = By.xpath("//h3[1]");
	// Helping functions
	public void login() { 
		
		
		
		try {
			
			CommonUtils.readPropertiesFile(null);
			
			CommonUtils.enterValue(getUsername(), "kosmik",true);
			
			CommonUtils.enterValue(getPassword(), "kosmik", true);
			
			CommonUtils.clickElement(getSignIn());
			
			
			
		}catch(Exception e) {
			TestNgUtility.assertFail(e.getMessage());
		}
	}
		
	// Getter/Setter functions
	public By getUsername() {
		return by_username;
	}
	
	public By getPassword() {
		return by_password;
	}
	
	public By getSignIn() {
		return by_signIn;
	}
	
	public By getWelcomePage() {
		return by_welcomepage;
	}
}



