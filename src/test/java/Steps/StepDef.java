package Steps;

import Utils.Base;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import misli.loginElements;
import org.openqa.selenium.support.PageFactory;

public class StepDef extends Base {
    private loginElements elements;


    @Given("the app is launched")
    public void appislaunched() {

        elements = new loginElements();
        PageFactory.initElements(new AppiumFieldDecorator(driver),elements);

    }

    @When("I tap on the not now button")
    public void clickNotNowButton() {
        elements.tapnotnow.click();
    }

    @And("I tap on the accept all button")
    public void clickAcceptAllButton() {
        elements.acceptall.click();
    }

    @And("I tap on the login")
    public void clickLogin() {
        elements.loginbtn.click();
    }

    @And("Write username {string}")
    public void writeUsername(String username) {
        elements.userNamefield.sendKeys(username);
    }

    @And("Write password {string}")
    public void writePassword(String password) {
        elements.passwordfield.sendKeys(password);
    }

    @And("I tap on the enter")
    public void clickEnter() {
        elements.enterbtn.click();
    }

    @Then("procedure is over")
    public void procedureOver() {

    }
}
