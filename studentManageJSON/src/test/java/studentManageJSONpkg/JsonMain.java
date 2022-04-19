package studentManageJSONpkg;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public class JsonMain {

	public static void main(String[] args) throws IOException, ParseException {
		
		
		
		StudentC ramesh=new StudentC(1,"Ramesh Yadav","A",56,99,89,95,98);
		JsonWrite.writeData(ramesh);
		StudentC ramesh2=new StudentC(2,"Ramesh Singh","A",56,99,89,95,98);
		JsonWrite.writeData(ramesh2);
		
		JsonRead.readData();
		
		StudentC ramesh3=new StudentC(3,"Ramesh kumar","A",56,99,89,95,98);
		JsonWrite.writeData(ramesh3);
		
		JsonRead.readData();
	}

}
