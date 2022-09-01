package stepDefinitions;

import PageObjectModel.loginTest_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class loginTest {
    private WebDriver driver;
    loginTest_Page loginTest_page = new loginTest_Page();
    @Given("^navigate to Website$")
    public void navigate_to_Website() throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.trendyol.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Given("^click login button$")
    public void click_login_button() throws Throwable {
        loginTest_page.alertCloseBtn();
        loginTest_page.acceptCokiesBtn();
        loginTest_page.clickLoginButton();
    }

    @Given("^type email$")
    public void type_email() throws Throwable {
        loginTest_page.sendEmail();
    }

    @Given("^click loginTwo button$")
    public void click_loginTwo_button() throws Throwable {
        System.out.println("Atlandı.");
    }

    @Given("^type password$")
    public void type_password() throws Throwable {
        loginTest_page.sendPassword();
    }

    @When("^click on login button$")
    public void click_on_login_button() throws Throwable {
        loginTest_page.clickLogin2Button();
    }

    @Then("^verify success message$")
    public void verify_success_message() throws Throwable {
        loginTest_page.showUsername();
    }
}
