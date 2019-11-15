package object;

public class Beanlist {
    private Integer beanListID;

    private String beanListName;

    private Integer userID;

    public Integer getBeanlistid() {
        return beanListID;
    }

    public void setBeanlistid(Integer beanlistid) {
        this.beanListID = beanlistid;
    }

    public String getBeanlistname() {
        return beanListName;
    }

    public void setBeanlistname(String beanlistname) {
        this.beanListName = beanlistname == null ? null : beanlistname.trim();
    }

    public Integer getUserid() {
        return userID;
    }

    public void setUserid(Integer userid) {
        this.userID = userid;
    }
}