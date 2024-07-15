package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class formularioPage {

    private AndroidDriver dvr;
    private WebDriverWait wait;

    public formularioPage(AndroidDriver driver) {
        dvr = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(driver, 30);
    }
    @AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='com.booking:id/bui_input_container_content'])[1]")
    protected static AndroidElement txtFirstName;
    @AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='com.booking:id/bui_input_container_content'])[2]")
    protected static AndroidElement txtLastname;
    @AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='com.booking:id/bui_input_container_content'])[3]")
    protected static AndroidElement txtEmailAddress;
    @AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='com.booking:id/bui_input_container_content'])[4]")
    protected static AndroidElement txtCountry;
    @AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='com.booking:id/bui_input_container_content'])[5]")
    protected static AndroidElement txtMobileFhone;
    @AndroidFindBy(xpath = "//android.widget.RadioButton[@resource-id='com.booking:id/business_purpose_leisure']")
    protected static AndroidElement rdLeisure;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.booking:id/action_button']")
    protected static AndroidElement btnNextStep;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.booking:id/action_button']")
    protected static AndroidElement btnFinaltStep;

    public void ingresarNombre(String nombre) {
        wait.until(ExpectedConditions.visibilityOf(txtFirstName));
        txtFirstName.click();
        txtFirstName.sendKeys(nombre);
    }
    public void ingresarApellido(String apellido) {
        wait.until(ExpectedConditions.visibilityOf(txtLastname));
        txtFirstName.click();
        txtLastname.sendKeys(apellido);
    }
    public void ingresarEmail(String email) {
        wait.until(ExpectedConditions.visibilityOf(txtEmailAddress));
        txtFirstName.click();
        txtEmailAddress.sendKeys(email);
    }
    public void ingresarPais(String pais) {
        wait.until(ExpectedConditions.visibilityOf(txtCountry));
        txtCountry.clear();
        txtCountry.click();
        txtCountry.sendKeys(pais);
        txtCountry.click();
    }
    public void ingresarTelefono(String telefono) {
        wait.until(ExpectedConditions.visibilityOf(txtMobileFhone));
        txtMobileFhone.click();
        txtMobileFhone.sendKeys(telefono);

    }
    public void seleccionarRdLeisure(){
        rdLeisure.click();
    }
    public void clicBtnNextStep(){
        btnNextStep.click();
    }
    public void clicBtnFinalStep(){
        btnFinaltStep.click();
    }


}
