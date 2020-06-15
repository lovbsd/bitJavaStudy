package dao;

import java.util.ArrayList;
import java.util.Scanner;

import doa.Human;
import fe.FileClass;

public class MemberDao {
	Scanner sc = new Scanner(System.in);

	private ArrayList<Human> list = new ArrayList<Human>();

	private int memberNumber;
	
	FileClass fp;

	public MemberDao() throws Exception {
		fp = new FileClass("student");
		fp.createFile();
		this.loadData();
	}

	public void insert() {
		

		System.out.println("추가할 학생이름을 쳐주세요");
		String name = sc.next();

		System.out.println("나이: ");
		int age = sc.nextInt();

		System.out.println("영어점수: ");
		int eng = sc.nextInt();

		System.out.println("수학점수: ");
		int math = sc.nextInt();

		list.add(new Human(name, age, eng, math, memberNumber));
		memberNumber++;
	}

	public void delete() {
		System.out.println("삭제하고 싶은 학생명은?:");
		String name = sc.next();

		if (name.equals("")) {
			System.out.println("이름을 정확히 입력해 주시요");
			return;

		}
		int findIndex = search(name);
		if (findIndex == -1) {
			System.out.println("성적 명단에 이름이없습니다. 삭제할수없습니다");
			return;

		}
		list.remove(findIndex);

	}

	public void find() {
		System.out.println("검색할 이름은?:");
		String name = sc.next();

		int findIndex = search(name);
		if (findIndex == -1) {
			System.out.println("학생 명단에 없습니다");
		} else {
			Human human = list.get(findIndex);

			System.out.println("번호: " + list.get(findIndex).getNumber());
			System.out.println("이름: " + human.getName());
			System.out.println("나이: " + human.getAge());
			System.out.println("영어: " + human.getEng());
			System.out.println("수학: " + human.getMath());

		}
	}

		public void update() {
		System.out.println("수정하고 싶은 학생명은?");
		String name = sc.next();
		
		int findIndex = search(name);
		if (findIndex == -1) {
			System.out.println("학생 명단에없습니다");
			}
		
		
		
		System.out.println("학생이름을 쳐주세요: ");
		name = sc.next();
		
		System.out.println("나이: ");
		int age = sc.nextInt();
		
		System.out.println("영어점수: ");
		int eng = sc.nextInt();
		
		System.out.println("수학점수: ");
		int math = sc.nextInt();
		list.get(findIndex).setName(name);
		list.get(findIndex).setAge(age);
		list.get(findIndex).setEng(eng);
		list.get(findIndex).setMath(math);
		
		
		System.out.println("이름이 수정되었습니다");
			
		}
		

	
	
	public void allin() {
		for (int i = 0; i<list.size(); i++) {
			Human human= list.get(i);
			System.out.println(human.toString());
			
			
		}
	}
		public int search(String name) {
			int index = -1;
			
			for (int i = 0; i < list.size(); i++) {
			Human h = list.get(i);
			if(name.equals(h.getName())) {
				index = i;
				break;
				}
			}
			
			return index;
		}
	
		public void maxscore() {
		System.out.println("math:1 or eng:2?");
		int num = sc.nextInt();
		int sum = 0;
		if(num==1) {
			for (int i = 0; i < list.size(); i++) {
				sum += list.get(i).getMath(); 
			}	System.out.println("수학총점수: "+sum);
		}else{
			for (int i = 0; i < list.size(); i++) {
				sum +=list.get(i).getEng();
				}	System.out.println("영어총점수: "+sum);
		}
		
	
			
			
			
		
		}
		public void saveData() {
			ArrayList<Human> listed = new ArrayList<Human>();
			Integer w;
			listed = list;		
			fp.saveData(listed);	
				
			
		}
		public void loadData() throws Exception {
			ArrayList<String> list1 = new ArrayList<String>();
			list1=fp.loadData();
			
			String title[];
			title = null;
			for (int i = 0; i < list1.size(); i++) {
				
				title=list1.get(i).split("-");
				list.add(new Human(
						title[0],
						Integer.parseInt(title[1]),
						Integer.parseInt(title[2]),
						Integer.parseInt(title[3]),
						Integer.parseInt(title[4]) ));
					
				
					
				}
			}				
		}
	
