package ScottSSrevieSite;

import java.io.File;
import jxl.Workbook;

public class Scriptik {

	public static void main(String[] args) throws Exception, Throwable {
		File src = new File ("C:/tmp/testScott.xls");
		
		//load excel file
		Workbook wb = Workbook.getWorkbook(src);
		//get cell
		
		
		
		for (int pz=35; pz<197; pz++) {
		
			String type = wb.getSheet(0).getCell(5,pz).getContents();
			
			
			String title = wb.getSheet(0).getCell(1,pz).getContents();
			String url = wb.getSheet(0).getCell(4,pz).getContents();
			
	
			
			if (type.equals("mp4")) {
				System.out.println("<li><a class=\"nyroModal640\"  href=\""+url+"\" target=\"_blank\">"+title+"</a>&nbsp;<span class=\"fa fa-file-video-o\">&nbsp;</span></li>");
				
			} 
			
			else if (type.equals("DOC")) {
				
				System.out.println("<li><a href=\""+url+"\" target=\"_blank\">"+title+"</a>&nbsp;<span class=\"fa fa-file-word-o\">&nbsp;</span></li>");
				
			} 
			
			
			else if (type.equals("PDF")) {
				
				System.out.println("<li><a class=\"nyroModal1024\"  href=\""+url+"\" target=\"_blank\">"+title+"</a>&nbsp;<span class=\"fa fa-file-pdf-o\">&nbsp;</span></li>");
							}
			
			
			
			else if (type.equals("SCO")) {
				System.out.println(" <li><a class=\"nyroModal1024\"  href=\""+url+"\" target=\"_blank\">"+title+"</a>&nbsp;<span class=\"fa fa-external-link\">&nbsp;</span></li>");
				
				
			} 

	}
	}
}
