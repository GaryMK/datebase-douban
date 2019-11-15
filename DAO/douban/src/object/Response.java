package object;

import java.util.Date;

public class Response {
    private Integer responseID;

    private Integer userID;

    private Integer discussID;

    private Date responseTime;

    private String responseContent;

    public Integer getResponseID() {
        return responseID;
    }

    public void setResponseID(Integer responseID) {
        this.responseID = responseID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getDiscussID() {
        return discussID;
    }

    public void setDiscussID(Integer discussID) {
        this.discussID = discussID;
    }

    public Date getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Date responseTime) {
        this.responseTime = responseTime;
    }

    public String getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(String responseContent) {
        this.responseContent = responseContent == null ? null : responseContent.trim();
    }
}