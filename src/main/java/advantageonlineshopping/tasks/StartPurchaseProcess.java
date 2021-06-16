package advantageonlineshopping.tasks;

import advantageonlineshopping.interactions.Remember;
import advantageonlineshopping.userinterfaces.AddToCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class StartPurchaseProcess implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Remember.laptopName(),
                Click.on(AddToCartPage.ADD_TO_CART_BTN),
                Click.on(AddToCartPage.MENU_CART_BTN)
        );
    }

    public static StartPurchaseProcess onThePage() {

        return instrumented(StartPurchaseProcess.class);
    }
}
