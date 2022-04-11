package com.musala.stepDefinition;

import com.musala.pages.Careers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class PrintignPosstions {
    private Careers career=new Careers();
    @When("Filter the available positions by available cities in the dropdown ‘Select location’ {string}")
    public void filter_the_available_positions_by_available_cities_in_the_dropdown_select_location(String city) {
        Select select=new Select(career.selectMenue);
        select.selectByVisibleText(city);
    }
    @When("Get the open positions by city")
    public void get_the_open_positions_by_city() throws InterruptedException {
        Thread.sleep(3000);
    }
    @Then("prints out the possitons.")
    public void prints_out_the_possitons() {
        for (int i = 0; i <career.openPosstionTitle.size() ; i++) {
            System.out.println("Title: "+career.openPosstionTitle.get(i).getText());
            System.out.println("Info: "+career.openPosstionInfo.get(i).getText());
            System.out.println("Location: "+career.openPosstionLocation.get(i).getText());
            System.out.println("----------------------------------------------------------------------------------------------");
        }

    }
}
