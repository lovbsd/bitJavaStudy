package factory;

import animal.Animal;
import animal.Cat;
import animal.Cow;
import animal.Dog;

public class AnimalFactory {
	//Factory로 원하는 클래스를 생성 하기위함 
	public static Animal create(String animalName) {
		
		if(animalName.equals("")) {
			System.out.println("생성할 클래스가 없습니다");
			
		}else if(animalName.contentEquals("야옹이")) {
			return new Cat();
		}else if(animalName.contentEquals("멍멍이")) {
			return new Dog();
		}else if(animalName.contentEquals("황소")) {
			return new Cow();
		}
		return null;
	}
}
