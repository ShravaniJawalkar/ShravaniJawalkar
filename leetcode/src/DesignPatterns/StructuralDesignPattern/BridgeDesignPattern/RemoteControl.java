public abstract class RemoteControl {
    protected Device device;
    public RemoteControl(Device device) {
        this.device = device;
    }
    public abstract void togglePower(boolean flag);

    public abstract void volumeUp(int val);

    public abstract void volumeDown(int val);

}