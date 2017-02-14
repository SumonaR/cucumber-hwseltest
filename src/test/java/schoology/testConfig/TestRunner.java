package schoology.testConfig;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;

@RunWith(Cucumber.class)
@CucumberOptions(

  features = {"Features/Schoology"},   // where feature files are located
  glue = { "schoology.stepDefinition"}, //where step definition for step
  tags = { "@TC006",},     //tags to execute or run{ "@TC005""}
  format = { "pretty", "html:target"})  //output file for report




public class TestRunner {
  
}
