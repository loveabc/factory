package com.imooc.newrepository;

import com.imooc.factory.Repository;
import com.imooc.factory.RepositoryFactoryProvider;
import com.imooc.repository.NetRepository;

public class NetRepositoryFactory implements RepositoryFactoryProvider {

	@Override
	public Repository buildRepository() {
		return new NetRepository();
	}

}
