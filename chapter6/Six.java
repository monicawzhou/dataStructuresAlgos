package chapter6;
// 6.3
public class Six {
	public static void main(String[] args) {
		int test = power(3,18);
		System.out.println(test);
	}

	public static int power(int x, int y) {
		if(y==1) {
			return x;
		} else {
			
			if(y%2==1) {
				return x*power(x*x,y/2);
			} else {
				return power(x*x,y/2);
			}
			

		}
	}

}
