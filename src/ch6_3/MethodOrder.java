package ch6_3;

public class MethodOrder {
    void one(){
        two();
        System.out.println("원");
    }
    void two() {
        three();
        System.out.println("투");
    }
    void three() {

        System.out.println("쓰리");
    }

    public static void main(String[] args){
        MethodOrder mo = new MethodOrder();
        mo.one();       //실행순서는 three가 나중에 실행이 되지만 one이 끝날때 까지 실행이 지속되기 때문에 가장 나중에 one이 출력된다
        System.out.println(mo.divide(
                                mo.pow(
                                        mo.plus(4,2),3
                                )
                            )
                        );

    }

    int plus(int x, int y){
        return x+y;
    }
    int pow(int x, int y){return x*y;}
    int divide(int x){
        return x/ 2;
    }
}
