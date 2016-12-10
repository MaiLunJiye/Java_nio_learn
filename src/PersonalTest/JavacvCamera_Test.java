package PersonalTest;

import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.OpenCVFrameGrabber;

import javax.swing.*;

/**
 * Created by root on 12/10/16.
 */
public class JavacvCamera_Test {
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

            Frame fr = grabber.grab();

            System.out.println("limit = " + fr.image[0].limit());
            System.out.println("Buffer[]long = " + fr.image.length);

            canvas.showImage(fr);
            Thread.sleep(50);
        }
    }
}
