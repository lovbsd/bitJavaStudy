package main;

public class PrintNameCard1 implements PrintNameCard {

	@Override
	public void print(NameCard nc) {
		System.out.println("이름:" + nc.name);
	}

}
