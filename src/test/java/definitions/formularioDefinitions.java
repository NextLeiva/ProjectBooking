package definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import pageobjects.detailHotelPage;
import pageobjects.formularioPage;

import java.util.Map;

public class formularioDefinitions {
    formularioPage formulario;

    public formularioDefinitions(){

        formulario =new formularioPage(Hooks.driver);
    }


    @And("^ingreso mis datos personale en la vista de Formulario$")
    public void ingresoMisDatosPersonaleEnLaVistaDeFormulario(DataTable dataTable) {
        Map<String, String> datosPersonales = dataTable.asMap(String.class, String.class);

        formulario.ingresarNombre(datosPersonales.get("Nombre"));
        formulario.ingresarApellido(datosPersonales.get("Apellido"));
        formulario.ingresarEmail(datosPersonales.get("Correo electrónico"));
        formulario.ingresarPais(datosPersonales.get("País"));
        formulario.ingresarTelefono(datosPersonales.get("Teléfono"));
    }
}
