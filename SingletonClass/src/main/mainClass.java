package main;

import mcls.MyClass;
import single.SingletonClass;
import ycls.YouClass;

public class mainClass {
public static void main(String[] args) {
	MyClass mcls = new MyClass();
	YouClass ycls = new YouClass();
	/*
	int n =mcls.getNumber();
	ycls.setTag(n);
	 */
	mcls.method();
	ycls.func();
	ycls.Fuck();
	
	System.out.println(ycls.toString());
	System.out.println(mcls.toString());
//	SingletonClass sc =  SingletonClass.getInstance();
//	System.out.println("sc: "+sc);
//	
//	SingletonClass single =  SingletonClass.getInstance();
//	System.out.println("scTag: "+single);
	}
}
