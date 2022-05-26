import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class TheRedCircle extends JComponent {
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		Ellipse2D.Double circle = new Ellipse2D.Double(50, 30, 200, 200);
		g2.draw(circle);
		
		g2.setColor(Color.RED);
		g2.fill(circle);
}
}