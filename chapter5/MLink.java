package chapter5;
class MLink
{
	public long dData; // data item
	public MLink nextRow; // next link in list
	public MLink nextCol;
	// -------------------------------------------------------------
	public MLink(long dd) // constructor
	{ dData = dd; }
	// -------------------------------------------------------------
	public void displayLink() // display this link
	{ System.out.print(dData + " "); }
} // end class Link