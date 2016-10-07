package com.superxu.service;

import com.superxu.dao.InjectionDao;

public class InjectionServicImpl implements InjectionService {

	private InjectionDao injectionDao;

	// 设值注入
	public void setInjectionDao(InjectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}

	// 构造器注入
	public InjectionServicImpl(InjectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}

	@Override
	public void save(String arg) {
		// TODO Auto-generated method stub
		injectionDao.save(arg);
	}

}
