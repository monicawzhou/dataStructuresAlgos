package chapter5;

class DoublyLinkedApp
{
	public static void main(String[] args)
	{ // make a new list
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.insertFirst(22); // insert at front
		dl.insertFirst(44);
		dl.insertFirst(66);
		dl.insertLast(11); // insert at rear
		dl.insertLast(33);
		dl.insertLast(55);
		dl.displayForward(); // display list forward
		dl.displayBackward(); // display list backward
		dl.deleteFirst(); // delete first item
		dl.deleteLast(); // delete last item
		dl.deleteKey(11); // delete item with key 11
		dl.displayForward(); // display list forward
		dl.insertAfter(22, 77); // insert 77 after 22
		dl.insertAfter(33, 88); // insert 88 after 33
		dl.displayForward(); // display list forward
	} // end main()
} // end class DoublyLinkedApp