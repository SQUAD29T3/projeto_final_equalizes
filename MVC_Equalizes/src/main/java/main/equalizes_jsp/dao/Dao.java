package main.equalizes_jsp.dao;

import java.sql.SQLException;
import java.util.Optional;

public interface Dao<T, ID> {
	Optional<T> find(ID id) throws SQLException;

	boolean save(T o) throws SQLException;

	boolean update(T o) throws SQLException;

	boolean delete(T o) throws SQLException;
}
