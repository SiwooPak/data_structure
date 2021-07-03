package stack;

public class MyArrayStackTest {

	public static void main(String[] args) {
		MyArrayStack stack = new MyArrayStack(3);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		// 배열의 사이즈보다 더 할당할 경 에러 발생. 
		//stack.push(40);
		
		stack.printAll();
		
		System.out.println("top element is " + stack.pop());
		stack.printAll();
		System.out.println("stack size is " + stack.getSize());

	}

}
