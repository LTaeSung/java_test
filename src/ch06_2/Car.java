package ch06_2;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;

    }

    boolean isleftGas() {
        if (gas == 0) {
            System.out.println("가스가 없음");
            return false;
        }
        System.out.println("가스가 있음");
        return true;
    }

    void run(){
        while (true){
            if(gas>0){
                System.out.println("달린다 (gas 용량 : " + gas+")");
                gas -=1;
            }else {
                System.out.println("멈춘다 (gas    용량 : "+gas+")");
                return;
            }
        }
    }
}

