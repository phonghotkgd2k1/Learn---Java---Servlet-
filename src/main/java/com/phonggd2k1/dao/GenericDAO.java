package com.phonggd2k1.dao;

import java.util.List;

import com.phonggd2k1.mapper.RowMapper;

public interface GenericDAO<T> {
	<T>List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
	void update (String sql, Object... parameters);
	Long insert (String sql, Object... parameters);
}
