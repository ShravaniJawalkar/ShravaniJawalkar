public class Playing implements State {
    @Override
    public void pressPlay(MediaPlayer mediaPlayer) {
        System.out.println("Already playing.");
    }

    @Override
    public void pressPause(MediaPlayer mediaPlayer) {
        System.out.println("Pausing the media.");
        mediaPlayer.setState(new Paused());
    }

    @Override
    public void pressStop(MediaPlayer mediaPlayer){
        System.out.println("Stopping the media.");
        mediaPlayer.setState(new Stopped());
    }
}