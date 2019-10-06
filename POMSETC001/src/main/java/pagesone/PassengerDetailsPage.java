package pagesone;

import base.ProjectSpecificClassone;

public class PassengerDetailsPage extends ProjectSpecificClassone {
	
	public PassengerDetailsPage getSetcTitle() {
		
		String title = driver.getTitle();
		System.out.println(title);
		return this;
	
	}

}
