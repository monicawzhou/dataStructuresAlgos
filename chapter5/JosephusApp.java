package chapter5;

public class JosephusApp {
	public static void main(String[] args) {
		CircularList start = new CircularList();
		// create input list of number of people in circle
		start.createList(7);
		
		// create output elimination list
		CircularList eliminate = new CircularList();
		
		// eliminate(int startPerson, int count) takes arguments of number of starting person and number for counting off (count)
		eliminate = start.eliminate(1,3);
		// displays eliminated people:
		System.out.println("Eliminated people in order from last --> first");
		eliminate.displayList();
		System.out.println("Last person left:");
		start.displayList();
	}
}
