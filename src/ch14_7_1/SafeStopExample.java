package ch14_7_1;

public class SafeStopExample {
    public static void main(String[] args){
        PrintThred printThred = new PrintThred();
        printThred.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){

        }
        printThred.setStop(true);
    }
}
