package ReferenceCode;

import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import java.io.DataOutputStream;
import java.io.File;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.sql.SQLOutput;
import java.util.concurrent.Executor;

/**
 * Created by root on 12/11/16.
 */
public class CameraServer_webcom {
    public static void main(String[] args) throws Exception {
        Webcam webcam = Webcam.getDefault();

        webcam.open();

        ImageIO.write(webcam.getImage(),"png",new File("output.png"));

    }
}
