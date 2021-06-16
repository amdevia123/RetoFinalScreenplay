package advantageonlineshopping.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AddToCartPage extends PageObject {

    public static final Target ADD_TO_CART_BTN = Target.the("Add To Cart Button").locatedBy("//button[contains(text(),'ADD TO CART')]");

    public static final Target MENU_CART_BTN = Target.the("Menu Cart Button").locatedBy("//*[@id='menuCart']");

    public static final Target LAPTOP_NAME = Target.the("Laptop Name").locatedBy("//body/div[3]/section[1]/article[1]/div[2]/div[2]/h1[1]");

}