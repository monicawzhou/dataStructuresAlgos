package chapter5;
class Link
{
	public long dData; // data item
	public Link next; // next link in list
	public Link previous;
	// -------------------------------------------------------------
	public Link(long dd) // constructor
	{ dData = dd; }
	// -------------------------------------------------------------
	public void displayLink() // display this link
	{ System.out.print(dData + " "); }
} // end class Link