package codingtest;

import java.util.Scanner;

public class Traiangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float result = 0;
        float H = scanner.nextInt();
        float W = scanner.nextInt();
        result =  (W * H) / 2;
        System.out.println(result);
    }
}
