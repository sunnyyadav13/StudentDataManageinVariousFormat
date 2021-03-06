package studentManageJSONpkg;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JsonWrite  {
	 
    
    @SuppressWarnings("unchecked")
	public static void writeData(StudentC userC) {
    	try {
    		JSONParser jsonParser = new JSONParser();
    		
    		Object obj = jsonParser.parse(new FileReader("Student.json"));
            JSONArray jsonArray = (JSONArray)obj;
       
        JSONObject userDetails=new JSONObject();
        
        userDetails.put("RollNo", userC.getRollno());
        userDetails.put("Name", userC.getName());
        userDetails.put("Section", userC.getSection());
        userDetails.put("Physics", userC.getPhysics_marks());
        userDetails.put("Chemistry", userC.getChemistry_marks());
        userDetails.put("Maths", userC.getMaths_marks());
        userDetails.put("English", userC.getEnglish_marks());
        userDetails.put("ComputerSci", userC.getComputerScience_marks());
        userDetails.put("Total", userC.getTotal());
        userDetails.put("Percentage", userC.getPercentage());
        userDetails.put("Grade", userC.getGrade());

        //Add employees to list
      
        jsonArray.add(userDetails);
        

        //Write JSON file
        FileWriter file = new FileWriter("Student.json");

        file.write(jsonArray.toJSONString());
        file.flush();
        
        

        }catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    	
    	
        System.out.println("User Complete data updated in json file ");
    }
    
    
}
