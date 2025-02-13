package d4exercises;

public class Movie extends Video {
    private double rating;

    //The constructor is overloading
    public Movie(String title, int duration) {
        super(title, duration);
    }

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getInfo(){
        return "The title is " + getTitle() +
                ".\nThe duration is " + getDuration() +
                ".\nThe rating is " + getRating() + ".\n";
    }
}

