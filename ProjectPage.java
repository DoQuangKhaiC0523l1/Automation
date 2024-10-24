package Page;

import Interface.ProjectInterface;
import commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class ProjectPage extends AbstractPage {
    WebDriver driver;

    public ProjectPage(WebDriver driver) {
        this.driver = driver;
    }
    public void addLabel(String value){
        clickToElement(driver, ProjectInterface.BTN_LABEL);
        sendkeyToElement(driver,ProjectInterface.TXB_LABEL,value);
        clickToElement(driver,ProjectInterface.BTN_SAVE);
        clickToElement(driver,ProjectInterface.BTN_CLOSE);
    }
    public void clickAddProject(){
        clickToElement(driver,ProjectInterface.BTN_ADDPROJECT);
    }
    public void inputSearchField(String title){
        enter(driver,ProjectInterface.TXB_SEARCH,title);
    }
    public void clickTitleAdded(){
        clickToElement(driver,ProjectInterface.OPTION_TITLE);
    }
    public void clickTaskList(){
        clickToElement(driver,ProjectInterface.BTN_TASKLIST);
    }
    public void clickAddMultipleTask(){
        clickToElement(driver,ProjectInterface.BTN_ADDMULTIPLETASK);
    }
}
