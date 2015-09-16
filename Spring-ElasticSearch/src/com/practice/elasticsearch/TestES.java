package com.practice.elasticsearch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.elasticsearch.bean.City;
import com.practice.elasticsearch.bean.CountryBean;
import com.practice.elasticsearch.bean.State;
import com.practice.elasticsearch.service.GeoService;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class TestES implements CommandLineRunner{

	@Autowired
	private GeoService geoService;
	
	public static void main(String[] args) {
		SpringApplication.run(TestES.class, args);
	}

	private CountryBean getCountryDataForIndia() {
		
		CountryBean india = new CountryBean();
		india.setCountryName("India");
		india.setId("IN");
		
		State gujarat = new State();
		gujarat.setStateId("IN-GJ");
		gujarat.setStateName("Gujarat");
		
		City ahmedabad = new City();
		ahmedabad.setCityId("IN-GJ-AHD");
		ahmedabad.setCityName("Ahmedabad");
		
		gujarat.addCity(ahmedabad);
		india.addState(gujarat);
				
		return india;
	}
	
	private CountryBean getCountryDataForUSA() {
		
		CountryBean usa = new CountryBean();
		usa.setCountryName("United States of America");
		usa.setId("US");
		
		State newYork = new State();
		newYork.setStateId("US-1");
		newYork.setStateName("New York");
		
		City albany = new City();
		albany.setCityId("US-1-1001");
		albany.setCityName("Albany");
		
		newYork.addCity(albany);
		
		City hudson = new City();
		hudson.setCityId("IN-1-1002");
		hudson.setCityName("Hudson");
		
		newYork.addCity(hudson);
		
		usa.addState(newYork);
				
		return usa;
	}
	
	
	public void run(String... args) throws Exception {
	
//		CountryBean country = getCountryDataForIndia();
//		
//		geoService.addCountry(country);
//		
//		List<CountryBean> retrievedCountry = geoService.getCountriesByName("India");
//		System.out.println(retrievedCountry);
//		
//		country = getCountryDataForUSA();
//		
//		geoService.addCountry(country);
//		
//		retrievedCountry = geoService.getCountriesByName("America");
//		System.out.println(retrievedCountry);		
		
		List<State> retrievedState = geoService.getStatesByName("Gujarat");
		System.out.println(retrievedState);		
		
	}
	
	
}
