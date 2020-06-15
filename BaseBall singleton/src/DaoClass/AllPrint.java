package DaoClass;

import DaoInterface.DaoImpl;
import dto.Human;
import singleton.SingletonCls;

public class AllPrint implements DaoImpl {

	public AllPrint() {
	}
	
	@Override
	public void process() {
		SingletonCls sc = SingletonCls.getInstance();//싱글톤클래스에 선언된 get함수에서 생성된 객체를 받아와서 싱글톤 타입의 sc 변수에 저장한다.
		
		for (int i = 0; i < sc.list.size(); i++) {//리스트크기만큼 돈다
			Human human = sc.list.get(i);//모든정보를 리스트 크기만큼 한줄 한줄 휴먼 타입 human 변수에 복사한다
			System.out.println(human.toString());//변수에담긴 정보를 한줄씩 개행하며 출력한다
		}

	}

}








