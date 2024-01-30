package codingtest;

import java.util.Scanner;

public class lamean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int W =0;
        int A =0;
        int X =0;
        int B =0;
        int[] result = new int[100];

        int n = scanner.nextInt();
        for(int i=0; i<n; i++){
            A = scanner.nextInt();
            B = scanner.nextInt();
            X = scanner.nextInt();
            W = A*(X-1)+B;
            result[i] = W;
        }
        for(int i=0; i<n;i++){
            System.out.println(result[i]);
        }
    }
}
