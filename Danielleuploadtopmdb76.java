package alfresco;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Danielleuploadtopmdb76 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("");
			
			driver.findElement(By.name("login")).sendKeys("");
			driver.findElement(By.name("password")).sendKeys("");
			driver.findElement(By.xpath("//*[@type='image']")).submit();
			
			Thread.sleep(1200);
			File src = new File ("C:\\Users\\vkoloyu\\daniel.xlsx");
			FileInputStream fis = new FileInputStream (src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet2 = wb.getSheetAt(1);
			
			for (int i=300; i<477; i++) {
			String data = sheet2.getRow(i).getCell(1).getStringCellValue(); 
	//search isbn
				driver.findElement(By.id("keyword")).sendKeys(data);
	//click what found
				Thread.sleep(1500);
				driver.findElement(By.xpath("//ul[@role='listbox']/li/a")).click();
				Thread.sleep(1500);
	//assets
				driver.findElement(By.linkText("Assets")).click();
				Thread.sleep(2000);
										
				WebElement r = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/form/table[2]/tbody/tr[7]/td[2]"));
				if (r.getText().contains("No file currently loaded.")){
			
				//select file
				driver.findElement(By.xpath("//input[@name='new_file_3']")).click();
				Thread.sleep(1100);
				
				String t = "C:\\Users\\vkoloyu\\alfrescoPDF\\danielle706\\deletedsmall\\resized310400\\";
				//start autoit to insert url
			
				Runtime.getRuntime().exec("C:\\Users\\vkoloyu\\autoit\\alfrescoAutoIt2.exe"+" "+t+data+".png");
				Thread.sleep(1100);
				//submit
				driver.findElement(By.xpath("//input[@name='submit_upload_file_3']")).click();
				Thread.sleep(1600);
				System.out.println(data);
				}
				
				else {
					//driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr/td[2]/form/table[2]/tbody/tr[7]/td[2]/a[2]")).click();
					Thread.sleep(1100);
					driver.navigate().refresh();
					Thread.sleep(1200);
				
					driver.findElement(By.xpath("//input[@name='new_file_3']")).click();
					Thread.sleep(1100);
					
					String t = "C:\\Users\\vkoloyu\\alfrescoPDF\\danielle706\\deletedsmall\\resized310400\\";
					//start autoit to insert url
				
					Runtime.getRuntime().exec("C:\\Users\\vkoloyu\\autoit\\alfrescoAutoIt2.exe"+" "+t+data+".png");
					Thread.sleep(1100);
					//submit
					driver.findElement(By.xpath("//input[@name='submit_upload_file_3']")).click();
					Thread.sleep(1200);
					driver.navigate().refresh();
					Thread.sleep(1200);
					
					System.out.println(data);
									}
							}
		wb.close();		
		driver.close();	

	}

}
