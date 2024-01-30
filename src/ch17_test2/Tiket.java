package ch17_test2;

public class Tiket {
    public static void main(String[] args) {

        int[][] array = {{1, 7}, {2, 4}, {2, 3}, {3, 5}};
        int result = 10;
        int grade = 0;
        int size = array.length;

        for (int i = 0; i < array.length; i++) {

            if(array[i][size] <= array[i+1][size]){
                grade = array[i][size];

                if(grade == array[i][size]){
                    for (int j = 0; j < array[i].length; j++) {

                        System.out.println(array[i][j]);

                        if(array[i][j] <= array[i][j+1]){
                            result = array[i][j];
                            System.out.println(result);
                        }

                        }

                }
            }

            result -= array[i][size];

            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);

            }
        }
    }
}

