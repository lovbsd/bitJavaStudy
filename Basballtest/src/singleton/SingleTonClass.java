package singleton;

import java.util.ArrayList;
import java.util.Scanner;
import dto.Human;

public class SingleTonClass {
	
	public static SingleTonClass check = null;
	
	public  ArrayList<Human>Array = new ArrayList<Human>();
	
	public int number=1000;
	private  SingleTonClass() {
		
	}
	public static SingleTonClass getInstance() {
		
		if(check== null) {
			
			check =new SingleTonClass();
			
			
		}return check;
	}
	
	
}
