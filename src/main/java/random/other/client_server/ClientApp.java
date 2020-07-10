package random.other.client_server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class ClientApp {
    public static void main(String[] args) throws IOException {
        // write your code here
        SocketChannel socket = SocketChannel.open(new InetSocketAddress("localhost", 9999));
        ByteBuffer bb = ByteBuffer.allocate(9);
        bb.putInt(2);
//        bb.putInt(9).rewind();
        System.out.println("bb.getInt(): " + bb.getInt() + "");
        System.out.println("bb: " + bb);
        System.out.println(socket.write(bb));
    }
}
