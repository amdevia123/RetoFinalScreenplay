package advantageonlineshopping.stepdefinitions;

import advantageonlineshopping.questions.ConfirmType;
import advantageonlineshopping.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class advantageonlineshoppingStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    private Actor andres = Actor.named("Andres");

    @Before
    public void setUp() {

        andres.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^the user enters the page$")
    public void openGuru(){
        andres.wasAbleTo(OpenTheBrowser.On());

    }

    @And("^he logs in (.*), (.*)$")
    public void logIn(String name, String passwd) {

        andres.attemptsTo(LogIn.onThePage(name, passwd));
    }


    @When("^choose the computer that he wants to buy$")
    public void choose() {

        andres.attemptsTo(ChooseTheLaptop.onThePage());

    }

    @And("^he starts the purchase process$")
    public void purchaseProcess() {

        andres.attemptsTo(StartPurchaseProcess.onThePage());
    }

    @Then("^he validates that the product to pay matches the one chosen first$")
    public void validate() {
        andres.attemptsTo(ConfirmTheLaptopName.onThePage());
    }

    @And("^he finishes the purchase$")
    public void logInGuru() {
        andres.attemptsTo(FinishThePurchase.onThePage());

    }

    @When("^he search (.*) on the page$")
    public void search(String pcType) {

        andres.attemptsTo(Search.onThePage(pcType));

    }

    @Then("^he verify that (.*)$")
    public void verify(String banner) {

        andres.should(seeThat(ConfirmType.onThePage(banner)));

    }

}
