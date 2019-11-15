package object;

import java.util.Date;

public class Discuss {
    private Integer discussID;

    private Integer userID;

    private Integer movieID;

    private Date beginTime;

    private String discussTitle;

    public Integer getDiscussID() {
        return discussID;
    }

    public void setDiscussID(Integer discussID) {
        this.discussID = discussID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getMovieID() {
        return movieID;
    }

    public void setMovieID(Integer movieID) {
        this.movieID = movieID;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public String getDiscussTitle() {
        return discussTitle;
    }

    public void setDiscussTitle(String discussTitle) {
        this.discussTitle = discussTitle == null ? null : discussTitle.trim();
    }
}