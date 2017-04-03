package chapter4;
// listing 4.6
class PriorityQ
{
	// array in sorted order, from max at 0 to min at size-1
	private int maxSize;
	private long[] queArray;
	private int nItems;
	//-------------------------------------------------------------
	public PriorityQ(int s) // constructor
	{
		maxSize = s;
		queArray = new long[maxSize];
		nItems = 0;
	}
	// 4.4 O(1) insertion time
	public void insert(long item) // insert item
	{
		
		queArray[nItems++] = item;

	} // end insert()
	// 4.4
	public long remove() // remove minimum item
	{ 
		long minimum = queArray[0];
		int index = 0;
		for (int i=1;i<nItems;i++) {
			if (queArray[i] < minimum) {
				minimum = queArray[i];
				index=i;
			}
		}
		for (int j=index;j<nItems-1;j++) {
			queArray[j] = queArray[j+1];
		}
		nItems--;
		return minimum;
	}
	
	public void display() {
		for(int i=0;i<nItems;i++) {
			System.out.print(queArray[i]);
			System.out.print(" ");
		}
		System.out.println("");
	}
	//-------------------------------------------------------------
	public long peekMin() // peek at minimum item
	{ return queArray[nItems-1]; }
	//-------------------------------------------------------------
	public boolean isEmpty() // true if queue is empty
	{ return (nItems==0); }
	//-------------------------------------------------------------
	public boolean isFull() // true if queue is full
	{ return (nItems == maxSize); }
	//-------------------------------------------------------------
} // end class PriorityQ