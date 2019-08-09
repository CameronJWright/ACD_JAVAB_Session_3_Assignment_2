package hello.world;

class Food {
	String type;
	
	Food(){
		
	}
	
	void display() {
		System.out.print("Type: "+type);
	}
}

class Carot extends Food {
	String taste;
	int length;
	
	Carot(){
		super();
	}

	Carot(String type, String taste, int length) {
		super.type = type;
		this.taste = taste;
		this.length = length;
	}
	
	void display() {
		super.display();
		System.out.println(" Taste: "+taste+" Length: "+length);

	}

}

public class SuperUsage {

	public static void main(String[] args) {
		
		Carot crt= new Carot("Vegetable","Tasty",5);
		crt.display();
		
	}

}
