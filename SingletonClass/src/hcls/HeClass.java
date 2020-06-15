package hcls;

import single.SingletonClass;

public class HeClass {
	private int num;
	
	public void function() {
		SingletonClass sc = SingletonClass.getInstance();
		num = sc.snumber;
				
	}
}
