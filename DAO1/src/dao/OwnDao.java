package dao;

import object.Own;

public interface OwnDao {
    int insert(Own own);
    int delete(Own own);
    int update(Own own);
    Own search(Integer movieid)
}