package object;

public class MovieWithBLOBs extends Movie {
    private String movieIntroduce;

    private String officialWebsite;

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