package advantageonlineshopping.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FailedPage extends PageObject {

    public static final Target BANNER = Target.the("Banner").locatedBy("body.ng-scope:nth-child(2) div.uiview.ng-scope:nth-child(8) section.ng-scope article:nth-child(1) div.noPromotedProductDiv:nth-child(4) div.textAlignCenter.ng-scope:nth-child(1) label.noProducts.roboto-bold > span.ng-binding");

}
