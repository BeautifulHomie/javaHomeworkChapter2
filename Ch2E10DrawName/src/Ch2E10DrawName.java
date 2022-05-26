import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class Ch2E10DrawName extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Font font = new Font("Verdana", Font.BOLD, 18);        
        g2.setFont(font);        
       
        g2.setColor(Color.RED);        
        g2.drawString("Jeremiah", 95,125);

}
}