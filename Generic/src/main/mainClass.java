package main;

public class mainClass {

	public static void main(String[] args) {
		/*
			Generic == template(형태)
					: 자료형의 변수		
					: 같은 클래스에서 다양한 자료형을 사용하고 싶은 경우의 사용하는 요소
		*/
		Box<Integer> box = new Box<Integer>( 111 );		
		System.out.println( box.getTemp() + 1 );

		Box<String> sBox = new Box<String>( "my world" );
		System.out.println( sBox.getTemp() );
		
		// Box<Object> sBox = new Box<String>( "my world" );
			
		BoxMap<Integer, String> bmap = new BoxMap<Integer, String>(1001, "hello");
		System.out.println(bmap.getKey());
		System.out.println(bmap.getValue());
		
	}
}

class Box<T>{	// <T> : Generic
	
	T temp;
	
	public Box(T temp) {
		this.temp = temp;
	}
	
	public T getTemp() {
		return temp;
	}
	
	public void setTemp(T temp) {
		this.temp = temp;
	}
	
}

class BoxMap<Key, Value>{
	
	Key key;
	Value value;
	
	public BoxMap(Key key, Value value) {
		super();
		this.key = key;
		this.value = value;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}
	
	
	
	
	
}


















