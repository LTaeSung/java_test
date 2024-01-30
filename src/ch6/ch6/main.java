package ch6.ch6;

public class main {
    public static void main(String[] args){
        // Sportscar 클래스로 객체를 생성
        // 변수를 선언한다

        SportsCar sc;
        // 초기화
        sc = new SportsCar();

        //선언과 초기화를 동시에
        SportsCar sc2 = new SportsCar();
        System.out.println(sc == sc2);

        SportsCar sc3 = sc2;
        System.out.println(sc3 == sc2);


    }
}
