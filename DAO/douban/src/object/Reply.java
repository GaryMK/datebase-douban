package object;

public class Reply {
    private Integer replyID;

    private Integer userID;

    private Integer questionID;

    private String replyContent;

    public Integer getReplyID() {
        return replyID;
    }

    public void setReplyID(Integer replyID) {
        this.replyID = replyID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Integer questionID) {
        this.questionID = questionID;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }
}