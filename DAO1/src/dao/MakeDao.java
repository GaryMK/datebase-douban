package dao;

import object.Make;

public interface MakeDao {
    int delete(Make make);
    int insert(Make make);
    int update(Make make);
    Make search(Integer movieID);
}