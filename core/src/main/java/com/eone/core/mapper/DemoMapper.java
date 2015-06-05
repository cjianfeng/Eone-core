package com.eone.core.mapper;


import com.eone.core.model.DemoModel;

public interface DemoMapper {
	int deleteByPrimaryKey(Integer id);

    int insert(DemoModel record);

    int insertSelective(DemoModel record);

    DemoModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DemoModel record);

    int updateByPrimaryKey(DemoModel record);
}
