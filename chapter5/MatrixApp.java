package chapter5;
// 5.6
public class MatrixApp {

	public static void main(String[] args) {
		Matrix m = new Matrix(4,7);
		
		m.insert(4, 3, 5);
		m.insert(2, 3, 7);
		m.insert(9, 1, 1);
		m.display();
		
	}
}
