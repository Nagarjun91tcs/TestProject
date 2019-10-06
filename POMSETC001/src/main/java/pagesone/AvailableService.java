package pagesone;

import base.ProjectSpecificClassone;

public class AvailableService extends ProjectSpecificClassone{
	
	public PassengerDetailsPage enterBook() {
		
		driver.findElementByXPath("(//div[@class='button2 blue']//a)[1]").click();
		
		//driver.findElementByXPath("(//a[@href='#'])[4]").click();
		return new PassengerDetailsPage();
	}

}
