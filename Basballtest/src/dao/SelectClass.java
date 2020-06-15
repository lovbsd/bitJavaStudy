package dao;

import java.util.Scanner;

import dto.Human;
import singleton.SingleTonClass;


public class SelectClass {
	public SelectClass() {
		
		SingleTonClass ac =  SingleTonClass.getInstance();
		System.out.println("검색할 이름을 쳐주세요");	
		String name =new Scanner(System.in).next();
		int index=search(name);
			
		
		System.out.println(ac.Array.get(index));
		
	
		
	}

public static int search(String name) {
	SingleTonClass sc = SingleTonClass.getInstance();
	
	int index = -1;
	for (int i = 0; i < sc.Array.size(); i++) {
		Human h = sc.Array.get(i);
		if(name.equals(h.getName())) {
			index = i;
			break;
		}
	}
	return index;
}

}
