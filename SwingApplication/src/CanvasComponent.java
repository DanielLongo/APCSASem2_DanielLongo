import javafx.animation.AnimationTimer;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.*;

public class CanvasComponent extends JComponent  implements MouseListener, MouseMotionListener, ActionListener, KeyListener{
    private int x;
    private int y;
    private int width;
    private int height;
    private int mouseFromX;
    private int mouseFromY;
    boolean shapeSelected;
    int animationDeltaX;
    int animationDeltaY;
    int gutterX;
    int gutterY;
    Timer animationTimer;
    int motionSpeed;


    CanvasComponent(int width, int height) {
        setSize (width, height);
        x = 200;
        y = 200;
        mouseFromX = 200;
        mouseFromY = 200;
        this.addMouseListener (this);
        this.addMouseMotionListener (this);
        animationDeltaX = 1;
        animationDeltaY = 0;
        gutterX = 10;
        gutterY = 10;
//        animationTimer = new Timer();
//        animationTimer.start ();
        motionSpeed = 1;

    }

    public void paintComponent(Graphics g) {
        g.setColor (Color.red);
        g.fillRect (mouseFromX, mouseFromY, 20, 20);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int MouseX=e.getX();
        int MouseY=e.getY();
        System.out.println("mouse: "+ x+","+y);//these co-ords are relative to the component
        System.out.println("actual" + this.x+","+this.y);//these co-ords are relative to the component
        while (mouseFromX != MouseX &&  y != MouseY) {
            repaint ();
            System.out.println("in loop: " +mouseFromX+","+mouseFromY);//these co-ords are relative to the component
            System.out.println ("A" );
            System.out.println ("B" );
            try
            {
                Thread.sleep(1);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println ("C" );
            if (mouseFromX < MouseX) mouseFromX += this.motionSpeed;
            if (mouseFromX > MouseX) mouseFromX -= this.motionSpeed;
            if (mouseFromY < MouseY) mouseFromY += this.motionSpeed;
            if (mouseFromY > MouseY) mouseFromY -= this.motionSpeed;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println ("Event" );
        if ((e.getX () < mouseFromX + 20) && (e.getX () > mouseFromX - 20)) {
            if ((e.getY () < mouseFromY + 20) && (e.getY () > mouseFromY - 20)) {
                shapeSelected = true;
                System.out.println ("selected" );
            }
        }
        mouseFromX = e.getX ();
        mouseFromY = e.getY ();
        repaint ();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {


    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (shapeSelected) {
            int mouseToX = e.getX ( );
            int mouseToY = e.getY ( );
            mouseFromX += mouseToX - mouseFromX;
            mouseFromY += mouseToY - mouseFromY;
            repaint ( );
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Dimension componentSizeDimension = getSize ();
        mouseFromX += animationDeltaX*motionSpeed - mouseFromX;
        mouseFromY += animationDeltaY*motionSpeed - mouseFromY;

    }

    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar ();
        if (keyChar == '+') this.motionSpeed ++;
        if (keyChar == '-') this.motionSpeed --;


    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
