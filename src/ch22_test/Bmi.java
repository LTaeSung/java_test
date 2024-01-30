package ch22_test;

public class Bmi {
    public static void main(String[] args){
        double heigth = 1.8;
        double weight = 80;

        double bmi = Bmiresult(heigth, weight);
        String grade = BmiGrade(bmi);

        System.out.println(Bmiresult(heigth, weight));
        System.out.println(grade);
    }
    public static double Bmiresult(double heigth, double weight){
        return weight / (heigth * heigth);
    }
    public static String BmiGrade(double bmi){
        if(bmi > 25){
            return "비만";
        }
        if(bmi > 18.5){
            return "표준";
        }
        else {
            return "저체중";
        }
    }
}

