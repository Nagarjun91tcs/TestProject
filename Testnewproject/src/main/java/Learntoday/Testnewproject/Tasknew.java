package Learntoday.Testnewproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasknew {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedrivernew.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.findElementByXPath("//input[@title='Search']").sendKeys("latest mobiles", Keys.ENTER);
		driver.findElementByXPath("//div[@class='daicon']").click();
		
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./data/image.png");
		FileUtils.copyFile(src, des);
		
		
		FileWriter writer = new FileWriter("D:\\test.txt");
		BufferedWriter fw = new BufferedWriter(writer);
		fw.write(driver.findElementByXPath("(//span[@class='pymv4e'])[1]").getText()+";"+driver.findElementByXPath("(//div[@class='e10twf T4OwTb'])[1]").getText());
		fw.newLine();
		fw.write(driver.findElementByXPath("(//span[@class='pymv4e'])[3]").getText()+";"+driver.findElementByXPath("(//div[@class='e10twf T4OwTb'])[2]").getText());
		fw.newLine();
		fw.write(driver.findElementByXPath("(//span[@class='pymv4e'])[5]").getText()+";"+driver.findElementByXPath("(//div[@class='e10twf T4OwTb'])[3]").getText());
		fw.newLine();
		fw.write(driver.findElementByXPath("(//span[@class='pymv4e'])[7]").getText()+";"+driver.findElementByXPath("(//div[@class='e10twf T4OwTb'])[4]").getText());
		fw.newLine();
		fw.write(driver.findElementByXPath("(//span[@class='pymv4e'])[9]").getText()+";"+driver.findElementByXPath("(//div[@class='e10twf T4OwTb'])[5]").getText());
		fw.newLine();
		fw.write(driver.findElementByXPath("(//span[@class='pymv4e'])[11]").getText()+";"+driver.findElementByXPath("(//div[@class='e10twf T4OwTb'])[6]").getText());
		fw.newLine();
		fw.close();
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		
		//driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		String text="";
		
		FileInputStream fis =new FileInputStream("D:\\test.txt");
		int read = fis.available();
		for (int i = 0; i < read; i++) {
			text=text+(char)fis.read();

		}
		
		System.out.println(text);
		driver.findElementByName("q").sendKeys(text);
		
				
		
		driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
		
		driver.findElementByXPath("(//div[text()='Redmi Note 8 Pro (Gamma Green, 128 GB)'])[1]").click();
		
		
		
		Set<String> set  = driver.getWindowHandles();
		
		List<String> lis = new LinkedList<String>();
		
		driver.switchTo().window(lis.get(1));
		
		driver.findElementByXPath("(//button[contains(@class,'_2AkmmA _2Npkh4')])[1]").click();
		
		File src1 = driver.getScreenshotAs(OutputType.FILE);
		File des1 = new File("./data/image2.png");
		FileUtils.copyFile(src1, des1);
		
		
		
		
		
		//driver.findElementById("search").sendKeys(text);
		
		driver.close();


	}

}
