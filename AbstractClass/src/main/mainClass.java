package main;

public class mainClass {

	public static void main(String[] args) {
		/*
			Abstract class : 추상 class	
					추상 method : 선언만 되어 있는 함수
							abstract int method(char c, int i);	prototype
					생성은 불가능하다. 상속받은 class에서 정의한 후에 생성		
						
			class : method의 내용이 모두 설정되어 있는 것.
							int method(char c, int i){
								처리	
							}

		*/
		
		childClass ccls = new childClass();
		ccls.method();
		ccls.abstractMethod();
		
		AbstractClass acls = new AbstractClass() {			
			@Override
			public void abstractMethod() {
				System.out.println("AbstractClass abstractMethod()");
			}
		};		
		acls.method();
		acls.abstractMethod();

		
		AbstractClass cls1 = new childClass();
		
		AbstractClass cls2 = new MyClass();
		
	}

}
















