package main;

import java.util.ArrayList;
import java.util.Iterator;

import dto.MemberDto;

public class mainClass {
	public static void main(String[] args) {

		ArrayList<MemberDto> memList = new ArrayList<>();

		MemberDto dto = new MemberDto(101, "홍길동");

		memList.add(dto);
		System.out.println();
		memList.add(new MemberDto(102, "일지매"));

			//원하는 위치
		memList.add(1, new MemberDto(103, "성춘향"));
		System.out.println();
		for (int i = 0; i < memList.size(); i++) {
			//	String string = memList.get(i);
			//	System.out.println(i+":"+mem.toString());
			System.out.println(memList.get(i).toString());
			

		}
		
		for(MemberDto mem : memList) {
			System.out.println(mem.toString());
		}
		System.out.println();
		//삭제
		memList.remove(2);
		for(MemberDto mem : memList) {
			System.out.println(mem.toString());
			
		}
		System.out.println();
		String findName = "성춘향";
		int findIndex = -1;
		for (int i = 0; i < memList.size(); i++) {
			MemberDto mem = memList.get(i);
					if(findName.equals(mem.getName())) {
						findIndex = i;
						break;
					}
			}
		memList.add(new MemberDto(103,"심재학"));
		System.out.println();
		System.out.println("데이터를 찾았습니다>>>>");
		System.out.println(memList.get(findIndex).toString());
		
		ArrayList<MemberDto> findList =new ArrayList<MemberDto>();
		findName = "성춘향";
		for (int i = 0; i < memList.size(); i++) {
			MemberDto mem = memList.get(i);
			if(findName.equals(mem.getName())) {//잘분석할
				
				findList.add(mem);
				
			}
			
		}
		System.out.println("============================");
		for (int i = 0; i < findList.size(); i++) {
			MemberDto mem=findList.get(i);
			System.out.println(mem.toString());
			
		}
		MemberDto updateMem =new MemberDto(104,"향단이");
			memList.set(2,updateMem); 
		for (MemberDto mem : memList) {
			System.out.println(mem.toString());
		}
	}
	
	
}
