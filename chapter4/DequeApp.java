package chapter4;
// 4.2
class DequeApp
{
	public static void main(String[] args)
	{
		Deque d = new Deque(5); // queue holds 5 items
		d.insertRight(10);
		d.insertRight(20);
		d.insertRight(30);
		d.removeRight();
		d.removeLeft();
		d.insertLeft(5);
		d.insertLeft(90);
		d.insertLeft(1);
		d.insertLeft(2);

		d.display();
	
		

	} // end main()
} // end class QueueApp
