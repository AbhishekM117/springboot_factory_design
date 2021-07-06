package com.bse.factoryDesign.factory.impl;

import org.springframework.stereotype.Component;

import com.bse.factoryDesign.factory.Vehicle;

@Component
public class Bicycle implements Vehicle {

	@Override
	public String specification() {
		return "This is a Bicycle and the speed depends on the way you ride it";
	}

	public int totalCount() {
		return 500;
	}
}
