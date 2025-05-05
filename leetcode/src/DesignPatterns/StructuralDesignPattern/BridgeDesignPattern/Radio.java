public class Radio implements Device{
    @Override
    public void powerOn() {
        System.out.println("Radio is turned on");
    }

    @Override
    public void powerOff() {
        System.out.println("Radio is turned off");
    }

    @Override
    public void setVolume(int volume){
        System.out.println("Radio volume set to " + volume);
    }
}