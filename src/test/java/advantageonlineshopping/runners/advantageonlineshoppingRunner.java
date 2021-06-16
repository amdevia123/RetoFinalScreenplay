package advantageonlineshopping.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/advantageonlineshopping.feature",
       tags = "@All",
        glue = "advantageonlineshopping.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class advantageonlineshoppingRunner {
}
