package com.phonggd2k1.service;

import java.util.List;

import com.phonggd2k1.model.NewModel;

public interface INewService {
	List<NewModel> findByCategoryId(Long categoryId);
	NewModel save(NewModel newModel);
}
