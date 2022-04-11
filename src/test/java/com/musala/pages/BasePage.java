package com.musala.pages;

import com.musala.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(id = "wt-cli-accept-all-btn")
    public WebElement cookieBar;
    @FindBy(xpath = "//a[@href='https://www.musala.com/company/']")
    public WebElement company;

    @FindBy(xpath = "(//a[@style='cursor: pointer;'])[1]")
    public WebElement services;

    @FindBy(xpath = "//a[@href='https://www.musala.com/clients/']")
    public WebElement clients;

    @FindBy(xpath = "(//a[@style='cursor: pointer;'])[2]")
    public WebElement community;

    @FindBy(xpath = "(//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-478'])[4]")
    public WebElement careers;


    @FindBy(xpath = "//a[@class='fancybox']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//div[@class='contacts-title']")
    public WebElement contactsection;

    @FindBy(xpath = "//input[@name='your-name']")
    public WebElement nameInput;


    @FindBy(xpath = "//input[@name='your-email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@name='mobile-number']")
    public WebElement mobileInput;

    @FindBy(xpath = "//input[@name='your-subject']")
    public WebElement subjectInput;

    @FindBy(xpath = "//textarea[@name='your-message']")
    public WebElement messageInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;

    @FindBy(id = "contact_form_pop")
    public WebElement contactDiv;

    @FindBy(xpath = "//span[@class='wpcf7-not-valid-tip']")
   public WebElement erorrMessageDiv;

   public String errorMessage = "The e-mail address entered is invalid.";

    public boolean isInHomePage() {
        return Driver.get().getTitle().equals("Musala Soft");
    }

    public void contactFomFill(String name, String email, String mobile, String subject, String message) {
        if (isInHomePage()) {
           // contactsection.click();
            //waits?
            nameInput.sendKeys(name);
            emailInput.sendKeys(email);
            mobileInput.sendKeys(mobile);
            subjectInput.sendKeys(subject);
            messageInput.sendKeys(message);


        }

        }
}
