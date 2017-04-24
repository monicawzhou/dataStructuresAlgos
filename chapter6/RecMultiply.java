package chapter6;
// 6.1
public class RecMultiply {
	public static void main(String[] args) {
		int result = mult(4,5);
		System.out.println(result);
	}
	
	public static int mult(int x, int y) {
		if(y==1) {
			return x;
		} else {
			return (x+mult(x,y-1));
		}
	}
}
