package codingtest;

import java.util.Scanner;

public class Macalong {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        scanner.nextLine();

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int z2 = scanner.nextInt();

        int[] b = {0, 0 ,0};

        int[] a = {x, y, z};
        int[] c = {x2, y2, z2};

        b[0] = c[0]-a[2];
        b[1] = c[1]/a[1];
        b[2] = c[2]-a[0];

        for(int i=0; i< b.length; i++){
            System.out.print(b[i]+" ");
        }

    }
}
