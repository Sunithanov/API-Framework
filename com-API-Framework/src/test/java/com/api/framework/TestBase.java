package com.api.framework;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;
import org.hamcrest.Matchers;
import io.qameta.allure.Step;

public class TestBase {
	
	@BeforeMethod
    public void beforeMethod(Method m){
        System.out.println("STARTING TEST: " + m.getName());
       // System.out.println("THREAD ID: " + Thread.currentThread().getId());
    }
	
	@Step
    public void assertStatusCode(int actualStatusCode, StatusCode statusCode){
      
        assertEquals(actualStatusCode, statusCode.code);
    }

    
}
