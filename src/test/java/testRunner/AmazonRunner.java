package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*
 * single test :tags="@Homepage"
 * two/multiple:tags="@Homepage or @Mobile"
 * ignore any scenario: not @specific scenario name
 * ignore multiple : not @ignore
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/amazon.feature",
					glue="stepdef",
					tags="not @ignore")
public class AmazonRunner {

}
