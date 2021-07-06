package com.bse.factoryDesign.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bse.factoryDesign.factory.constants.VehicleTypeConstants;
import com.bse.factoryDesign.factory.impl.Bicycle;
import com.bse.factoryDesign.factory.impl.Bus;
import com.bse.factoryDesign.factory.impl.Car;
import com.bse.factoryDesign.factory.impl.Motorcycle;

@Service
public class  VehicleFactoryImplementation {

	@Autowired
	private Bus bus;
	@Autowired
	private Bicycle bicycle;
	@Autowired
	private Motorcycle motor;
	@Autowired
	private Car car;

	private static final Map<String, Vehicle> handler = new HashMap<String, Vehicle>();

	@PostConstruct
	private Map<String, Vehicle> getObject() {
		handler.put(VehicleTypeConstants.BICYCLE, bicycle);
		handler.put(VehicleTypeConstants.BUS, bus);
		handler.put(VehicleTypeConstants.MOTORCYCLE, motor);
		handler.put(VehicleTypeConstants.CAR, car);
		return handler;
	}

	public static Vehicle createInstance(String vehicle) throws Exception {
		return Optional.ofNullable(handler.get(vehicle)).orElseThrow(() -> new IllegalArgumentException("Invalid vahicle"));
	}

}
