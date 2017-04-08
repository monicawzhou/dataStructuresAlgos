package chapter5;
//5.5
class CircularList
{
	private Link current; // ref to first item on list
	private int nItems;
	// -------------------------------------------------------------
	public CircularList() // constructor
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
	
	public int size() {
		return nItems;
	}


	public Link delete() // delete item after current
	{ 
		if(isEmpty()) {
			System.out.println("Empty list!");
			return null;
		} else if (nItems == 1) {
			current = null;
			nItems--;
			return null;
		} else {
			Link temp = current.next;
			current.next = current.next.next;
			nItems--;
			return temp;
		}
	
	}
	
	public void createList(int n) {
		for(int i=n;i>0;i--) {
			insert(i);
		}
	}
	
	public Link getCurrent() {
		return current;
	}

	public void displayList()
	{

		for (int i=0;i<nItems;i++) {
			current.next.displayLink(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}
	
	// searches if link after current has the value we are searching for
	public Link search(long j) {
		for(int i=0;i<nItems;i++) {
			if(current.next.dData == j) {
				return current;
			} 
			current = current.next;
		}
		System.out.println("Link not found!");
		return current;
		
	}
	
	public long peek() {
		current.next.displayLink();
		return current.next.dData;
	}
	
	// returns output list of people eliminated, prints from last --> first
	public CircularList eliminate(int startPerson, int count) {
		CircularList eliminate = new CircularList();
		current = search(startPerson);
		
		while(nItems!=1) {
			for(int i=0;i<count;i++) {
				current=current.next;
			}
			eliminate.insert(delete().dData);

		}
		return eliminate;
	}
} 