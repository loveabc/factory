package com.imooc.newrepository;

import com.imooc.factory.Repository;
import com.imooc.factory.RepositoryFactoryProvider;
import com.imooc.repository.FileRepository;

public class FileRepositoryFactory implements RepositoryFactoryProvider {

	@Override
	public Repository buildRepository() {
		return new FileRepository();
	}

}
