package com.imooc.repository;

import com.imooc.factory.Repository;

public class FileRepository implements Repository {

	@Override
	public void save() {
		System.out.println("file");
	}

}
