package d4exercises;

public class TVSeries extends Video{
    private int episodes;

    //The constructor is overloading
    public TVSeries(String title, int duration) {
        super(title, duration);
    }

    public TVSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getInfo(){
        return "The title is " + getTitle() +
                ".\nThe duration is " + getDuration() +
                ".\nThe number of episodes is " + getEpisodes() + ".\n";
    }
}
