package com.musala.stepDefinition;

import com.musala.pages.BasePage;
import com.musala.utils.ConfigurationReader;
import com.musala.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.sound.midi.Soundbank;
import java.time.Duration;

public class ContactForm {
    BasePage basePage=new BasePage();

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.get().get(ConfigurationReader.get("baseurl"));
        Assert.assertTrue(basePage.isInHomePage());
    }
    @Given("scrolls down to Contact section")
    public void scrolls_down_to_contact_section() {
        JavascriptExecutor js = (JavascriptExecutor)Driver.get();
        js.executeScript("window.scrollBy(0,700)");


    }
    @Given("clicks on Contact Us.")
    public void clicks_on_contact_us() {
        JavascriptExecutor js = (JavascriptExecutor)Driver.get();
        js.executeScript("arguments[0].click();", basePage.contactUsButton);
        Assert.assertTrue(basePage.contactDiv.isDisplayed());
    }
    @Given("user should fill in {string}, {string}, {string}, {string} and {string} input boxes")
    public void user_should_fill_in_and_input_boxes(String name, String email, String mobile, String subject, String message) {
        // Write code here that turns the phrase above into concrete actions
        basePage.contactFomFill(name, email, mobile, subject, message);
    }
    @Then("Click the Send Button.")
    public void click_the_send_button() {
       basePage.submit.click();

        WebDriverWait wait = new WebDriverWait(Driver.get(),300);
        wait.until(ExpectedConditions.visibilityOf(basePage.erorrMessageDiv));
        System.out.println(basePage.erorrMessageDiv.getText());
       Assert.assertTrue(basePage.erorrMessageDiv.getText().contains(basePage.errorMessage));
    }

}
