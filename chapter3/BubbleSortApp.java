package chapter3;
//Lafore textbook code
class BubbleSortApp
{
	public static void main(String[] args)
	{
		int maxSize = 100; // array size
		ArrayBub arr; // reference to array
		arr = new ArrayBub(maxSize); // create the array
		arr.insert(88); // insert 10 items
		arr.insert(00);
		arr.insert(77);
		arr.insert(66);
		arr.insert(55);
		arr.insert(44);
		arr.insert(33);
		arr.insert(22);
		arr.insert(11);
		arr.insert(99);
		arr.display(); // display items
		arr.bubbleSort(); // bubble sort them
		arr.display(); // display them again
		
		ArrayBub evenodd = new ArrayBub(7);
		evenodd.insert(6);
		evenodd.insert(5);
		evenodd.insert(4);
		evenodd.insert(3);
		evenodd.insert(2);
		evenodd.insert(1);
		evenodd.insert(3);
		evenodd.display();
		evenodd.oddEvenSort();
		evenodd.display();
	} // end main()
} // end class BubbleSortApp
