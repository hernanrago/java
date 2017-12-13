import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class minimoCliente {

    public static void main(String[] args) throws IOException {

        int c;
        Socket socket=null;
        InputStream inputStream;

        try {
            socket = new Socket("m1r4r1",4321);
        } catch (IOException e) {
            e.printStackTrace();
        }

        inputStream = socket.getInputStream();

        while ((c = inputStream.read())!=-1) System.out.print((char)c);

        socket.close();
    }
}
