public class BridgeDemo {
    public static  void main(String[] args) {
        //TV
//        RemoteControl rm = new RemoteControl(new Tv());
//        rm.volumeUp();
//        rm.volumeDown();
        AdvanceRemoteControl am = new AdvanceRemoteControl(new Tv());
        am.mute();
        am.volumeUp(90);
        am.volumeDown(10);
        am.togglePower(true);
        //Radio
//        RemoteControl rm1 = new RemoteControl(new Radio());
//        rm1.volumeUp();
//        rm1.volumeDown();
        AdvanceRemoteControl am1 = new AdvanceRemoteControl(new Radio());
        am1.mute();
        am1.volumeUp(90);
        am1.volumeDown(10);
        am1.togglePower(false);
    }
}