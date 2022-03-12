package com.example.AOP.Dao;

import org.springframework.stereotype.Repository;

import com.example.AOP.AspectProg.TrackTime;

@Repository
public class Dao1 {
	
	@TrackTime
	public String retriveData() {
		return "Dao1... returning";
	}
}
