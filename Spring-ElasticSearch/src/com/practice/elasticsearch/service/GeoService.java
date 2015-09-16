package com.practice.elasticsearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.elasticsearch.bean.CountryBean;
import com.practice.elasticsearch.bean.State;
import com.practice.elasticsearch.dao.GeoRepository;

@Service
public class GeoService {

	@Autowired
	private GeoRepository geoRepository;
	
	public List<CountryBean> getCountriesByName(String name) {
		return geoRepository.findByCountryName(name);
	}

	public void addCountry(CountryBean country) {		
		geoRepository.save(country);		
	}	
	
	public List<State> getStatesByName(String name) {
		return geoRepository.findByStateName(name);
	}
	
	
}
