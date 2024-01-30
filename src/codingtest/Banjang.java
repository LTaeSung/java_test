package codingtest;

import java.util.Scanner;

public class Banjang {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = 5;
        int[][] student = new int[N][M];
        int[] samesave = new int[M];
        int sameCount = 0;

        for(int i=0; i<N; i++){
            int ClassName = scanner.nextInt();
            for(int j =0; j<student[i].length; j++){
                student[i][j] = ClassName;
            }
        }
        for(int i=0; i<M; i++){
            for(int temp =1; temp<6; temp ++){
                for(int j=0; j<N; j++){
                    if(student[j][i] == temp){
                        sameCount++;
                    }
                }
            }
            samesave[i] = sameCount;
            sameCount = 0;
        }

        for(int i=0; i<N ;i++){
            System.out.print(samesave[i]+" ");
        }

    }
}
