package pageobjects;

import definitions.Hooks;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class detailHotelPage {
    private AndroidDriver dvr;
    private WebDriverWait wait;

    public detailHotelPage(AndroidDriver driver) {
        dvr = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(driver, 30);
    }

    @AndroidFindBy (xpath = "//android.widget.FrameLayout[@resource-id='com.booking:id/property_availability_cta_facetframe']/android.view.ViewGroup")
    protected static AndroidElement btnSelectRooms;

    @AndroidFindBy (id = "com.booking:id/rooms_item_select_layout")
    protected static AndroidElement btnSelectChouse;

    @AndroidFindBy (xpath = "//android.widget.Button[@resource-id='com.booking:id/main_action']")
    protected static AndroidElement btnReserveChouce;



    public void seleccionarBtnSelectRooms(){
        btnSelectRooms.click();
    }
    public void seleccionarBtnSelectChouse(){
        btnSelectChouse.click();
    }
    public void seleccionarBtnReserveChouce(){
        btnReserveChouce.click();
    }




}
