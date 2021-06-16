package advantageonlineshopping.tasks;

import advantageonlineshopping.userinterfaces.LapTopsPage;
import advantageonlineshopping.userinterfaces.MyAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChooseTheLaptop implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MyAccountPage.LAPTOP_BTN),
                Ensure.that(LapTopsPage.CHOOSEN_LAPTOP).isDisplayed(),
                Click.on(LapTopsPage.CHOOSEN_LAPTOP)
        );
    }

    public static ChooseTheLaptop onThePage() {

        return instrumented(ChooseTheLaptop.class);
    }

}
