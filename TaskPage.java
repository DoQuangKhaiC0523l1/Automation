package Page;

import Interface.TaskInterface;
import commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class TaskPage extends AbstractPage {
    WebDriver driver;

    public TaskPage(WebDriver driver) {
        this.driver=driver;
    }
    public void clickAddTask(){
        clickToElement(driver, TaskInterface.BTN_ADDTASK);
    }
}
