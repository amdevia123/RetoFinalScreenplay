package advantageonlineshopping.tasks;

import advantageonlineshopping.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogIn implements Task {

    private String name, passwd;

    public LogIn(String name, String passwd) {
        this.name = name;
        this.passwd = passwd;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(HomePage.WAIT_ELEMENT_1).isDisplayed(),
                Click.on(HomePage.USER_BTN),
                Enter.theValue(name).into(HomePage.USERNAME_BOX),
                Enter.theValue(passwd).into(HomePage.PASSWD_BOX),
                Click.on(HomePage.LOGIN_BTN)
        );


    }

    public static LogIn onThePage(String name, String passwd) {

        return instrumented(LogIn.class, name, passwd);
    }

}
