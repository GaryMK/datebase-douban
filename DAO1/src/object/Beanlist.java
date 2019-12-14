package object;

public class BeanList {
    private Integer beanListID;

    private String beanListName;

    private Integer userID;

    public Integer getBeanListID() {
        return beanListID;
    }

    public void setBeanListID(Integer beanListID) {
        this.beanListID = beanListID;
    }

    public String getBeanListName() {
        return beanListName;
    }

    public void setBeanListName(String beanListName) {
        this.beanListName = beanListName == null ? null : beanListName.trim();
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }
}