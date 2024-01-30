package ch7_8_2;

public class DriverExample {
    public static void main(String[] args){
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}
