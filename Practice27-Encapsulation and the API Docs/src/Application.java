class Plant{
public class Application {
	public static final int ID=7;
	private String name;
	public String getData() {
		String data="Some stuffs"+calculateGrowthForecast();
		return data;
	}
    
	 private int calculateGrowthForecast() {
		 return 9;
	 }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

	public static void main(String[] args) {

	}

}
