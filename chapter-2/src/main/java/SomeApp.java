import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

class SomeApp {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Gson gson = new GsonBuilder().create(); // requires external library to be provided
    }
}
