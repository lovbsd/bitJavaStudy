package main;

import java.util.ArrayList;

import dto.MemberDto;

public class mainClass {

	public static void main(String[] args) {
		/*
		  	Collection : 수집
		  	
			List : 목록
				   데이터의 관리를 유동적으로 할 수 있는 배열.
				   
			ArrayList(== Vector)
				배열처럼 사용할 수 있는 목록
				선형구조 o-o-o-o-o	
				검색 속도 빠르다.
				index number로 관리된다.	0 ~ n-1
				o-o-o-o-o-o		
						
			LinkedList(Game)	
				빈번하게 추가, 삭제가 되는 경우 적합한 구조.			
			
			Map
			
			HashMap
				key, value로 관리된다.
				key로 접근한다. 	
				"apple" : "사과"
				key값의 중복을 허용하지 않는다. key는 하나만 존재한다.
				Tree 구조
			
			TreeMap
				sorting잉 추가되어 있음.
		*/
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		// Integer arrInt[];
		
		// 추가
		arrList.add(111);
		
		Integer in = new Integer(222);
		arrList.add(in);
		
		arrList.add( new Integer(333) );
		
		// list size()
		int len = arrList.size();
		System.out.println("len:" + len);
		
		// 데이터를 산출 get
		Integer getVal = arrList.get(0);
		System.out.println("getVal:" + getVal);
		
		for (int i = 0; i < arrList.size(); i++) {
			Integer n = arrList.get(i);
			System.out.println(i + ":" + n);
		}
		
		for(Integer inte : arrList) {	// for each
			System.out.println(inte);
		}
		
		// 원하는 위치에 추가
		Integer inum = new Integer(200);
		arrList.add(1, inum);
		
		for (int i = 0; i < arrList.size(); i++) {
			Integer n = arrList.get(i);
			System.out.println(i + ":" + n);
		}		
		
		// 삭제	Array obj[0].name = "";
		arrList.remove(2);
		
		for (int i = 0; i < arrList.size(); i++) {
			Integer n = arrList.get(i);
			System.out.println(i + ":" + n);
		}
		
		// 검색
		int index = arrList.indexOf( 333 );
		System.out.println("index:" + index);
		System.out.println(arrList.get(index));
		
		index = -1;
		for (int i = 0; i < arrList.size(); i++) {
			Integer var = arrList.get(i);
			if(var == 200) {
				index = i;
				break;
			}
		}
		System.out.println("index:" + index);
		
		// 수정
		Integer updateData = new Integer(555);
	
		arrList.set(2, updateData);
		
		for (int i = 0; i < arrList.size(); i++) {
			Integer n = arrList.get(i);
			System.out.println(i + ":" + n);
		}
		
		
		
		ArrayList<String> list = new ArrayList<String>();
		/*
		추가, 삭제, 검색, 수정
		출력확인 
		연예인, 야구팀...
		*/
		
		ArrayList<MemberDto> memList = new ArrayList<>();
		
		// 추가		
		// 뒤에
		MemberDto dto = new MemberDto(101, "홍길동");
		memList.add(dto);
		
		memList.add(new MemberDto(102, "일지매"));
		
		// 원하는 위치
		memList.add(1, new MemberDto(111, "성춘향"));
		
		for (int i = 0; i < memList.size(); i++) {
		//	MemberDto mem = memList.get(i);
		//	System.out.println(i + ":" + mem.toString());
			
			System.out.println( memList.get(i).toString() );			
		}
		/*
		for (MemberDto mem : memList) {
			System.out.println(mem.toString());
		}
		*/
		
		// 삭제
	/*	memList.remove(2);
		
		for (MemberDto mem : memList) {
			System.out.println(mem.toString());
		} */
		
		// 검색
		String findName = "성춘향"; 
		int findIndex = -1;
		for (int i = 0; i < memList.size(); i++) {
			MemberDto mem = memList.get(i);
			if(findName.equals(mem.getName())) {
				findIndex = i;
				break;
			}
		}
		
		System.out.println("데이터를 찾았습니다 >>>");
		System.out.println(memList.get(findIndex).toString());
		
		// 다수의 데이터를 검색
		memList.add(new MemberDto(103, "성춘향"));
		
		for (MemberDto mem : memList) {
			System.out.println(mem.toString());
		}

		System.out.println("================================");
		ArrayList<MemberDto> findList = new ArrayList<MemberDto>();
		findName = "성춘향"; 
		for (int i = 0; i < memList.size(); i++) {
			MemberDto mem = memList.get(i);
			if(findName.equals( mem.getName() )) {
				findList.add(mem);
			}
		}
		
		System.out.println("-----------------------");
		for (int i = 0; i < findList.size(); i++) {
			MemberDto mem = findList.get(i);
			System.out.println(mem.toString());
		}
				
		// 수정
		MemberDto updateMem = new MemberDto(104, "향단이");		
		memList.set(3, updateMem);
		
		for (MemberDto mem : memList) {
			System.out.println(mem.toString());
		}
		

	}

}











