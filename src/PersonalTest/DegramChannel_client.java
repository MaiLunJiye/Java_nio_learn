package PersonalTest;

import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameGrabber;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

/**
 * Created by root on 12/10/16.
 */
public class DegramChannel_client {
    public static final int BufferLimit = 921600;
    public static void main(String[] args) throws IOException, FrameGrabber.Exception {
        DatagramChannel dgc = DatagramChannel.open();
        OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(0);
        grabber.start();

        CanvasFrame canvas = new CanvasFrame("title");
        canvas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setAlwaysOnTop(true);



        while(true){
            Frame fr = grabber.grab();
            Frame ff = new Frame(fr.imageWidth,fr.imageHeight,fr.imageDepth,fr.imageChannels);

            ff.image = fr.image;
            canvas.showImage(ff);


        }

    }
}
