package com.practice.elasticsearch.bean;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class City {

	private String cityId;
	private String cityName;
	
	public String getCityId() {
		return cityId;
	}
	
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}	
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
}
