package com.imooc.newrepository;

import com.imooc.factory.Repository;
import com.imooc.factory.RepositoryFactoryProvider;
import com.imooc.repository.CacheRepository;

public class CacheRepositoryFactory implements RepositoryFactoryProvider {

	@Override
	public Repository buildRepository() {
		// TODO Auto-generated method stub
		return new CacheRepository();
	}

}
