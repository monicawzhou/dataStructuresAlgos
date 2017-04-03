package chapter4;
//listing 4.4
class Queue
{
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;
	//--------------------------------------------------------------
	public Queue(int s) // constructor
	{
		maxSize = s;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	//--------------------------------------------------------------
	public void insert(long j) // put item at rear of queue
	{
		if(rear == maxSize-1) // deal with wraparound
			rear = -1;
		queArray[++rear] = j; // increment rear and insert
		nItems++; // one more item
	}
	//--------------------------------------------------------------
	public long remove() // take item from front of queue
	{
		long temp = queArray[front++]; // get value and incr front
		if(front == maxSize) // deal with wraparound
			front = 0;
		nItems--; // one less item
		return temp;
	}
	//--------------------------------------------------------------
	public long peekFront() // peek at front of queue
	{
		return queArray[front];
	}
	
	// 4.1 display contents from front to rear
	public void display()
	{
		if(nItems==0) {
			System.out.println("Queue is empty!");
		}
		for(int i=0;i<nItems;i++) {
			System.out.print(queArray[(front+i)%maxSize]);
			System.out.print(" ");
		}
		System.out.println("");
	}
	public boolean isEmpty() // true if queue is empty
	{
		return (nItems==0);
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