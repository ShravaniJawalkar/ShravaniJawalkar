public class Paused implements State{

    @Override
    public void pressPlay(MediaPlayer mediaPlayer) {
        System.out.println("Resuming playback...");
        mediaPlayer.setState(new Playing());
    }

    @Override
    public void pressPause(MediaPlayer mediaPlayer) {
        System.out.println("Already paused.");
    }

    @Override
    public void pressStop(MediaPlayer mediaPlayer){
        System.out.println("Stopping playback...");
        mediaPlayer.setState(new Stopped());
    }
}