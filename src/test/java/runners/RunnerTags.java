package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registroUtest.feature",
        tags = "@scenario1",
        glue = "stepDefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}


