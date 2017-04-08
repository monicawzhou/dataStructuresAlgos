package chapter5;
// 5.3
public class CircularApp {
	public static void main(String[] args) {
		LinkList lst = new LinkList();
		lst.insert(1);
		lst.insert(2);
		lst.insert(3);
		lst.insert(4);
		lst.displayList();
		lst.step();
		lst.peek();
		System.out.println("");
		lst.displayList();
		lst.peek();
		System.out.println("");
		lst.delete();
		lst.displayList();
		lst.search(1);
		lst.delete();
		lst.displayList();
		lst.search(10);
	}

}
