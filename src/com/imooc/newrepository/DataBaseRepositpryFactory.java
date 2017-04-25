package com.imooc.newrepository;

import com.imooc.factory.Repository;
import com.imooc.factory.RepositoryFactoryProvider;
import com.imooc.repository.DataBaseRepository;

public class DataBaseRepositpryFactory implements RepositoryFactoryProvider {

	@Override
	public Repository buildRepository() {
		return new DataBaseRepository();
	}

}
