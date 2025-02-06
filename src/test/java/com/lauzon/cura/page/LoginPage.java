package com.lauzon.cura.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public static WebElement LoginMessage(WebDriver driver) {
        return driver.findElement(By.className("lead"));
    }
}
