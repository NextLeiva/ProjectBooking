package definitions;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;


public class Hooks {
    public static AndroidDriver driver;

    @Before
    public static void setUp() throws MalformedURLException {
        //conexion con el appiumserver
        //inializar la variable capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability("appPackage", "com.booking");
        capabilities.setCapability("appActivity", "com.booking.startup.HomeActivity");
        //capabilities.setCapability(MobileCapabilityType.APP, "/Users/joel/Documents/Automatizacion/ProjectBooking/src/test/resources/app/booking-com-32-9.apk");
        capabilities.setCapability("autoGrantPermissions", true);
        //capabilities.setCapability("appium:ensureWebviewsHavePages", true);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));

        // Aquí se elimina el flag SECURE de la ventana actual
        //driver.executeScript("mobile: shell", ImmutableMap.of("command", "wm", "args", Arrays.asList("clearflags", "secure")));



    }

    @After
    public static void tearDown() {
        //driver.quit();
    }



}
