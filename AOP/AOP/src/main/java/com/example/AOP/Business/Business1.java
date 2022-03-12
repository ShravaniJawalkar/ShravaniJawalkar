package com.example.AOP.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AOP.Dao.Dao1;


@Service
public class Business1 {

	@Autowired
	private Dao1 dao1;

	public String retriveBusiness1() {
		return this.dao1.retriveData();
	}

}
