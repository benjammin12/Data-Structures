
public class LinkListApp {

	public static void main(String[] args) {
		
		LinkList theList = new LinkList(); //makes new list
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		
		theList.displayList();
		
		theList.deleteFirst();
		theList.deleteFirst();
		
		theList.insertFirst(7, 77.77);
		
	}

}
