package com.medunna.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaTestItemPage extends SaBasePage {

    @FindBy(xpath = "//h2[.='Test Items']")
    public WebElement TestItemHeading;

    @FindBy(xpath = "//tbody/tr[2]/td[2]")
    public WebElement Urea;

    @FindBy(xpath = "//td[.='glucose']")
    public WebElement Glucose;
    @FindBy(xpath = "//td[.='Total Protein-']")
    public WebElement TotalProtein;
    @FindBy(xpath = "//td[.='Albumin']")
    public WebElement Albumin;
    @FindBy(xpath = "//tbody/tr[38]/td[2]")
    public WebElement Hemoglobin;
    @FindBy(xpath = "")
    public WebElement Creatinine;
    @FindBy(xpath = "")
    public WebElement SodiumPotassium;


}
