package com.musala.stepDefinition;

import com.musala.pages.Company;
import com.musala.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;

public class CompanyTests {
    private Company company=new Company();
    @When("user clicks on the {string} link")
    public void user_clicks_on_the_link(String string) {
        company.clickOnCompany(string);
    }


    @Then("verify that the correct url is being displayed  {string}")
    public void verify_that_the_correct_url_is_being_displayed(String musala) {
        String url=Driver.get().getCurrentUrl();
       Assert.assertEquals(url,musala);

    }
    @Then("verify that there is a {string} section")
    public void verify_that_there_is_a_section(String leadership) {
    Assert.assertEquals(company.leaderShip.getText(), leadership);
    }

    @When("user clicks on the FacebookLink on the footer")
    public void user_clicks_on_the_facebook_link_on_the_footer() {

        Actions actions = new Actions(Driver.get());
        WebDriverWait wait = new WebDriverWait(Driver.get(),300);
        wait.until(ExpectedConditions.visibilityOf(company.facebookLink));
        company.cookieBar.click();
        actions.moveToElement(company.facebookLink).perform();
        company.facebookLink.click();


    }
    @Then("Verify that the correct URL {string} loads")
    public void verify_that_the_correct_url_loads(String fb) {

        ArrayList<String> tabs2 = new ArrayList<String>(Driver.get().getWindowHandles());
        Driver.get().switchTo().window(tabs2.get(1));
        String fburl=Driver.get().getCurrentUrl();
        WebDriverWait wait = new WebDriverWait(Driver.get(),3);
        wait.until(ExpectedConditions.urlContains(fb));
        Assert.assertEquals(fb,fburl);
    }
    @Then("very that the Musala Soft profile picture appears on the new page")
    public void very_that_the_musala_soft_profile_picture_appears_on_the_new_page() {

    }
}
