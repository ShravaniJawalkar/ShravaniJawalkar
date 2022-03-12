package com.example.AOP.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {
	public String retriveData() {
		return "Dao2... returning";
	}
}
