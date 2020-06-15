package main;

public class NameCard {
	String name;
	String phone;
	String email;
	
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
		printNameCard.print( this );
	}
		
	
	PrintNameCard2 printNameCard2;
	
	public void setPrintNameCard2(PrintNameCard2 p) {
		this.printNameCard2 = p;
	}
	public void print2() {
		printNameCard2.print( this );
	}

}




