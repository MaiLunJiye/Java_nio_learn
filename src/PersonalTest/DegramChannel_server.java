package PersonalTest;

import org.bytedeco.javacv.*;
import org.bytedeco.javacv.Frame;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

/**
 * Created by root on 12/10/16.
 */


public class DegramChannel_server {
    public static final int BufferLimit = 921600;
    public static void main(String[] args) throws IOException {
        DatagramChannel dgc = DatagramChannel.open();

        dgc.socket().bind(new InetSocketAddress(8888));
        ByteBuffer buf = ByteBuffer.allocate(BufferLimit);

        CanvasFrame canvas = new CanvasFrame("title");
        canvas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setAlwaysOnTop(true);

        Frame fr=new Frame();


        while(true) {
            buf.clear();
            dgc.receive(buf);
            fr.image[0] = buf;
            canvas.showImage(fr);
        }



    }
}
