package object;

public class Movie {
    private Integer movieID;

    private String imdb;
    
    private String movieIntroduce;

    private String officialWebsite;

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
    
    public String getMovieIntroduce() {
        return movieIntroduce;
    }

    public void setMovieIntroduce(String movieIntroduce) {
        this.movieIntroduce = movieIntroduce == null ? null : movieIntroduce.trim();
    }

    public String getOfficialWebsite() {
        return officialWebsite;
    }

    public void setOfficialWebsite(String officialWebsite) {
        this.officialWebsite = officialWebsite == null ? null : officialWebsite.trim();
    }
}