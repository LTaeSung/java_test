package ch9_7_2;

public class Home {
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("티비를 켜라");
        }

        @Override
        public void turnOff() {
            System.out.println("티비를 꺼라");
        }
    };

        public void use1(){
            rc.turnOn();
            rc.turnOff();
        }


        public void use2(){
            RemoteControl rc = new RemoteControl() {
                @Override
                public void turnOn() {
                    System.out.println("에어컨을 켜라");
                }

                @Override
                public void turnOff() {
                    System.out.println("에어컨을 꺼라");

                }
            };

            rc.turnOn();
            rc.turnOff();
        }

        public  void use3(RemoteControl rc){
            rc.turnOn();
            rc.turnOff();
        }
    }

