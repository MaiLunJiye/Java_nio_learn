package ReferenceCode;

import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.OpenCVFrameGrabber;

import javax.swing.*;

/**
 * Created by root on 12/10/16.
 */
public class JavacvCameraTest {
    public static void main(String[] args) throws Exception{
        OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(0);
        grabber.start();
        CanvasFrame canvas = new CanvasFrame("title");
        canvas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setAlwaysOnTop(true);

        while(true){
            if(!canvas.isDisplayable())
            {
                grabber.stop();
                System.exit(2);
            }
            canvas.showImage(grabber.grab());
            Thread.sleep(50);
        }
    }
}
