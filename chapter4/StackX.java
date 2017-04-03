package chapter4;
// 4.3
class StackX
{
	Deque d;
	//--------------------------------------------------------------
	public StackX(int s) // constructor
	{
		d = new Deque(s);
	}
	//--------------------------------------------------------------
	public void push(long j) // put item on top of stack
	{
		d.insertRight(j);
	}
	//--------------------------------------------------------------
	public long pop() // take item from top of stack
	{
		return d.removeRight(); // access item, decrement top
	}
	//--------------------------------------------------------------
	public long peek() // peek at top of stack
	{
		return d.peekRight();
	}
	//--------------------------------------------------------------
	public boolean isEmpty() // true if stack is empty
	{
		return d.isEmpty();
	}
	//--------------------------------------------------------------
	public boolean isFull() // true if stack is full
	{
		return d.isFull();
	}
	//--------------------------------------------------------------
} // end class StackX