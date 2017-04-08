package chapter5;
// 5.1
class PriorityQueue
{
	private SortedList theList;
	//--------------------------------------------------------------
	public PriorityQueue() // constructor
	{ theList = new SortedList(); } // make a sorted list
	//--------------------------------------------------------------
	public boolean isEmpty() // true if queue is empty
	{ return theList.isEmpty(); }
	//--------------------------------------------------------------
	public void insert(long j) // insert, rear of queue
	{ theList.insert(j); }
	//--------------------------------------------------------------
	public Link remove() // remove, front of queue
	{ return theList.remove(); }
	//--------------------------------------------------------------
	public void displayQueue()
	{
		theList.displayList();
	}
	
} 