package com.api.framework;

import io.restassured.response.Response;
import static com.api.framework.SpecBuilder.*;
import static io.restassured.RestAssured.given;

public class RestResource {
	/**
	 * This method used to post
	 * 
	 * @author sunit
	 * 
	 * @param path
	 * @param token
	 * @param requestPlaylist
	 * @return
	 */
	public static Response post(String path, String token, Object requestPlaylist) {
		return given(getRequestSpec()).body(requestPlaylist).auth().oauth2(token).when().post(path).then()
				.spec(getResponseSpec()).extract().response();
	}

	/**
	 * This method used get
	 * 
	 * @author sunit
	 * @param path
	 * @param token
	 * @return
	 */
	public static Response get(String path, String token) {
		return given(getRequestSpec()).auth().oauth2(token).when().get(path).then().spec(getResponseSpec()).extract()
				.response();
	}

	/**
	 * This method used to update the query
	 * 
	 * @author sunitA
	 * @param path
	 * @param token
	 * @param requestPlaylist
	 * @return
	 */
	public static Response update(String path, String token, Object requestPlaylist) {
		return given(getRequestSpec()).auth().oauth2(token).body(requestPlaylist).when().put(path).then()
				.spec(getResponseSpec()).extract().response();
	}

}
