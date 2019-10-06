package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


import Utils.GettingDataFromExcel1;

public class ProjectSpecificClassone {

	public String excelFileName1;
	
	public static ChromeDriver driver;
	
    @Parameters({"url"})
    
    @BeforeMethod
    
    public void startApp1(String url) {
    	
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    	
    	driver = new ChromeDriver();
    	
    	driver.get(url);
    	
    	driver.manage().window().maximize();
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	
    }
	
    @AfterMethod
    public void afterMethod() {
    	
    	driver.close();
    }
    
    @DataProvider(name = "fetchData")
	
	public Object[][] getData() throws IOException{
		
	return GettingDataFromExcel1.readExcel1(excelFileName1);	
	 
}

    
  
}
