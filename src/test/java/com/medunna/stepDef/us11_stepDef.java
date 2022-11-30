package com.medunna.stepDef;

import com.medunna.pages.SaAppointmentUpdatePage;
import com.medunna.utilities.ReusableMethods;
import com.medunna.pages.SaAppoitmentPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import com.medunna.utilities.Driver;
import org.openqa.selenium.support.ui.Select;


import java.util.List;
import java.util.Map;

public class us11_stepDef {
    SaAppointmentUpdatePage us11 = new SaAppointmentUpdatePage();


    @Then("Doc navigate to the appointment update page")
    public void docNavigateAppointmentUpdatePage() {

        Assert.assertTrue(us11.update_heading.isDisplayed());
        ReusableMethods.waitFor(3);

    }

    @Given("Doc verifies patient is present")
    public void docVerifiesPatientIsPresent() {
      String appointment_id=us11.appointment_id.getAttribute("value");
      Assert.assertTrue(appointment_id!=null);
    }


    @And("Doc verifies id {string}")
    public void docVerifiesId(String id) {
        String expectedID=id;
        String actualID=us11.appointment_id.getAttribute("value");
        Assert.assertEquals(expectedID,actualID);
    }

    @And("Doc verifies startDateTime {string}")
    public void docVerifiesStartDateTime(String startDate) {
        String expectedStartDate=startDate;
        String actualStartDate=us11.startDate.getAttribute("value");
        Assert.assertEquals(expectedStartDate,actualStartDate);

    }

    @And("Doc verifies EndDateTime {string}")
    public void docVerifiesEndDateTime(String endDate) {
        String expectedStartDate=endDate;
        String actualStartDate=us11.endDate.getAttribute("value");
        Assert.assertEquals(expectedStartDate,actualStartDate);
    }

    @And("Doc verifies Status {string}")
    public void docVerifiesStatus(String status) {
        String expectedStatus= status;
//        Select select=new Select(us11.status);
//        select.selectByVisibleText("PENDING");
        String actualStatus= us11.statusOption.getText();
        System.out.println("actualStatus = " + actualStatus);
        Assert.assertEquals(expectedStatus,actualStatus);
    }

    @And("Doc verifies Physician {string}")
    public void docVerifiesPhysician(String doctor) {
        String expectedDoc= doctor;
        String actualDoc = us11.physician.getText();
        Assert.assertEquals(expectedDoc,actualDoc);

    }


    @When("Doc fills in required fields")
    public void docFillsInRequiredFields(Map<String,String> map) {
//        String expectedAnamnesis=map.get("Anamnesis");
//        String expectedTreatment=map.get("Treatment");
//        String expectedDiagnosis=map.get("Diagnosis");

        us11.anamnesis.clear();
      //  us11.anamnesis.sendKeys(map.get("Anamnesis"));
        us11.treatment.clear();
        us11.treatment.sendKeys(map.get("Treatment"));
        us11.diagnosis.clear();
        us11.diagnosis.sendKeys(map.get("Diagnosis"));


    }

    @And("Doc clicks save button")
    public void docClicksSaveButton() {
        JavascriptExecutor js= (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", us11.updateAndSave);
        ReusableMethods.waitForVisibility(us11.updateAndSave,10);
        us11.updateAndSave.submit();
    }

    @Then("Doc Verifies {string} popup")
    public void docVerifiesPopup(String popup) {
        ReusableMethods.waitForVisibility(us11.success_popup,10);
        String expectedPopup=popup;
        String actualPopup=us11.success_popup.getText();
        Assert.assertTrue(actualPopup.contains(expectedPopup));

    }

    @Given("Doc changes pending status to completed status")
    public void docChangesPendingStatusToCompletedStatus() {
        Select select= new Select(us11.statusOptions);
        select.selectByVisibleText("COMPLETED");

    }

    @But("Doc can NOT update the appointment")
    public void docCanNOTClickTheSaveButton() {
        JavascriptExecutor js= (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", us11.updateAndSave);
      //  ReusableMethods.waitForVisibility(us11.updateAndSave,10);
        ReusableMethods.waitFor(3);
        us11.updateAndSave.click();

       Assert.assertTrue(us11.invalid_feedback.isDisplayed());

    }
}
