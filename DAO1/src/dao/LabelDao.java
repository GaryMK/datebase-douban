package dao;

import object.Label;

public interface LabelDao {
    int delete(Label label);
    int insert(Label label);
    int update(Label label);
    Label search(Integer commentID);
}