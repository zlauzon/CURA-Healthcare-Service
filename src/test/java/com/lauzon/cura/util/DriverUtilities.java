package com.lauzon.cura.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtilities {
    private static DriverUtilities driverUtilities;
    private WebDriver driver;

    public DriverUtilities() {
        super();
    }

    public static DriverUtilities getInstance() {
        if (driverUtilities == null)
            driverUtilities = new DriverUtilities();
        return driverUtilities;
    }

    public WebDriver getDriver() {
        if (driver == null)
            driver = new ChromeDriver();
        return driver;
    }
}
