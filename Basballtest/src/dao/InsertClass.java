package dao;

import java.util.Scanner;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import singleton.SingleTonClass;


public class InsertClass {
		SingleTonClass ar =SingleTonClass.getInstance();
		Scanner sc = new Scanner(System.in);
		public String name;
		
		
		public int age,height,win,lose,hit,batcount,num;
		public double defence,hitAvg;
		Human h;
		
		
		
		
	public  InsertClass() {
		System.out.println("투수(1)/타자(2)");
		num = sc.nextInt();
		System.out.println("이름 = ");
		name = sc.next();
		System.out.println("나이 = ");
		age = sc.nextInt();
		System.out.println("신장 = ");
		height = sc.nextInt();
		info(num);
	
	}
	public void info(int num) {
		if(num==1) {
			pit();
		}else {
			bat();
		}
		
	}
	public void pit() {
		System.out.println("승 = ");
		win=sc.nextInt();
		System.out.println("패 = ");
		lose = sc.nextInt();
		System.out.println("방어율");
		defence= sc.nextDouble();
		
		ar.Array.add(new Pitcher(ar.number,name,age,height,win,lose,defence));
		ar.number++;
	}
	public void bat() {
		System.out.println("타수 = ");
		batcount = sc.nextInt();
		System.out.println("안타수 = ");
		hit = sc.nextInt();
		System.out.println("타율 = ");
		hitAvg = sc.nextInt();
		ar.Array.add(new Batter(ar.number,name,age,height,batcount,hit,hitAvg));
		
		ar.number++;
	}
}
