package codingtest;

import java.util.Scanner;

public class Donari {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "M":
                System.out.println("MatKor");
                break;
            case "W":
                System.out.println("WiCys");
                break;
            case "C":
                System.out.println("CyKor");
                break;
            case "A":
                System.out.println("AlKor");
                break;
            case "$":
                System.out.println("$clear");
                break;
        }
    }
}

