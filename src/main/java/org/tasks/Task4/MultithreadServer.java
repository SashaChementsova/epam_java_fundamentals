package org.tasks.Task4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultithreadServer {

    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = null;
        try  {
            serverSocket=new ServerSocket(2525);
            int count=0;
            System.out.println("Server is listening on port " + 2525);

            while (true) {
                count++;
                Socket socket = serverSocket.accept();
                System.out.println("New client connected "+ count);
                Server s=new Server(socket);
                new Thread(s).start();
            }

        }
        catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.getMessage();
        }
        finally {
            try {
                serverSocket.close();
            }
            catch (IOException e) {
                e.getMessage();
            }
        }
    }
}