
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.json.JsonOutput;

import java.io.FileReader;
import java.util.Iterator;

public class ParseJson {
    JSONParser parser;
    JSONObject jsonObject;

    public ParseJson(String filePath) {
        parser = new JSONParser();
        try{
            Object obj = parser.parse(new FileReader(filePath));
            jsonObject = (JSONObject) obj;
        }
        catch(Exception e) {e.printStackTrace();}
    }

    public String getString(String label) {
        return (String) jsonObject.get(label);
    }

    public Iterator<String> getJSONArray(String label) {
        JSONArray jsonArray = (JSONArray) jsonObject.get(label);
        return jsonArray.iterator();
    }
}

