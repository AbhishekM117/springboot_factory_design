package com.bse.factoryDesign.factory.impl;

import org.springframework.stereotype.Component;

import com.bse.factoryDesign.factory.Vehicle;

@Component
public class Car implements Vehicle {

	@Override
	public String specification() {
		return "This is a Car with maximum speed of 200km/hr";
	}

	public int totalCount() {
		return 9000;
	}
}
