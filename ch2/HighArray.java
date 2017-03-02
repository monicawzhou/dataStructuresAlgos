package ch2;

public class HighArray {

	private Long[] a; // ref to array a
	private int nElems; // number of data items

	public HighArray(int max) // constructor
	{
		a = new Long[max]; // create the array
		nElems = 0; // no items yet
	}

	public long[] noDups() {
		Long compare;
		int nullCount=0;
		for(int j=0;j<a.length;j++) {
			compare = a[j];
			
		
			for(int i=0;i<a.length-1;i++) {
				if(i==j) {
					continue;
				}
				if(compare==a[i]) {
					a[i] = null;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("a[i]: "+a[i]);
		}

		for(int i=0;i<a.length;i++) {
			if(a[i]==null)
			nullCount++;
		}


		for(int i=0;i<nullCount;i++) {
			delete(null);
		}
		

		
		System.out.println("nullcount: "+nullCount);
		int arrSize = a.length - nullCount;
		System.out.println("arrSize: "+arrSize);
		long[] noDupArr = new long[arrSize];
		for(int n=0;n<arrSize;n++) {
			noDupArr[n] = a[n];
		}
		
		return noDupArr;
	}

	public long getMax() {
		long maxValue=0;
		if (nElems == 0) {
			return -1;
		} else {
			for(int i=0;i<nElems;i++)
			{
				if(a[i]>maxValue) {
					maxValue = a[i];
				}
			}
			return maxValue;
		}
	}
	
	public void removeMax() {
		long maxValue = getMax();
		delete(maxValue);
	}
	
	public int getSize() {
		return nElems;
	}


	public boolean find(Long searchKey)
	{ // find specified value
		int j;
		for(j=0; j<nElems; j++) // for each element,
			if(a[j] == searchKey) // found item?
				break; // exit loop before end
		if(j == nElems) // gone to end?
			return false; // yes, can’t find it
		else
			return true; // no, found it
	} // end find()

	public void insert(Long value) // put element into array
	{
		a[nElems] = value; // insert it
		nElems++; // increment size
	}

	public boolean delete(Long value)
	{
		int j;
		for(j=0; j<nElems; j++) // look for it
			if( value == a[j] )
				break;
		if(j==nElems) // can’t find it
			return false;
		else // found it
		{
			for(int k=j; k<nElems-1; k++) // move higher ones down
				a[k] = a[k+1];
			nElems--; // decrement size
			return true;
		}
	} // end delete()

	public void display() // displays array contents
	{
		for(int j=0; j<nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}
}
