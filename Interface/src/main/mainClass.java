package main;

public class mainClass {

	public static void main(String[] args) {
		/*
			abstract class : 일반 method + abstract method + variable
							 다중 상속이 불가능하다.
							 
			interface : abstract method. 선언만 되어 있는 요소
						다중 상속이 가능하다.
						빠르게 설계의 사양을 파악할 수 있는 장점.
						확장성, 관리 목적을 갖고 있다.

		*/
		
		// MyInterface myinter = new MyInterface();
		
		MyClass mycls = new MyClass();
		mycls.method();		
		YouClass youcls = new YouClass();
		youcls.method();
		
		MyInterface myInter = new MyClass();
		myInter.method();
		MyInterface youInter = new YouClass();
		youInter.method();
		
		HeClass hcls = new HeClass();
		hcls.method();
		hcls.func();
		hcls.heMethod();
		
		MyInterface minter = new HeClass();
		minter.method();
		((YouInterface)minter).func();
		
	}

}





