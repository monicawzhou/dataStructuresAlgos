package chapter5;
//5.1
class PriorityQueueApp
{
	public static void main(String[] args)
	{ // create new list
		PriorityQueue q= new PriorityQueue();
		q.insert(20); // insert 2 items
		q.insert(40);
		q.displayQueue(); // display list
		q.insert(10); // insert 3 more items
		q.insert(30);
		q.insert(50);
		q.displayQueue(); // display list
		q.remove(); // remove an item
		q.remove();
		q.remove();
		q.displayQueue(); // display list
	} // end main()
} // end class SortedListApp

