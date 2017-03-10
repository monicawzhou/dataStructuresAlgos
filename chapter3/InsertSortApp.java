package chapter3;
//modified Lafore textbook code
class InsertSortApp
{
	public static void main(String[] args)
	{
		int maxSize = 100; // array size
		ArrayIns arr; // reference to array
		arr = new ArrayIns(maxSize); // create the array
		arr.insert(77); // insert 10 items
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		arr.display(); // display items
		long median = arr.median();
		System.out.println(median);
		arr.insertionSort(); // insertion-sort them
		arr.display(); // display them again
		
		
		// 3.3
		ArrayIns dupArr = new ArrayIns(12);
		dupArr.insert(1);
		dupArr.insert(3);
		dupArr.insert(2);
		dupArr.insert(3);
		dupArr.insert(4);
		dupArr.insert(2);
		dupArr.insert(4);
		dupArr.insert(4);
		dupArr.insert(5);
		dupArr.insert(7);
		dupArr.insert(6);
		dupArr.insert(6);
		dupArr.noDups();
		dupArr.display();
	
		//3.5 - inversely sorted - worst case 
		ArrayIns cc = new ArrayIns(6);
		cc.insert(5);
		cc.insert(4);
		cc.insert(3);
		cc.insert(2);
		cc.insert(1);
		cc.display();
		cc.insertionSort();
		cc.display();
		
		//3.6
		ArrayIns noDups = new ArrayIns(5);
		noDups.insert(1);
		noDups.insert(2);
		noDups.insert(2);
		noDups.insert(3);
		noDups.insert(2);
		noDups.insertionSortNoDups();
		noDups.display();
	} // end main()
} // end class InsertSortApp
