package studentManageExcel;

import java.io.IOException;

public class HomeClass {

	public static void main(String[] args) throws IOException {
		
		StudentClass Shivam=new StudentClass(1,"Ramesh Yadav","A",56,99,89,95,98);
		Object[] obj =Shivam.calculatation();
		
		WritingExcel.writeExcel(Shivam); // INITIAL VALUES INSERTION
		
//		Shivam.writeData(obj);
		
		ReadingExcel.readData();
		

}

	
	
}
