package com.medunna.stepDef;

import com.medunna.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


   @Before
   public void setup(){
       System.out.println("Good Morning Everyone");
   }


    @After
    public void teardownScenario(Scenario scenario){
        System.out.println("Bye");
        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        Driver.closeDriver();

    }


}
