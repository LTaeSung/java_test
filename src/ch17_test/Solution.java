package ch17_test;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        int result =0;
        int redger =0;

        System.out.println("----------------------------");
        System.out.println("첫 번째 요청");
        System.out.println(" + 10000");

        List<Integer> account = new ArrayList<>();

            account.add(10000);
            System.out.print("잔고액(원) :");
            System.out.println(account);

        System.out.println("----------------------------");
        System.out.println("두 번째 요청");
        System.out.println(" - 13000");

            account.add(-13000);

        for(int i =0; i<account.size(); i++){
            result += account.get(i);
        }

        System.out.print("잔고액(원) :");
        System.out.println(result);

        System.out.println("----------------------------");
        System.out.println("세 번째 요청");
        System.out.println(" - 4000");

        account.add(-4000);

        for(int i =0; i<account.size(); i++){
            redger += account.get(i);

            if(redger <= -5000){
                System.out.println( account.get(i) +"요청거절");
                redger -= account.get(i);
            }else {
                result = redger;
            }
        }
        System.out.print("잔고액(원) :");
        System.out.println(result);

        System.out.println("----------------------------");
        System.out.println("네 번째 요청");
        System.out.println(" - 2000");

        account.add(-2000);

        redger =0;

        for(int i =0; i<account.size(); i++){
            redger += account.get(i);

            if(redger <= -5000){
                System.out.println( account.get(i) +"요청거절");
                redger -= account.get(i);
            }else {
                result = redger;
            }
        }

        System.out.print("잔고액(원) :");
        System.out.println(result);

        System.out.println("----------------------------");
        System.out.println("다섯 번째 요청");
        System.out.println(" + 6500");

            account.add(6500);
            redger =0;

        for(int i =0; i<account.size(); i++){
            redger += account.get(i);

            if(redger < -5000){
                System.out.println( account.get(i) +"요청거절");
                redger -= account.get(i);
            }else {
                result = redger;
            }
        }

        System.out.print("잔고액(원) :");
        System.out.println(result);

        System.out.println("----------------------------");
        System.out.println("여섯 번째 요청");
        System.out.println(" - 20000");

        account.add(-20000);
        redger =0;

        for(int i =0; i<account.size(); i++){
            redger += account.get(i);

            if(redger < -5000){
                System.out.println( account.get(i) +"요청거절");
                redger -= account.get(i);
            }else {
                result = redger;
            }
        }

        System.out.print("잔고액(원) :");
        System.out.println(result);





    }


        public int problem(int m, int[] ledger) {
            int account = 0;

            return account;
        }



}
