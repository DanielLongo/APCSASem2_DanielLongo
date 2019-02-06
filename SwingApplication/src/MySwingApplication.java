import javax.swing.*;
public class MySwingApplication implements Runnable{
    private JFrame jFrame;
    public void run() {
        CanvasComponent canvasComponent = new CanvasComponent (20,20);

//        System.out.println ("hello" );
        jFrame = new JFrame ("test");
        jFrame.setSize (400,400);
        jFrame.add(canvasComponent);
////        jFrame.EXIT_ON_CLOSE.;
        jFrame.setVisible (true);
    }
    public static void main(String[] args) {
        MySwingApplication mySwingApplicationSwing = new MySwingApplication ();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);

    }
}
