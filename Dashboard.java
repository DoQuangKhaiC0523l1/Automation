package Page;

import Interface.DashboardInterface;
import Interface.SaleInterfaces;
import commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class Dashboard extends AbstractPage {
    WebDriver driver;
    public Dashboard (WebDriver driver){
        this.driver=driver;
    }
    public void clickSalePage(){
        clickToElement(driver, DashboardInterface.OPTION_SALES);
    }
    public void clickProjectPage(){
        clickToElement(driver,DashboardInterface.OPTION_PROJECTS);
    }

    public void verifyTitle(){
       String actual = String.valueOf(isElementDisplayed(driver, DashboardInterface.TITLE));
       String expected = "Dashboard";
       verifyEqual(actual,expected,"Title correct","Title wrong");
    }
}
