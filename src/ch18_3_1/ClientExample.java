package ch18_3_1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {
    public static void main(String[] args){
        try {
            Socket socket = new Socket("localhost", 50001);

            System.out.println("클라이언트 ㅎㅇ");

            socket.close();
            System.out.println("클라이언트 ㅂㅇ");
        }catch (UnknownHostException e){

        }catch (IOException e){

        }
    }
}
