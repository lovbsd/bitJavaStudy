package dao;

import singleton.SingleTonClass;

public class AllprintClass {
	public AllprintClass() {
		
		
		SingleTonClass ac = SingleTonClass.getInstance();
		for (int i = 0; i < ac.Array.size(); i++) {
			System.out.println(ac.Array.get(i));
			
			
		}
	}
}
