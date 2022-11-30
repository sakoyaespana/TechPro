package com.medunna.stepDef;

import com.medunna.pages.SaAppoitmentPage;
import com.medunna.utilities.ConfigReader;
import com.medunna.utilities.Driver;
import com.medunna.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;




public class us10_stepDef {
    SaAppoitmentPage us10_page= new SaAppoitmentPage();
    @Given("Doc goes to the Medunna web page")
    public void docGoesToTheMedunnaWebPage() {
      String url = ConfigReader.getProperty("sa-url");
        Driver.getDriver().get(url);

    }
    @And("Doc clicks user icon")
    public void docClicksUserIcon() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", us10_page.user_icon);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", us10_page.user_icon);

    }

    @And("Doc clicks Sign in option")
    public void docClicksSignInOption() {
        us10_page.sign_in_option.click();
        ReusableMethods.waitFor(2);
    }

    @And("Doc sign in home page")
    public void docSignInHomePage() {
        us10_page.SaDocSignIn();
        ReusableMethods.waitFor(3);

    }

    @And("Doc navigates to home page")
    public void docNavigatesToHomePage() {
        ReusableMethods.waitForClickablility(us10_page.MY_PAGES,5);
        Assert.assertTrue(us10_page.MY_PAGES.isDisplayed());

    }

    @And("Doc clicks MY PAGES dropdown menu")
    public void docClicksMYPAGESDropdownMenu() {
        us10_page.MY_PAGES.click();
    }

    @And("Doc clicks My Appointments option")
    public void docClicksMyAppointmentsOption() {
        us10_page.MyAppointments_option.click();
        ReusableMethods.waitFor(5);
    }

    @Given("Doc sees Appointments heading displayed")
    public void docSeesAppointmentsHeadingDisplayed() {
       Assert.assertTrue(us10_page.Appointment_Heading.isDisplayed());
    }

    @And("Appointment is listed")
    public void appointmentIsListed() {
     Assert.assertTrue(us10_page.listOfRow_tr.isDisplayed());

    }

    @And("Time slots are displayed")
    public void timeSlotsAreDisplayed() {
        Assert.assertTrue(us10_page.time_slot.isDisplayed());
    }

    @And("Doc see the patient ID")
    public void docSeeThePatientID() {
        Assert.assertTrue(us10_page.patient_ID.isDisplayed());
    }

    @And("Doc see the StarDataTime")
    public void docSeeTheStarDataTime() {
        Assert.assertTrue(us10_page.time_slot.isDisplayed());
    }

    @And("Doc see the EndDateTime")
    public void docSeeTheEndDateTime() {
      //  Assert.assertTrue(us10_page.time_slot.isDisplayed());
    }

    @And("doc see the Status")
    public void docSeeTheStatus() {
      //  Assert.assertTrue(us10_page.pending_displayed.isDisplayed());
    }

    @But("Appointment list is NOT empty")
    public void appointmentListIsNOTEmpty() {

     Assert.assertFalse(us10_page.patients_list.isEmpty());
    }


    @And("Doc clicks Edit button to update patients info")
    public void docClicksEditButtonToUpdatePatientsInfo() {
        us10_page.Edit_BTN.click();
       // ReusableMethods.waitFor(3);
    }


}
