package dao;

import java.util.List;

import object.Own;

public interface OwnDao {
    int insert(Own own);
    int delete(Own own);
    int update(Own theold,Own thenew);
    List<Own> searchByMovieID(Integer movieid);
}