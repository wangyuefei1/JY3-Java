import javax.swing.*;

public class JFrameHelloWorld
{
   public static  void main(String[] args)
   {
   JFrame frame = new JFrame("JFrame");
   JPanel panel = new JPanel();
   JLabel label = new JLabel("JY3-CALSS");
   panel.add(label);
   frame.setContentPane(panel);
   frame.setSize(300,300);
   frame.setVisible(true);
   }
}