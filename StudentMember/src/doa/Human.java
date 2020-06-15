package doa;

public class Human {
	private String name;
	private int age;
	private int eng;
	private int math;
	private int Number;
	
	public Human() {
		
	}
	public Human(String name,int age,int eng,int math,int Number) {
		
		this.name =name;
		this.age = age;
		this.eng = eng;
		this.math = math;
		this.Number=Number;
		
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int Number) {
		this.Number = Number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public String toString() {
		return  name + "-" + age + "-" + eng + "-" + math+"-"+Number;
	}

}
