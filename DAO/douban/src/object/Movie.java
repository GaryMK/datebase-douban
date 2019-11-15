package object;

public class Movie {
    private Integer movieID;

    private String imdb;

    public Integer getMovieID() {
        return movieID;
    }

    public void setMovieID(Integer movieID) {
        this.movieID = movieID;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb == null ? null : imdb.trim();
    }
}