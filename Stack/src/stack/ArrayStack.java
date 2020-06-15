package stack;

public class ArrayStack {

	
	private int top;
	private int maxSize;
	private Object stackArray[]; // ArrayList
	
	public ArrayStack(int maxSize) {
		this.maxSize = maxSize;
		
		stackArray = new Object[maxSize];
		this.top = -1;
	}
	//stack 공간이 비어있는지 확인
	public boolean isEmpty() {
		return (this.top ==-1);
		
	}
	//stack 공간이 꽉차있는지 확인
	public boolean full() {
		return (this.top == maxSize-1);
		
	}
	//insert
	public void push(Object item) {
		if(full()) {
			System.out.println("스택공간이 가득 차있습니다");
			return;
		}
		top++;
		stackArray[top]= item;
		
	}
	//delete
	public Object pop() {
		Object item =peek();
		top--;
		return item;
	}
	public Object peek() {
		if(isEmpty()) {
			System.out.println("스택공간이 비어 있습니다");
			return null;
		}
		return stackArray[top];
	}
}
