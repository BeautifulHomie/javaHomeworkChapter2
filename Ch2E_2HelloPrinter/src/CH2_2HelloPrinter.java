
public class CH2_2HelloPrinter {

	public static void main(String[] args) {
		
		String greeting = "Hello, World";
		greeting = greeting.replace("e", "!");
		greeting = greeting.replace("o", "e");
		greeting = greeting.replace("!", "o");
		System.out.println(greeting + "!");

	}

}
