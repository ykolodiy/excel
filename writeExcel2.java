package writeExcel;
//tut zapysujem w eksel
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// apache POI
		//locate file
		File src = new File ("C:\\Users\\vkoloyu\\test.xlsx");
		//input stream class
		FileInputStream fis = new FileInputStream (src);
		//load full workbook XSSF by xlsx
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//focus on sheet1 index0
		XSSFSheet sheet1 = wb.getSheetAt(0);
	//row1 col1
		
		//WRITING!!!!!!!!!!!!!!!!!!!!
		
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		sheet1.getRow(1).createCell(2).setCellValue("Fail");
		//saving file
		FileOutputStream fout = new FileOutputStream (src);
		wb.write(fout);
		
		wb.close();
	}

}
