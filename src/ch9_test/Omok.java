package ch9_test;
/*
        1. 좌표 출력하기
            좌측에 0123... 하단에 abcd....
        2. 바둑판에 돌 놓기
            "j9" 를 입력하면 해당 좌표에 O 돌을 표기
        3. 검은돌 흰돌 번갈아 가며 놓기
            사용자 a, b가 번갈아 가며 OX의 돌을 놓도록
        4. 오목이 되면 게임을 종료
 */
public class Omok {
    public static void main(String[] args) {
        Player user = new Player("사용자", "O");
        Player computer = new Player("컴퓨터", "X");
        Board board = new Board(21);
        play(board, user, computer);
    }
    private static void play(Board board, Player user, Player computer) {
        board.print();
    }
}