package advantageonlineshopping.tasks;

import advantageonlineshopping.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Search implements Task {

    private String pcType;

    public Search(String pcType) {
        this.pcType = pcType;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.MENU_SEARCH_BTN),
                Ensure.that(HomePage.SEARCH_BOX).isDisplayed(),
                Enter.theValue(pcType).into(HomePage.SEARCH_BOX).thenHit(Keys.ENTER)
        );

    }

    public static Search onThePage(String pcType) {

        return instrumented(Search.class, pcType);
    }

}
