
public class App {

	public static void main(String[] args) {
		ReverseWord greeting = new ReverseWord();
		greeting.insertToTop('h');
		greeting.insertToTop('e');
		greeting.insertToTop('l');
		greeting.insertToTop('l');
		greeting.insertToTop('o');
		
		
		while(! greeting.isEmpty()){
			System.out.println((char)(greeting.removeFromTop())); //you can type cast a character
		}
		
	}

}

