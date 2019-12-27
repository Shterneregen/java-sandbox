package random;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerApp {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel ss = ServerSocketChannel.open();
        ss.bind(new InetSocketAddress("localhost", 9999));
        try (SocketChannel sc = ss.accept();) {
            System.out.println("Accepted conn");
            ByteBuffer bb = ByteBuffer.allocate(9);
            sc.read(bb);
            System.out.println("bb.getInt()" + bb.getInt());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
