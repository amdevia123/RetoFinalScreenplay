package advantageonlineshopping.interactions;

import advantageonlineshopping.userinterfaces.AddToCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Remember implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.remember("Laptop Name", AddToCartPage.LAPTOP_NAME.resolveFor(actor).getText());

    }

    public static Remember laptopName() {

        return new Remember();
    }
}