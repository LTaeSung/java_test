package ch6_test;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] arga){
        Account[] acc = new Account[100];
        Scanner scan = new Scanner(System.in);
        int idx =0;


        while(true) {
            System.out.println("---------------------------------------------");
            System.out.println("1. 계좌 생성 2. 계좌 목록 3. 예금 4. 출금 5. 종료");
            System.out.println("---------------------------------------------");
            System.out.println("선택 > ");
            String val = scan.nextLine();

            if("1".equals(val)){
                System.out.println("--------");
                System.out.println("계좌 생성");
                System.out.println("--------");
                System.out.print("계좌번호 :");
                String number = scan.nextLine();
                System.out.print("계좌주 :");
                String name = scan.nextLine();
                System.out.print("초기입금액 :");
                int balance = Integer.parseInt(scan.nextLine());

                acc[idx++] = new Account(number, name, balance);
            }
            else if("2".equals(val)){
                System.out.println("--------");
                System.out.println("계좌 목록");
                System.out.println("--------");
                for (int i=0; i<idx; i++){      //length는 null이 있을 수 있기 때문에 들어갈 수 없다.
                    System.out.println(acc[i].getNumber()+"\t"+acc[i].getName()+"\t"+acc[i].getBalance());
                }
            }
            else if("3".equals(val)){
                System.out.println("--------");
                System.out.println("  예 금  ");
                System.out.println("--------");
                System.out.print("예금액 :");

                System.out.println("계좌번호 : ");
                String number = scan.nextLine();
                System.out.println("예금액 : ");

                int balance = Integer.parseInt(scan.nextLine());

                for (int i=0; i<idx; i++){
                    if(number.equals(acc[i].getNumber())){
                        acc[i].setBalance(acc[i].getBalance()+balance);
                        break;
                    }
                }
            }
            else if("4".equals(val)){
                System.out.println("--------");
                System.out.println("  출 금  ");
                System.out.println("--------");
                System.out.print("출금액 :");
                int balance = Integer.parseInt(scan.nextLine());

                System.out.println("계좌번호 : ");
                String number = scan.nextLine();
                System.out.println("출금액 : ");

                for (int i=0; i<idx; i++){
                    if(number.equals(acc[i].getNumber())){
                        acc[i].setBalance(acc[i].getBalance()-balance);
                        break;
                    }
                }
            }
            else if("5".equals(val)){
                System.out.println("프로그램 종료");
                break;
            }
        }
    }


}
