package com.evoco.managers;

import com.evoco.enums.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    public WebDriver driver;
    public FileReaderManager fileReader;
    public DriverType driverType;

    public WebDriver getDriver() {
        if (this.driver == null)
            this.driver = this.createDriver();
        return this.driver;
    }

    private WebDriver createDriver() {
        this.fileReader = new FileReaderManager();
        this.driverType = this.fileReader.getConfigFileReader().getBrowser();
        switch (this.driverType) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver",
                        System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
                return this.driver = new ChromeDriver();
            default:
                throw new RuntimeException("Failed to initialize the driver");
        }
    }
}
