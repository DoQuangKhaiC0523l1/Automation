package Page;

import Interface.AddProjectInterface;
import commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class AddProject extends AbstractPage {
    WebDriver driver;

    public AddProject(WebDriver driver) {
        this.driver = driver;
    }
    public void selectValueInDropdownlist(String combobox, String value) {
        clickToElement(driver, AddProjectInterface.DROPDOWNLISTS, combobox);
        clickToElement(driver, AddProjectInterface.OPTIONS, value);
    }
    public void selectValueInCombobox(String combobox, String value) {
        clickToElement(driver, AddProjectInterface.COMBOBOX, combobox);
        clickToElement(driver, AddProjectInterface.OPTIONS, value);
    }
    public void inputTitle(String title) {
        sendkeyToElement(driver, AddProjectInterface.TXB_TITLE, title);
    }
    public void selectValueProjectType(String cbb,String value) {
        selectValueInCombobox(cbb, value);
    }
    public void selectValueClient(String cbb,String value){
        selectValueInCombobox(cbb,value);
    }
    public void inputDesc(String description) {
        sendkeyToElement(driver, AddProjectInterface.TXA_DESCRIPTION, description);
    }
    public void inputStartDate(String startDate) {
        sendkeyToElement(driver, AddProjectInterface.TXB_STARTDATE, startDate);
    }
    public void inputDeadline(String deadLine) {
        sendkeyToElement(driver, AddProjectInterface.TXB_DEADLINE, deadLine);
    }
    public void inputPrice(String price) {
        sendkeyToElement(driver, AddProjectInterface.TXB_PRICE, price);
    }
    public void selectValueLabel(String cbb,String value) {
    clickToElement(driver,AddProjectInterface.CBB_LABEL,cbb);
    clickToElement(driver,AddProjectInterface.OPTION_LABEL,value);

    }
    public void clickSave(){
        clickToElement(driver,AddProjectInterface.BTN_SAVE);
    }
    public void clickSaveAndContinue(){
        clickToElement(driver,AddProjectInterface.BTN_SAVEANDCONTINUE);
    }
    public void clickAddMore(){
        clickToElement(driver,AddProjectInterface.BTN_ADDMORE);
    }
    public void clickClose(){
        clickToElement(driver,AddProjectInterface.BTN_CLOSE);
    }
}
