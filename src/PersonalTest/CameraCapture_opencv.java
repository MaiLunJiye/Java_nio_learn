package PersonalTest;

import java.awt.image.BufferedImage;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.javacv.OpenCVFrameGrabber;
import javax.imageio.ImageIO;

/**
 * Created by root on 12/11/16.
 */
public class CameraCapture_opencv {
    public static void main(String[] args) throws FrameGrabber.Exception {
        OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(0);
        grabber.start();
        grabber.getAudioStream();
    }
}
