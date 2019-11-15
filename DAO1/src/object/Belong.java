package object;

public class Belong {
    private Integer movieID;

    private String typeName;

    public Integer getMovieID() {
        return movieID;
    }

    public void setMovieid(Integer movieID) {
        this.movieID = movieID;
    }

    public String getTypename() {
        return typeName;
    }

    public void setTypename(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
}