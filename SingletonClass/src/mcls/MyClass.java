package mcls;

import single.SingletonClass;

public class MyClass {
//	public int getNumber() {
//		return number;
//	}


	private int number;

	public MyClass() {
		number = 12;

	}
	public void method() {
		SingletonClass sc = SingletonClass.getInstance();
		sc.snumber = this.number;
		
		
		
	}
}
