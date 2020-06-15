package dao;

import java.util.Scanner;

import dto.Human;

import singleton.SingleTonClass;

public  class UpdateClass {
	public  UpdateClass() {
		SingleTonClass ac =SingleTonClass.getInstance();
		System.out.println("수정할 선수이름을 쳐주세요");
		String name = new Scanner(System.in).next();
		
		int index=SelectClass.search(name);
		index = 0;
		
		
		
		
		
		System.out.println("name");
		String nam = new Scanner(System.in).next();
		System.out.println("age");
		int age = new Scanner(System.in).nextInt();
		System.out.println("height");
		int height = new Scanner(System.in).nextInt();
		
			}	
	}

