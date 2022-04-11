package com.musala.pages;

import com.musala.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Company extends BasePage{
    public Company(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//div[@class='cm-content']/h2")
    public WebElement leaderShip;


    @FindBy(xpath = "//a[@href='https://www.facebook.com/MusalaSoft?fref=ts']")
    public WebElement facebookLink;



    public void clickOnCompany(String str){
        Actions actions =new Actions(Driver.get());
        if(str.contains("Company")){
            Driver.get().get("https://www.musala.com/company/");
        }
        else if(str.contains("Career")){
            actions.moveToElement(this.careers).perform();
            actions.click().perform();
        }

    }
}
