package ch7_02;

public class Phon  {
    public String model;
    public String color;

    public void bell(){
        System.out.println("벨이 울린다");

    }
    public void sendVoice(String message){
        System.out.println("자기 :" + message);
    }
    public void receiveVoice(String message){
        System.out.println("상대방 :"+ message);
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void hangUp(){
        System.out.println("전화를 끊습니다");
    }

}
