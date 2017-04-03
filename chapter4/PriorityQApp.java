package chapter4;

import java.io.IOException;

// listing 4.6
class PriorityQApp
{
	public static void main(String[] args) throws IOException
	{
		PriorityQ thePQ = new PriorityQ(5);
		thePQ.insert(30);
		thePQ.insert(50);
		thePQ.insert(10);
		thePQ.insert(40);
		thePQ.insert(20);
		// 4.4
		thePQ.display();
		while( !thePQ.isEmpty() )
		{
			long item = thePQ.remove();
			System.out.print(item + " "); // 10, 20, 30, 40, 50
		} // end while
		System.out.println("");
	} // end main()
	//-------------------------------------------------------------
} // end class PriorityQApp
