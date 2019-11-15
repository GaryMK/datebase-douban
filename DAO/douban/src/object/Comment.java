package object;

import java.util.Date;

public class Comment {
    private Integer commentID;

    private Integer userID;

    private Integer movieID;

    private Integer starLevel;

    private String device;

    private Date commentTime;

    private String viewStatus;

    private Integer usefulNumber;

    private String commentContent;

    public Integer getCommentID() {
        return commentID;
    }

    public void setCommentID(Integer commentID) {
        this.commentID = commentID;
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

    public Integer getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(Integer starLevel) {
        this.starLevel = starLevel;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getViewStatus() {
        return viewStatus;
    }

    public void setViewStatus(String viewStatus) {
        this.viewStatus = viewStatus == null ? null : viewStatus.trim();
    }

    public Integer getUsefulNumber() {
        return usefulNumber;
    }

    public void setUsefulNumber(Integer usefulNumber) {
        this.usefulNumber = usefulNumber;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}