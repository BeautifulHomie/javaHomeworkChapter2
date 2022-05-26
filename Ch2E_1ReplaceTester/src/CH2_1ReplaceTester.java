
public class CH2_1ReplaceTester {

	public static void main(String[] args) {
		
		String river = "Mississippi";
		river = river.replace("i", "!");
		river = river.replace("s", "$");
		System.out.println("Actual result: " + river);
		System.out.println("Expected result: M!$$!$$!pp!");
	}

}
