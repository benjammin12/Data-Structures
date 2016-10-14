
public class App {

	public static void main(String[] args) {
		Queue queue = new Queue(5);
		
		queue.insertFromRear(10); //fill up array
		queue.insertFromRear(11);
		queue.insertFromRear(12);
		queue.insertFromRear(3);
		queue.insertFromRear(9);
		
		queue.removeFromFront(); //remove 3 elements
		queue.removeFromFront();
		queue.removeFromFront();
		
		queue.insertFromRear(5); //confirm that you could put back those 3 elements and wrap araound works
		queue.insertFromRear(7);
		queue.insertFromRear(21);
	}

}
