package dao;

import java.util.List;

import object.BeanList;

public interface BeanListDao {
    int delete(Integer beanlistid);
    int insert(BeanList beanlist);
    List<BeanList> searchByUserID(Integer userid);
    int update(BeanList beanlist);
}