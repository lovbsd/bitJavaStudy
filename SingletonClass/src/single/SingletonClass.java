package single;

public class SingletonClass {
	/*
	 Singleton : 하나의 instance 에 접근 하여 데이터를 송수신 할수 있는 pattern
	 */
	private static SingletonClass sc = null;
	public int snumber;
	private SingletonClass() {
	
	}

	public static SingletonClass getInstance() {
			if(sc ==null) {
				sc = new SingletonClass();
			}
			return sc;
	}
}
