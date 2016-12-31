
public class LinkList {
	private Link first; //reference to the first link on the list
	
	public LinkList() {
		first = null;
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
	
	public void insertFirst(int id, double dd){
		Link newLink = new Link(id,dd);
		newLink.next = first; //newLink is the old first
		first = newLink;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList(){
		System.out.println("List(first -->Last: " );
		Link current = first; //first element
		while (current != null) { //until we reach the end because the last link is always null
			current.displayLink();
			current = current.next;
		}
		System.out.println(" ");
	}

}
