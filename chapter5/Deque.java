package chapter5;

//5.2
class Deque
{
	private DoublyLinkedList dlist;
	//--------------------------------------------------------------
	public Deque() // constructor
	{
		dlist = new DoublyLinkedList();
	}
	//--------------------------------------------------------------
	public void insertRight(long j) 
	{
		dlist.insertLast(j);
	}
	
	public void insertLeft(long j) {
		dlist.insertFirst(j);
	}
	
	public Link removeRight() {
		return dlist.deleteLast();
	}
	
	//--------------------------------------------------------------
	public Link removeLeft() // take item from front of queue
	{
		return dlist.deleteFirst();
	}

	
	// display contents from left to right
	public void display()
	{
		System.out.print("List (left-->right): ");
		dlist.displayForward();
	}


	public int size() // number of items in queue
	{
		return dlist.size();
	}
	//--------------------------------------------------------------
} 