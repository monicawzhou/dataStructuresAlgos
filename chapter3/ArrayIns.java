package chapter3;
// modified Lafore textbook code
//insertSort.java
//demonstrates insertion sort
//to run this program: C>java InsertSortApp
//--------------------------------------------------------------
class ArrayIns
{
	private long[] a; // ref to array a
	private int nElems; // number of data items
	//--------------------------------------------------------------
	public ArrayIns(int max) // constructor
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
	//--------------------------------------------------------------
	//3.5
	public void insertionSort()
	{
		int in, out;
		int copies = 0;
		int comparisons = 0;
		for(out=1; out<nElems; out++) // out is dividing line
		{
			long temp = a[out]; // remove marked item
			copies++;
			in = out; // start shifts at out
			while(in>0 && a[in-1] >= temp) // until one is smaller,
			{
				comparisons++;
				a[in] = a[in-1]; // shift item to right
				copies++;
				--in; // go left one position
			}
			if(in==0) {
				comparisons++;
			}
			a[in] = temp; // insert marked item
			copies++;
			
		} // end for
		System.out.println("Copies: "+copies);
		System.out.println("Comparisons: "+comparisons);
	} // end insertionSort()
	//--------------------------------------------------------------
	//3.2
	public long median() {
		//sort first
		insertionSort();
		int index;
		
		//odd number of elements
		if(nElems%2==1) {
			index = nElems/2;
			return a[index];
		} else {                //even number of elements
			index = nElems/2;
			return (a[index] + a[index-1])/2;
		}
	
	}
	// 3.3 removes duplicates - no item is shifted in the array more than once
	public void noDups() {
		insertionSort();
		long dupVal=a[0];
		int count=0;

		for(int i=1;i<a.length;i++) {
			if(dupVal==a[i]) {
				count++;
			}
			if(dupVal!=a[i]) {
				a[i-count] = a[i];	
				dupVal=a[i];
			}
		}
		nElems -=count;
		

	}
	//3.6
	public void insertionSortNoDups()
	{
		int in, out;
		int dups=0;
		for(out=1; out<nElems; out++) // out is dividing line
		{
			long temp = a[out]; // remove marked item
			
			in = out; // start shifts at out
			while(in>0 && a[in-1] >= temp) // until one is smaller,
			{
				if(temp==a[in-1] && temp!=-1) {
					temp=-1;
					dups++;
				}
				a[in] = a[in-1]; // shift item to right
				
				--in; // go left one position
			}
			
			a[in] = temp; // insert marked item

		} // end for
		
		//shift down entire array
		for(int i=0;i<nElems-dups;i++) {
			a[i] = a[i+dups];
		}
		nElems-=dups;
	} // end insertionSort()

} // end class ArrayIns