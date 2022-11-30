package com.medunna.stepDef;

import com.medunna.pages.SaAppointmentUpdatePage;
import com.medunna.pages.SaTestItemPage;
import com.medunna.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class us12_stepDef {
    SaAppointmentUpdatePage us_12= new SaAppointmentUpdatePage();
    SaTestItemPage us12=new SaTestItemPage();
    @And("Doc clicks Request A Test button")
    public void docClickRequestATestButton() {
        us_12.RequestTestBTM.click();
    }

    @Then("Doc navigate to the Test Items page")
    public void docNavigateToTheTestItemsPage() {
        ReusableMethods.waitForVisibility(us12.TestItemHeading,10);
      //  ReusableMethods.waitFor(3);
        Assert.assertTrue( us12.TestItemHeading.isDisplayed());
    }


    @And("Doc sees items below as checkmark options")
    public void docSeesItemsBelowAsCheckmarkOptions(List<String> items) {
      String expectedItem = items.get(0);
      String actualItem = us12.Urea.getText();
      Assert.assertTrue(us12.Urea.isDisplayed());
      Assert.assertEquals(expectedItem,actualItem);

    }
}
