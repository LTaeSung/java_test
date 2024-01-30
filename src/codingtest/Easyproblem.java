package codingtest;


import java.util.Scanner;
public class Easyproblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int s=0;
        int t=0;

        for(int i=1; i<=end;i++){
            for(int j=1; j<=i;j++){
                s++;

                if(start<=s && s<=end){
                    t += i;
                }
            }
        }
        System.out.println(t);

//        int[] sum = new int[1000];
//        for(int i = 0; i<1000; i++){
//            for(int j=0; j<i; j++){
//                sum[s] += i;
//                s++;
//                System.out.print(i);
//            }
//        }
//        System.out.println();
//        for(int i=start-1; i<end; i++){
//              t += sum[i];
//        }
//        System.out.println(t);
    }
}
