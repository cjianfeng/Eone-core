package com.eone.core.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eone.core.mapper.DemoMapper;
import com.eone.core.model.DemoModel;
import com.eone.core.services.DemoService;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

	@Resource
    private DemoMapper demoMapper;  
	
	public DemoModel getDemoById(int demoId) {
		return demoMapper.selectByPrimaryKey(demoId);
	}

}
