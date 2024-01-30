package codingtest;

import java.util.Scanner;

public class UCPC {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        String[] semina = new String[input+1];

        for(int i=0; i<=input; i++){
            semina[i] = scanner.nextLine();
        }

        for(int j=0; j<=input; j++){
            if(semina[j].equals("Algorithm")){
                System.out.println("204");
            }else if(semina[j].equals("DataAnalysis")){
                System.out.println("207");
            }else if(semina[j].equals("ArtificialIntelligence")){
                System.out.println("302");
            }else if(semina[j].equals("TestStrategy")){
                System.out.println("105");
            }else if(semina[j].equals("Network")){
                System.out.println("303");
            }else if(semina[j].equals("CyberSecurity")){
                System.out.println("B101");
            }else if(semina[j].equals("Startup")){
                System.out.println("501");
            }
        }
    }
}
