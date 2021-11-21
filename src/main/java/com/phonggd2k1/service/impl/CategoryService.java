package com.phonggd2k1.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.phonggd2k1.dao.ICategotyDAO;
import com.phonggd2k1.model.CategoryModel;
import com.phonggd2k1.service.ICategoryService;

public class CategoryService implements ICategoryService{
	
//	private ICategotyDAO categoryDao;
//	public CategoryService() {
//		categoryDao = new CategoryDAO();
//	}
	@Inject
	private ICategotyDAO categoryDao;
	@Override
	public List<CategoryModel> findAll() {
		
		return categoryDao.findAll();
	}
	
}
