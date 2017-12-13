import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class minimoServidor {

    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        Socket socket;
        String cadena = "Servidor Mínimo en funcionamiento.";
        int longCad;
        OutputStream outputStream;

        try {
            serverSocket = new ServerSocket(4321,300);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                socket = serverSocket.accept();
                outputStream = socket.getOutputStream();
                longCad = cadena.length();
                for (int i=0; i<longCad; i++) outputStream.write((int)cadena.charAt(i));
                socket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
