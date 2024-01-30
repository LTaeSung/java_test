package ch5;

import java.util.Scanner;

public class ch5_TestProject {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        System.out.println(array.length);
        System.out.println(array[2].length);

        int[] array2 = {1,5,3,8,2};
        int max = 0;
        for(int i=0; i< array2.length; i++){
            if(max < array2[i]){
                max = array2[i];
            }
        }

        System.out.println();
        System.out.println(max);
        System.out.println();

        int array3[][] = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        double arrayAvg =0;
        int total =0;
        int count =0;

        for(int i=0 ; i < array3.length; i++){
            for(int j=0 ; j< array3[i].length ;j++){
                count ++;
                total += array3[i][j];
            }
        }
        System.out.println(total);
        System.out.println(total/count);
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        int len = 0;
        int[] student = null ; //  학생 수를 측정하는 값을 앞단에 선언하고 후에 초깅화를 한다.




        while ( run) {
            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println(" 1.학생점수 2.점수입력 3.점수리스트 4.분석 5.종료 ");
            System.out.println("-------------------------------------------");
            System.out.print("선택 >");



            String strNum = scanner.nextLine();
            //


            if("1".equals(strNum)){      // 입력값이 null 인경우  strNum.equals("1") 는 오류가 날 수 있다.
                System.out.print("학생수 >");
                int size = Integer.parseInt(scanner.nextLine());
                student = new int[size];
                //  len = peaple; -----> 변수를 이곳에서 설정하게 되면 동작하지 않는다
                System.out.println(size+"명이 존재합니다");
            }
            else if("2".equals(strNum)){
                for(int i=0; i< student.length ; i++){
                    System.out.print("score["+i+"] >");
                    int scores = Integer.parseInt(scanner.nextLine());  // 입력받은 문자를 숫자로 변환
                    student[i] = scores;
                }
            }
            else if("3".equals(strNum)){
                for(int i=0; i< student.length ; i++){
                    System.out.println("score["+i+"] >"+ student[i]+"점입니다." );
                }
            }
            else if("4".equals(strNum)){
                int Max = 0;
                int Total = 0;
                for(int i=0; i< student.length; i++){
                    Total += student[i];
                    if(Max < student[i]){
                        Max = student[i];
                    }

                }
                System.out.println("최고 점수는 "+Max);
                System.out.println("평균 점수는 "+Total/student.length);
            }
            else if("5".equals(strNum)){
                run = false ;
            }
        } System.out.println("종료");
    }
}

