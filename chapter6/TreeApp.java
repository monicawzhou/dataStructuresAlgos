package chapter6;
// 6.2
public class TreeApp {
	public static void main(String[] args) {
		
		Tree t = new Tree(16);
		t.initialize();

		t.makeBranches();
		t.display();
	}

}
