package some.other.place;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.assertj.core.api.Assertions;

public class BaseScenarioInSomeOtherPackage extends ScenarioSteps{

    public BaseScenarioInSomeOtherPackage(Pages pages) {
        super(pages);
    }

    public String returnFoo() {
        return "proportionOf";

    }

}
