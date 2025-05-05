public class Tv implements Device{

    @Override
    public void powerOn() {
        System.out.println("TV is turned on");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is turned off");
    }

    @Override
    public void setVolume(int volume){
        System.out.println("TV volume set to " + volume);
    }
}