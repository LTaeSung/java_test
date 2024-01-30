package codingtest;

import java.util.Scanner;

public class chece {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] result = {1, 1, 2, 2, 2, 8};
        int[] input = new int[6];
        input[0] = scanner.nextInt();
        input[1] = scanner.nextInt();
        input[2] = scanner.nextInt();
        input[3] = scanner.nextInt();
        input[4] = scanner.nextInt();
        input[5] = scanner.nextInt();
        for (int i = 0; i < 6; i++) {
            result[i] = result[i] - input[i];
            System.out.print(result[i] + " ");
        }
    }
}
