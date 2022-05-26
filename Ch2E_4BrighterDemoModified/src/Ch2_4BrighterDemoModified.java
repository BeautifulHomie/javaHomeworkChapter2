import java.awt.Color;

import javax.swing.JFrame;

public class Ch2_4BrighterDemoModified {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
	    frame.setSize(500, 600);
	    frame.setTitle("A Brighter Color");
	    Color myColor = new Color(255, 174, 176);
	    Color brighterColor = myColor.brighter();
	    frame.getContentPane().setBackground(brighterColor);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);

	}

}
