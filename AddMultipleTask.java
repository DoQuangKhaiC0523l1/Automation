package Page;

import Interface.AddMultipleTaskInterface;
import commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class AddMultipleTask extends AbstractPage {
    WebDriver driver;
    public void selectValueInCombobox(String cbb,String value){
        clickToElement(driver,AddMultipleTaskInterface.COMBOBOX,cbb);
        clickToElement(driver,AddMultipleTaskInterface.OPTIONS,value);
    }
    public void selectValueInDropDown(String cbb,String value){
        clickToElement(driver,AddMultipleTaskInterface.DROPDOWNLISTS,cbb);
        clickToElement(driver,AddMultipleTaskInterface.OPTIONS,value);
    }

    public AddMultipleTask(WebDriver driver) {
        this.driver = driver;
    }
    public void inputTitle(String title){
        enter(driver,AddMultipleTaskInterface.TXB_TITLE,title);
    }
    public void inputDescription(String description){
        sendkeyToElement(driver,AddMultipleTaskInterface.TXA_DESCRIPTION,description);
    }
    public void selectValueOfPoint(String cbb,String value){
        selectValueInCombobox(cbb,value);
    }
    public void selectValueOfAssignTo(String cbb,String value){
        selectValueInCombobox(cbb,value);
    }
    public void selectValueOfCollaborators(String cbb,String value){
        clickToElement(driver,AddMultipleTaskInterface.CBB_COLLABORATORS,cbb);
        clickToElement(driver,AddMultipleTaskInterface.OPTION_COLLABORATORS,value);
    }
    public void selectValueOfStatus(String cbb,String value){
        selectValueInCombobox(cbb,value);
    }
    public void selectValueOfPriority(String cbb,String value){
        selectValueInCombobox(cbb,value);
    }
    public void selectValueOfLabel(String cbb,String value){
        clickToElement(driver,AddMultipleTaskInterface.CBB_LABEL,cbb);
        clickToElement(driver,AddMultipleTaskInterface.OPTION_LABEL,value);    }
    public void inputStartDate(){
        sendkeyToElement(driver,AddMultipleTaskInterface.TXB_STARTDATE,"20-9-2024");
    }
    public void inputDeadLine(){
        sendkeyToElement(driver,AddMultipleTaskInterface.TXB_DEADLINE,"20-10-2024");
    }
    public void clickSave(){
        clickToElement(driver,AddMultipleTaskInterface.BTN_SAVEANDADDMORE);
    }
    public void clickClose(){
        clickToElement(driver,AddMultipleTaskInterface.BTN_CLOSE);
    }

}
