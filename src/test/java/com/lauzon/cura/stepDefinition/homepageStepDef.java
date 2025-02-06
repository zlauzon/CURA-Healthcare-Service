package com.lauzon.cura.stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;

import com.lauzon.cura.dataFile.DataFile;
import com.lauzon.cura.page.HomePage;
import com.lauzon.cura.page.LoginPage;
import com.lauzon.cura.util.DriverUtilities;

public class homepageStepDef {
    private DriverUtilities driverUtilities;
    private WebDriver driver;

    @Before
    public void init() {
        driverUtilities = DriverUtilities.getInstance();
        driver = driverUtilities.getDriver();
    }

    @When("User types url into browser")
    public void user_is_types_url_into_browser() {
        driver.get(DataFile.homeURL);
    }

    @Then("User is presented homepage")
    public void user_is_presented_homepage() {
        assertEquals("CURA Healthcare Service", driver.getTitle());
    }

    @Given("User is on homepage")
    public void user_is_on_homepage() {
        // Write code here that turns the phrase above into concrete actions
        driver.get(DataFile.homeURL);
    }

    @When("User clicks Make Appointment Button")
    public void user_clicks_make_appointment_button() {
        HomePage.AppointmentButton(driver).click();
    }

    @Then("User is presented with login page")
    public void user_is_presented_with_login_page() {
        assertEquals("Please login to make appointment.", LoginPage.LoginMessage(driver).getText());
    }
}
