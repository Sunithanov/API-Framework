package com.api.framework;
import java.util.List;
import java.util.stream.Collectors;
public class BaseAuthApi {
	 protected static final String BASEURL = "http://api.openweathermap.org";
    public static final String API = "/data/2.5";
    public static final String WEATHER = "/weather";
    public static final String FORECAST = "/forecast/hourly";
    
    public static final String AppiKey = "c6c4ec21ff556b26a493746b7090c27a";

    /**
     * @author sunit
     * @return
     */
    public static String stringBuilder(List<String> list)
    { String joined="";
    joined = list.stream().collect(Collectors.joining(","));
    	return joined;
    }
}