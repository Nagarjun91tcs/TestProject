package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GettingDataFromExcelnew {

	public static String[][] readExcelnew(String excelFileName) throws IOException{
		
		
		XSSFWorkbook wBook1 = new XSSFWorkbook ("./data/" +excelFileName+".xlsx");
			
		XSSFSheet sheet = 	wBook1.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();
		
		int ColCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][ColCount];
		
		for(int i=1;i<=rowCount;i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<ColCount;j++) {
				
				XSSFCell cell = row.getCell(j);
				
				data[i-1] [j] = cell.getStringCellValue();
				
				System.out.println(data[i-1][j]);
				
				
				
				
				
				
			}
			
			
		}
		
		wBook1.close();
		return data;
		
		
		

	}

}
