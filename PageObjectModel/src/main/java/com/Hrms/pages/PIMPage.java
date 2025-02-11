package com.Hrms.pages;

import org.openqa.selenium.By;

import com.Hrms.utils.CommonUtils;

public class PIMPage {
	
	// Web locators

		//private final static By by_pim = By.xpath("//li[@id='pim']");
	    private final static By by_pim = By.xpath("//div[normalize-space()='Practice']");
		//private final static By by_addEmp = By.xpath("//*[@id='pim']/ul/li[2]/a");
	    private final static By by_addEmp = By.xpath("//a[contains(text(),'160 Days of DSA')]");
	    private final static By by_searchEmployee = By.xpath("//input[@placeholder='Search...']");

	    private final static By by_addEmp1 = By.xpath("//div[@class='defaultProfileImg']");
	    private final static By by_addEmp2 = By.xpath("//span[normalize-space()='Logout']");
	    private final static By by_iframe = By.xpath("//a[@class='basicUserDetails_head_editProfileDiv_btn__dVHzW']");
		private final static By by_firstName = By.xpath("//input[@id='txtEmpFirstName']");
		private final static By by_lastName = By.xpath("//input[@id='txtEmpLastName']");
		//private final static By by_iframe = By.xpath("//iframe[@id='rightMenu']");
		
		private final static By by_save = By.xpath("//input[@id='btnEdit']");
		private final static By by_back = By.xpath("//input[@class='backbutton']");
		private final static By by_empName = By.xpath("//a[contains(text(),'Sai')]");
		private final static By by_getEmpDelete = By.xpath("//*[@id='pim']/u1/li[2]/a"); 
		// Getter/Setter Helping functions
		public static void clickOnElement() throws Exception {
			CommonUtils.clickElement(getPim());
		}
		
		public static By getPim() throws Exception {
			return by_pim;
		}
		
		public static By getAddEmp() throws Exception {
			return by_addEmp;
		}
		public static By getAddEmp1() throws Exception {
			return by_addEmp1;
		}
		public static By getAddEmp2() throws Exception {
			return by_addEmp2;
		}
		
		public static By getFirstName() throws Exception {
			return by_firstName;
		}
		
		public static By getLastName() throws Exception {
			return by_lastName;
		}
		
		public static By getFrame() throws Exception {
			return by_iframe;
		}
		
		public static By getSave() throws Exception {
			return by_save;
		}
		
		public static By getBackButton() throws Exception {
			return by_back;
		}
		
		public static By getEmpName() throws Exception {
			return by_empName;
		}
		
		 public static By searchEmployee() throws Exception {
				return by_searchEmployee;
			}
		 public static By getEmpDelete() throws Exception {
				return by_getEmpDelete;
			}
		
		
	}



