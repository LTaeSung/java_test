package ch16_3;

import ch16_2_1.Workable;

public class Person {
    public void action1(Workable workable){
        workable.work("홍길동", "프로그래밍");
    }

    public void action2(Speakable speakable){
        speakable.speak("안녕하세요");
    }
}
