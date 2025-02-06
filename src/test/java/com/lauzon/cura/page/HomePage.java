package com.lauzon.cura.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public static WebElement AppointmentButton(WebDriver driver) {
        return driver.findElement(By.id("btn-make-appointment"));
    }
}
