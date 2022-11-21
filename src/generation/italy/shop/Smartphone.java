package generation.italy.shop;

public class Smartphone extends Product {
	private String Imei;
	private int memory;
	
	public Smartphone(String name, String brand, int price,
			 String imei, int memory) {

		super( name, brand, price);

this.Imei = imei;
this.setMemory(memory);

	}
	public String getImei() {
		return Imei;
	}
	public void setImei(String imei) {
		this.Imei = imei;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}

	public String toString(){

		return "\n"+ super.toString()+ "\nImei: " + getImei()+
				"\nMemory: " + getMemory() + "GB";
		
}
	}
