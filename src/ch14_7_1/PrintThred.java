package ch14_7_1;

public class PrintThred extends Thread{
    private boolean stop;

    public void setStop(boolean stop){
        this.stop = stop;
    }

    public void run(){

        while (!stop) {
            System.out.println("실행중");

        }
        System.out.println("리소스 정리중");
        System.out.println("실행 종료");
    }
}
