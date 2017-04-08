package chapter5;
//5.3
class LinkList
{
	private Link current; // ref to first item on list
	private int nItems;
	// -------------------------------------------------------------
	public LinkList() // constructor
	{ 
		current = null;
		nItems = 0;
	
	} // no items on list yet
	// -------------------------------------------------------------
	public boolean isEmpty() // true if list is empty
	{ return (current==null); }
	// -------------------------------------------------------------
	public void insert(long dd) // insert after current
	{ 
		// make new link
		Link newLink = new Link(dd);
		if(isEmpty()) {
			current = newLink;
			current.next = newLink;
		} else {
			newLink.next = current.next;
			current.next = newLink;
		}
		nItems++;
		
	}
	
	public void step() {
		current = current.next;
	}


	public long delete() // delete item after current
	{ 
		if(isEmpty()) {
			System.out.println("Empty list!");
			return 0;
		} else if (nItems == 1) {
			current = null;
			nItems--;
			return 0;
		} else {
			Link temp = current.next;
			current.next = current.next.next;
			nItems--;
			return temp.dData;
		}
	
	}

	public void displayList()
	{

		for (int i=0;i<nItems;i++) {
			current.displayLink(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}
	
	// searches if link after current has the value we are searching for
	public Link search(long j) {
		for(int i=0;i<nItems;i++) {
			if(current.next.dData == j) {
				System.out.println("Link found!");
				return current.next;
			} 
			current = current.next;
		}
		System.out.println("Link not found!");
		return current;
		
	}
	
	public void peek() {
		current.displayLink();
	}
} 