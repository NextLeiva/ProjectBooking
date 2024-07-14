Feature:
  Yo Como usuario quiero utilizar el servicio de reservas para encontrar la mejor opcion de alojamiento

#  Background: Ingresar en la pestana Stays
#    Given yo cierro la pantalla el inicio de sesion

  Scenario Outline: Validar que se puede reservar un servicio de alojamiento
    Given cierro la pantalla el inicio de sesion
    When se haga tap en el servicio de alojamiento
    And se haga tap busca la ciudad de destino <destino>
    And se haga tap en el boton de Seleccionar fechas
    And se selecciona la habitacion para las personas
    And se selecciona el hotel en la vista del listados de hoteles
    And se selecciono la habitacion en la vista de detalle de Hotel





    Examples:[HAPPY PATH]
      | destino | fechaInicio    | fechaFin       |
      | Cusco   | 01 August 2024 | 03 August 2024 |



