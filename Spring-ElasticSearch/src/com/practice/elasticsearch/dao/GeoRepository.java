package com.practice.elasticsearch.dao;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.practice.elasticsearch.bean.CountryBean;
import com.practice.elasticsearch.bean.State;

public interface GeoRepository extends ElasticsearchRepository<CountryBean, String> {

	public List<CountryBean> findByCountryName(String countryName);
		
	public List<State> findByStateName(String stateName);
	
}
