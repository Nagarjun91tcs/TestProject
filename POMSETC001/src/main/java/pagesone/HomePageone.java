package pagesone;

import base.ProjectSpecificClassone;

public class HomePageone extends ProjectSpecificClassone{

	public HomePageone enterSetcfromdate(String fromplace) {
		
		//driver.findElementById("matchStartPlace").sendKeys("CHENNAI CMBT");
		driver.findElementById("matchStartPlace").sendKeys(fromplace);
		driver.findElementByLinkText("CHENNAI CMBT").click();
		return this;
	}
	
	
	public HomePageone enterSetcTodate(String toplace) {
		//driver.findElementById("matchEndPlace").sendKeys("MADURAI");
		driver.findElementById("matchEndPlace").sendKeys(toplace);
		driver.findElementByLinkText("MADURAI").click();
		return this;
		
	}
	
	public AvailableService clickSetcButton() throws InterruptedException {
		Thread.sleep(1000);
		
		//driver.findElementByLinkText("search Available services").click();
	driver.findElementByXPath("//div[@class='btnTxt']").click();
	   return new AvailableService();
	}
	
	public void getSetcTitle() {
		
         String name = driver.getTitle();
		
		if(name.contains("TNSTC")) {
			
			System.out.println("Verified");
		}
		
	}
	
	
}
