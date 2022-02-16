package com.api.framework.POJO;


public class CurrentWeather {
	 private String id;
	 private String name;
	 private String cod;
	 private String visibility;
	 private String base;
	 private String dt;
	 private Weather weather;
	 
	public Weather getWeather() {
		return weather;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	 
	  private CurrentWeather(String id, String name,String dt,String base,String cod ,String visibility ) {
		  this.dt = dt;
		  this.visibility = visibility;
	        this.base = base;
	        this.cod = cod;
	        this.name = name;
	        this.id = id;
	    }
}
