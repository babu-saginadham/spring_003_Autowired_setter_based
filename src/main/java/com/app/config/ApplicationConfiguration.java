package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.service.TwoWheeler;
import com.service.VehicleService;

@Configuration
public class ApplicationConfiguration {

	@Bean("vehicleService")
	public VehicleService getVehicleService() {
		return new VehicleService("Suzuki");
	}	
	
	@Bean("two")
	public TwoWheeler getTwo() {
		return new TwoWheeler();
	}
}
