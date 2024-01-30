package ch9_7_2;

public class HomeExample {
    public static void main(String[] args ){
        Home home = new Home();

        home.use1();
        home.use2();

        home.use3(new RemoteControl() {
            public void turnOn () {
                System.out.println("난방을 켜라");
            }
            public void turnOff () {
                System.out.println("난방을 꺼라");

            }
        });
    }
}
