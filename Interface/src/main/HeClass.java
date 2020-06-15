package main;

public class HeClass implements MyInterface, YouInterface{

	@Override
	public void func() {
		System.out.println("HeClass func()");
	}

	@Override
	public void method() {
		System.out.println("HeClass method()");
	}
	
	public void heMethod() {
		System.out.println("HeClass heMethod()");
	}

}




