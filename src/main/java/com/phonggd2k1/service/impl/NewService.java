package com.phonggd2k1.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.phonggd2k1.dao.INewDAO;
import com.phonggd2k1.model.NewModel;
import com.phonggd2k1.service.INewService;

public class NewService implements INewService {
	
	@Inject
	private INewDAO newDao;
	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		
		return newDao.findByCategoryID(categoryId);
	}
	@Override
	public NewModel save(NewModel newModel) {
		Long newID = newDao.save(newModel);
		return newDao.findOne(newID);
	}
	@Override
	public NewModel update(NewModel updateNew) {
		NewModel oldNew = newDao.findOne(updateNew.getId());
		
		return null;
	}

}
