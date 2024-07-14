package definitions;

import io.cucumber.java.en.And;
import pageobjects.listHotelPage;
import pageobjects.searchPage;

public class lisHotelDefinitions {
    listHotelPage listHotel;

    public lisHotelDefinitions(){

        listHotel=new listHotelPage(Hooks.driver);
    }
    @And("^se selecciona el hotel en la vista del listados de hoteles$")
    public void seSeleccionaElHotelEnLaVistaDelListadosDeHoteles() {

        listHotel.seleccionarNombreHotel();
    }
}
