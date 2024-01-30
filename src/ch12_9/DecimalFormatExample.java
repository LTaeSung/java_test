package ch12_9;

import java.text.DecimalFormat;

public class DecimalFormatExample {
    public static void main(String[]args){
        double num = 1234567.89;
        double pi = 3.14;

        DecimalFormat ap;

        DecimalFormat df = new DecimalFormat("#,###.###");
        System.out.println(df.format(pi));
        ap = new DecimalFormat("#,###");
        System.out.println(ap.format(num));

        ap = new DecimalFormat("#,###.0");
        System.out.println(ap.format(num));
    }
}
