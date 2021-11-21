package com.phonggd2k1.dao;

import java.util.List;

import com.phonggd2k1.model.NewModel;

public interface INewDAO extends GenericDAO<NewModel> {
	List<NewModel> findByCategoryID(Long categoryID);
	Long save(NewModel newModel);
}
