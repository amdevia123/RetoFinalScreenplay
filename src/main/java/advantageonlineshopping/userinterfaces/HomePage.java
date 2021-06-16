package advantageonlineshopping.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.advantageonlineshopping.com/#/")

public class HomePage extends PageObject {

    public static final Target USER_BTN = Target.the("User Button").locatedBy("//*[@id='menuUser']");

    public static final Target USERNAME_BOX = Target.the("Username Box").locatedBy("//input[@name='username']");

    public static final Target PASSWD_BOX = Target.the("Password Box").locatedBy("//input[@name='password']");

    public static final Target LOGIN_BTN = Target.the("LogIn Button").locatedBy("//button[@id='sign_in_btnundefined']");

    public static final Target WAIT_ELEMENT_1 = Target.the("Wait Element 1").locatedBy("//div[@id='speakersImg']");

    public static final Target MENU_SEARCH_BTN = Target.the("Menu Search Button").locatedBy("#menuSearch");

    public static final Target SEARCH_BOX = Target.the("Search Box").locatedBy("//input[@id='autoComplete']");

}

