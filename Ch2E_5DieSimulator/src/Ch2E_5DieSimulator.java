import java.util.Random;

public class Ch2E_5DieSimulator {

	public static void main(String[] args) {
		Random dieRoll = new Random();
		System.out.println("Die roll: ");
		System.out.println("#1 = " + (dieRoll.nextInt(6) + 1));
		System.out.println("#2 = " + (dieRoll.nextInt(6) + 1));
		System.out.println("#3 = " + (dieRoll.nextInt(6) + 1));
		System.out.println("#4 = " + (dieRoll.nextInt(6) + 1));
		System.out.println("#5 = " + (dieRoll.nextInt(6) + 1));
		System.out.println("#6 = " + (dieRoll.nextInt(6) + 1));
		System.out.println("#7 = " + (dieRoll.nextInt(6) + 1));
		System.out.println("#8 = " + (dieRoll.nextInt(6) + 1));
		System.out.println("#9 = " + (dieRoll.nextInt(6) + 1));
		System.out.println("#10 = " + (dieRoll.nextInt(6) + 1));

	}

}
