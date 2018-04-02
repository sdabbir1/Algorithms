package Testhere;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Json {



	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
		Prims p = new Prims();
		ObjectMapper mapperObj = new ObjectMapper();
		try {
			String str = mapperObj.writeValueAsString(p);
			System.out.println(str);
			p = mapperObj.readValue(str, Prims.class);
			System.out.println(p.toString());
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
