package main;

public class NameCard {
	String name;
	String phone;
	String email;
	
	// class가 아닌 interface
	PrintNameCard printNameCard;
		
	public NameCard(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public void setPrintNameCard(PrintNameCard p) {
		this.printNameCard = p;
	}
	
	public void print() {
		printNameCard.print(this);
	}
}
