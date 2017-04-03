package chapter4;
// 4.2
class Deque
{
	private int maxSize;
	private long[] dequeArr;
	private int left;
	private int right;
	private int nItems;
	//--------------------------------------------------------------
	public Deque(int s) // constructor
	{
		maxSize = s;
		dequeArr = new long[maxSize];
		left = 0;
		right = -1;
		nItems = 0;
	}
	//--------------------------------------------------------------
	public void insertRight(long j) 
	{
		if(right == maxSize-1) // deal with wraparound
			right = -1;
		dequeArr[++right] = j; // increment rear and insert
		nItems++; // one more item
	}
	
	public void insertLeft(long j) {
		left--;
		if(left == -1) {        // wraparound
			left = maxSize-1;
		}
		dequeArr[left] = j;
		nItems++;
	}
	
	public long removeRight() {
		long temp = dequeArr[right--]; // get value then decrement
		if(right==-1) {
			right = maxSize-1;
		}
		nItems--;
		return temp;
	}
	
	//--------------------------------------------------------------
	public long removeLeft() // take item from front of queue
	{
		long temp = dequeArr[left++]; // get value and incr front
		if(left == maxSize) // deal with wraparound
			left = 0;
		nItems--; // one less item
		return temp;
	}

	
	// display contents from left to right
	public void display()
	{
		if(nItems==0) {
			System.out.println("Queue is empty!");
		}
		for(int i=0;i<nItems;i++) {
			System.out.print(dequeArr[(left+i)%maxSize]);
			System.out.print(" ");
		}
		System.out.println("");
	}
	public boolean isEmpty() // true if queue is empty
	{
		return (nItems==0);
	}
	
	public long peekRight() {
		return dequeArr[right];
	}
	//--------------------------------------------------------------
	public boolean isFull() // true if queue is full
	{
		return (nItems==maxSize);
	}
	//--------------------------------------------------------------
	public int size() // number of items in queue
	{
		return nItems;
	}
	//--------------------------------------------------------------
} // end class Queue