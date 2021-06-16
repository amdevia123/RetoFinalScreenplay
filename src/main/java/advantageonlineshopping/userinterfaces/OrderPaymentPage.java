package advantageonlineshopping.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OrderPaymentPage extends PageObject {

    public static final Target NEXT_BTN = Target.the("Next Button").locatedBy("//button[@id='next_btn']");

    public static final Target PAY_NOW_BTN = Target.the("Pay Now Button").locatedBy("//button[@id='pay_now_btn_MasterCredit']");

}