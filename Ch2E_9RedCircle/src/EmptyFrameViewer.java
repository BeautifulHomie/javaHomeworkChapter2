import javax.swing.JFrame;

public class EmptyFrameViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(300, 400);
      frame.setTitle("Red circle in a frame");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      TheRedCircle component = new TheRedCircle();
      frame.add(component);
      
      frame.setVisible(true);
   }
}
