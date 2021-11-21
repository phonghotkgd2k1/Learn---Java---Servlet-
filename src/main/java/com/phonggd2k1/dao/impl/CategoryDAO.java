package com.phonggd2k1.dao.impl;

import java.util.List;

import com.phonggd2k1.dao.ICategotyDAO;
import com.phonggd2k1.mapper.CategoryMapper;
import com.phonggd2k1.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategotyDAO {

	@Override
	public List<CategoryModel> findAll() {
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());

	}
}
