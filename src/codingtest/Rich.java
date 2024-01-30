package codingtest;

import java.math.BigInteger;
import java.util.Scanner;

public class Rich {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        BigInteger total = scanner.nextBigInteger();
        BigInteger result = scanner.nextBigInteger();
        scanner.close();
        System.out.println(total.divide(result));
        System.out.println(total.remainder(result));

    }
}
