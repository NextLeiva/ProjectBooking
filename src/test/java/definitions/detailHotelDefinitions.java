package definitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import pageobjects.detailHotelPage;

public class detailHotelDefinitions {
    detailHotelPage detailHotel;

    public detailHotelDefinitions(){

        detailHotel =new detailHotelPage(Hooks.driver);
    }


    @And("se selecciono la habitacion en la vista de detalle de Hotel")
    public void seSeleccionoLaHabitacionEnLaVistaDeDetalleDeHotel() {
        detailHotel.seleccionarBtnSelectRooms();
        detailHotel.seleccionarBtnSelectChouse();
        detailHotel.seleccionarBtnReserveChouce();
    }
}
