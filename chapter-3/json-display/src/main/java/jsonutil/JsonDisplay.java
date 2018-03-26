package jsonutil;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;
public class JsonDisplay {
    public static String generateJson(Object obj) {
	Gson gson = new GsonBuilder().create();
	String jsonString = gson.toJson(obj);
	return jsonString;
    }
}
