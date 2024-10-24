package Page;

import Interface.AddMultipleTaskInterface;
import Interface.AddTaskInterface;
import commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class AddTask extends AbstractPage {
    WebDriver driver;

    public AddTask(WebDriver driver) {
        this.driver = driver;
    }
    public void selectValueInCombobox(String cbb,String value){
        clickToElement(driver, AddTaskInterface.COMBOBOX,cbb);
        clickToElement(driver,AddTaskInterface.OPTIONS,value);
    }
    public void selectValueInDropDown(String cbb,String value){
        clickToElement(driver,AddTaskInterface.DROPDOWNLISTS,cbb);
        clickToElement(driver,AddTaskInterface.OPTIONS,value);
    }

    public void inputTitle(String title){
        enter(driver,AddTaskInterface.TXB_TITLE,title);
    }
    public void inputDescription(String description){
        sendkeyToElement(driver,AddTaskInterface.TXA_DESCRIPTION,description);
    }
    public void selectValueOfPoint(String cbb,String value){
        selectValueInCombobox(cbb,value);
    }
    public void selectValueOfAssignTo(String cbb,String value){
        selectValueInCombobox(cbb,value);
    }
    public void selectValueOfCollaborators(String cbb,String value){
        clickToElement(driver,AddTaskInterface.CBB_COLLABORATORS,cbb);
        clickToElement(driver,AddTaskInterface.OPTION_COLLABORATORS,value);
    }
    public void selectValueOfStatus(String cbb,String value){
        selectValueInCombobox(cbb,value);
    }
    public void selectValueOfPriority(String cbb,String value){
        selectValueInCombobox(cbb,value);
    }
    public void selectValueOfLabel(String cbb,String value){
        clickToElement(driver,AddTaskInterface.CBB_LABEL,cbb);
        clickToElement(driver,AddTaskInterface.OPTION_LABEL,value);    }
    public void inputStartDate(){
        sendkeyToElement(driver,AddTaskInterface.TXB_STARTDATE,"20-9-2024");
    }
    public void inputDeadLine(){
        sendkeyToElement(driver,AddTaskInterface.TXB_DEADLINE,"20-10-2024");
    }
    public void clickSave(){
        clickToElement(driver,AddTaskInterface.BTN_SAVEANDADDMORE);
    }
    public void clickClose(){
        clickToElement(driver,AddTaskInterface.BTN_CLOSE);
    }


}
