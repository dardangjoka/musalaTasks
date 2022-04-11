package com.musala.stepDefinition;

import com.musala.pages.Careers;
import com.musala.utils.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CareerTests {
    private Careers career=new Careers();
    @When("clicks {string} button")
    public void clicks_button(String career) {

            this.career.openPossitonButton.click();
    }
    @Then("Verify that ‘Join Us’ page is opened {string}")
    public void verify_that_join_us_page_is_opened(String string) {
        WebDriverWait wait = new WebDriverWait(Driver.get(),3);
        wait.until(ExpectedConditions.urlContains(string));
        Assert.assertEquals(Driver.get().getCurrentUrl(),string);
    }
    @Then("From the dropdown ‘Select location’ select ‘Anywhere’")
    public void from_the_dropdown_select_location_select_anywhere() {
        Select select=new Select(career.selectMenue);
        select.selectByVisibleText("All Locations");
    }
    @Then("Choose open position by name \\(e.g. {string})")
    public void choose_open_position_by_name_e_g(String string) throws InterruptedException {

            career.qaAutomationPossiotn.click();


    }
    @Then("Verify that {int} main sections are shown: {string}, {string}, {string}, {string}")
    public void verify_that_main_sections_are_shown(Integer int1, String general,  String req, String res, String whatWeOffer) {
        int size=career.sections.size();
        Assert.assertEquals(int1,size);
        List<String> list=new ArrayList<>();
        list.add(general);
        list.add(req);
        list.add(res);
        list.add(whatWeOffer);

        for (int i = 0; i <size ; i++) {
            Assert.assertEquals(career.sections.get(i).getText(), list.get(i));
        }
    }
    @Then("erify that ‘Apply’ button is present at the bottom")
    public void erify_that_apply_button_is_present_at_the_bottom() {
        // Write code here that turns the phrase above into concrete actions
        Actions actions=new Actions(Driver.get());
        actions.moveToElement(career.applyButton).perform();
        Assert.assertTrue(career.applyButton.isDisplayed());
    }
    @Then("Click ‘Apply’ button")
    public void click_apply_button() throws InterruptedException {
        career.cookieBar.click();
        WebDriverWait wait = new WebDriverWait(Driver.get(),300);
        wait.until(ExpectedConditions.elementToBeClickable(career.applyButton));
        career.applyButton.click();

    }
    @Then("send")
    public void send(io.cucumber.datatable.DataTable dataTable) {


        Map<String,String> list=dataTable.asMap(String.class, String.class);
        career.nameInput.sendKeys(list.get("name"));
        career.emailInput.sendKeys(list.get("email"));

    }
    @Then("Upload cv document and click send")
    public void upload_cv_document_and_click_send() {
        // Write code here that turns the phrase above into concrete actions
        career.setUploadCV();
    }
    @Then("very that error message is showing")
    public void very_that_error_message_is_showing() {
        career.checkBox.click();
        career.submit.click();
        WebDriverWait wait = new WebDriverWait(Driver.get(),300);
        wait.until(ExpectedConditions.visibilityOf(career.errors.get(0)));
        Assert.assertTrue(career.errors.get(0).getText().contains("The e-mail address entered is invalid."));
        //System.out.println(career.errors.get(0).getText());
        Assert.assertTrue(career.errors.get(1).getText().contains("The field is required"));
        Assert.assertTrue(career.errors.get(2).getText().contains("The field is required"));
        Assert.assertTrue(career.errors.get(3).getText().contains("reCAPTCHA error"));


    }
}
