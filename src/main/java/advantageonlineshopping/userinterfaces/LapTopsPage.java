package advantageonlineshopping.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LapTopsPage extends PageObject {

    public static final Target CHOOSEN_LAPTOP = Target.the("Choosen Laptop").locatedBy("//a[contains(text(),'HP ZBook 17 G2 Mobile Workstation')]");

}
