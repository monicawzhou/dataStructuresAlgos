package chapter6;
// 6.2
class Tree
{
	private char[][] arr;
	private int width;
	private int len;
	private int index=0;
	// -------------------------------------------------------------
	public Tree(int length) // constructor
	{ 
		width = (int)(Math.log(length)/Math.log(2)+1);
		arr = new char[width][length];
		len = length;
	}
	
	public void initialize() {
		for(int i=0;i<width;i++) {
			for(int j=0;j<len;j++) {
				arr[i][j] = '-';
			}
		}
	}
	
	public void display() {
		for(int i=0;i<width;i++) {
			for(int j=0;j<len;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
			
	}
	
	public void makeBranches() {
		recMakeBranches(0,len-1);
	}
	
 	public void recMakeBranches(int left, int right) {
		
 		if(left==right) {
 			if(index==width-1) {
 				arr[index][left] = 'x';
 			}
			return;
		}
 		int mid = (left+right+1)/2;
		arr[index][mid] = 'x';
		index++;
		recMakeBranches(left,mid-1);
		
		recMakeBranches(mid,right);
		index--;
		
		
	}

}