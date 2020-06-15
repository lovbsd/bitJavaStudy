package main;

import java.util.Scanner;

import dao.AllprintClass;
import dao.DeleteClass;
import dao.InsertClass;
import dao.SelectClass;
import singleton.SingleTonClass;


public class mainClass {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	SingleTonClass ar = SingleTonClass.getInstance();
	
	while (true) {

		System.out.println("1. 선수 등록 ");
		System.out.println("2. 선수 삭제 ");
		System.out.println("3. 선수 검색 ");
		System.out.println("4. 선수 수정 ");
		System.out.println("5. 선수 모두 출력 ");

		System.out.println("6. 데이터 저장 ");

		System.out.println("7. 방어율 Ranking ");
		System.out.println("8. 타율 Ranking ");

		System.out.println("10. 프로그램 종료 ");

		System.out.print("메뉴 번호 입력 >>> ");
		int choice = sc.nextInt();
		
		switch( choice ) {
		case 1:
			new InsertClass();
			break;
		case 2:
			new DeleteClass();
			break;
		case 3:
			new SelectClass();
			break;
		case 4:
			new AllprintClass();
			break;
		case 5:
			
			break;					
		case 6:
			
			break;
		case 7:
			break;
		case 8:
			
			break;
		}
	}
}
}
