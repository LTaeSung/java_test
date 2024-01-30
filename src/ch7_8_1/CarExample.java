package ch7_8_1;

public class CarExample {
    public static void main(String[]args){
        Car myCar = new Car();

        myCar.trie = new Tire();
        myCar.run();

        myCar.trie = new HankookTire();
        myCar.run();

        myCar.trie = new KumhoTire();
        myCar.run();
    }
}
