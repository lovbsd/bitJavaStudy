package dao;

import java.util.Scanner;

import dto.Batter;
import dto.Human;
import dto.Pitcher;
import file.FileProc;

// Data Access Object	= model == back end
public class MemberDao {
	
	Scanner sc = new Scanner(System.in);
	
	// 배열
	//private Pitcher pitcher[];
	//private Batter batter[];
	
	private Human human[] = new Human[20]; //부모 변수 20개 생성
	
	private int memberNumber;
	private int memberCount;

	
	FileProc fp;//file
	
	public MemberDao() {
		fp = new FileProc("baseball");//file 
		fp.createFile();//file
		
			
		memberNumber = 1000; //선수번호
		memberCount = 0;//INDEX
		
	}	
	public void insert() {	
		// 투수/타자 ?
		System.out.print("투수(1)/타자(2) = ");
		int pos = sc.nextInt();
		
		// human
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("나이 = ");
		int age = sc.nextInt();
		
		System.out.print("신장 = ");
		double height = sc.nextDouble();
		
		Human h = null;	
		// 투수	1000 ~ 
		if(pos == 1) {
			// win
			System.out.print("승 = ");
			int win = sc.nextInt();
			
			// lose
			System.out.print("패 = ");
			int lose = sc.nextInt();
			
			// defense
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			//입력받은 변수들 전달 정적 변수 매개인자
			h = new Pitcher(memberNumber, name, age, height, win, lose, defence);
			//h 투수 정보
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
			int batcount = sc.nextInt();
			bat.setBatcount(batcount);
						
			// 안타수
			System.out.print("안타수 = ");
			int hit = sc.nextInt();
			bat.setHit(hit);
			
			// 타율
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			bat.setHitAvg(hitAvg);
			
			h = bat;
		}		//타자 정보 변수 저장 각개임 조건문이 들어와서 h에 한번에 두정보담을수없음
		
		human[memberCount] = h;
		//인간 배열 인덱스에담는다 
		
		memberNumber++;
		//선수 번호
		memberCount++;
		//인간 배열 INDEX
	}	
	
	public void delete() {
		
		System.out.print("삭제하고 싶은 선수명 입력 = ");
		String name = sc.next();
		
		if(name.equals("")) {
			System.out.println("이름을 정확히 입력해 주십시오.");
			return;		// continue
		}
		
		int findIndex = search(name);// 검색할문자를 찾아본다
		if(findIndex == -1) {
			System.out.println("선수 명단에 없습니다. 삭제할 수 없습니다");
			return;// if 문만빠져나옴 continue 처럼 다시돌아감
		}
		
		// 삭제
		if(human[findIndex] instanceof Pitcher) {//인간 정보에 투수가있느냐는 비교문
			
			
			Pitcher p =(Pitcher) human[findIndex];//투수정보 
			
			
			p.setNumber(0);
			p.setName("");
			p.setAge(0);
			p.setHeight(0.0);
			p.setWin(0);
			p.setLose(0);
			p.setDefence(0.0);
		}
		else if(human[findIndex] instanceof Batter) {
			
			
			Batter b = (Batter)human[findIndex];//타자정보
			
			b.allClean();
		}		
	}	
		
	public void select() {		
		System.out.print("검색하고 싶은 선수명 = "); //출력
		String name = sc.next();//입력
		int findIndex = search(name);//서치
		
		if(findIndex==-1) {
			System.out.println("선수 명단에 없습니다.");
		}
		else {
			System.out.println("번호:" + human[findIndex].getNumber());
			System.out.println("이름:" + human[findIndex].getName());
			System.out.println("나이:" + human[findIndex].getAge());
			System.out.println("신장:" + human[findIndex].getHeight());
			
			if(human[findIndex] instanceof Pitcher) {
				System.out.println("승리:" + ((Pitcher)human[findIndex]).getWin() );
				System.out.println("패전:" + ((Pitcher)human[findIndex]).getLose() );
				System.out.println("방어율:" + ((Pitcher)human[findIndex]).getDefence() );
				System.out.println("방어율순위:"+ ((Pitcher)human[findIndex]).getDefence() );
			}
			else if(human[findIndex] instanceof Batter) {
				System.out.println("타수:" + ((Batter)human[findIndex]).getBatcount() );
				System.out.println("안타수:" + ((Batter)human[findIndex]).getHit() );
				System.out.println("타율:" + ((Batter)human[findIndex]).getHitAvg() );
			}
		}		
	}	
	
	public void update() {		
		System.out.print("수정하고 싶은 선수명 = ");
		String name = sc.next();
		
		int findIndex = search(name);
		if(findIndex == -1) {
			System.out.println("선수 명단에 없습니다.");
			return;
		}
		
		if(human[findIndex] instanceof Pitcher) {
			System.out.print("승 = ");
			int win = sc.nextInt();
			
			System.out.print("패 = ");
			int lose = sc.nextInt();
			
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			Pitcher pit = (Pitcher)human[findIndex];
			pit.setWin(win);
			pit.setLose(lose);
			pit.setDefence(defence);			
		}
		else if(human[findIndex] instanceof Batter) {
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			
			System.out.print("안타수 = ");
			int hit = sc.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			
			Batter bat = (Batter)human[findIndex];
			bat.setBatcount(batcount);
			bat.setHit(hit);
			bat.setHitAvg(hitAvg);
			
			
		}		
	}
	
	
	
	public void allprint() {	
		
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				
				System.out.println(human[i].toString());				
			}
		}		
	}	
	
	public int search(String name) {
		int index = -1;
		
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null) {
				if(name.equals(human[i].getName())) {//이름이 있는지없는지 확인한다
					index = i;
					break;
				}
			}
		}
		return index;
	}
	
	public void saveData() {
		// 1001-홍길동-24-178.1-10-3-0.12
		int len = 0;		
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null) {
				len++;
			}
		}		
		
		String datas[] = new String[len];		
		for (int i = 0; i < datas.length; i++) {
			datas[i] = human[i].toString();
		}
		
		fp.saveData(datas);		
	}
	
	public void loadData() {
		String datas[] = fp.loadData();
		
		/*
			datas : Pitcher, Batter		-> Human[]
					객체 생성
					값을 저장
		*/
		
		for (int i = 0; i < datas.length; i++) {
			// datas[0 ~ n-1]	
			// datas[0] => 1000-홍길동-24-178.1-10-2-0.12
			// datas[1] => 2001-일지매-21-181.1-21-11-0.34
			// datas[2] => 1002-정수동-26-182.4-11-4-0.24
			
			String data[] = datas[i].split("-");
			
			int title = Integer.parseInt(data[0]);
			if(title < 2000) {		// 투수				
				human[i] = new Pitcher(	Integer.parseInt(data[0]), 
										data[1], 
										Integer.parseInt(data[2]), 
										Double.parseDouble(data[3]), 
										Integer.parseInt(data[4]), 
										Integer.parseInt(data[5]), 
										Double.parseDouble(data[6]) );
			}
			else {
				human[i] = new Batter(	Integer.parseInt(data[0]), 
										data[1], 
										Integer.parseInt(data[2]), 
										Double.parseDouble(data[3]), 
										Integer.parseInt(data[4]), 
										Integer.parseInt(data[5]), 
										Double.parseDouble(data[6]) );
			}				
		}		
	}
	
	// 타율 순위 출력 1 ~ n
		
	// 방어율 순위 출력 1 ~ n

}









