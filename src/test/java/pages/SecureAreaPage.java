package pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    @DefaultUrl("/login")
    public class SecureAreaPage extends PageObject{
        public static final Target LOGOUT_BUTTON = Target.the("Logout button").located(By.cssSelector("[href='/logout']"));

        @FindBy(css = "h2")
        WebElement headerText;

        public SecureAreaPage(WebDriver driver) {
            super(driver);
        }

        public String getHeaderText(){
            return headerText.getText();
        }
}
