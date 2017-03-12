package steps;

import Ability.Authenticate;
import cucumber.api.java.en.Then;
import tasks.LogIn;
import tasks.VisitLoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;


public class LogIntoLoginPage {

    @Steps
    VisitLoginPage visitTheLoginPage;


    Actor tomSmith = Actor.named("Tom Smith");

    @Managed
    public WebDriver tomsBrowser;

    @Given("^a user is on the Login Page$")
    public void a_user_is_on_the_login_page(){
        tomSmith.can(BrowseTheWeb.with(tomsBrowser));
        tomSmith.wasAbleTo(visitTheLoginPage);
    }

    @When("^the user logs in using valid credentials$")
    public void the_user_logs_in_using_valid_credentials(String validUserName, String validPassword){
        tomSmith.can(Authenticate.with("tomsmith","SuperSecretPassword!"));
        tomSmith.attemptsTo(LogIn.withCredentials());
    }

    @Then("^the user navigates_to the Secure Area landing page$")
    public void the_user_navigates_to_the_secure_area_landing_page(){

    }

}
