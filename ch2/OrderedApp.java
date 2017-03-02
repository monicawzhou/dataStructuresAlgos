package ch2;

class OrderedApp
{
	public static void main(String[] args)
	{
		int maxSize = 100; // array size
		OrdArray arr; // reference to array
		arr = new OrdArray(maxSize); // create the array
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
		int searchKey = 55; // search for item
		if( arr.find(searchKey) != arr.size() )
			System.out.println("Found " + searchKey);
		else
			System.out.println("Can’t find " + searchKey);
		arr.display(); // display items
		arr.delete(00); // delete 3 items
		arr.delete(55);
		arr.delete(99);
		arr.display(); // display items again
		
		OrdArray a = new OrdArray(3);
		OrdArray b = new OrdArray(3);
		a.insert(1);
		a.insert(101);
		a.insert(2);
		a.display();
		
		b.insert(100);
		b.insert(103);
		b.insert(102);
		b.display();
		
		long[] merged = a.merge(b);
		System.out.println("merged:");
		display(merged);
		
		
		
	} // end main()
	
	public static void display(long[] display) // displays array contents
	{
		for(int j=0; j<display.length; j++) // for each element,
			System.out.print(display[j] + " "); // display it
		System.out.println("");
	}
	 
} // end class OrderedApp
