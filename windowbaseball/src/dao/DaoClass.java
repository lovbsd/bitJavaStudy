package dao;

import java.util.ArrayList;
import java.util.List;

import dto.Batter;
import dto.Human;
import dto.Pitcher;


public class DaoClass {
	int memberNumber;
	private static DaoClass sc = null;//객체 생성여부확인
	//private 내부 데이터, 내부 연산을 외부에서 접근하지 못하도록 은닉
	public List<Human> list = null; 
	
	private DaoClass() {// new 연산시 바로 호출
		list = new ArrayList<Human>();//Human 타입 연결리스트객체생성
	}
	public static DaoClass getInstance() {
		if(sc == null) { // 초기값을두었던 sc객체가 생성되지않았을경우 새로운 객체생성후 생성한 객체를반환한다
			sc = new DaoClass();
		}
		return sc;
	}
	
	public boolean insert(Human h) {
		if(h instanceof Pitcher) {
			h.setNumber(memberNumber);
		}else if(h instanceof Batter){
			h.setNumber(memberNumber + 1000);
		}
		boolean b= list.add(h);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		memberNumber++;
		
		return b;
		
	}
		public Human delete(String name) {
		
		return null;

	
		}
}
