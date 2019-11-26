package cucuepta;

import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;
import static utils.TestUtils.isItFriday;

public class SimpleSteps {
    private String today;
    private String actualAnswer;

    @Given("today is {string}")
    public void today_is(String t) {
        this.today = t;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }


}

