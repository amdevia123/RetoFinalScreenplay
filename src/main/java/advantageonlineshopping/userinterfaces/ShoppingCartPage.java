package advantageonlineshopping.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage extends PageObject {

    public static final Target CHECKOUT_BTN = Target.the("Checkout Button").locatedBy("//button[@id='checkOutButton']");

    public static final Target LAPTOP_NAME = Target.the("Laptop Name").locatedBy("//label[contains(text(),'HP ZBOOK 17 G2 MOBILE WORKSTATION')]");

}
