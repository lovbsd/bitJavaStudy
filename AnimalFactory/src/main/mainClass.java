package main;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.Cat;
import animal.Cow;
import animal.Dog;
import factory.AnimalFactory;

public class mainClass {
	public static void main(String[] args) {
			/*
			 singleton pattern
			 	중심이 되는 데이터 관리 template(list,map)을 중심으로 
			 	어디 클래스에서나 접근이 용이하게 하기 위한 패턴
			 	instance 가 한개의 의미.
			 	
			 factory pattern 공장 ->Object
			 	원하는 클래스의 형태를 생성하기위한 패턴.
			 	
			 interface,class 동물 
			 
			 class 	고양이,멍멍이,황소
			 
			 animal ani = new Cat();
			 
			 */
		Animal ani1 = AnimalFactory.create("멍멍이");
		Animal ani2 = AnimalFactory.create("야옹이");
		Animal ani3 = AnimalFactory.create("황소");
		
		ani1.printDescript();
		ani2.printDescript();
		ani3.printDescript();
		
		((Dog)ani1).dogMethod();
		
		List<Animal> list = new ArrayList<Animal>();
		
		Animal ani = null;
		
		String anme[] = {"황소","황소","야옹이","멍멍이","멍멍이"};
		
		for (int i = 0; i < anme.length; i++) {
		ani =AnimalFactory.create(anme[i]);
		list.add(ani);
		}
//		ani = AnimalFactory.create("황소");
//		list.add(ani);
//		ani = AnimalFactory.create("황소");
//		list.add(ani);
//		ani = AnimalFactory.create("야옹이");
//		list.add(ani);
//		ani = AnimalFactory.create("멍멍이");
//		list.add(ani);
//		ani = AnimalFactory.create("멍멍이");
//		list.add(ani);
System.out.println();
System.out.println();
		for (int i = 0; i < anme.length; i++) {
			Animal a = list.get(i);
			a.printDescript();
			
			
			if(a instanceof Cat) {
				((Cat)a).catMethod();
				
			}else if(a instanceof Dog) {
				((Dog)a).dogMethod();
			}else if(a instanceof Cow) {
				((Cow)a).cowMethod();
			}
			
			
			
		}
	}
}
