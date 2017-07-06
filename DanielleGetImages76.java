package alfresco;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import javax.imageio.ImageIO;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DanielleGetImages76 {
	static String  data;
	static String  isbn;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
			
	
			
			File src = new File ("C:\\Users\\vkoloyu\\daniel.xlsx");
			FileInputStream fis = new FileInputStream (src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet1 = wb.getSheetAt(0);
			
			for (int i=1; i<936; i++) {
				isbn = sheet1.getRow(i).getCell(0).getStringCellValue();
				data = "http://www.mypearsonstore.com/ShowCover.asp?isbn="+sheet1.getRow(i).getCell(0).getStringCellValue()+"&amp;type=a"; 
		//search isbn
				JavaImageIO(data);
			}
			wb.close();
			
	}
	
	
	//=IF(ISERROR(VLOOKUP(E1240,'Project Overview'!M:M,1,FALSE)),"OUT","KEEP")
	
	public static void JavaImageIO(String url2)
	  {
	    try
	    { 
	      // the line that reads the image file
	    
	    	
	    	 URL url3 = new URL(url2);
	   
	      BufferedImage image = ImageIO.read(url3);
	      ImageIO.write(image, "png", new File("C:\\Users\\vkoloyu\\alfrescoPDF\\danielle706\\"+ isbn +".png"));
	      
	    } 
	    catch (Exception e)
	    {
	    	System.out.println("Exception occured :" + e.getMessage());
	    }
	    System.out.println(data+ " ok");
	  }
	
	
	
	
	
	
	

}
