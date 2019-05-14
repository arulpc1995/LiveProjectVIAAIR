package viaAir.stepdefinetion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\LiveVIAAIR\\src\\test\\resources",glue= {"viaAir.stepdefinetion"},dryRun=true,monochrome = true, strict = true)

public class TestRunner {

}
