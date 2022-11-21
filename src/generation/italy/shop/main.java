package generation.italy.shop;



public class main {
	
	public static void main(String[] args) {
		
		Television t = new Television("magic tv", "hp", 44565, 45, true);
		System.out.print(t);
		System.out.print("--------------------------------------------");
		Smartphone S = new Smartphone("Telefonino ultra piccino","Motorola",77,"12345667",64);
		System.out.print(t);
		Headphones c = new Headphones("Cuffie superTronic Drake 2500","Drake snc",49,"red",true);
		System.out.print(c);
}
}
