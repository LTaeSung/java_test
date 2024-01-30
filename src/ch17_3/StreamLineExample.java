package ch17_3;

import java.util.Arrays;
import java.util.List;

public class StreamLineExample {
    public static void main(String[] args){
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();

        System.out.println("평균점수 :" + avg);
    }
}
