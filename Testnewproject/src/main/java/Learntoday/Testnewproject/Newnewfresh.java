package Learntoday.Testnewproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newnewfresh {

	public static void main(String[] args) throws WebDriverException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedrivernew.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElementByXPath("(//input[@name='q'])[1]").sendKeys("Latest mobiles below 1 lakh");
		driver.findElementByXPath("(//input[@name='q'])[1]").sendKeys(Keys.ENTER);
		driver.findElementByXPath("//a[@class='UhJVed']//span[1]").click();
		
		Set<String> ml = new LinkedHashSet<String>();
		Set<String> mp = new LinkedHashSet<String>();
		
		List<WebElement> l1 = driver.findElementsByXPath("(//h3[@class='xsRiS'])");
		System.out.println("No. Of  Mobiles" + l1.size());
		for (WebElement ele : l1) {
			String text1 = ele.getText().substring(0, 10);
				ml.add(text1);
	
		}
		System.out.println("List of Mobiles in google: " +ml);
		System.out.println("Count : "+ml.size());

		List<WebElement> l2 = driver.findElementsByXPath("(//span[@class='Nr22bf']/following-sibling::span)");
		System.out.println("No. Of  price" + l2.size());

		for (WebElement ele : l2) {
			String text2 = ele.getText().substring(1);
				mp.add(text2);
			
		}	
		System.out.println("List of Mobile pricess in google: " +mp);
		System.out.println("Count : "+mp.size());

		List<String> mobileList = new ArrayList<String>(ml);
		List<String> mobilePrice = new ArrayList<String>(mp);
		HashMap<String,String> mobileWithPrice = new HashMap<String,String>();
		
		for (int i=0 ; i< mobileList.size(); i++) {
			mobileWithPrice.put(mobileList.get(i), mobilePrice.get(i));
		}
		
		System.out.println(mobileWithPrice);
		
	//write the contents from hashmap to text file
	try {
		FileWriter fw = new FileWriter("MyFile.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for (String key : mobileWithPrice.keySet()) {
			String value = mobileWithPrice.get(key);
			System.out.println(key + value);
			bw.write(key);;
			bw.newLine();
			bw.write(value);
			bw.newLine();
		}
		bw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	driver.quit();

	//Read the mobile name from text file and pass to flipkart
	
	int a =0;
		
		FileReader fr = new FileReader("MyFile.txt");
		BufferedReader br = new BufferedReader(fr);
		while((br.readLine())!=null) {
		String line = br.readLine();

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.flipkart.com");
		driver1.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
		driver1.findElementByName("q").sendKeys(line);
		driver1.findElementByName("q").sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		File src = driver1.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot"+a+".png");
		FileUtils.copyFile(src, dest); 
		driver1.close();
		br.readLine();

		}
		a++;

		
	}
}

