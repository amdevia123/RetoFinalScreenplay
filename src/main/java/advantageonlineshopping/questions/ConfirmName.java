package advantageonlineshopping.questions;

import advantageonlineshopping.userinterfaces.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConfirmName implements Question {

    @Override
    public Object answeredBy(Actor actor) {

        return ShoppingCartPage.LAPTOP_NAME.resolveFor(actor).getText().equals(actor.recall("Laptop Name").toString());
    }


    public static ConfirmName ofTheLaptop() {

        return new ConfirmName();

    }
}

