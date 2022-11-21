package generation.italy.shop;

public class Headphones extends Product {
	private String colour;
	private boolean wifi;
	public Headphones(String name, String brand, int price,String colour,boolean wifi) {
		super(name,brand,price);
		this.setColour(colour);
		this.setWifi(wifi);
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public String toString(){

		return "\nCuffie:" + super.toString()
				+"\ncolore: " + getColour() + "\nWifi: " + (isWifi()? "si":"no");
		
}
}
