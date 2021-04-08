package com.evoco.filereader;

import com.evoco.enums.DriverType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    Properties configProperties;

    public ConfigFileReader() {
        try {
            FileInputStream inputStream = new FileInputStream(new File(System.getProperty("user.dir")
                    + "/src/main/resources/config.properties"));
            configProperties = new Properties();
            configProperties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public DriverType getBrowser() {
        String browserName = configProperties.getProperty("browser");
        switch (browserName) {
            case "chrome":
                return DriverType.CHROME;
            case "firefox":
                return DriverType.FIREFOX;
            case "edge":
                return DriverType.EDGE;
            case "safari":
                return DriverType.SAFARI;
            default:
                throw new RuntimeException("browser not specified in the config.properties file or check browser name\"");
        }
    }

    public String getApplicationUrl() {
        String appUrl = configProperties.getProperty("applicationUrl");
        if (appUrl != null)
            return appUrl;
        else
            throw new RuntimeException("url not specified in the Configuration.properties file.");
    }
}
