package ch2;

public class HighArrayApp {
	public static void main(String[] args) {

		int maxSize = 100; // array size
		HighArray arr; // reference to array
		arr = new HighArray(maxSize); // create the array
		arr.insert(Long.valueOf(77)); // insert 10 items
		arr.insert(Long.valueOf(99));
		arr.insert(Long.valueOf(44));
		arr.insert(Long.valueOf(55));
		arr.insert(Long.valueOf(22));
		arr.insert(Long.valueOf(88));
		arr.insert(Long.valueOf(11));
		arr.insert(Long.valueOf(00));
		arr.insert(Long.valueOf(66));
		arr.insert(Long.valueOf(33));
		arr.display(); // display items
		Long searchKey = Long.valueOf(35); // search for item
		if( arr.find(searchKey) )
			System.out.println("Found " + searchKey);
		else
			System.out.println("Can’t find " + searchKey);
		arr.delete(Long.valueOf(00)); // delete 3 items
		arr.delete(Long.valueOf(55));
		arr.delete(Long.valueOf(99));
		arr.display(); // display items again
		
		
		long maxValue = arr.getMax();
		System.out.println("maxValue: "+maxValue);
		arr.removeMax();
		
		arr.display();
		int arrSize = arr.getSize();
		System.out.println("arrSize: "+arrSize);
		HighArray sortedArr = new HighArray(arrSize);
		
		for(int i=0;i<arrSize;i++) {
			long maxToInsert = arr.getMax();
			sortedArr.insert(maxToInsert);
			arr.removeMax();
		}
		sortedArr.display();
		
		
		HighArray dups = new HighArray(8);
		dups.insert(Long.valueOf(2));
		dups.insert(Long.valueOf(2));
		dups.insert(Long.valueOf(3));
		dups.insert(Long.valueOf(3));
		dups.insert(Long.valueOf(3));
		dups.insert(Long.valueOf(3));
		dups.insert(Long.valueOf(4));
		dups.insert(Long.valueOf(4));
		
		dups.display();
		
		long[] noDups = dups.noDups();
		
		for (int i=0;i<noDups.length;i++) {
			System.out.println(noDups[i]);
		}
		
		
		
	} // end main()
	// end class HighArrayApp
}
