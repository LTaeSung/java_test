package ch06_2;

public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();

    myCar.setGas(5);
    if(myCar.isleftGas()){
        System.out.println("출발합니다");
        myCar.run();
    }

    System.out.println("가스를 주입하세요");

    }
}
