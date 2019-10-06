package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GettingDataFromExcel1 {
	
	
	public static String[][] readExcel1(String excelFileName1) throws IOException

	 {
		
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+excelFileName1+".xlsx");
		
		XSSFSheet sheet = wBook.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();
		//System.out.println(rowCount);
		
		int colCount = sheet.getRow(0).getLastCellNum();
		//System.out.println(colCount);
		
		String[][] data =new String[rowCount][colCount];
		
		for(int i=1;i<=rowCount;i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<colCount;j++) {
				
				XSSFCell cell = row.getCell(j);
				
				data[i-1][j] =cell.getStringCellValue();
				
				System.out.println(data[i-1][j]);				
				}	
		}
		
		wBook.close();
		return data;
		
	}
	
	
}
