public class Queue {
	private int maxSize;
	private int [] queArray;
	private int front;
	private int rear;
	private int numElms;
	
	public Queue(int size){
		maxSize = size; //make sure you assign size to the value the user inputs
		queArray = new int[size];
		front = 0;
		rear = -1;
		numElms = 0;
	}
	
	public void insertFromRear(int value){
		if (rear == maxSize -1) //this is to prevent wrap around, since we build from the rear, we increment the rear, we don't want to go out of bounds, but there may be
			rear = -1;          //room in the front of the queue
			
		queArray[++rear] = value; //increment rear, and insert item , alternatively you could put these into two steps
		numElms++; //increment number of items
	}
	
	public int removeFromFront(){
		int temp = queArray[front++]; //hold the front value
		if (front == maxSize) //to deal with wrap around sceneario, if the front is the same as the maxSize, that means you're at the end of the array, so you must	
			front = 0;		// set the front to 0
		numElms--;
		return temp;
	}
	
	
	public int peekFront() {
		return queArray[front];
	}
	
	public int size(){
		return numElms;
	}
	
	public boolean isEmpty() {
		return (numElms == 0);
	}
	
	public boolean isFull() {
		return (numElms == maxSize);
	}

}
