package dao;

import object.Movie;

public interface MovieDao {
	int insert(Movie movie);
	int delete(Movie movie);
	int update(Movie movie);
	Movie search(Integer movieid);
}