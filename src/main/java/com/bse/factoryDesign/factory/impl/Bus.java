package com.bse.factoryDesign.factory.impl;

import org.springframework.stereotype.Component;

import com.bse.factoryDesign.factory.Vehicle;

@Component
public class Bus implements Vehicle {

	@Override
	public String specification() {
		return "This is a Bus with maximum speed of 150km/hr";
	}

	public int totalCount() {
		return 2000;
	}
}
