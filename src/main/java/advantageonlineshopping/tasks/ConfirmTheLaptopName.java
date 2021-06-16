package advantageonlineshopping.tasks;

import advantageonlineshopping.interactions.Recall;
import advantageonlineshopping.userinterfaces.OrderPaymentPage;
import advantageonlineshopping.userinterfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConfirmTheLaptopName implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Recall.laptopName(),
                Click.on(ShoppingCartPage.CHECKOUT_BTN),
                Click.on(OrderPaymentPage.NEXT_BTN)
                );
    }


    public static ConfirmTheLaptopName onThePage() {
        return instrumented(ConfirmTheLaptopName.class);

    }

}
