package pagesone;

import base.ProjectSpecificClassone;

public class LoginPage extends ProjectSpecificClassone {
	
	
	public LoginPage enterSetcUsername(String username) {
		
		driver.findElementByName("txtUserLoginID").sendKeys("NAGARJUNB");
		return this;
	}
	
	public LoginPage enterSetcPassword(String password) {
		
		driver.findElementByName("txtPassword").sendKeys("28419543");
		return this;
	}
	
	
	public HomePageone clickSetc()  {
		
		
		
		driver.findElementByClassName("dboxheader").click();
		
		return new HomePageone();
	}
	

}
