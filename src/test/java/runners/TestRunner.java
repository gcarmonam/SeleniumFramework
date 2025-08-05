package runners;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectFile;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectFile("src/test/resources/features")
@ConfigurationParameter(key= Constants.GLUE_PROPERTY_NAME, value = "stepDefinitions")
//@ConfigurationParameter(key= Constants.PLUGIN_PROPERTY_NAME, value = "pretty.html, html:target/cucumber-report.html")

public class TestRunner {
}
