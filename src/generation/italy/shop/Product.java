package generation.italy.shop;

import java.util.Random;

public class Product {
	private int code;
	private String name;
	private String brand;
	private int price;
	
	public Product(String name,String brand,int price){
		
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	public int price() {
		return price;
	}

	public int taxprice() {
	
	return price = price +(price*20/100);
}
	public static String getRandomNumberString() {
	    Random rnd = new Random();
	    int code = rnd.nextInt(99999);
	    return String.format("%05d", code);
	}
	
	
	
	public String toString(){

		return "\nil nome del Prodotto è: " + name + "\nMarca :" + brand +"\nprezzo all ingrosso(o anche per te vecchio abbonato):"+ price + "€"
				+"\nprezzo(al pubblico): " + taxprice() + "€" + "\nEan:"+ getRandomNumberString();
		
}
}
