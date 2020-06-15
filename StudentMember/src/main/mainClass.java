package main;

import java.util.Scanner;

import dao.MemberDao;

public class mainClass {
public static void main(String[] args) throws Exception {
	
	Scanner sc = new Scanner(System.in);
	
	MemberDao dao = new MemberDao();

	
	
	while (true) {
		System.out.println("-----------------메뉴");
		System.out.println("1. 학생 정보 추가");
		System.out.println("2. 학생 정보 삭제");
		System.out.println("3. 학생 정보 검색");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 모두 출력");
		System.out.println("6. 학생 과목 총점");
		System.out.println("7. 데이터 저장!");
		

		System.out.println("메뉴 번호를 입력해 주십시오");
		System.out.print(">>> ");
		int choice =sc.nextInt();
		
		switch (choice) {
		case 1: // 학생추가
			dao.insert();
			break;
		case 2:
			dao.delete();
			break;
		case 3:
			dao.find();
			break;
		case 4:
			dao.update();
			break;
		case 5:
			dao.allin();
			break;
		case 6:
			dao.maxscore();
			break;
		case 7:
			dao.saveData();
			break;
		
		case 10:
			System.out.println("프로그램 종료");
			System.exit(0);
			break;
		}
	}
}
}