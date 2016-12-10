package PersonalTest;

import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameGrabber;

import java.io.IOException;
import java.net.InetSocketAddress;
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

        while(true){
            Frame fr = grabber.grab();

            dgc.send((ByteBuffer) grabber.grab().image[0],new InetSocketAddress("127.0.0.1",8888));
        }

    }
}
