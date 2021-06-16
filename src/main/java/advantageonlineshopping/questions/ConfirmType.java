package advantageonlineshopping.questions;

import advantageonlineshopping.userinterfaces.FailedPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConfirmType implements Question {

    private String banner;

    public ConfirmType(String banner) {
        this.banner = banner;
    }

    @Override
    public Object answeredBy(Actor actor) {

        return FailedPage.BANNER.resolveFor(actor).getText().equals(banner);
    }

    public static ConfirmType onThePage(String banner) {

        return new ConfirmType(banner);
    }
}
