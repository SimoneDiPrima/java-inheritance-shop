package generation.italy.shop;

public class Television extends Product{
 private int size;
 private boolean smart;
 
 public Television(String name, String brand, int price,
			 int size, boolean smart) {
 super(name,brand,price);
 this.setSize(size);
 this.setSmart(smart);
 }

public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}

public boolean isSmart() {
	return smart;
}

public void setSmart(boolean smart) {
	this.smart = smart;
}

public String toString(){

	return "\n"+ super.toString()+ "\nPollici televisore: " + getSize()+
			"\nSmart tv: " + (isSmart()?"yes":"no");
	
}
}
