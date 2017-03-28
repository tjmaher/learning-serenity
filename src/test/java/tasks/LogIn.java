package tasks;

import ability.Authenticate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import pages.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Created by ventmahe on 3/12/17.
 */
public class LogIn implements Task {

    public static LogIn withCredentials(){
        return instrumented(LogIn.class);
    }

    @Override
    @Step("Logs in as: {0}")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(authenticated(actor).username())
                        .into(LoginPage.USERNAME_FIELD),
                Enter.theValue(authenticated(actor).password())
                        .into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    private Authenticate authenticated(Actor actor) {
        return Authenticate.as(actor);
    }
}
