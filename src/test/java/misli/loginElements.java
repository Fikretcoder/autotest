package misli;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;


public class loginElements {

    @AndroidFindBy (id = "com.misli.androidNew:id/text_view_update_not_now")
    public WebElement tapnotnow;

    @AndroidFindBy (id ="com.misli.androidNew:id/button_accept_all")
    public WebElement acceptall;

    @AndroidFindBy(id  = "com.misli.androidNew:id/button_login")
    public WebElement loginbtn;

    @AndroidFindBy(id = "com.misli.androidNew:id/text_input_username")
    public WebElement userNamefield;

    @AndroidFindBy(id = "com.misli.androidNew:id/text_input_password")
    public WebElement passwordfield;

    @AndroidFindBy(id = "com.misli.androidNew:id/login_sign_in_btn")
    public WebElement enterbtn;

}
