
package ycls;

import mcls.MyClass;
import single.SingletonClass;

public class YouClass extends MyClass{
	


//	public void setTag(int tag) {
//		this.tag = tag;
//	}

	@Override
	public void method() {
		System.out.println(" 나다 ");
		super.method();
	}

	@Override
	public String toString() {
		return "YouClass [tag=" + tag + ", ac8=" + ac8 + "]";
	}

	private int tag;
	private int ac8;
	public void Fuck() {
		ac8 = 1;
		SingletonClass sc = SingletonClass.getInstance();
		
		sc.snumber = this.ac8;
	}
	
	public void func() {
		SingletonClass sc = SingletonClass.getInstance();
		this.tag = sc.snumber;
		
		}
}
