package ch6_3;

public class Init {

    Init(){
        System.out.println("생성자");


    }

    static {
        System.out.println("static 출력");
    }

    {
        System.out.println("instance 출력");
    }

    public static void main(String[] args){
        System.out.println("main 에서 실행");
        System.out.println("Init 객체 생성");
        Init i = new Init();
        System.out.println("Init2 객체 생성");
        Init i2 = new Init();
    }
}
