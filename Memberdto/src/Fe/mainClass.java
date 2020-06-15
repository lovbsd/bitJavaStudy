package Fe;
import java.util.ArrayList;
import java.util.Scanner;

public class mainClass {
public static void main(String [] args) {
	/*
	  collection : 수집
	 
	  list: 목록
	  		데이터의 관리를 유동적으로 할 수 있는 배열.
	  		
	  Arraylist( == vector)
	  	배열처럼 사용할 수 있는 목록
	  	
	  	선형구조 0-0-0-0-0
	  	
	  	검색 속도 빠르다
	  	 index number로 관리 된다.      0 ~ n-1
	  LinkedList
	  	빈번하게 추가,삭제가 되는 경우 적합한 구조.
	  	
	  Map
	  
	  HashMap
	  	key,value로 관리된다.
	  	key로 접근한다.
	  
	  TreeMap
	  
	
	 */
	
	//어레이 생성
	ArrayList<Integer> arrList = new ArrayList<Integer>();
	 
	Integer arrInt[];
	
	
	//추가
	arrList.add(111);
	
	Integer in = new Integer(222);
	arrList.add(in);
	arrList.add(new Integer(333));
	//list size()
	int len = arrList.size();
	
	System.out.println("len:"+len);
	
	//데이터를 산출get
	Integer getVal = arrList.get(0);
	
	System.out.println("getVal:"+getVal);
	for(int i=0;i<arrList.size();i++) {
		Integer n= arrList.get(i);
		System.out.println(i+":"+n);
	}
	
	for(Integer inte : arrList) {
		System.out.println(inte);
	}
	//원하는 위치 추가
	Integer inum = new Integer(200);
	arrList.add(1,inum);
	
	for(Integer inte : arrList) {
		System.out.println(inte);
	}
	//삭제
	arrList.remove(2);
	
	//출력
	for(int i=0;i<arrList.size();i++) {
		Integer n= arrList.get(i);
		System.out.println(i+":"+n);
	}
	//검색
	int index = arrList.indexOf(new Integer(333));
	
	System.out.println("index:"+index);
	
	System.out.println(arrList.get(index));
	
	index = -1;
	for(int i =0;i<arrList.size();i++) {
		Integer var = arrList.get(i);
		if(var ==200) {
			index = i;
			break;
		}
	}
	System.out.println("index:"+index);
	//수정
	
	Integer updateData = new Integer(555);
	
	arrList.set(2, updateData);
	for(int i=0;i<arrList.size();i++) {
		Integer n= arrList.get(i);
		System.out.println(i+":"+n);
	}
	ArrayList<String>list = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	/*
	 추가,삭제,검색,수정
	 출력확인
	 연예인,야구팀...
	 */
	list.add("심성보");
	
	System.out.println("검색할 이름을 쳐주세요");
	String name = sc.next();
	int index1 = list.indexOf(name);
	
		for(int i=0;i<list.size();i++) {
			String n= list.get(i);
			System.out.println(i+":"+n);
	}
	System.out.println("삭제할 이름을 쳐주세요");
			name = sc.next();
			index1 = list.indexOf(name);
			list.remove(name);
			
			for(int i=0;i<list.size();i++) {
				String n= list.get(i);
				System.out.println(i+":"+n);
			}
		System.out.println("수정할 이름을 쳐주세요");
			name = sc.next();
		String updatedata = new String(name);
	
		
		for(int i=0;i<list.size();i++) {
			String n= list.get(i);
			System.out.println(i+":"+n);
		}
		
	}

}
