import javax.swing.JFrame;

public class EmptyFrameViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(300, 400);
      frame.setTitle("An empty frame");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      Ch2E10DrawName component = new Ch2E10DrawName();
      frame.add(component);
      
      frame.setVisible(true);
   }
}
