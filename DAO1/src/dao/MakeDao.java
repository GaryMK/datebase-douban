package dao;

import java.util.List;

import object.Make;

public interface MakeDao {
    int delete(Make make);
    int insert(Make make);
    int update(Make theold,Make thenew);
    List<Make> searchByMovieID(Integer movieID);
}