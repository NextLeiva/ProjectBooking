package pageobjects;


import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.*;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static definitions.Hooks.driver;

public class searchPage {
    private AndroidDriver dvr;
    private WebDriverWait wait;

    public searchPage(AndroidDriver driver) {
        dvr = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(driver, 30);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    protected static AndroidElement btnCerrar;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.booking:id/facet_index_section_search_header\"]/android.widget.LinearLayout[1]")
    protected static AndroidElement btnTipoServicio;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"com.booking:id/facet_search_box_accommodation_destination\"]")
    protected static AndroidElement searchDestination;
    @AndroidFindBy(id = "com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")
    protected static AndroidElement txtDestino;
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@class=\"android.view.ViewGroup\"])[2]")
    protected static AndroidElement lblDestino;


    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_dates")
    protected static AndroidElement searchFecha;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"com.booking:id/design_bottom_sheet\"]/android.widget.LinearLayout")
    protected static AndroidElement popupMoth;


    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_occupancy")
    protected static AndroidElement searchPersonas;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.Button[2]")
    protected static AndroidElement addRooms;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.Button[2]")
    protected static AndroidElement addAdults;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.Button[2]")
    protected static AndroidElement addChild;
    @AndroidFindBy(id = "android:id/numberpicker_input")
    protected static AndroidElement selectYear;


    @AndroidFindBy(id = "android:id/button1")
    protected static AndroidElement btnOkChild;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.booking:id/group_config_apply_button']")
    protected static AndroidElement btnApplyChild;
    @AndroidFindBy(id = "com.booking:id/facet_search_box_cta")
    protected static AndroidElement btnSearch;


    @AndroidFindBy(id = "com.booking:id/facet_date_picker_confirm")
    protected AndroidElement btnSelectDates;

    @AndroidFindBy(id = "com.booking:id/age_picker_view")
    protected AndroidElement agePickerView;


    public void cerrarIdentity() {
        btnCerrar.click();
    }

    public void seleccionarTipoServicio() {
        btnTipoServicio.click();
    }

    public void seleccionarDestino() {
        searchDestination.click();
    }

    public void ingresoDestino(String texto) {
        wait.until(ExpectedConditions.visibilityOf(txtDestino));
        txtDestino.sendKeys(texto);
    }

    public void selectCiudad() {
        lblDestino.click();
    }

    public void selectDates() {
        wait.until(ExpectedConditions.elementToBeClickable(btnSelectDates));
        btnSelectDates.click();
    }

    public void selectPersonas() {
        wait.until(ExpectedConditions.elementToBeClickable(searchPersonas));
        searchPersonas.click();
    }

    public void selectRooms() {
        wait.until(ExpectedConditions.elementToBeClickable(addRooms));
        addRooms.click();
    }

    public void selectAdults() {
        wait.until(ExpectedConditions.elementToBeClickable(addAdults));
        addAdults.click();
    }

    public void selectChildren() {
        wait.until(ExpectedConditions.elementToBeClickable(addChild));
        addChild.click();
    }

    public void selectYear() {
        selectYear.click();
        //selectYearChild.click();
        selectSecondItem();
        clicOKChild();

    }

    public void selectSecondItem() {
        int startX = agePickerView.getLocation().getX() + (agePickerView.getSize().getWidth() / 2);
        int startY = agePickerView.getLocation().getY() + (agePickerView.getSize().getHeight() / 2);
        int endY = startY - 200; // Ajusta este valor según sea necesario para alcanzar el segundo elemento
        new TouchAction<>(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();

    }

    public void clicOKChild(){

        btnOkChild.click();
    }
    public void clicbtnApply(){
        wait.until(ExpectedConditions.elementToBeClickable(btnApplyChild));
        btnApplyChild.click();
    }
    public void clicbtnSearch(){
        wait.until(ExpectedConditions.elementToBeClickable(btnSearch));
        btnSearch.click();

    }
}















/*

    @AndroidFindBy(accessibility = "com.booking:id/facet_search_box_accommodation_destination")
    protected static AndroidElement searchDestination;
    @AndroidFindBy(accessibility = "com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")
    protected static AndroidElement txtDestino;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@class=\"android.view.ViewGroup\"][2]")
    protected static AndroidElement lblDestino;

    @AndroidFindBy(accessibility = "com.booking:id/facet_search_box_accommodation_dates")
    protected static AndroidElement searchFecha;
    @AndroidFindBy(accessibility = "com.booking:id/month_custom_view")
    protected static AndroidElement popupMoth;
    @AndroidFindBy(accessibility = "com.booking:id/facet_date_picker_confirm")
    protected static AndroidElement btnSelectDates;

    @AndroidFindBy(accessibility = "com.booking:id/facet_search_box_accommodation_occupancy")
    protected static AndroidElement searchPeople;
    @AndroidFindBy(accessibility = "com.booking:id/bui_input_stepper_add_button")
    protected static AndroidElement btnRooms;
    @AndroidFindBy(accessibility = "com.booking:id/bui_input_stepper_add_button")
    @AndroidFindBy(accessibility = "com.booking:id/facet_search_box_cta")
    protected static AndroidElement btnSearch;
*/



    /*public searchPage(AndroidDriver driver) {
        drv=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        wait=new WebDriverWait(driver,30);
    }*/



