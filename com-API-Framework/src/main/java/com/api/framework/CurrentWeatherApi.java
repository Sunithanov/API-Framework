package com.api.framework;

import static io.restassured.RestAssured.given;

import java.util.List;

import com.api.framework.POJO.CurrentWeather;

import io.restassured.response.Response;
import io.restassured.http.ContentType;;

public class CurrentWeatherApi extends BaseAuthApi {

	private static final String apiUrl = BASEURL + "/data/2.5/weather";

	// BASEURL+API+WEATHER;
	/**
	 * @author sunit
	 * @return
	 */
	public static Response get() {
		return given().when().get(apiUrl);
	}

	/**
	 * @author sunit
	 * @param cityval
	 * @param appId
	 * @return
	 */
	public static Response getCityName(String cityval, String appId) {
		return given().when().queryParam("q", cityval).queryParam("appid", appId).get(apiUrl);
	}

	/**
	 * @author sunit
	 * @param appId
	 * @param cityval
	 * @return
	 */
	public static Response getCityNames(String appId, List<String> cityval) {
		String value = stringBuilder(cityval);
		return given().when().queryParams("q", value).queryParam("appid", appId).get(apiUrl);
	}

	/**
	 * @author sunit
	 * @param payload
	 * @return
	 */
	public static Response postCurrent(CurrentWeather payload) {
		return given().contentType(ContentType.JSON).body(payload).when().post(apiUrl);
	}

	/**
	 * @author sunit
	 * @param tokenValue
	 * @return
	 */
	public static Response delete(String tokenValue) {
		return given().header("Cookie", "token=" + tokenValue).delete(apiUrl);
	}

}
