package studentManageExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.*;

public class WritingExcel extends StudentClass{
	
	
	

	public static void writeExcel(StudentClass studentobj) throws IOException {
		
		FileInputStream file = new FileInputStream(new File("..//studentManageExcel//dataFile//Student.xlsx"));
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		System.out.println(workbook.getNumberOfSheets());
		
//		Object[][] empdata= {{6,"daya singh","D",19,20,21,22,23},
//								{7,"Abhijeeth","A",91,27,21,92,93}};
		
		Object[][] empdata= {{studentobj.getRollno(),studentobj.getName(),studentobj.getSection(),
			studentobj.getPhysics_marks(),studentobj.getMaths_marks(),studentobj.getChemistry_marks(),
			studentobj.getEnglish_marks(),studentobj.getComputerScience_marks(),studentobj.getTotal(),studentobj.getPercentage(),studentobj.getGrade()}};
		
//		
		
		int rowsLength=empdata.length;
		int colsLength=empdata[0].length;
		
//		System.out.print(rowsLength +" ");
//		System.out.print(colsLength);
		
		int lastRowno=sheet.getLastRowNum();
		for(int r=0;r<rowsLength;r++) {
			
			XSSFRow row=sheet.createRow(++lastRowno);
			
			for(int c=0;c<colsLength;c++) {
				XSSFCell cell=row.createCell(c);
				Object value=empdata[r][c];
				
				if(value instanceof String) cell.setCellValue((String) value);
				else if(value instanceof Integer ) cell.setCellValue((Integer) value);
				else if(value instanceof Boolean) cell.setCellValue((Boolean) value);
				else if(value instanceof Double) cell.setCellValue((Double)value);
				
			}
		}
		
		String filePath="..//studentManageExcel//dataFile//Student.xlsx";
		FileOutputStream fileOutputStream=new FileOutputStream(filePath);
		workbook.write(fileOutputStream);
		
		fileOutputStream.close();
		
		System.out.println("File Write Successful");
		
	}
	
	public static void writeCalc(Object[] empdata1) throws IOException{
		
		FileInputStream file = new FileInputStream(new File("..//studentManageExcel//dataFile//Student.xlsx"));
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		System.out.println(workbook.getNumberOfSheets());
		
//		int rowsLength=empdata1.length;
//		int colsLength=empdata1[0].length;
		
//		System.out.print(rowsLength +" ");
//		System.out.print(colsLength);
		
		int rowsLength=sheet.getLastRowNum();
		int colsLength=sheet.getRow(rowsLength).getLastCellNum();
		System.out.println(rowsLength+", "+colsLength);
		
		
			for(int i=0;i<3;i++){  
				XSSFCell cellobj =sheet.getRow(rowsLength).getCell(8+i);
				
				Object value=empdata1[i];  //{567,97.6,"A"}
				
				if(value instanceof String) cellobj.setCellValue((String) value);
				else if(value instanceof Integer ) cellobj.setCellValue((Integer) value);
				else if(value instanceof Boolean) cellobj.setCellValue((Boolean) value);
				else if(value instanceof Double) cellobj.setCellValue((Double)value);
				
				
			}
		
		String filePath="..//studentManageExcel//dataFile//Student.xlsx";
		FileOutputStream fileOutputStream=new FileOutputStream(filePath);
		
		workbook.write(fileOutputStream);
		
		fileOutputStream.close();
		
		System.out.println("Calculation is Updated !!");
		

		
	}

}
