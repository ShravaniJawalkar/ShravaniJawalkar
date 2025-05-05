public class MediaPlayer {
    private State state;

    public MediaPlayer() {
        this.state = new Stopped();
    }

    public void setState(State state){
        this.state = state;
    }

    public void play(){
        this.state.pressPlay(this);
    }

    public void pause(){
        this.state.pressPause(this);
    }

    public void stop(){
        this.state.pressStop(this);
    }
}