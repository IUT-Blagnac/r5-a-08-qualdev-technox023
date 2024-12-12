package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
    private String today;
    private String answer;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }


    @Given("today is Sunday")
    public void today_is_sunday() {
        // Write code here that turns the phrase above into concrete actions
        today = "Sunday";
    }


    @Given("today is Friday")
    public void today_is_friday() {
        // Write code here that turns the phrase above into concrete actions
        today = "Friday";
    }


    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        // Write code here that turns the phrase above into concrete actions
        answer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(string, answer);
    }

}
class IsItFriday {
    static String isItFriday(String today) {
        return today.equals("Friday")? "TGIF" : "Nope";
    }
}