package ch9_test;

public class Board {
    int size;
    int rowNum = 0 ;
    char c = 65;

    String[][] map;
    Board(int size) {
        this.size = size;
        map = new String[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if(row <10){
                    map[row][1] = " .";
                }

                map[row][col] = ".";

                if(col == 0){
                    map[row][col] = String.valueOf(rowNum);
                    rowNum++;
                }
                if(row == size-1){
                    for(int i=0; i<=col; i++){
                        map[row][col] = String.valueOf(c++);
                    }
                }
            }
        }
    }

    public void print() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(" " + map[row][col]);
            }
            System.out.println();
        }
    }
}