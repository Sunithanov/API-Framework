package com.api.framework;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilder extends BaseAuthApi {
	 public static RequestSpecification getRequestSpec(){
	        return new RequestSpecBuilder().
	                setBaseUri(BASEURL).	   
	                setContentType(ContentType.JSON).
	                addFilter(new AllureRestAssured()).
	                log(LogDetail.ALL).
	                build();
	    }	   

	    public static ResponseSpecification getResponseSpec(){
	        return new ResponseSpecBuilder().
	                log(LogDetail.ALL).
	                build();
	    }
	    
}
