package dao;

import object.Personnel;

public interface PersonnelDao {
    int insert(Personnel personnel);
    int delete(Personnel personnel);
    int update(Personnel personnel);
    Personnel search(Integer personnelid);
}