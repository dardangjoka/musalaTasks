package com.musala.pages;

import com.musala.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Careers extends BasePage{
    private final String cv="C:\\Users\\user\\Downloads\\Dardan-Gjoka_Sonnecto-_-Cydeo-_-Notice-of-Transfer.pdf";
    public final String qaAtuomationLink="https://www.musala.com/job/experienced-automation-qa-engineer/";
    private final String joinUsLink="https://www.musala.com/careers/join-us/";


    public void setUploadCV(){
        uploadCV.sendKeys(cv);
    }
    public Careers(){
        PageFactory.initElements(Driver.get(),this);
    }
    
    @FindBy(xpath = "//button[@class='contact-label contact-label-code btn btn-1b']")
    public WebElement openPossitonButton;
    
    @FindBy(xpath = "//span[@class='wpcf7-not-valid-tip']")
    public List<WebElement> errors;
    

    
    @FindBy(id = "get_location")
    public WebElement selectMenue;

    @FindBy(xpath = "//div[@class='card-container']/a[@href='https://www.musala.com/job/experienced-automation-qa-engineer/']")
    public WebElement qaAutomationPossiotn;

    @FindBy(xpath = "//article[@class='card-jobsHot']//h2")
    public List<WebElement> openPosstionTitle;

    @FindBy(xpath = "//article[@class='card-jobsHot']//p[@class='card-jobsHot__location']")
    public List<WebElement> openPosstionLocation;

    @FindBy(xpath = "//article[@class='card-jobsHot']//p[@class='card-jobsHot__info']")
    public List<WebElement> openPosstionInfo;
    
    
    @FindBy(xpath = "//div[@class='content-title']/h2")
    public List<WebElement> sections;


    @FindBy(xpath = "//dic[@class='btn-apply-container']")
    public WebElement applyDiv;

    @FindBy(xpath = "//input[@type='button']")
    public WebElement applyButton;


    @FindBy(xpath = "//input[@name='uploadtextfield']")
        public WebElement uploadCV;
    @FindBy(xpath = "//input[@name='linkedin']")
    public WebElement linkedin;

    @FindBy(id = "adConsentChx")
    public WebElement checkBox;

    public void fillInForm(String name, String email, String mobile, String linkedIn, String subject, String message){

    }
}
