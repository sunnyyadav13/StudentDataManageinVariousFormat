package studentManageExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.binary.XSSFBSheetHandler;
import org.apache.poi.xssf.usermodel.*;

public class ReadingExcel extends StudentClass {
	
	

	public static void readExcel() throws IOException {
		
		String filePath="..//studentManageExcel//dataFile//Student.xlsx";
		FileInputStream fileinputstream= new FileInputStream(filePath);
		
		XSSFWorkbook workbook =new XSSFWorkbook(fileinputstream);
		
//		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		System.out.println(rows +" "+ cols);
		
		Iterator iterator=sheet.iterator();
		
		while(iterator.hasNext()) {
			XSSFRow rowitr=(XSSFRow)iterator.next(); //single row in rowitr
			Iterator cellitr=rowitr.cellIterator();
			while(cellitr.hasNext()) {
				XSSFCell cell=(XSSFCell)cellitr.next();
				switch (cell.getCellType()) {
				case STRING -> System.out.print(cell.getStringCellValue());
				case NUMERIC -> System.out.print(cell.getNumericCellValue());
				case BOOLEAN -> System.out.print(cell.getBooleanCellValue());
		
				default ->
				throw new IllegalArgumentException("Unexpected value: " + cell);
				}
				System.out.print(" | ");
			}
			System.out.println("");
			
			
		}
		
		

	}

}
