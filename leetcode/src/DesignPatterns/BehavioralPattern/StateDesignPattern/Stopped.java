public class Stopped implements State {

    @Override
    public void pressPlay(MediaPlayer mediaPlayer) {
        System.out.println("Playing the media...");
        mediaPlayer.setState(new Playing());
    }

    @Override
    public void pressPause(MediaPlayer mediaPlayer) {
        System.out.println("Can't paused media is not playing.");
    }

    @Override
    public void pressStop(MediaPlayer mediaPlayer) {
        System.out.println("Media is already stopped.");
    }
}