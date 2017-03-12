package pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    @DefaultUrl("/login")
    public class LoginPage extends PageObject{

        public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.cssSelector("[type='submit'][class='radius']"));
        public static final Target USERNAME_FIELD = Target.the("Username field").located(By.id("username"));
        public static final Target PASSWORD_FIELD = Target.the("Password field").located(By.id("password"));

        @FindBy(css = "h2")
        WebElement headerText;


        @FindBy(id = "flash-messages.flash")
        WebElement alertMessages;

        public LoginPage(WebDriver driver) {
            super(driver);
        }

        public String getHeaderText(){
            return headerText.getText();
        }

        public String getAlertMessages(){
            return alertMessages.getText();
        }
}
