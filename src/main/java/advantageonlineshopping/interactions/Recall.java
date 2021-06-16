package advantageonlineshopping.interactions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import advantageonlineshopping.questions.ConfirmName;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Recall implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.should(seeThat(ConfirmName.ofTheLaptop()));

    }

    public static Recall laptopName() {

        return new Recall();
    }
}
