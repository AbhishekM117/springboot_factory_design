package com.bse.factoryDesign.factory.impl;

import org.springframework.stereotype.Component;

import com.bse.factoryDesign.factory.Vehicle;

@Component
public class Motorcycle implements Vehicle {

	@Override
	public String specification() {
		return "This is a MotorCycle with maximum speed of 400km/hr";
	}

	public int totalCount() {
		return 50000;
	}
}
