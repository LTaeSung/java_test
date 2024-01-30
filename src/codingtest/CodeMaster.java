package codingtest;

import java.util.Scanner;

public class CodeMaster {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();

        switch (A) {
            case "SONGDO":
                System.out.println("HIGHSCHOOL");
                break;
            case "CODE":
                System.out.println("MASTER");
                break;
            case "2023":
                System.out.println("0611");
                break;
            case "ALGORITHM":
                System.out.println("CONTEST");
                break;
        }
    }
}
