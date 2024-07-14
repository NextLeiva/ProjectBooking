package definitions;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.listHotelPage;
import pageobjects.searchPage;

import java.io.IOException;

import static support.screenshots.captura;

public class searchDefinitions {

    searchPage search;


    //creamos un constructor

    public searchDefinitions(){
        search=new searchPage(Hooks.driver);


    }

    @Given("^cierro la pantalla el inicio de sesion$")
    public void CierroLaPantallaElInicioDeSesion() throws IOException {
        search.cerrarIdentity();
        captura();

    }

    @When("^se haga tap en el servicio de alojamiento$")
    public void seHagaTapEnElServicioDeAlojamiento() throws IOException {
        search.seleccionarTipoServicio();
        captura();
    }

    @And("^se haga tap busca la ciudad de destino (.*)$")
    public void seHagaTapBuscaLaCiudadDeDestinoDestino(String destino) {
        search.seleccionarDestino();
        search.ingresoDestino(destino);
        search.selectCiudad();
    }

    @And("^se haga tap en el boton de Seleccionar fechas$")
    public void seHagaTapEnElBotonDeSeleccionarFechas() {
        search.selectDates();
    }

    @And("^se selecciona la habitacion para las personas$")
    public void seSeleccionarLaHabitacionParaLasPersonas() {
        search.selectPersonas();
        /*search.selectRooms();
        search.selectAdults();*/
        search.selectChildren();
        search.selectYear();
        search.clicbtnApply();
        search.clicbtnSearch();
    }


}
