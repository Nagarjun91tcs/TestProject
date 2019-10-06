package testcasesnew;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificClassone;
import pagesone.LoginPage;

public class Tc001_LoginSetcPage extends ProjectSpecificClassone {
	
	@BeforeTest
	public void setData() {
		excelFileName1="cmpy1";
	}
	
	
	@Test(dataProvider="fetchData")
	public void setcTestCase(String username,String password,String fromplace,String toplace) throws InterruptedException {
		
		
		 new LoginPage()
		.enterSetcUsername(username)
		.enterSetcPassword(password)
		.clickSetc()
		.enterSetcfromdate(fromplace)
		.enterSetcTodate(toplace)
		.clickSetcButton()
		.enterBook()
		.getSetcTitle();
		
       		
	}

}
