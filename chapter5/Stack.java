package chapter5;
// 5.4
class Stack
{
	LinkList lst;
	//--------------------------------------------------------------
	public Stack() // constructor
	{
		lst = new LinkList();
	}
	//--------------------------------------------------------------
	public void push(long j) // put item on top of stack
	{
		lst.insert(j);
	}
	//--------------------------------------------------------------
	public long pop() // take item from top of stack
	{
		return lst.delete(); // access item, decrement top
	}
	//--------------------------------------------------------------
	public long peek() // peek at top of stack
	{
		return lst.peek();
	}
	//--------------------------------------------------------------
	public boolean isEmpty() // true if stack is empty
	{
		return lst.isEmpty();
	}

	public void display() {
		lst.displayList();
	}
} 