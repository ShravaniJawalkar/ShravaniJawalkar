public class AdvanceRemoteControl extends RemoteControl {
    public AdvanceRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Mute");
        this.device.setVolume(0);
    }

    @Override
    public void volumeUp(int val) {
        System.out.println("Increase volume");
        this.device.setVolume(val);
    }

    @Override
    public void volumeDown(int val) {
        System.out.println("Decrease volume");
        this.device.setVolume(val);
    }

    @Override
    public void togglePower(boolean flag) {
        if(flag) this.device.powerOn();
        else this.device.powerOff();
    }
}