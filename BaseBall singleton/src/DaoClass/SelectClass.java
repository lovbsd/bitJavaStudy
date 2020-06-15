package DaoClass;

import java.util.List;
import java.util.Scanner;

import DaoInterface.DaoImpl;
import dto.Batter;
import dto.Human;
import dto.Pitcher;
import singleton.SingletonCls;

public class SelectClass implements DaoImpl {
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void process() {
		SingletonCls sc = SingletonCls.getInstance();//싱글톤클래스에 선언된 get함수에서 생성된 객체를 받아와서 싱글톤 타입의 sc 변수에 저장한다.

		System.out.print("검색하고 싶은 선수명 = ");
		String name = scan.next();
		
		int findIndex = search(name);//방번호를 찾기위해 findIndex변수를두어 입력받은 이름을 가지고 셀렉트 클래스의 서치함수를 찾아들어가고 나오면서 방번호나 없으면 -1를 가져온다 
		if(findIndex == -1) {
			System.out.println("선수 명단에 없습니다.");
		}
		else {
			Human human = sc.list.get(findIndex);// 휴먼타입 변수에 리스트의 겟함수를 사용하여 방번호를 찾아서 복사한다
			
			System.out.println("번호:" + sc.list.get(findIndex).getNumber()); // 방번호에있는 넘버값을 가져와서 출력한다 
			System.out.println("이름:" + human.getName());// 이름을 가져와서 출력
			System.out.println("나이:" + human.getAge());//나이를 가져와서 출력
			System.out.println("신장:" + human.getHeight());//신장을 가져와서 출력
			
			if(human instanceof Pitcher) {
				System.out.println("승리:" + ((Pitcher)human).getWin() );//투수승리 출력
				System.out.println("패전:" + ((Pitcher)human).getLose() );//투수패전출력
				System.out.println("방어율:" + ((Pitcher)human).getDefence() );//투수방어율 출력
			}
			else if(human instanceof Batter){
				System.out.println("타수:" + ((Batter)human).getBatcount() );//타자 타수 출력
				System.out.println("안타수:" + ((Batter)human).getHit() );// 타자 안타수 출력
				System.out.println("타율:" + ((Batter)human).getHitAvg() );		//타자 타율 출력	
			}			
		}
	}
	
	public static int search(String name) {
		SingletonCls sc = SingletonCls.getInstance();//싱글톤클래스에 선언된 get함수에서 생성된 객체를 받아와서 싱글톤 타입의 sc 변수에 저장한다.
		
		int index = -1;//방이있는지없는지를 체크하기위해 -1를 선언한다
		for (int i = 0; i < sc.list.size(); i++) {//리스트 사이즈만큼 돈다
			Human h = sc.list.get(i); //휴먼타입 객체 변수에 리스트모든 정보를 돌면서 복사한다
			if(name.equals(h.getName())) {//휴먼타입 객체 변수의 이름을 가져와서 매개로 받아온 이름과 비교한다
				index = i;//맞으면 방번호를 복사한다
				break;//방번호를 찾았으면 반복문을 종료한다
			}
		}
		return index;
	}

}





