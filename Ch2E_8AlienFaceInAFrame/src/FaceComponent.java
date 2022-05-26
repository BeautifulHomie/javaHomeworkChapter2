import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;


public class FaceComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;

      Ellipse2D.Double head = new Ellipse2D.Double(150, 75, 200, 275);
      g2.draw(head);

      g2.setColor(Color.GREEN);
      Rectangle eye = new Rectangle(205, 190, 15, 15);
      g2.fill(eye);
      eye.translate(75, 0);
      g2.fill(eye);

      Line2D.Double mouth = new Line2D.Double(205, 310, 290, 310);
      g2.setColor(Color.RED);
      g2.draw(mouth);

      g2.setColor(Color.ORANGE);
      g2.drawString("Hello World, my name is Jeremiah", 150, 450);
   }
}
