package chapter5;
// 5.4
public class StackApp {
	public static void main(String[] args) {

		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.peek();
		System.out.println("");
		s.display();
		s.pop();
		s.display();
		s.pop();
		s.pop();
		System.out.println(s.isEmpty());
		s.pop();
		System.out.println(s.isEmpty());
	}

}
