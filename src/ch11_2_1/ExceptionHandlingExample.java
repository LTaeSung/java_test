package ch11_2_1;

public class ExceptionHandlingExample {
    public static void main(String[] args){
        System.out.println("1");
        try {
            System.out.println("2");
            int[] arr = {1,2,};
            System.out.println(arr[2]);
            System.out.println(3/0);
        }catch (ArithmeticException e){
            System.out.println("3");
            System.out.println("예외발생");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("예외발생");
        }

        System.out.println("4");
    }
}
