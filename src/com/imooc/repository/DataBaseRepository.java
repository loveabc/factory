package com.imooc.repository;

import com.imooc.factory.Repository;

public class DataBaseRepository implements Repository {

	public void save() {
		System.out.println("database");
	}
}
