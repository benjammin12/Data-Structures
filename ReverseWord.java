public class ReverseWord {
	
	char arr[];
	int stackSize;
	int numItems=0;
	int top;
	
	
	public ReverseWord(){
	
		stackSize = 10;
		arr = new char[stackSize];
		top = -1; //this is because you increment the top before inserting , to prevent from any data loss
		
	}

	public void insertToTop(char val){
		
		top++;
		 arr[top] = val; //increment the top to create space, then insert the value
		numItems++;
	}
	
	public int removeFromTop(){
		numItems--;
		return arr[top--]; //this is because you get the top value and then decrement the stack
	}
	
	public boolean isEmpty(){
		return (numItems == 0);
				
	}
	
	public boolean isFull(){
		return (numItems == stackSize);
	}

}
