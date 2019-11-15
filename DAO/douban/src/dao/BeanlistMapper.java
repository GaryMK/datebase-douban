package dao;

import object.BeanList;

public interface BeanListDao {
    int delete(Integer beanlistid);
    int insert(BeanList beanlist);
    BeanList search(Integer beanlistid);
    int update(BeanList beanlist);
}