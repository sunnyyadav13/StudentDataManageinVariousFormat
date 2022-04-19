package studentManageJSONpkg;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {
	
    public static void readData() throws FileNotFoundException, IOException, ParseException  {
        
    	JSONParser jsonParser = new JSONParser();
		
		Object obj = jsonParser.parse(new FileReader("Student.json"));
        JSONArray jsonArray = (JSONArray)obj;
        System.out.println(jsonArray);

    
}}

