package com.imooc.repository;

import com.imooc.factory.Repository;

public class NetRepository implements Repository {

	@Override
	public void save() {
		System.out.println("net");
	}

}
