package ch18_3_1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args){
        System.out.println("----");
        System.out.println(" out_[q]");
        System.out.println("----");

        startServer();

        Scanner scanner = new Scanner(System.in);
        while (true){
            String key = scanner.nextLine();
            if(key.toLowerCase().equals("q")){
                break;
            }
        }
        scanner.close();
        stopServer();
    }

    private static void startServer(){
        Thread thread = new Thread(){
            @Override
            public void run(){
                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("시작");

                    while (true){
                        System.out.println("\n 기다림");
                        Socket socket = serverSocket.accept();

                        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("서버"+ isa.getHostName() + "요청 수락");

                        socket.close();
                        System.out.println("서버"+ isa.getHostName() + "연결 끊음");
                    }
                }catch (IOException e){
                    System.out.println("서버" + e.getMessage());
                }
            }
        };
        thread.start();
    }

    public static void stopServer(){
        try {
            serverSocket.close();
            System.out.println("종료");
        }catch (IOException e1){}
    }
}
