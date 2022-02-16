package com.api.framework;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.approvaltests.Approvals;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CurrentWeatherTests extends TestBase {

	/**
	 * This Class is to verify the Test for Current weather
	 * @author sunit
	 */
	
	 @Test
	 public void testVerifyStatusofCurrentWeatherwithValiddata(){	    	
   	 
       Response response = CurrentWeatherApi.getCityName("London","c6c4ec21ff556b26a493746b7090c27a");     
       assertStatusCode(response.statusCode(), StatusCode.CODE_200);      
   }
	 
	 @Test
	 public void testgetResponsestatusWeatherwithoutData(){	    	
   	 
       Response response = CurrentWeatherApi.getCityName("",""); 
       assertStatusCode(response.statusCode(), StatusCode.CODE_401);
   }
	 @Test
	 public void testVerifyCityResponseData(){	    	
   	 
       Response response = CurrentWeatherApi.getCityName("London","c6c4ec21ff556b26a493746b7090c27a");     
       assertStatusCode(response.statusCode(), StatusCode.CODE_200); 
       System.out.println(response.prettyPrint());
       JsonPath jsonevaluate=response.jsonPath();       
       assertEquals(jsonevaluate.getString("name"), "London"); 
     
   }
	 @Test
	 public void testVerifyMutliCityResponseData(){	    	
		 List<String> cities = Arrays.asList("London","uk");
       Response response = CurrentWeatherApi.getCityNames("c6c4ec21ff556b26a493746b7090c27a",cities);     
       assertStatusCode(response.statusCode(), StatusCode.CODE_200); 
       System.out.println(response.toString());
       JsonPath jsonevaluate=response.jsonPath();       
       assertEquals(jsonevaluate.getString("name"), "London"); 
     
   }
}
