package support;

import definitions.Hooks;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class screenshots {
    public static void captura()throws IOException {
        Date date=new Date();
        SimpleDateFormat fecha= new SimpleDateFormat("ddMMyyyy_HHmmss");

        String ruta ="/Users/joel/Documents/Automatizacion/ProjectBooking/target";

        String nombre_captura = ruta +" "+ "screenshot.jpg";
        File scrfile= ((TakesScreenshot) Hooks.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrfile,new File(nombre_captura));
    }
}
