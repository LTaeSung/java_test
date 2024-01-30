package ch11_5;

public class ThrowExample {
    public static void main(String[]args){
        try {
            findClass();
        }catch (ClassNotFoundException e){
            System.out.println("예외처리 :"+e.toString());
        }
    }

    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.long.String2");
    }
}
