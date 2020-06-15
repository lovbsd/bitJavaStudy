package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class mainClass {
public static void main(String[] args) {
	
	/*
	  ArrayList : 검색,대입 속도가빠름== vector
	  
	  LinkedList : 연결목록 
	  실시간 추가,삭제 의 처리가 빠름
	 */
//	ArrayList<String>list = new ArrayList<String>();
//	List<String> elist= new ArrayList<String>();
//	List<String> alist =new LinkedList<String>();
	
	ArrayList<String>alist = new ArrayList<String>();
	
	alist.add("tigers");
	alist.add("rions");
	alist.add("twins"); //추가삭제를 하고 링크드로 보냄
	
	LinkedList<String>blist = new LinkedList<String>(alist);//정보를 가져
	for (String str : blist) {
		System.out.println(str);
	}
		if(blist.isEmpty()) {//blist.size() == 0
			
		}
		//맨 앞에 element를 추가한다
		blist.addFirst("giants");
		//맨 뒤에 element를 추가한다
		blist.addLast("bears");
		for (int i = 0; i < blist.size(); i++) {
			String str = blist.get(i);
			System.out.println(i+":"+str);
		}
		blist.add(0,"giants");
		//iterator : 반복자 == 포인터()
		
		Iterator<String> it;
		
		it = blist.iterator();
		while(it.hasNext()) {
			String value = it.next();
			System.out.println("it: "+value);
		}
	}
}