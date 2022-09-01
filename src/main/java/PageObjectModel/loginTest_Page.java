package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class loginTest_Page extends AbstractClass{
    WebDriver driver;
    public loginTest_Page()
    {
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "div.modal-close")
    private WebElement alert;

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptCocikes;

    @FindBy(xpath = "//*[@id=\"account-navigation-container\"]/div/div[1]/div[1]/p")
    private WebElement loginBtn;

    @FindBy(className = "login-button")
    private WebElement loginBtn1;

    @FindBy(css = "input[data-testid='email-input']")
    private WebElement email;

    @FindBy(css = "input[data-testid='password-input']")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"login-register\"]/div[3]/div[1]/form/button")
    private WebElement loginBtn2;

    @FindBy(xpath = "//*[@id=\"account-navigation-container\"]/div/div[1]/div[1]/p")
    private WebElement myAcc;

    @FindBy(css = "p.user-name")
    private WebElement userName;

    public void alertCloseBtn(){clickFunction(alert);}
    public void acceptCokiesBtn(){clickFunction(acceptCocikes);}
    public void clickLoginButton(){clickFunction(loginBtn);}
    public void sendEmail(){
        sendKeysFunction(email,"testmail");
    }
    public void clickLogin2Button(){clickFunction(loginBtn2);}
    public void sendPassword(){sendKeysFunction(passwordField,"testpassword");}
    public void showUsername(){System.out.println("Username: "+showUsernameFunction(myAcc,userName));}
}
