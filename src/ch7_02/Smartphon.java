package ch7_02;

public class Smartphon extends Phon {
    public boolean wifi;

    public Smartphon(String model, String color){
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("와이파이상태를 변경함");
    }
    public void internet(){
        System.out.println("인터넷 연결");
    }


}
