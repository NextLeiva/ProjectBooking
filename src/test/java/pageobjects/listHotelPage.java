package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class listHotelPage {
    private AndroidDriver dvr;
    private WebDriverWait wait;

    public listHotelPage(AndroidDriver driver) {
        dvr = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(driver, 30);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Los Aticos B&B with Coworking']")
    protected static AndroidElement txtNombreHotel;

    public void seleccionarNombreHotel(){
        wait.until(ExpectedConditions.visibilityOf(txtNombreHotel));
        txtNombreHotel.click();
    }

}
