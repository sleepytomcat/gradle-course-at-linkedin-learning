import jsonutil.JsonDisplay;

class SomeApp {
    public static void main(String[] args) {
        SomeRecord record = new SomeRecord("hello", 42);
	String jsonString = JsonDisplay.generateJson(record);
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
