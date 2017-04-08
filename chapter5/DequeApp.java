package chapter5;


//5.2
class DequeApp
{
	public static void main(String[] args)
	{
		Deque d = new Deque(); 

		int size = d.size();
		System.out.println(size);
		
		d.insertRight(10);
		d.insertRight(20);
		d.insertRight(30);
		d.removeRight();
		d.removeLeft();
		d.insertLeft(5);
		d.insertLeft(90);
		d.insertLeft(1);
		d.insertLeft(2);

		d.display();
		size = d.size();
		System.out.println(size);
	
		

	}
} 