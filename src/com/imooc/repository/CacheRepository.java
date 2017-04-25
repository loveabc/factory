package com.imooc.repository;

import com.imooc.factory.Repository;

public class CacheRepository implements Repository {

	@Override
	public void save() {
		System.out.println("cache");
	}

}
