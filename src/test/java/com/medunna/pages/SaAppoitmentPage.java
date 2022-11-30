package com.medunna.pages;

import com.medunna.utilities.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SaAppoitmentPage extends SaBasePage {

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a")
    public WebElement MY_PAGES;

    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement MyAppointments_option;
    @FindBy(css = "#appointment-heading")
    public WebElement Appointment_Heading;

    @FindBy(css = "tbody > tr:nth-child(1)")
    public WebElement listOfRow_tr;
    @FindBy(css = "tbody > tr")
    public List<WebElement> patients_list;

    @FindBy(xpath = "//tbody/tr[1]/td[2] /span")
    public WebElement time_slot;

    @FindBy(xpath = "//table/tbody/tr[1]/td[1]")
    public WebElement patient_ID;
    @FindBy(xpath = "//span[text()='PENDING']")
    public WebElement pending_displayed;

    @FindBy(xpath = "(//div/a/span/span)[1]")
    public WebElement Edit_BTN;


}
