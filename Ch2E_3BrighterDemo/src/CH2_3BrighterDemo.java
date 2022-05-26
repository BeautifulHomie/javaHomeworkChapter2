import java.awt.Color;

public class CH2_3BrighterDemo {

	public static void main(String[] args) {
		Color myColor = new Color(255, 174, 176);
		Color brighterColor = myColor.brighter();
		System.out.print("Red: ");
		System.out.println(brighterColor.getRed());
		System.out.print("Green: ");
		System.out.println(brighterColor.getGreen());
		System.out.print("Blue: ");
		System.out.println(brighterColor.getBlue());

	}

}
