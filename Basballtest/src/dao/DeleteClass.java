package dao;

import java.util.Scanner;

import singleton.SingleTonClass;





public class DeleteClass {

	public DeleteClass() {
		int index =-1;
		 Scanner  sc = new Scanner(System.in);
		 SingleTonClass ar = SingleTonClass.getInstance();
		 System.out.println("삭제할 이름은? =");
		 String name =sc.next();
		 for (int i = 0; i < ar.Array.size(); i++) {
			 if((name.equals(ar.Array.get(i)))) {
				 index = i;
			 }
			 ar.Array.remove(i);
		System.out.println(ar.Array.toString());
		}
		 
		 
	}
	
}
