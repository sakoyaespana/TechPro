package com.medunna.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {

                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",

    },
        features = "src/test/resources/features",
        glue = "com/medunna/stepDef",
        dryRun = false,
        tags = "@sa",
        publish = false

)
public class CukesRunner {
}


