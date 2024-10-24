package Page.BaiThi;

import Interface.BaiThi.LoginIF;
import commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void inputUsernameAndPassword(String username,String password){
        sendkeyToElement(driver, LoginIF.TXB_USERNAME,username);
        sendkeyToElement(driver, LoginIF.TXB_PASSWORD,password);
        clickToElement(driver,LoginIF.BTN_LOGIN);
    }
}
