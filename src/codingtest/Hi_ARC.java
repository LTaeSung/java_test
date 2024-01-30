package codingtest;

import java.util.Scanner;

public class Hi_ARC {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int I = scanner.nextInt();
        int A = scanner.nextInt();
        int R = scanner.nextInt();
        int C = scanner.nextInt();

        System.out.println(H*I - A*R*C);

    }
}
