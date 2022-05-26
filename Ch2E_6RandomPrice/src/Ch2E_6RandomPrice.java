import java.util.Random;

public class Ch2E_6RandomPrice {

	public static void main(String[] args) {
		//random price between $10.00 and $19.95
		//multiply prices by 100 to get integers 1000 and 1995 instead of decimals (in pennies)
		
		Random generator = new Random();
		int minPrice = 1000;
		int maxPrice = 1995;
		
		int value = generator.nextInt(maxPrice - minPrice) + minPrice;
		/* maxPrice - minPrice + minPrice equals to 
		 int value = generator.nextInt(955) + 1000 
		 */
		//nextInt(955) returns random integers between 0-954
		// +1000 brings the threshold up to at least 1000 
		
		System.out.printf("Price: $%.2f", (value / 100.0));
		//prints dollar sign and 2 decimal places
		//dividing by 100.0 will yield a decimal place answer instead of an integer

	}

}
