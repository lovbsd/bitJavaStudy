package dao;

import java.util.HashMap;
import java.util.Scanner;

import main.MyData;

public class daoMember {
	Scanner sc= new Scanner(System.in);
	public daoMember() {
	}
	private HashMap<Integer,MyData> dMap = new HashMap<Integer,MyData>();
	
	public void insert() {
		System.out.println("추가할 학생이름을 입력해주세요");
		String name = sc.next();
		
		System.out.println("추가할 숫자를 입력해주세요");
		String number = sc.next();
		dMap.put(1,new MyData(1,"Stupid"));
		
	}
}
