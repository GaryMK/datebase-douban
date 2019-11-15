package dao;

import object.Question;

public interface QuestionDao {
    int insert(Question question);
    int delete(Question question);
    int update(Question question);
    Question search(Integer questionid);    
}