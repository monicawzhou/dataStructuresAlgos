package chapter5;

class Matrix
{
	private MLink curRow;
	private MLink curCol;
	private MLink current;
	private MLink first;
	private int r;
	private int c;
	// -------------------------------------------------------------
	public Matrix(int row, int col) // constructor
	{
		r = row;
		c = col;
		first = new MLink(0);
		current = first;
		// initialize to zeros
		for(int r = 0;r<row;r++) {
			curCol = current;
			for(int c = 0;c<col-1;c++) { // each row grows from the first item

				MLink newLink = new MLink(0);
				newLink.nextCol = curCol.nextCol;
				curCol.nextCol = newLink;
			}
			if (r < row-1) { // create a new row
				MLink newLink = new MLink(0);
				current.nextRow = newLink;
				current = current.nextRow;
			}
		}
	}

	public void display() // display the matrix
	{

		current = first; 
		curRow = first;
		for(int i =0;i<r;i++) {
			for(int j=0;j<c;j++) 
			{
				current.displayLink(); 
				current = current.nextCol; 
			}
			current = curRow; // reset current to beginning of row because rows grow from the first item
			System.out.println("");
			current = current.nextRow;
			curRow = curRow.nextRow;
		}
	}
	
	public void insert(long d, int row, int col) {
		curRow = first;
		
		for(int i=0;i<row-1;i++) {
			curRow = curRow.nextRow;
		}
		curCol = curRow;
		for(int j=0;j<col-1;j++) {
			curCol = curCol.nextCol;
		}
		curCol.dData = d;
	}
	
} 