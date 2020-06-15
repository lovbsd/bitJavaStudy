package observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
		String str = (String)arg;
		System.out.println("감시자 A 입니다 통지받았음: " + str);
		
	}
	

}
