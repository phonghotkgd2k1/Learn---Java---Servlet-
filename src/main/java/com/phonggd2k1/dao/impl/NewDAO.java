package com.phonggd2k1.dao.impl;

import java.util.List;

import com.phonggd2k1.dao.INewDAO;
import com.phonggd2k1.mapper.NewMapper;
import com.phonggd2k1.model.NewModel;

public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {

	@Override
	public List<NewModel> findByCategoryID(Long categoryID) {
		String sql = "SELECT * FROM news WHERE category id = ?";
		return query(sql, new NewMapper(), categoryID);

	}

	@Override
	public Long save(NewModel newModel) {
		String sql = "INSERT INTO news(title, content, categoryID) VALUES(?,?,?)";
		return insert(sql, newModel.getTitle(), newModel.getContent(), newModel.getCategoryID());
	}

}
