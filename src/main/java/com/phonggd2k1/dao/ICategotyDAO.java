package com.phonggd2k1.dao;

import java.util.List;

import com.phonggd2k1.model.CategoryModel;

public interface ICategotyDAO extends GenericDAO<CategoryModel> {
	List<CategoryModel> findAll();
} 
