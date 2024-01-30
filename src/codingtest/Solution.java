package codingtest;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = "";
        String output = "";
        int temp;

        input = sc.nextLine();

        for(int i=0; i<input.length(); i++){
            temp = input.charAt(i);
            if(temp >=65 && temp <=90){
                output += (char)(temp + 32);
            }else if(temp >=97 && temp <=122){
                output += (char)(temp - 32);
            }else {
                output += (temp);
            }
        }
        System.out.println(output);
//        String a = sc.next();
    }
}