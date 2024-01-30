package codingtest;

import java.util.Scanner;

public class Cardgame {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int b = 0;

        for(int i=0; i<5; i++){
            int a = scanner.nextInt();
            b += a;
        }

        System.out.println(b);
    }
}
