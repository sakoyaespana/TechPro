package com.medunna.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaAppointmentUpdatePage extends SaBasePage{

    @FindBy(xpath = "//span[.='Create or Edit an Appointment']")
    public WebElement update_heading;

    @FindBy(id = "appointment-id")
    public WebElement appointment_id;
    @FindBy(xpath = "//input[@id='appointment-startDate']")
    public WebElement startDate;

    @FindBy(id = "appointment-endDate")
    public WebElement endDate;

    @FindBy(xpath = "//option[@value='PENDING']")
    public WebElement statusOption;

    @FindBy(css = "#appointment-physician>option[value='301005']")
    public WebElement physician;

    @FindBy(id = "appointment-anamnesis")
    public WebElement anamnesis;

    @FindBy(id = "appointment-treatment")
    public WebElement treatment;

    @FindBy(id = "appointment-diagnosis")
    public WebElement diagnosis;

    @FindBy(id = "appointment-status")
    public WebElement statusOptions;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement updateAndSave;

    @FindBy(css = "div[role='alert']")
    public WebElement success_popup;

    @FindBy(xpath = "//div[text()='This field is required.']")
    public WebElement invalid_feedback;

     @FindBy(linkText = "Request A Test")
    public WebElement RequestTestBTM;





}
