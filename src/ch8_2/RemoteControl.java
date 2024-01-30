package ch8_2;

public interface RemoteControl {
    int MAX_VOLUME =10;
    int MIN_VOLUME =0;
    public void turnOn();
    public void turnOff();
    void setVolume(int volume);
}
