package com.imooc.test;

import com.imooc.factory.RepositoryFactoryProvider;
import com.imooc.newrepository.CacheRepositoryFactory;
import com.imooc.newrepository.DataBaseRepositpryFactory;
import com.imooc.newrepository.FileRepositoryFactory;
import com.imooc.newrepository.NetRepositoryFactory;

public class TestFactory {

	public static void main(String[] args) {
		
		RepositoryFactoryProvider provider=new DataBaseRepositpryFactory();
		provider.buildRepository().save();
		provider=new CacheRepositoryFactory();
		provider.buildRepository().save();
		provider=new FileRepositoryFactory();
		provider.buildRepository().save();
		provider=new NetRepositoryFactory();
		provider.buildRepository().save();
	}

}
