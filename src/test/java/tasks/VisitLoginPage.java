package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class VisitLoginPage implements Task {

    LoginPage loginPage;

    @Step("Visit the Login Page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(loginPage));
    }
}