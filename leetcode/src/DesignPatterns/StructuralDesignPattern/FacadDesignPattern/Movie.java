public class Movie {
    private DVDPlayer dvdPlayer;
    private Lights lights;
    private Projector projector;

    public Movie(DVDPlayer dvdPlayer, Lights lights, Projector projector) {
        this.dvdPlayer = dvdPlayer;
        this.lights = lights;
        this.projector = projector;
    }

    public void watchMovie(String name){
        lights.dim();
        projector.projectorOn();
        projector.setInput("DVD palyer");
        dvdPlayer.on();
        dvdPlayer.play(name);
    }

    public void endMovie(){
        dvdPlayer.off();
        projector.projectorOff();
        lights.on();
    }
}