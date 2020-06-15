package DaoClass;

import java.util.Scanner;

import DaoInterface.DaoImpl;
import dto.Human;
import singleton.SingletonCls;

public class DeleteClass implements DaoImpl {
	Scanner scan = new Scanner(System.in);
	
	public DeleteClass() {
	}
	
	@Override
	public void process() {
		SingletonCls sc = SingletonCls.getInstance();//싱글톤클래스에 선언된 get함수에서 생성된 객체를 받아와서 싱글톤 타입의 sc 변수에 저장한다.

		System.out.print("삭제하고 싶은 선수명 입력 = ");
		String name = scan.next();
		
		if(name.equals("")) {// 입력받은 이름이 문자열인지 확인
			System.out.println("이름을 정확히 입력해 주십시오."); 
			return;		// 함수종료 main으로돌아감
		}
		
		int findIndex = SelectClass.search(name);//방번호를 찾기위해 findIndex변수를두어 입력받은 이름을 가지고 셀렉트 클래스의 서치함수를 찾아들어가고 나오면서 방번호나 없으면 -1를 가져온다 
		if(findIndex == -1) {// 방번호못찾았을경우
			System.out.println("선수 명단에 없습니다. 삭제할 수 없습니다");
			return; //함수종료 main으로돌아감
		}
		
		Human h = sc.list.remove(findIndex);//방번호를 삭제하고 방번호가없어진 상태의 정보는 휴먼타입 h변수에 복사한다 백업  
		// remove 사용시 주의
		System.out.println(h.getName() + "의 데이터는 삭제되었습니다");//사라진 휴먼 정보는 h가가지고있기때문에 위험성이적다
	}

}







