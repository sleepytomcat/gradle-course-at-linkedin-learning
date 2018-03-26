import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

public class SomeApp {
    public static void main(String[] args) {
        SomeRecord record = new SomeRecord("hello", 42);       
	Gson gson = new GsonBuilder().create(); // requires external library to be provided
	String jsonString = gson.toJson(record);
	System.out.println(jsonString);
    }
}

class SomeRecord {
    private String text;
    private int number;
    SomeRecord (String text, int number) {
	this.text = text;
	this.number = number;
    }
}
