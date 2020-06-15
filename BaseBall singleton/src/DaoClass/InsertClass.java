package DaoClass;

import java.util.List;
import java.util.Scanner;

import DaoInterface.DaoImpl;
import dto.Batter;
import dto.Pitcher;
import singleton.SingletonCls;

public class InsertClass implements DaoImpl {
	Scanner scan = new Scanner(System.in);
	
	private int memberNumber;
	
	public InsertClass() {
		SingletonCls sc = SingletonCls.getInstance();//싱글톤클래스에 선언된 getInstance함수에서 생성된 객체를 받아와서 싱글톤 타입의 sc 변수에 저장한다.
	
		memberNumber = sc.list.get( sc.list.size() - 1 ).getNumber(); // 싱글톤내부 리스트에담겨져있는 마지막 정보의 Human 타입 number값을 가져와서 memberNumber에 저장한다
		
		if(memberNumber >= 2000) { //만약 그정보가 2000보다 크거나같다면 
			memberNumber = memberNumber - 1000; //멤버넘버값의 1000을 빼준다
		}
		memberNumber = memberNumber + 1;// if문을 빠져나와서 무조건 멤버넘버값은 1증가시킨다
	}
	
	@Override
	public void process() {		
		SingletonCls sc = SingletonCls.getInstance();//싱글톤클래스에 선언된 getInstance함수에서 생성된 객체를 받아와서 싱글톤 타입의 sc 변수에 저장한다.
		
		// 투수/타자 ?
		System.out.print("투수(1)/타자(2) = ");
		int pos = scan.nextInt();
		
		// human
		System.out.print("이름 = ");
		String name = scan.next();
		
		System.out.print("나이 = ");
		int age = scan.nextInt();
		
		System.out.print("신장 = ");
		double height = scan.nextDouble();
		
		if(pos == 1) {//입력받은 포스값의 1이면 실행
			// win
			System.out.print("승 = ");
			int win = scan.nextInt();
			
			// lose
			System.out.print("패 = ");
			int lose = scan.nextInt();
			
			// defense
			System.out.print("방어율 = ");
			double defence = scan.nextDouble();
			
			sc.list.add(new Pitcher(memberNumber, name, age, height, win, lose, defence)); //싱글톤 list의 add연산시 투수타입객체생성후 멤버변수들의 모든정보를 저장하고 list 에 복사한다   
			
		}		
		// 타자  2000 ~ 
		else if(pos == 2) {
			
			Batter bat = new Batter();
			
			// 선수 등록 번호
			bat.setNumber(memberNumber + 1000);
			bat.setName(name);
			bat.setAge(age);
			bat.setHeight(height);			
						
			// 타수
			System.out.print("타수 = ");
			int batcount = scan.nextInt();
			bat.setBatcount(batcount);
						
			// 안타수
			System.out.print("안타수 = ");
			int hit = scan.nextInt();
			bat.setHit(hit);
			
			// 타율
			System.out.print("타율 = ");
			double hitAvg = scan.nextDouble();
			bat.setHitAvg(hitAvg);
			
			sc.list.add(bat);
		}
	}

}








