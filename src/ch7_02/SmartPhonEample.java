package ch7_02;

public class SmartPhonEample {
    public static void main(String[] args){
        Smartphon myphon = new Smartphon("갤럭시", "은색");

        System.out.println("모델: "+myphon.model );
        System.out.println("색상: "+myphon.color );

        System.out.println("와이파이 상태" +myphon.wifi);

        myphon.bell();
        myphon.sendVoice("여보세요");
        myphon.receiveVoice("안녕하세요 홍길동임");
        myphon.sendVoice("ㅎㅎ ㅅㄱ");
        myphon.hangUp();

        myphon.setWifi(true);

        myphon.internet();
    }
}
