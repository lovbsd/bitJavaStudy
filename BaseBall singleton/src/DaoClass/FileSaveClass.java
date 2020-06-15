package DaoClass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import DaoInterface.DaoImpl;
import dto.Human;
import singleton.SingletonCls;

public class FileSaveClass implements DaoImpl {

	File file = new File("d:\\tmp\\baseball.txt");
	
	public FileSaveClass() {
	}
	
	@Override
	public void process() {		
		SingletonCls sc = SingletonCls.getInstance();//싱글톤클래스에 선언된 get함수에서 생성된 객체를 받아와서 싱글톤 타입의 sc 변수에 저장한다.
		
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));//생성한 파일 읽기쓰기 
			
			for (int i = 0; i < sc.list.size(); i++) {//리스트 사이즈만큼 돈다
				Human h = sc.list.get(i);//리스트요소에 접근해서 리스트크기만큼 돌면서 그정보를 휴먼타입 h에 복사한다
				pw.println(h.toString());//복사된 휴먼타입 h변수의 방에있는 정보를  개행하며 파일에 옮겨 적는다
			}			
			pw.close(); //파일닫는다
			
		} catch (IOException e) {			
			e.printStackTrace();
		}		
		
		System.out.println("파일에 저장되었습니다");
	}

}
