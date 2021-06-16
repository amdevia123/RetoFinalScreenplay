package advantageonlineshopping.tasks;

import advantageonlineshopping.userinterfaces.OrderPaymentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FinishThePurchase implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OrderPaymentPage.PAY_NOW_BTN)
        );


    }

    public static FinishThePurchase onThePage() {
        return instrumented(FinishThePurchase.class);
    }
}
