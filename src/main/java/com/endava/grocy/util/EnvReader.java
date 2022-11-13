package com.endava.grocy.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EnvReader {

    private static final Properties properties = new Properties();

    static{
        String env = System.getProperty("env");
        InputStream resourceAsStream = EnvReader.class.getClassLoader().getResourceAsStream("env/"+env+".properties");
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            throw new RuntimeException("Can't read properties file!", e); // e = cause of runtime exception
        }
    }

    public static String getBaseUri(){
        return properties.getProperty("baseUri");
    }

    //Integer.parseInt -> converts String to Integer
    public static Integer getPort(){
        return Integer.parseInt(properties.getProperty("port"));
    }

    public static String getBasePath(){
        return properties.getProperty("basePath");
    }

    public static String getApiKey(){
        return properties.getProperty("apiKey");
    }

    public static String getDBUrl(){
        return properties.getProperty("db.url");
    }

    public static String getDBUsername(){
        return properties.getProperty("db.username");
    }

    public static String getDBPassword(){
        return properties.getProperty("db.password");
    }
}
