package com.group9_practice_project.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json" //to run our smoke test
        },
        features = "src/test/resources/features",
        glue = "com/group9_practice_project/step_definitions",
        dryRun = false,
        tags = "@B31G9-122",
        publish = true //generating a report with public link
)
public class CukesRunner {}