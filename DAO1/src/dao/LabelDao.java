package dao;

import java.util.List;

import object.Label;

public interface LabelDao {
    int delete(Label label);
    int insert(Label label);
    List<Label> searchByCommentID(Integer commentid);
}