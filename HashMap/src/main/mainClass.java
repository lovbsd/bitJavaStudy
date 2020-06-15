package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class mainClass {
public static void main(String[] args) {
	/*
	 	HashMap :사전
	 			 "사과":"apple"
	 			 key :value -> 1쌍 ==web json
	 			 Tree 구조
	 			 List : 선형 구조 o-o-o-o-o-o-o
	 			 key는 중복되지않는다!
	 			 
	 			TreeMap = HashMap +sorting(key)
	 			
	 */
	HashMap<Integer, String>hMap = new HashMap<Integer,String>(); 
//	Map<Integer, String> map = new HashMap<Integer,String>();	
//	TreeMap<Integer,String>tMap = new TreeMap<Integer,String>(map);
	// 추가 	 key   value
	
	hMap.put(111, "백십일");
	hMap.put(222, "이백이십이");
	hMap.put(333, "삼백삼십삼");
	
	//value 취득
	String value = hMap.get(222);
	System.out.println(value);
	
	//삭제
	String val = hMap.remove(222);
	
	value =hMap.get(222);
	System.out.println("value:"+value);
	//검색
	
	//있다/없다
	boolean b= hMap.containsKey(new Integer(333));
	System.out.println("b= "+b);
	
	//값을 취득
	if(hMap.containsKey(333)) {
		value = hMap.get(333);
		System.out.println(value);
	}
	//수정
	hMap.put(111,"100+10+1");
	
	hMap.replace(222,"200+22"); // 정석
	
	//모두 출력 0~n-1 가 아님 순서대로 데이터가 저장되어 있진 않다.
	
	//key 값을 모두 취득 =>iterator 
	Iterator<Integer>it = hMap.keySet().iterator();
	while(it.hasNext()) {
		Integer key = it.next();
		System.out.println("key: "+key);
		
		String _value = hMap.get(key);
		System.out.println("value: "+_value);
	}
	//키값이 중복되지않게한다
	HashMap<String,String>haMap = new HashMap<String,String>();
	haMap.put(new String("apple"),new String("사과"));
	haMap.put("pear","배");
	haMap.put("grape","포도");
	haMap.put("banana","바나나");
	
	value = haMap.get("grape");
	System.out.println("value"+value);
	
	//모두 출력
	Iterator<String>sit = haMap.keySet().iterator();
	while(sit.hasNext()) {
		String key = sit.next();
		String _val = haMap.get(key);
		System.out.println("key: "+key+"value:"+_val);
		
	}
	//sorting
	//TreeMap <--> HashMap
	TreeMap<String,String> treeMap=new TreeMap<String,String>(haMap);
	
	//오름차순
	Iterator<String> itkey = treeMap.keySet().iterator();
	
	//내림차순
//	Iterator<String> itkey = treeMap.descendingKeySet().iterator();
	
	while(itkey.hasNext()) {
		String key = itkey.next();
		System.out.println("key"+key+"value:"+treeMap.get(key));
	}
	
	HashMap<Integer,MyData> dMap = new HashMap<Integer,MyData>();
	
			}
}
