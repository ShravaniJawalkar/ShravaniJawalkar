package com.example.AOP.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AOP.Dao.Dao2;



@Service
public class Business2 {
	@Autowired
	private Dao2 dao2;

	public String retriveBussiness2() {
		return this.dao2.retriveData();
	}
}
