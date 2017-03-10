package chapter3;
// modified Lafore textbook code
//bubbleSort.java
//demonstrates bubble sort
//to run this program: C>java BubbleSortApp
////////////////////////////////////////////////////////////////
class ArrayBub
{
	private long[] a; // ref to array a
	private int nElems; // number of data items
	//--------------------------------------------------------------
	public ArrayBub(int max) // constructor
	{
		a = new long[max]; // create the array
		nElems = 0; // no items yet
	}
	//--------------------------------------------------------------
	public void insert(long value) // put element into array
	{
		a[nElems] = value; // insert it
		nElems++; // increment size
	}
	//--------------------------------------------------------------
	public void display() // displays array contents
	{
		for(int j=0; j<nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}
	//3.1 bidirectional bubble sort
	public void bubbleSort()
	{
		int right, in;
		int left = 0;
		for(right=nElems-1; right>left; right--) // outer loop (backward)
			for(in=left; in<right; in++) // inner loop (forward)
				if( a[in] > a[in+1] ) // out of order?
					swap(in, in+1); // swap them
	
			for(in=right-1; in>left;in--)
				if(a[in] < a[in-1])
					swap(in, in-1);
			left++;

			
	} // end bubbleSort()
	
	// 3.4
	public void oddEvenSort() {
		// worst case needs nElems passes through array; 
		// pass equals just one odd iteration or one even iteration so both count as two passes
		// the outer loop that joins the even and odd inner loops together thus makes an extra even pass if nElems is odd
		for(int i=0;i<(nElems+1)/2;i++) {
			for(int odd = 1;odd<nElems-1;odd+=2) {
				if(a[odd] > a[odd+1]) {
					swap(odd, odd+1);
				}
			}
			for(int even = 0;even<nElems-1;even+=2) {
				if(a[even] > a[even+1]) {
					swap(even, even+1);
				}
			}
		}
	}
	
	
	private void swap(int one, int two)
	{
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
	//--------------------------------------------------------------
} // end class ArrayBub